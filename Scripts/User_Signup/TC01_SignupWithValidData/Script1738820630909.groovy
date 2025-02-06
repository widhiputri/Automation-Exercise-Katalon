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

// Generate a 4-digit timestamp (last 4 digits of current time in milliseconds)
String timestamp = System.currentTimeMillis().toString().takeRight(4)

// Construct email with timestamp
String email = ('janedoeqa' + timestamp) + '@yopmail.com'

WebUI.openBrowser('')

// Append the relative path to the baseURL stored in Global Variable
String loginUrl = GlobalVariable.baseURL + "login"

// Navigate to the login page
WebUI.navigateToUrl(loginUrl)

// Enter the new user signup information
WebUI.setText(findTestObject('Object Repository/LoginAndSignupPage/inputNewUserSignupName'), 'Jane Doe')
WebUI.setText(findTestObject('Object Repository/LoginAndSignupPage/inputNewUserSignupEmail'), email)

// Click the Signup button
WebUI.click(findTestObject('Object Repository/LoginAndSignupPage/buttonSignup'))

// Fill the new user signup form
WebUI.click(findTestObject('Object Repository/LoginAndSignupPage/selectUserTitleMrs'))
WebUI.setEncryptedText(findTestObject('Object Repository/LoginAndSignupPage/inputPassword'), 'cm63QLAYF44=')
WebUI.selectOptionByValue(findTestObject('Object Repository/LoginAndSignupPage/selectDay'), '21', true)
WebUI.selectOptionByValue(findTestObject('Object Repository/LoginAndSignupPage/selectMonth'), '12', true)
WebUI.selectOptionByValue(findTestObject('Object Repository/LoginAndSignupPage/selectYear'), '1996', true)
WebUI.setText(findTestObject('Object Repository/LoginAndSignupPage/inputFirstName'), 'Jane')
WebUI.setText(findTestObject('Object Repository/LoginAndSignupPage/inputLastName'), 'Doe')
WebUI.setText(findTestObject('Object Repository/LoginAndSignupPage/inputCompanyName'), 'ABC Company')
WebUI.setText(findTestObject('Object Repository/LoginAndSignupPage/inputAddressFirstLine'), 'Random street RS01')
WebUI.setText(findTestObject('Object Repository/LoginAndSignupPage/inputAddressSecondLine'), 'Second field of address')
WebUI.selectOptionByValue(findTestObject('Object Repository/LoginAndSignupPage/selectCountry'), 'Singapore', true)
WebUI.setText(findTestObject('Object Repository/LoginAndSignupPage/inputState'), 'Singapore')
WebUI.setText(findTestObject('Object Repository/LoginAndSignupPage/inputCity'), 'Kallang')
WebUI.setText(findTestObject('Object Repository/LoginAndSignupPage/inputZipCode'), '8273827')
WebUI.setText(findTestObject('Object Repository/LoginAndSignupPage/inputMobileNumber'), '+65237381928')

// Click to create account
WebUI.click(findTestObject('Object Repository/LoginAndSignupPage/buttonCreateAccount'))

// Verify that the 'Continue' button is present
WebUI.verifyElementPresent(findTestObject('Object Repository/LoginAndSignupPage/buttonContinue'), 3)

// Verify text 'ACCOUNT CREATED!'
WebUI.verifyTextPresent('ACCOUNT CREATED!', false)

WebUI.closeBrowser()