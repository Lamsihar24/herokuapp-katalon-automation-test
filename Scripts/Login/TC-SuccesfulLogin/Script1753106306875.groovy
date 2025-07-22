import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')
WebUI.navigateToUrl('https://katalon-demo-cura.herokuapp.com/profile.php#login') 
WebUI.setText(findTestObject('Object Repository/login/input_Username_username'), 'John Doe')
WebUI.setEncryptedText(findTestObject('Object Repository/login/input_Password_password'), 'g3/DOGG74jC3Flrr3yH+3D/yKbOqqUNM')
WebUI.click(findTestObject('Object Repository/login/button_Login'))
//verifikasi berhasil login
WebUI.verifyMatch(WebUI.getUrl(), 'https://katalon-demo-cura.herokuapp.com/#appointment', false)
//WebUI.verifyElementText(findTestObject('Object Repository/label_Welcome'), 'Welcome John')
WebUI.delay(2)
WebUI.closeBrowser()