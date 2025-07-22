import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import org.openqa.selenium.Keys as Keys
//WebUI.openBrowser('')
//
//WebUI.navigateToUrl('https://katalon-demo-cura.herokuapp.com/profile.php#login')
//
//WebUI.setText(findTestObject('Object Repository/Logout/input_Username_username'), 'John Doe')
//
//WebUI.setEncryptedText(findTestObject('Object Repository/Logout/input_Password_password'), 'g3/DOGG74jC3Flrr3yH+3D/yKbOqqUNM')
//
//WebUI.click(findTestObject('Object Repository/Logout/button_Login'))
//
////verifikasi berhasil login
//WebUI.verifyMatch(WebUI.getUrl(), 'https://katalon-demo-cura.herokuapp.com/#appointment', false)
//
//WebUI.click(findTestObject('Object Repository/Logout/a_CURA Healthcare_menu-toggle'))
//
//WebUI.delay(5)
//
//WebUI.click(findTestObject('Object Repository/Logout/a_Logout'))
//
////Verifikasi berhasil logout
//WebUI.verifyElementText(findTestObject('Object Repository/Logout/logout_ver'), 'CURA Healthcare Service')

WebUI.openBrowser('')

WebUI.navigateToUrl('https://katalon-demo-cura.herokuapp.com/profile.php#login')

WebUI.click(findTestObject('Object Repository/Logout/input_Username_username'))

WebUI.setText(findTestObject('Object Repository/Logout/input_Username_username'), 'John Doe')

WebUI.setEncryptedText(findTestObject('Object Repository/Logout/input_Password_password'), 'g3/DOGG74jC3Flrr3yH+3D/yKbOqqUNM')

WebUI.doubleClick(findTestObject('Object Repository/Logout/button_Login'))
WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Logout/i_CURA Healthcare_fa fa-bars'))

WebUI.click(findTestObject('Object Repository/Logout/a_Logout'))
//Verifikasi berhasil logout
WebUI.verifyElementText(findTestObject('Object Repository/Logout/logout_ver'), 'CURA Healthcare Service')

