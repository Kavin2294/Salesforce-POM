package salesPOM;

import org.testng.annotations.Test;

import baseclass.BaseclassPOM;

public class Runnerclass extends BaseclassPOM {
	
	@Test
	public void sfcase() throws InterruptedException {
	
	Loginpage lp = new Loginpage(driver);
	lp.uname().pword().clicklogin().verify().toggle().click_on_view_all().select_from_the_app_launcher()
	.click_on_the_tab().click_on_the_button().new_opportunity_page_should_be_displayed().enter_the_opportunity_name_as()
	.enter_amount_as().choose_the_close_date_as_today().select_stage_as_need_analysis().click_on_the_button_and_verify_the_opportunity_name().opportunity_name_should_be_displayed();
	}

}
