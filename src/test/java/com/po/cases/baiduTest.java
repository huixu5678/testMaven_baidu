package com.po.cases;


import com.po.method.Baidu;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.net.URL;

public class baiduTest {
    WebDriver driver;

    @Test(dataProvider ="data_baidu",dataProviderClass =com.po.data.parameters.class)
    public void test_baidu(String browser) throws Exception {
        DesiredCapabilities dc=null;
        if(browser.equals("firefox")){
            dc=DesiredCapabilities.firefox();
        }else if(browser.equals("internetExplorer")){
            dc=DesiredCapabilities.internetExplorer();
        }
        driver=new RemoteWebDriver(new URL("http://192.168.0.128:4445/wd/hub"),dc);
        driver.get("http://www.baidu.com");
        Thread.sleep(10000);
        Baidu.clickBaidu(driver);
        driver.quit();
    }
    @AfterMethod
    public void close(){
        driver.quit();
    }
}

