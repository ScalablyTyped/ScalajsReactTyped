package typingsJapgolly.zwjsbridge.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PhoneNumber extends StObject {
  
  /** 电话号码 */
  var phoneNumber: js.UndefOr[String] = js.undefined
  
  /** 短信内容 */
  var text: js.UndefOr[String] = js.undefined
}
object PhoneNumber {
  
  inline def apply(): PhoneNumber = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PhoneNumber]
  }
  
  extension [Self <: PhoneNumber](x: Self) {
    
    inline def setPhoneNumber(value: String): Self = StObject.set(x, "phoneNumber", value.asInstanceOf[js.Any])
    
    inline def setPhoneNumberUndefined: Self = StObject.set(x, "phoneNumber", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
