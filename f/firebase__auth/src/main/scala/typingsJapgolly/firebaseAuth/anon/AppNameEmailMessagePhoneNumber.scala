package typingsJapgolly.firebaseAuth.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppNameEmailMessagePhoneNumber extends StObject {
  
  var appName: js.UndefOr[typingsJapgolly.firebaseAuth.distRnSrcModelAuthMod.AppName] = js.undefined
  
  var email: js.UndefOr[String] = js.undefined
  
  var message: js.UndefOr[String] = js.undefined
  
  var phoneNumber: js.UndefOr[String] = js.undefined
}
object AppNameEmailMessagePhoneNumber {
  
  inline def apply(): AppNameEmailMessagePhoneNumber = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppNameEmailMessagePhoneNumber]
  }
  
  extension [Self <: AppNameEmailMessagePhoneNumber](x: Self) {
    
    inline def setAppName(value: typingsJapgolly.firebaseAuth.distRnSrcModelAuthMod.AppName): Self = StObject.set(x, "appName", value.asInstanceOf[js.Any])
    
    inline def setAppNameUndefined: Self = StObject.set(x, "appName", js.undefined)
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setPhoneNumber(value: String): Self = StObject.set(x, "phoneNumber", value.asInstanceOf[js.Any])
    
    inline def setPhoneNumberUndefined: Self = StObject.set(x, "phoneNumber", js.undefined)
  }
}
