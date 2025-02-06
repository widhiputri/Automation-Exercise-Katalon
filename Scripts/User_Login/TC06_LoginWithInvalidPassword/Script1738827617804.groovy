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

// Use the Global Variables
String email = GlobalVariable.loginEmail
String loginUrl = GlobalVariable.baseURL + 'login'

WebUI.openBrowser('')

// Navigate to the login page
WebUI.navigateToUrl(loginUrl)

// Enter incorrect user login information
WebUI.setText(findTestObject('Object Repository/LoginAndSignupPage/inputLoginEmail'), email)
WebUI.setEncryptedText(findTestObject('Object Repository/LoginAndSignupPage/inputLoginPassword'), 'ifTZcph1FO93SVr0dZvNUw==')

// Click the Login button
WebUI.click(findTestObject('Object Repository/LoginAndSignupPage/buttonLogin'))

// Verify failed login
WebUI.verifyTextPresent('Your email or password is incorrect!', false)

WebUI.closeBrowser()

