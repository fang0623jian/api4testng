package com.hebut.apitest.listener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class APITestListener implements ITestListener {
    @Override
    public void onTestStart(ITestResult iTestResult) {
        System.out.println("测试用例执行成功后调用");
    }

    @Override
    public void onTestSuccess(ITestResult iTestResult) {

    }

    @Override
    public void onTestFailure(ITestResult iTestResult) {

    }

    @Override
    public void onTestSkipped(ITestResult iTestResult) {

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {

    }

    @Override
    public void onStart(ITestContext iTestContext) {

    }

    @Override
    public void onFinish(ITestContext iTestContext) {

    }
}
