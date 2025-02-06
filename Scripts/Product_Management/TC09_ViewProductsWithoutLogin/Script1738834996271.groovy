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

// Set the variables
String baseURL = GlobalVariable.baseURL
String expectedUrl = GlobalVariable.baseURL + 'product_details/1'

// Open the browser and navigate to the base URL
WebUI.openBrowser('')
WebUI.navigateToUrl(baseURL)

// Verify that the Home Page is visible
WebUI.verifyTextPresent('FEATURES ITEMS', false)

// Click on the 'Products' button
WebUI.click(findTestObject('Object Repository/HomePage/buttonMenuProducts'))

// Verify that the user is navigated to the ALL PRODUCTS page
WebUI.verifyTextPresent('ALL PRODUCTS', false)

// Click on the 'View Product' button for the first product
WebUI.click(findTestObject('Object Repository/Product/buttonViewProduct'))

// Verify that the current URL matches the expected URL
String currentUrl = WebUI.getUrl()
WebUI.verifyMatch(currentUrl, expectedUrl, false)

// Verify that the Product Details are visible
WebUI.verifyTextPresent('Quantity', false)
WebUI.verifyTextPresent('Availability', false)
WebUI.verifyTextPresent('Condition', false)
WebUI.verifyTextPresent('Brand', false)
WebUI.verifyElementVisible(findTestObject('Object Repository/Product/buttonAddToCart'))

WebUI.closeBrowser()