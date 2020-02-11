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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://hybris-qa2.sgproof.com/sgws/en/usd/search?q=:relevance')

WebUI.click(findTestObject('Object Repository/svg_Cases_svg-inline--fa fa-plus fa-w-12'))

WebUI.click(findTestObject('Object Repository/svg_Cases_svg-inline--fa fa-plus fa-w-12'))

WebUI.click(findTestObject('Object Repository/svg_Cases_svg-inline--fa fa-minus fa-w-12'))

WebUI.click(findTestObject('Object Repository/path'))

WebUI.click(findTestObject('Object Repository/button_Add to Cart'))

WebUI.click(findTestObject('Object Repository/div_Add to Cart                            _ea6bf7'))

WebUI.doubleClick(findTestObject('Object Repository/div_Add to Cart                            _ea6bf7'))

WebUI.click(findTestObject('Object Repository/svg_Skip to main content_svg-inline--fa fa-_7a793c'))

WebUI.click(findTestObject('Object Repository/button_Checkout'))

WebUI.setText(findTestObject('Object Repository/input_Purchase Order Number_purchaseOrderNumber'), 'PO0001')

WebUI.setText(findTestObject('Object Repository/textarea_Driver Delivery Instructions_drive_6e99df'), 'PO0001')

WebUI.click(findTestObject('Object Repository/button_Checkout'))

WebUI.click(findTestObject('Object Repository/div_'))

WebUI.click(findTestObject('Object Repository/button_Submit Order'))

WebUI.waitForElementPresent(findTestObject('Object Repository/p_Thank you'),5)

WebUI.click(findTestObject('Object Repository/p_Thank you'))

WebUI.click(findTestObject('Object Repository/a_QA260195007'))

WebUI.closeBrowser()

