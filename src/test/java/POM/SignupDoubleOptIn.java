package POM;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ResourceBundle;

public class SignupDoubleOptIn {
    WebDriver driver;
    /*String filePath = System.getProperty("user.dir")+"/src/test/java/Properties File/";
    ResourceBundle bundle = ResourceBundle.getBundle(filePath+"setup");*/
    public void excelReadFillForm(String filePath, String fileName, String sheetName) throws IOException, InterruptedException {
        File file = new File(filePath + fileName);
        FileInputStream inputStream = new FileInputStream(file);
        Workbook softWorkbook = null;
        String fileExtensionName = fileName.substring(fileName.indexOf("."));
        if (fileExtensionName.equals(".xlsx")) {
            softWorkbook = new XSSFWorkbook(inputStream);

        } else if (fileExtensionName.equals(".xls")) {
            softWorkbook = new HSSFWorkbook(inputStream);

        }

        Sheet softSheet = softWorkbook.getSheet(sheetName);
        int rowCount = softSheet.getLastRowNum() - softSheet.getFirstRowNum();  //Find number of rows in excel file
        for (int i = 0; i < rowCount + 1; i++) {

            WebDriver driver = new ChromeDriver();
//            driver.navigate().to(bundle.getString("url"));
            driver.navigate().to("http://softwaredevx.co.in/sign-up/");
            // driver.manage().window().maximize();
            driver.switchTo().frame(0);
            int cellcount = softSheet.getRow(i).getLastCellNum();
            //System.out.println("Row" + i + " data is :");
            Row row = softSheet.getRow(i);
            String companyName = softSheet.getRow(i).getCell(0).getStringCellValue();
            driver.findElement(By.cssSelector("#COMPANYNAME")).sendKeys(companyName);
            System.out.print("Entered Company Name: " + companyName);
            for (int j = 1; j < cellcount; j++) {
                String emailData = softSheet.getRow(i).getCell(1).getStringCellValue();
                driver.findElement(By.cssSelector("#EMAIL")).sendKeys(emailData);
                driver.findElement(By.cssSelector(".checkbox.checkbox_tick_positive")).click();
                driver.findElement(By.cssSelector("button[type='submit'")).click();
                Thread.sleep(3000);
                driver.quit();
            }

            System.out.println();
        }


    }
        }
