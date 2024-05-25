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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://metrodataacademy.id/metrodata-training/list')

WebUI.click(findTestObject('Page_Metrodata Academy/a_Masuk'))

WebUI.setText(findTestObject('Page_Metrodata Academy/input__email'), username)

WebUI.setEncryptedText(findTestObject('Page_Metrodata Academy/input__password'), password)

WebUI.click(findTestObject('Page_Metrodata Academy/button_Masuk'))

WebUI.click(findTestObject('Page_Metrodata Academy/svg_M Gilang Rizky Ramadhan_w-5 h-5 ml-1'))

WebUI.click(findTestObject('Page_Metrodata Academy/button_Keluar'))

WebUI.closeBrowser(FailureHandling.STOP_ON_FAILURE)

