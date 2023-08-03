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
import com.kms.katalon.keyword.excel.ExcelKeywords as ExcelKeywords

sheet = ExcelKeywords.getExcelSheetByName(GlobalVariable.testData, 'Register')

String email = ExcelKeywords.getCellValueByAddress(sheet, 'A2')

String phoneNumber = ExcelKeywords.getCellValueByAddress(sheet, 'B2')

String password = ExcelKeywords.getCellValueByAddress(sheet, 'C2')

String confirmPassword = ExcelKeywords.getCellValueByAddress(sheet, 'D2')

String firstName = ExcelKeywords.getCellValueByAddress(sheet, 'E2')

String lastName = ExcelKeywords.getCellValueByAddress(sheet, 'F2')

String city = ExcelKeywords.getCellValueByAddress(sheet, 'G2')

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.cermati.com/app/gabung')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/Register/Input Email'), email)

WebUI.setText(findTestObject('Object Repository/Register/Input Phone Number'), phoneNumber)

WebUI.setText(findTestObject('Object Repository/Register/Input Password'), password)

WebUI.setText(findTestObject('Object Repository/Register/Input Confirm Password'), confirmPassword)

WebUI.setText(findTestObject('Object Repository/Register/Input First Name'), firstName)

WebUI.setText(findTestObject('Object Repository/Register/Input Last Name'), lastName)

WebUI.setText(findTestObject('Object Repository/Register/Input City'), city)

WebUI.sendKeys(findTestObject('Object Repository/Register/Input City'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Register/Button Daftar'))

if (WebUI.verifyElementPresent(findTestObject('Object Repository/Register/Email Sudah Terdaftar'), 2, FailureHandling.OPTIONAL) == 
true) {
    WebUI.click(findTestObject('Object Repository/Register/Button Masuk'))
}

WebUI.delay(3)

WebUI.closeBrowser()

