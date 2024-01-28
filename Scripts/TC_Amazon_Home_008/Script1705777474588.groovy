import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

//WebUI.openBrowser('')

//WebUI.navigateToUrl('https://www.amazon.in/')

//WebUI.click(findTestObject('Object Repository/Edit_OR/Page_Online Shopping site in India Shop Onl_10c5f3/span_Account  Lists'))

//WebUI.setText(findTestObject('Object Repository/Edit_OR/Page_Amazon Sign In/input_email'), '7249078715')

//WebUI.click(findTestObject('Object Repository/Edit_OR/Page_Amazon Sign In/inputcontinue'))

//WebUI.setText(findTestObject('Object Repository/Edit_OR/Page_Amazon Sign In/input_password'), 'harish123')

//WebUI.click(findTestObject('Object Repository/Edit_OR/Page_Amazon Sign In/inputsignInSubmit'))

WebUI.click(findTestObject('Object Repository/Edit_OR/Page_Online Shopping site in India Shop Onl_10c5f3/span_Account  Lists'))

WebUI.click(findTestObject('Object Repository/Edit_OR/Page_Your Account/span_Edit login, name, and mobile number'))

WebUI.click(findTestObject('Object Repository/Edit_OR/Page_Login and Security/a_Edit'))

WebUI.setText(findTestObject('Object Repository/Edit_OR/Page_Amazon Change Name, E-mail, Password/input_customerName'), 
    'Harshavardhan')

WebUI.click(findTestObject('Object Repository/Edit_OR/Page_Amazon Change Name, E-mail, Password/inputcnep_1C_submit_button'))

//WebUI.closeBrowser()

