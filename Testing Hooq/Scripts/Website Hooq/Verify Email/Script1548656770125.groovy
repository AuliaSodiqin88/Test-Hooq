import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://login.yahoo.com/config/login?.src=fpctx&.intl=id&.lang=id-ID&.done=https%3A%2F%2Fid.yahoo.com')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('input_username'), 'aulia.sodiqin@yahoo.co.id')

WebUI.click(findTestObject('input_signin'))

WebUI.setText(findTestObject('input_password'), 'Jadian0612')

WebUI.click(findTestObject('button_Masuk'))

WebUI.click(findTestObject('span_Email'))

WebUI.click(findTestObject('span_Afif dari HOOQ'))

WebUI.click(findTestObject('td_BUKA AKSES SEKARANG'))

WebUI.setText(findTestObject('input_email (2)'), 'aulia.sodiqin@yahoo.co.id')

WebUI.click(findTestObject('span_Selesai (1)'))

WebUI.click(findTestObject('span_Saya sudah verifikasi'))

WebUI.closeBrowser()

