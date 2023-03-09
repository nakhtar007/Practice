package tek.sdet.framework.pages;

import tek.sdet.framework.base.BaseSetup;

public class POMFactory extends BaseSetup {
	private RetailHomePage homePage;
	private RetailSignInPage signInPage;
	private AccountHomePage accountHomePage;
	
	
	
	public POMFactory() {
	this.homePage = new RetailHomePage();	
	this.signInPage = new RetailSignInPage();
	this.accountHomePage = new AccountHomePage();
	}
	
	public RetailHomePage homePage() {
		return this.homePage;
	}
	
	public RetailSignInPage signInPage() {
		return this.signInPage;
	}

	public AccountHomePage accountHomePage() {
		return this.accountHomePage;
	}
}
