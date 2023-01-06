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

WebUI.callTestCase(findTestCase('Quick login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_The Next Six Admin (SIT)/span_agency'))

WebUI.click(findTestObject('Object Repository/Page_The Next Six Admin (SIT)/create new company/Page_The Next Six Admin (SIT)/span_company'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_The Next Six Admin (SIT)/create new company/Page_The Next Six Admin (SIT)/h1_Company'), 
    'Company')

totalcom = WebUI.getText(findTestObject('Object Repository/Page_The Next Six Admin (SIT)/create new company/Page_The Next Six Admin (SIT)/strong_1396'), 
    FailureHandling.STOP_ON_FAILURE)
int totalcom = totalcom as Integer
println(totalcom)

WebUI.click(findTestObject('Object Repository/Page_The Next Six Admin (SIT)/create new company/Page_The Next Six Admin (SIT)/button_New company'))

def companyname = 'The Good And Bad '

newdate = new Date().format('yyyy-MM-dd-HH:mm:ss')
String firmnumber = new Date().format('ddmmss')
println firmnumber
//println newdate
//println(rnd.nextInt(1000))
WebUI.setText(findTestObject('Object Repository/Page_The Next Six Admin (SIT)/create new company/Page_The Next Six Admin (SIT)/input_Company Name_firmName'), 
    companyname + newdate)

WebUI.setText(findTestObject('Object Repository/Page_The Next Six Admin (SIT)/create new company/Page_The Next Six Admin (SIT)/input_Firm No_firmNo'), 
    'ABC'+ firmnumber)

WebUI.setText(findTestObject('Object Repository/Page_The Next Six Admin (SIT)/create new company/Page_The Next Six Admin (SIT)/textarea_Address_address'), 
    'Kuchai lama, Jalan Maju 13')

WebUI.setText(findTestObject('Object Repository/Page_The Next Six Admin (SIT)/create new company/Page_The Next Six Admin (SIT)/input_Contact_contact'), 
    '01156438483')

WebUI.click(findTestObject('Object Repository/Page_The Next Six Admin (SIT)/create new company/Page_The Next Six Admin (SIT)/button_Okay'))

newtotalcom = totalcom+1
String newtotalcom = newtotalcom
println(newtotalcom)

WebUI.verifyElementText(findTestObject('Object Repository/Page_The Next Six Admin (SIT)/create new company/Page_The Next Six Admin (SIT)/strong_1397'), 
	newtotalcom)

WebUI.setText(findTestObject('Object Repository/Page_The Next Six Admin (SIT)/create new company/Page_The Next Six Admin (SIT)/input_Company_name'), 
    companyname + newdate)

WebUI.click(findTestObject('Object Repository/Page_The Next Six Admin (SIT)/create new company/Page_The Next Six Admin (SIT)/button_Search'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_The Next Six Admin (SIT)/create new company/Page_The Next Six Admin (SIT)/td_The Good And Bad 1'), 
    companyname + newdate)

WebUI.verifyElementText(findTestObject('Object Repository/Page_The Next Six Admin (SIT)/create new company/Page_The Next Six Admin (SIT)/td_1'), 
    '1')

WebUI.click(findTestObject('Object Repository/Page_The Next Six Admin (SIT)/create new company/Page_The Next Six Admin (SIT)/button_New company'))
WebUI.setText(findTestObject('Object Repository/Page_The Next Six Admin (SIT)/create new company/Page_The Next Six Admin (SIT)/input_Company Name_firmName'),
	companyname + newdate)

WebUI.setText(findTestObject('Object Repository/Page_The Next Six Admin (SIT)/create new company/Page_The Next Six Admin (SIT)/input_Firm No_firmNo'),
	'ABC'+ firmnumber)

WebUI.setText(findTestObject('Object Repository/Page_The Next Six Admin (SIT)/create new company/Page_The Next Six Admin (SIT)/textarea_Address_address'),
	'Kuchai lama, Jalan Maju 13')

WebUI.setText(findTestObject('Object Repository/Page_The Next Six Admin (SIT)/create new company/Page_The Next Six Admin (SIT)/input_Contact_contact'),
	'01156438483')

WebUI.click(findTestObject('Object Repository/Page_The Next Six Admin (SIT)/create new company/Page_The Next Six Admin (SIT)/button_Okay'))
