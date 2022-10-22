package typingsJapgolly.antdMobileRn.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DatePickerLocaleDismissText extends StObject {
  
  var DatePickerLocale: Calendar
  
  var dismissText: String
  
  var extra: String
  
  var okText: String
}
object DatePickerLocaleDismissText {
  
  inline def apply(DatePickerLocale: Calendar, dismissText: String, extra: String, okText: String): DatePickerLocaleDismissText = {
    val __obj = js.Dynamic.literal(DatePickerLocale = DatePickerLocale.asInstanceOf[js.Any], dismissText = dismissText.asInstanceOf[js.Any], extra = extra.asInstanceOf[js.Any], okText = okText.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatePickerLocaleDismissText]
  }
  
  extension [Self <: DatePickerLocaleDismissText](x: Self) {
    
    inline def setDatePickerLocale(value: Calendar): Self = StObject.set(x, "DatePickerLocale", value.asInstanceOf[js.Any])
    
    inline def setDismissText(value: String): Self = StObject.set(x, "dismissText", value.asInstanceOf[js.Any])
    
    inline def setExtra(value: String): Self = StObject.set(x, "extra", value.asInstanceOf[js.Any])
    
    inline def setOkText(value: String): Self = StObject.set(x, "okText", value.asInstanceOf[js.Any])
  }
}
