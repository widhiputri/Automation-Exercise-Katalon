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

// Set the Global Variables
String baseURL = GlobalVariable.baseURL

// Open the browser and navigate to the base URL
WebUI.openBrowser('')
WebUI.navigateToUrl(baseURL)

// Click on the 'Products' button
WebUI.click(findTestObject('Object Repository/HomePage/buttonMenuProducts'))

// Hover over the first product and click 'Add to Cart'
WebUI.mouseOver(findTestObject('Object Repository/Product/productToAdd1'))
WebUI.click(findTestObject('Object Repository/Product/buttonAddProduct1'))

// Verify that the first product is successfully added to the Cart
WebUI.verifyTextPresent('Your product has been added to cart', false)

// Click the 'Continue Shopping' button
WebUI.click(findTestObject('Object Repository/Product/buttonContinueShopping'))

// Hover over the second product and click 'Add to Cart'
WebUI.mouseOver(findTestObject('Object Repository/Product/productToAdd2'))
WebUI.click(findTestObject('Object Repository/Product/buttonAddProduct2'))

// Verify that the second product is successfully added to the Cart
WebUI.verifyTextPresent('Your product has been added to cart', false)

// Click the 'View Cart'
WebUI.click(findTestObject('Object Repository/Product/linkViewCart'))

// Verify the product added
WebUI.click(findTestObject('Object Repository/Cart/listChartProduct1'))
WebUI.click(findTestObject('Object Repository/Cart/listChartProduct2'))

WebUI.closeBrowser()