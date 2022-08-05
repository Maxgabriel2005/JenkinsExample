package Utils;

import Pages.LoginPage;
import Pages.NavMenuPage;

public class BasePage extends BaseTest {
	
	public NavMenuPage navMenu = new NavMenuPage(driver.get());
	public LoginPage loginPage =new LoginPage(driver.get());
	

}
