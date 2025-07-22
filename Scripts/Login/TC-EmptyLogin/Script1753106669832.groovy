import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://katalon-demo-cura.herokuapp.com/profile.php#login')

WebUI.setText(findTestObject('Page_Login/txt_username'), '')

WebUI.setText(findTestObject('Page_Login/txt_password'), '')

WebUI.click(findTestObject('Object Repository/Login/button_Login'))

// Tunggu sampai pesan error muncul
WebUI.waitForElementVisible(findTestObject('Object Repository/Login/login_error'), 10)

// Verifikasi error messagenya sesuai
WebUI.verifyElementText(findTestObject('Object Repository/Login/login_error'), 'Login failed! Please ensure the username and password are valid.')

WebUI.delay(2)

WebUI.closeBrowser() 