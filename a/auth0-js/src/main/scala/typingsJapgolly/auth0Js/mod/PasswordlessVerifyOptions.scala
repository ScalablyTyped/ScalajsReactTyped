package typingsJapgolly.auth0Js.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PasswordlessVerifyOptions
  extends StObject
     with BaseAuthOptions {
  
  var connection: String
  
  var email: js.UndefOr[String] = js.undefined
  
  var phoneNumber: js.UndefOr[String] = js.undefined
  
  var responseMode: js.UndefOr[String] = js.undefined
  
  var send: js.UndefOr[String] = js.undefined
  
  var verificationCode: String
}
object PasswordlessVerifyOptions {
  
  inline def apply(connection: String, verificationCode: String): PasswordlessVerifyOptions = {
    val __obj = js.Dynamic.literal(connection = connection.asInstanceOf[js.Any], verificationCode = verificationCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[PasswordlessVerifyOptions]
  }
  
  extension [Self <: PasswordlessVerifyOptions](x: Self) {
    
    inline def setConnection(value: String): Self = StObject.set(x, "connection", value.asInstanceOf[js.Any])
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    inline def setPhoneNumber(value: String): Self = StObject.set(x, "phoneNumber", value.asInstanceOf[js.Any])
    
    inline def setPhoneNumberUndefined: Self = StObject.set(x, "phoneNumber", js.undefined)
    
    inline def setResponseMode(value: String): Self = StObject.set(x, "responseMode", value.asInstanceOf[js.Any])
    
    inline def setResponseModeUndefined: Self = StObject.set(x, "responseMode", js.undefined)
    
    inline def setSend(value: String): Self = StObject.set(x, "send", value.asInstanceOf[js.Any])
    
    inline def setSendUndefined: Self = StObject.set(x, "send", js.undefined)
    
    inline def setVerificationCode(value: String): Self = StObject.set(x, "verificationCode", value.asInstanceOf[js.Any])
  }
}
