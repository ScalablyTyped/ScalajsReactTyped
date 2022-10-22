package typingsJapgolly.auth0Js.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PasswordlessStartOptions extends StObject {
  
  var authParams: js.UndefOr[PasswordlessStartAuthParams] = js.undefined
  
  var connection: String
  
  var email: js.UndefOr[String] = js.undefined
  
  var phoneNumber: js.UndefOr[String] = js.undefined
  
  var send: String
}
object PasswordlessStartOptions {
  
  inline def apply(connection: String, send: String): PasswordlessStartOptions = {
    val __obj = js.Dynamic.literal(connection = connection.asInstanceOf[js.Any], send = send.asInstanceOf[js.Any])
    __obj.asInstanceOf[PasswordlessStartOptions]
  }
  
  extension [Self <: PasswordlessStartOptions](x: Self) {
    
    inline def setAuthParams(value: PasswordlessStartAuthParams): Self = StObject.set(x, "authParams", value.asInstanceOf[js.Any])
    
    inline def setAuthParamsUndefined: Self = StObject.set(x, "authParams", js.undefined)
    
    inline def setConnection(value: String): Self = StObject.set(x, "connection", value.asInstanceOf[js.Any])
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    inline def setPhoneNumber(value: String): Self = StObject.set(x, "phoneNumber", value.asInstanceOf[js.Any])
    
    inline def setPhoneNumberUndefined: Self = StObject.set(x, "phoneNumber", js.undefined)
    
    inline def setSend(value: String): Self = StObject.set(x, "send", value.asInstanceOf[js.Any])
  }
}
