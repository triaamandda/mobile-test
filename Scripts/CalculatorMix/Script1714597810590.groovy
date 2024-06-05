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

Mobile.startApplication('C:\\Users\\triaa\\Automate\\Katalon Studio\\EduApp\\mobileapp\\Calculator_v8.1.apk', true)

Mobile.tap(findTestObject('Object Repository/theme/ImageView'), 0)

Mobile.tap(findTestObject('Object Repository/theme/LinearLayout'), 0)

Mobile.tap(findTestObject('Object Repository/theme/Dark'), 0)

Mobile.tap(findTestObject('Object Repository/theme/OK'), 0)

Mobile.tap(findTestObject('Object Repository/theme/Button8'), 0)

Mobile.tap(findTestObject('Object Repository/theme/Button5'), 0)

Mobile.tap(findTestObject('Object Repository/theme/first'), 0)

Mobile.tap(findTestObject('Object Repository/theme/Button2'), 0)

Mobile.tap(findTestObject('Object Repository/theme/Button 0'), 0)

Mobile.tap(findTestObject('Object Repository/theme/Button1'), 0)

Mobile.tap(findTestObject('Object Repository/theme/ButtonAC'), 0)

Mobile.takeScreenshot('C:\\Users\\triaa\\AppData\\Local\\Temp\\screenshot13879264401206900463.png')

Mobile.closeApplication()

