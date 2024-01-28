import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject

import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile

import internal.GlobalVariable as GlobalVariable

import com.kms.katalon.core.annotation.BeforeTestCase
import com.kms.katalon.core.annotation.BeforeTestSuite
import com.kms.katalon.core.annotation.AfterTestCase
import com.kms.katalon.core.annotation.AfterTestSuite
import com.kms.katalon.core.context.TestCaseContext
import com.kms.katalon.core.context.TestSuiteContext

class TL_Amazon_Proj_001 {
	/**
	 * Executes before every test case starts.
	 * @param testCaseContext related information of the executed test case.
	 */
	@BeforeTestCase
	def sampleBeforeTestCase() {
		WebUI.click(findTestObject('Amazon_Login_OR/Page_Online Shopping site in India Shop Onl_10c5f3/span_Account  Lists'))
		
		WebUI.setText(findTestObject('Object Repository/Amazon_Login_OR/Page_Amazon Sign In/input_email'), '7249078715')
		
		WebUI.click(findTestObject('Object Repository/Amazon_Login_OR/Page_Amazon Sign In/inputcontinue'))
		
		WebUI.setText(findTestObject('Object Repository/Amazon_Login_OR/Page_Amazon Sign In/input_password'), 'Harshu@13')
		
		WebUI.click(findTestObject('Object Repository/Amazon_Login_OR/Page_Amazon Sign In/inputsignInSubmit'))
		
	}

	/**
	 * Executes after every test case ends.
	 * @param testCaseContext related information of the executed test case.
	 */
	@AfterTestCase
	def sampleAfterTestCase() {
		WebUI.mouseOver(findTestObject('LOgout_Or/Page_Your Account/span_Account  Lists'), FailureHandling.STOP_ON_FAILURE)
		
		WebUI.click(findTestObject('LOgout_Or/Page_Your Account/span_Sign Out'))
		
	}

	/**
	 * Executes before every test suite starts.
	 * @param testSuiteContext: related information of the executed test suite.
	 */
	@BeforeTestSuite
	def sampleBeforeTestSuite( ) {
		//println testSuiteContext.getTestSuiteId()
		
		
	}

	/**
	 * Executes after every test suite ends.
	 * @param testSuiteContext: related information of the executed test suite.
	 */
	@AfterTestSuite
	def sampleAfterTestSuite( ) {
	//	println testSuiteContext.getTestSuiteId()
		
		
	}
}