package listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGListeners implements ITestListener {

	
	public void onStart(ITestContext arg0) {
		// TODO Auto-generated method stub
		System.out.println("test started: " +arg0.getName());
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		System.out.println("test failed with success percentage: " +arg0.getName());
		
	}

	public void onTestFailure(ITestResult arg0) {
		// TODO Auto-generated method stub
		System.out.println("test failure: " +arg0.getName());
	}

	public void onTestSkipped(ITestResult arg0) {
		// TODO Auto-generated method stub
		System.out.println("test skipped: " +arg0.getName());
	}

	public void onTestStart(ITestResult arg0) {
		// TODO Auto-generated method stub
		System.out.println("test started: " +arg0.getName());
	}

	public void onTestSuccess(ITestResult arg0) {
		// TODO Auto-generated method stub
		System.out.println("test success: " +arg0.getName());
	}

	public void onFinish(ITestContext arg0) {
		// TODO Auto-generated method stub
		System.out.println("test finished: " +arg0.getName());
	}

}
