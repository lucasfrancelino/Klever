package elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FiltroElementMap {
    @FindBy(xpath = "//*[@id=\"button-menu-icon\"]/span/svg")
    public WebElement menu;
    @FindBy(linkText = "/html/body/div[6]/div/div[2]/div/div/div[2]/ul[1]/li[1]/span/a")
    public WebElement markets;
    @FindBy(xpath = "//input[@class='ant-input']")
    public WebElement campoBusca;
    @FindBy(id = "rc-tabs-2-tab-tab_favorites")
    public WebElement favorite;
    @FindBy(id = "rc-tabs-2-tab-tab_BNB")
    public WebElement BNB;
}
