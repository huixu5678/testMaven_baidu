package com.po.method;

import com.po.page.baidu_page;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Baidu {
    public static void clickBaidu(WebDriver driver) throws Exception{

        findElement2(baidu_page.baiduInput,driver).sendKeys("云南，我去那里找你好不好");
        findElement2(baidu_page.baiduButton,driver).click();
        Thread.sleep(3000);
    }
    public static WebElement findElement2(By by, WebDriver driver){
        WebDriverWait wait=new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.presenceOfElementLocated(by));
        return driver.findElement(by);

    }
}
