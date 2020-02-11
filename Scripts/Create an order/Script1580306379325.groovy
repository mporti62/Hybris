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

WebUI.navigateToUrl('https://hybris-qa2.sgproof.com/sgws/en/usd/')

WebUI.click(findTestObject('Object Repository/Page_Southern Glazers Wine and Spirits/div_You are on a modal asking you to confir_9344ba'))

WebUI.maximizeWindow()

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Southern Glazers Wine and Spirits/select_Select Site                         _4b8e91'), 
    '1', true)

WebUI.sendKeys(findTestObject('Object Repository/Page_Southern Glazers Wine and Spirits/button_Yes'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_Southern Glazers Wine and Spirits/a_Log In'))

WebUI.setText(findTestObject('Object Repository/Page_Southern Glazers Wine and Spirits/input_User Name_username'), 'grillcheesefl@mailinator.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Southern Glazers Wine and Spirits/input_Password_password'), 
    '/3RKn9nGpOGwryYwplMFIg==')

WebUI.sendKeys(findTestObject('Object Repository/Page_Southern Glazers Wine and Spirits/input_Password_password'), Keys.chord(
        Keys.ENTER))

//WebUI.doubleClick(findTestObject('Object Repository/Page_Southern Glazers Wine and Spirits/div_Login_gigya-screen-loader'))
WebUI.waitForElementPresent(findTestObject('Object Repository/Page_Southern Glazers Wine and Spirits/a_Products'), 2)
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Southern Glazers Wine and Spirits/a_Products'), 1)
WebUI.click(findTestObject('Object Repository/Page_Southern Glazers Wine and Spirits/a_Products'))
//WebUI.sendKeys(findTestObject('Object Repository/Page_Southern Glazers Wine and Spirits/button_Yes'), Keys.chord(Keys.ENTER))
CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Page_Southern Glazers Wine and Spirits/a_Shop All Products'))
WebUI.delay(1)
WebUI.sendKeys(findTestObject('Object Repository/Page_Southern Glazers Wine and Spirits/a_Shop All Products'), Keys.chord(Keys.ENTER))
//WebUI.click(findTestObject('Object Repository/Page_Southern Glazers Wine and Spirits/a_Shop All Products'))

WebUI.waitForElementPresent(findTestObject('Object Repository/svg_Cases_svg-inline--fa fa-plus fa-w-12'),3)
WebUI.click(findTestObject('Object Repository/svg_Cases_svg-inline--fa fa-plus fa-w-12'))

WebUI.click(findTestObject('Object Repository/svg_Cases_svg-inline--fa fa-plus fa-w-12'))

//WebUI.click(findTestObject('Object Repository/svg_Cases_svg-inline--fa fa-minus fa-w-12'))

//WebUI.click(findTestObject('Object Repository/path'))

WebUI.click(findTestObject('Object Repository/button_Add to Cart'))

WebUI.click(findTestObject('Object Repository/div_Add to Cart                            _ea6bf7'))

//WebUI.doubleClick(findTestObject('Object Repository/div_Add to Cart                            _ea6bf7'))

WebUI.waitForElementPresent(findTestObject('Object Repository/svg_Skip to main content_svg-inline--fa fa-_7a793c'),3)
WebUI.click(findTestObject('Object Repository/svg_Skip to main content_svg-inline--fa fa-_7a793c'))

WebUI.waitForElementPresent(findTestObject('Object Repository/button_Checkout'),10)

//CustomKeywords.'com.reusableComponents.HighlightElement.run'(findTestObject('Object Repository/button_Checkout'))

WebUI.click(findTestObject('Object Repository/button_Checkout'))

WebUI.waitForElementPresent(findTestObject('Object Repository/button_Submit Order'),5)

WebUI.click(findTestObject('Object Repository/button_Submit Order'))

WebUI.waitForElementPresent(findTestObject('Object Repository/p_Thank you'),5)


WebUI.click(findTestObject('Object Repository/p_Thank you'))

WebUI.click(findTestObject('Object Repository/a_QA260195007'))

WebUI.closeBrowser()

