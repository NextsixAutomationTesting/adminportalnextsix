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

WebUI.setText(findTestObject('Object Repository/create new agent/Page_The Next Six Admin (SIT)/input_User Name_username'), 
    'Ziqh')

WebUI.setEncryptedText(findTestObject('Object Repository/create new agent/Page_The Next Six Admin (SIT)/input_Password_password'), 
    'ZnTcfyJ/lDA6t7m3oz/+tA==')

WebUI.click(findTestObject('Object Repository/create new agent/Page_The Next Six Admin (SIT)/button_Sign in'))

WebUI.click(findTestObject('Object Repository/create new agent/Page_The Next Six Admin (SIT)/span_agency'))

WebUI.click(findTestObject('Object Repository/create new agent/Page_The Next Six Admin (SIT)/span_agents'))

WebUI.click(findTestObject('Object Repository/create new agent/Page_The Next Six Admin (SIT)/button_New Public Agent'))

WebUI.selectOptionByValue(findTestObject('Object Repository/create new agent/Page_The Next Six Admin (SIT)/select_DisabledIn ServiceTemporary Out of Service'), 
    'In Service', true)

WebUI.setText(findTestObject('Object Repository/create new agent/Page_The Next Six Admin (SIT)/input__login'), 'admin@gmail.com')

WebUI.setText(findTestObject('Object Repository/create new agent/Page_The Next Six Admin (SIT)/input__name'), 'AD')

WebUI.click(findTestObject('Object Repository/create new agent/Page_The Next Six Admin (SIT)/input__firstName'))

WebUI.setText(findTestObject('Object Repository/create new agent/Page_The Next Six Admin (SIT)/input__name'), 'Admin')

WebUI.setText(findTestObject('Object Repository/create new agent/Page_The Next Six Admin (SIT)/input__firstName'), 'admin')

WebUI.setText(findTestObject('Object Repository/create new agent/Page_The Next Six Admin (SIT)/input__lastName'), 'admin')

WebUI.getText(findTestObject('Object Repository/create new agent/Page_The Next Six Admin (SIT)/input__nickname'))

WebUI.setText(findTestObject('Object Repository/create new agent/Page_The Next Six Admin (SIT)/input__mobile'), '0189845374')

WebUI.setText(findTestObject('Object Repository/create new agent/Page_The Next Six Admin (SIT)/input__icno'), '000000-00-0000')

WebUI.setText(findTestObject('Page_The Next Six Admin (SIT)/input_Date of Birth_dob'), '22/05/2023')

WebUI.selectOptionByValue(findTestObject('Object Repository/create new agent/Page_The Next Six Admin (SIT)/select_GenderFemaleMale'), 
    'Male', true)

WebUI.setText(findTestObject('Object Repository/create new agent/Page_The Next Six Admin (SIT)/textarea_K'), 'K')

WebUI.setText(findTestObject('Object Repository/create new agent/Page_The Next Six Admin (SIT)/textarea_Ku'), 'Ku')

WebUI.setText(findTestObject('Object Repository/create new agent/Page_The Next Six Admin (SIT)/textarea_Kuc'), 'Kuc')

WebUI.setText(findTestObject('Object Repository/create new agent/Page_The Next Six Admin (SIT)/textarea_Kuch'), 'Kuch')

WebUI.setText(findTestObject('Object Repository/create new agent/Page_The Next Six Admin (SIT)/textarea_Kucha'), 'Kucha')

WebUI.setText(findTestObject('Object Repository/create new agent/Page_The Next Six Admin (SIT)/textarea_Kuchai'), 'Kuchai')

WebUI.setText(findTestObject('Object Repository/create new agent/Page_The Next Six Admin (SIT)/textarea_Kuchai_1'), 'Kuchai ')

WebUI.setText(findTestObject('Object Repository/create new agent/Page_The Next Six Admin (SIT)/textarea_Kuchai L'), 'Kuchai L')

WebUI.setText(findTestObject('Object Repository/create new agent/Page_The Next Six Admin (SIT)/textarea_Kuchai La'), 'Kuchai La')

WebUI.setText(findTestObject('Object Repository/create new agent/Page_The Next Six Admin (SIT)/textarea_Kuchai Lam'), 'Kuchai Lam')

WebUI.setText(findTestObject('Object Repository/create new agent/Page_The Next Six Admin (SIT)/textarea_Kuchai Lama'), 'Kuchai Lama')

WebUI.selectOptionByValue(findTestObject('Object Repository/create new agent/Page_The Next Six Admin (SIT)/select_StateJohorKedahKelantanMelakaNegeri _ee4b0a'), 
    'Negeri Sembilan', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/create new agent/Page_The Next Six Admin (SIT)/select_AreaAmpanganBahauBandar Baru Serting_fae656'), 
    'Labu', true)

WebUI.setText(findTestObject('Object Repository/create new agent/Page_The Next Six Admin (SIT)/textarea_s'), 's')

WebUI.setText(findTestObject('Object Repository/create new agent/Page_The Next Six Admin (SIT)/textarea_sy'), 'sy')

WebUI.setText(findTestObject('Object Repository/create new agent/Page_The Next Six Admin (SIT)/textarea_s'), 's')

WebUI.setText(findTestObject('Object Repository/create new agent/Page_The Next Six Admin (SIT)/textarea_sh'), 'sh')

WebUI.setText(findTestObject('Object Repository/create new agent/Page_The Next Six Admin (SIT)/textarea_shy'), 'shy')

WebUI.setText(findTestObject('Object Repository/create new agent/Page_The Next Six Admin (SIT)/textarea_shy_1'), 'shy ')

WebUI.setText(findTestObject('Object Repository/create new agent/Page_The Next Six Admin (SIT)/textarea_shy p'), 'shy p')

WebUI.setText(findTestObject('Object Repository/create new agent/Page_The Next Six Admin (SIT)/textarea_shy pe'), 'shy pe')

WebUI.setText(findTestObject('Object Repository/create new agent/Page_The Next Six Admin (SIT)/textarea_shy per'), 'shy per')

WebUI.setText(findTestObject('Object Repository/create new agent/Page_The Next Six Admin (SIT)/textarea_shy pers'), 'shy pers')

WebUI.setText(findTestObject('Object Repository/create new agent/Page_The Next Six Admin (SIT)/textarea_shy perso'), 'shy perso')

WebUI.setText(findTestObject('Object Repository/create new agent/Page_The Next Six Admin (SIT)/textarea_shy person'), 'shy person')

WebUI.uploadFile(findTestObject('Page_The Next Six Admin (SIT)/p_Drag and drop an image here, or click to _b81b3c'), 'C:\\Users\\user\\Downloads\\admin.jpg')

WebUI.click(findTestObject('Object Repository/create new agent/Page_The Next Six Admin (SIT)/button_Crop and Finish'))

WebUI.uploadFile(findTestObject('Page_The Next Six Admin (SIT)/input__ics'), 'C:\\Users\\user\\Downloads\\icimage.jpg')

WebUI.selectOptionByValue(findTestObject('Object Repository/create new agent/Page_The Next Six Admin (SIT)/select_Select PackageKick Starter Pack (Fre_068a6c'), 
    '603dd950f18dad021153a640', true)

WebUI.getText(findTestObject('Object Repository/create new agent/Page_The Next Six Admin (SIT)/input_REN ID_renId'))

WebUI.click(findTestObject('Object Repository/create new agent/Page_The Next Six Admin (SIT)/div_Type to search company name'))

WebUI.click(findTestObject('Object Repository/create new agent/Page_The Next Six Admin (SIT)/span_A Must Group'))

WebUI.selectOptionByValue(findTestObject('Object Repository/create new agent/Page_The Next Six Admin (SIT)/select_Select Firm NoE (3) 0488'), 
    'E (3) 0488', true)

WebUI.getText(findTestObject('Object Repository/create new agent/Page_The Next Six Admin (SIT)/input_Firm Address_firmAddress'))

WebUI.getText(findTestObject('Object Repository/create new agent/Page_The Next Six Admin (SIT)/input_Firm Contact_firmContact'))

WebUI.setText(findTestObject('Object Repository/create new agent/Page_The Next Six Admin (SIT)/input_Branch_branch'), 'HQ')

WebUI.selectOptionByValue(findTestObject('Object Repository/create new agent/Page_The Next Six Admin (SIT)/select_Specialized StateJohorKedahKelantanM_50fe30'), 
    'Wilayah Persekutuan Labuan', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/create new agent/Page_The Next Six Admin (SIT)/select_Specialized AreaLabuan'), 
    'Labuan', true)

WebUI.click(findTestObject('Object Repository/create new agent/Page_The Next Six Admin (SIT)/button_Save'))

WebUI.setText(findTestObject('Object Repository/create new agent/Page_The Next Six Admin (SIT)/input__mobile'), '018-984-5374')

WebUI.click(findTestObject('Object Repository/create new agent/Page_The Next Six Admin (SIT)/button_Save'))

WebUI.setText(findTestObject('Object Repository/create new agent/Page_The Next Six Admin (SIT)/input__mobile'), '018-9845374')

WebUI.click(findTestObject('Object Repository/create new agent/Page_The Next Six Admin (SIT)/button_Save'))

WebUI.verifyElementText(findTestObject('Object Repository/create new agent/Page_The Next Six Admin (SIT)/h5_Do you confirmed the updates'), 
    'Do you confirmed the updates?')

WebUI.click(findTestObject('Object Repository/create new agent/Page_The Next Six Admin (SIT)/button_Okay'))

