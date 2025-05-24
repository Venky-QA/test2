package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;
import java.time.Duration;

public class HomePage {
    WebDriver driver;
    By loader = By.id("loader");
    By myDreamsBtn = By.id("dreams");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isLoaderDisplayed() {
        return driver.findElement(loader).isDisplayed();
    }

    public void waitForLoaderToDisappear() {
        new WebDriverWait(driver, Duration.ofSeconds(5))
            .until(ExpectedConditions.invisibilityOfElementLocated(loader));
    }

    public boolean isMyDreamsBtnVisible() {
        return driver.findElement(myDreamsBtn).isDisplayed();
    }

    public void clickMyDreams() {
        driver.findElement(myDreamsBtn).click();
    }
}
