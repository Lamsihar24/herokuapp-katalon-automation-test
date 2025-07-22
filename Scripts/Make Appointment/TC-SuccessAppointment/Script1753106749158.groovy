import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import org.openqa.selenium.Keys as Keys
WebUI.openBrowser('')

WebUI.navigateToUrl('https://katalon-demo-cura.herokuapp.com/profile.php#login')

WebUI.doubleClick(findTestObject('Object Repository/Appointment/input_Username_username'))

WebUI.setText(findTestObject('Object Repository/Appointment/input_Username_username'), 'John Doe')

WebUI.setEncryptedText(findTestObject('Object Repository/Appointment/input_Password_password'), 'g3/DOGG74jC3Flrr3yH+3D/yKbOqqUNM')

WebUI.doubleClick(findTestObject('Object Repository/Appointment/button_Login'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Appointment/select_Tokyo CURA Healthcare Center        _5b4107'), 
    'Hongkong CURA Healthcare Center', true)

WebUI.setText(findTestObject('Object Repository/Appointment/textarea_Comment_comment'), 'tes')

WebUI.doubleClick(findTestObject('Object Repository/Appointment/button_Book Appointment'))


WebUI.click(findTestObject('Object Repository/Appointment/td_15'))

WebUI.doubleClick(findTestObject('Object Repository/Appointment/button_Book Appointment'))

