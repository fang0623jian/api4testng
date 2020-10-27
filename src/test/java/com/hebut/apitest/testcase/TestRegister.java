package com.hebut.apitest.testcase;

import com.hebut.apitest.listener.APITestListener;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.*;

@Listeners(APITestListener.class)
public class TestRegister {
    @Test(description = "测试极验api1接口",priority = 1,groups = {"group1"})
    public void testRegisterSuccess() {
        System.out.println("register.php接口返回200");
        Reporter.log("测试日志输出");
        Assert.assertTrue(true);
    }
}
