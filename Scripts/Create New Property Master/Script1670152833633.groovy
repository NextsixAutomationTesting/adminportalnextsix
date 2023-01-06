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

WebUI.navigateToUrl('https://sit-admin.nextsix.com/')

WebUI.setText(findTestObject('Object Repository/Page_The Next Six Admin (SIT)/input_User Name_username'), 'Ziqh')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_The Next Six Admin (SIT)/input_Password_password'), 'ZnTcfyJ/lDA6t7m3oz/+tA==')

WebUI.click(findTestObject('Object Repository/Page_The Next Six Admin (SIT)/button_Sign in'))

WebUI.click(findTestObject('Object Repository/Page_The Next Six Admin (SIT)/svg_Setup_cr-sidebar__nav-item-icon'))

WebUI.click(findTestObject('Object Repository/Page_The Next Six Admin (SIT)/span_Property Master'))

WebUI.click(findTestObject('Object Repository/Page_The Next Six Admin (SIT)/button_New property master'))

WebUI.setText(findTestObject('Object Repository/Page_The Next Six Admin (SIT)/input_Property Name_name'), 'Labu Apartment One')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_The Next Six Admin (SIT)/select_Property CategoryApartmentFlatCondoS_56a06f'), 
    'Apartment/Flat', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_The Next Six Admin (SIT)/select_Property TypeApartmentFlat'), 
    'Apartment', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_The Next Six Admin (SIT)/select_CountryMalaysia'), 'Malaysia', 
    true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_The Next Six Admin (SIT)/select_StateWilayah Persekutuan Kuala Lumpu_647440'), 
    'Negeri Sembilan', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_The Next Six Admin (SIT)/select_AreaAmpanganBahauBandar Baru Serting_fae656'), 
    'Labu', true)

WebUI.setText(findTestObject('Object Repository/Page_The Next Six Admin (SIT)/input_Property Address_city'), 'Labu')

WebUI.setText(findTestObject('Object Repository/Page_The Next Six Admin (SIT)/input_Property Address_postcode'), '79000')

WebUI.setText(findTestObject('Object Repository/Page_The Next Six Admin (SIT)/input_Property Address_line1'), 'Jalan Sendayan 2')

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_The Next Six Admin (SIT)/button_Save'))

WebUI.setText(findTestObject('Object Repository/Page_The Next Six Admin (SIT)/input_Property Master Setup_form-control'), 
    'Labu Apartment One')

WebUI.click(findTestObject('Object Repository/Page_The Next Six Admin (SIT)/button_Search'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_The Next Six Admin (SIT)/td_Labu Apartment One'), 'Labu Apartment One')

WebUI.verifyElementText(findTestObject('Object Repository/Page_The Next Six Admin (SIT)/td_Jalan Sendayan 2 Labu 79000 Negeri Sembi_46029d'), 
    'Jalan Sendayan 2 Labu 79000 Negeri Sembilan Malaysia')

WebUI.click(findTestObject('Object Repository/Page_The Next Six Admin (SIT)/span_agency'))

WebUI.click(findTestObject('Object Repository/Page_The Next Six Admin (SIT)/span_properties'))

WebUI.click(findTestObject('Object Repository/Page_The Next Six Admin (SIT)/button_New Property'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_The Next Six Admin (SIT)/select_Property CategoryAgricultural LandAp_0d50e3'), 
    'Apartment/Flat', true)

WebUI.click(findTestObject('Object Repository/Page_The Next Six Admin (SIT)/div_Type at least 3 characters to search pr_c81f40'))

WebUI.setText(findTestObject('Object Repository/Page_The Next Six Admin (SIT)/input__react-select-4-input'), 'labu apartment one')

WebUI.click(findTestObject('Object Repository/Page_The Next Six Admin (SIT)/mark_Labu Apartment One'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_The Next Six Admin (SIT)/input__name'), '')

WebUI.verifyElementText(findTestObject('Object Repository/Page_The Next Six Admin (SIT)/input__line1'), '')

WebUI.verifyElementText(findTestObject('Object Repository/Page_The Next Six Admin (SIT)/input_City or Town_city'), '')

WebUI.verifyElementText(findTestObject('Object Repository/Page_The Next Six Admin (SIT)/input__postcode'), '')

