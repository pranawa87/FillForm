
package StepDef;


import POM.SignupDoubleOptIn;
import io.cucumber.java.en.Given;

public class Signupform_SD {


	@Given("^User launch open signup form and submit double opt-in sign form$")
	public void user_launch_open_signup_form_and_submit_double_opt_in_sign_form() throws Throwable {
		SignupDoubleOptIn form = new SignupDoubleOptIn();
//		System.out.println("File will be here :-> "+System.getProperty("user.dir"));
//		String filePath = System.getProperty("user.dir")+"/src/test/java/Properties_file";
		System.out.println("Entered path: ");
		String filePath = "/var/lib/DevIndiaData";
		form.excelReadFillForm(filePath, "/dataFile.xlsx", "Sheet1");
	}




}
