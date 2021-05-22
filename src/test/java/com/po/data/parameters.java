package com.po.data;

import org.testng.annotations.DataProvider;

public class parameters{
    @DataProvider(name = "data_baidu")
    public static Object[][] getdata_baidu() {
        return new Object[][]{
                {"firefox"}, {"internetExplorer"}
        };
    }
}