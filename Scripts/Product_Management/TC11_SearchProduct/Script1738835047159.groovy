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

// Call the login test case
WebUI.callTestCase(findTestCase('User_Login/TC04_LoginWithValidCredentials'), [:], FailureHandling.STOP_ON_FAILURE)

// Verify that the Home Page is visible
WebUI.verifyTextPresent('FEATURES ITEMS', false)

// Click on the 'Products' button
WebUI.click(findTestObject('Object Repository/HomePage/buttonMenuProducts'))

// Verify that the user is navigated to the ALL PRODUCTS page
WebUI.verifyTextPresent('ALL PRODUCTS', false)

// Enter Product Name in the search input and click Search button
WebUI.setText(findTestObject('Object Repository/Product/inputSearchBar'), 'winter top')
WebUI.click(findTestObject('Object Repository/Product/buttonSearch'))

// Verify that the 'SEARCHED PRODUCTS' label is visible
WebUI.verifyTextPresent('SEARCHED PRODUCTS', false)

// Verify that the relevant products are displayed
WebUI.mouseOver(findTestObject('Object Repository/Product/productContainer'))
WebUI.verifyElementPresent(findTestObject('Object Repository/Product/productWinterTop'), 1)

WebUI.closeBrowser()