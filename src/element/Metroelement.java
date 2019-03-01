package element;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Metroelement {
	WebDriver dvr;
    public Metroelement(WebDriver paramdvr) {
        PageFactory.initElements(paramdvr, this);
        this.dvr = paramdvr;
    }
    @FindBy(xpath = "//div[@class='main-menu']//nav//ul//li[@class='menu-item-has-children']//ul[@class='sub-menu']//li[@class='menu-item-has-children']//ul[@class='sub-menu']//li//a[contains(text(),'Fresh Vegetables')]")
    WebElement VegElement;
    
    public void vegetableselement() {
    	VegElement.click();
    	}
}
