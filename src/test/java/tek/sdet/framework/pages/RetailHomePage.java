package tek.sdet.framework.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.framework.base.BaseSetup;

public class RetailHomePage extends BaseSetup {
	
	public RetailHomePage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	// syntax for finding UI elements and storing them in POM classes 
	/**
	 * @FindBy(locatorType = "value")
	 * public WebElement nameOfElement
	 */
	
	@FindBy(xpath="//a[text()='TEKSCHOOL']")
	public WebElement tekSchoolLogo;
	
	@FindBy(id ="search")
	public WebElement allDepartmentDropDown;
	
	@FindBy(css = "#searchInput")
	public WebElement searchBar;
	
	@FindBy(xpath = "//button[@id='searchBtn']")
	public WebElement searchButton; 
	
	@FindBy(linkText = "Sign in")
	public WebElement signInButton;
	
	@FindBy(id="cartBtn")
	public WebElement cartButton;
	
	@FindBy(xpath ="//img[contains(@alt, 'Pokemon')]")
	public WebElement pokemanProductImage;
	@FindBy(xpath = "//span[contains(text(),'All')]")
	public WebElement sideBarButton;
	@FindBy(xpath = "//div[@class = 'sidebar_content-item']/span")
	public List <WebElement> sidebarAllOptions;
	@FindBy(xpath = "//body/div[@id='root']/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]")
	public WebElement sidebarElectronicOption;
	@FindBy(xpath = "//span[contains(text(),'Computers')]")
	public WebElement sideBarComputersOption;
	@FindBy(xpath = "//span[contains(text(),'Smart Home')]")
	public WebElement sideBarSmartHomeOption;
	@FindBy(xpath = "//span[contains(text(),'Sports')]")
	public WebElement sideBarSportOption;
	@FindBy(xpath = "//span[contains(text(),'Automative')]")
	public WebElement sideBarAutomativeOption;
	
	
	

}
