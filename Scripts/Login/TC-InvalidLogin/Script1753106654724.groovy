import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://katalon-demo-cura.herokuapp.com/profile.php#login')

WebUI.click(findTestObject('Object Repository/login/input_Username_username'))

WebUI.setText(findTestObject('Object Repository/login/input_Username_username'), 'John Doe')

WebUI.setEncryptedText(findTestObject('Object Repository/login/input_Password_password'), 'ifTZcph1FO93SVr0dZvNUw==')

WebUI.click(findTestObject('Object Repository/login/button_Login'))

// Tunggu sampai pesan error muncul
WebUI.waitForElementVisible(findTestObject('login/login_error'), 10)

// Verifikasi error messagenya sesuai
WebUI.verifyElementText(findTestObject('login/login_error'), 
  'Login failed! Please ensure the username and password are valid.')

