
package StepDef;


import POM.SignupDoubleOptIn;
import io.cucumber.java.en.Given;

public class Signupform_SD {


	@Given("^User launch open signup form and submit double opt-in sign form$")
	public void user_launch_open_signup_form_and_submit_double_opt_in_sign_form() throws Throwable {
		SignupDoubleOptIn form = new SignupDoubleOptIn();
//		System.out.println("File will be here :-> "+System.getProperty("user.dir"));
//		String filePath = System.getProperty("user.dir")+"/src/test/java/Properties_file";

		/*String filePathRLocal = System.getProperty("user.dir")+"/src/test/java/Properties_file/";
		String fileNameLocal= "testdata.xlsx";
		String fileSheetNameLocal = "Sheet1";
		System.out.println("Entered Full File Name with Path In LOCAL Run :->  "+filePathRLocal+fileNameLocal);
		form.excelReadFillForm(filePathRLocal, fileNameLocal, fileSheetNameLocal);*/

		String filePathRemote = "/var/lib/test_dir/";
		String fileNameRemote = "coFileJenkins.xlsx";
		String fileSheetNameRemote = "Sheet1";
		System.out.println("Entered Full File Name with Path In Remote Run :->  "+filePathRemote+fileNameRemote);
		form.excelReadFillForm(filePathRemote, fileNameRemote, fileSheetNameRemote);

	}




}
