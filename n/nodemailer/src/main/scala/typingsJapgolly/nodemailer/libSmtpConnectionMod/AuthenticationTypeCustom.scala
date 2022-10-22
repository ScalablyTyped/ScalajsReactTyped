package typingsJapgolly.nodemailer.libSmtpConnectionMod

import typingsJapgolly.nodemailer.nodemailerStrings.CUSTOM
import typingsJapgolly.nodemailer.nodemailerStrings.Custom_
import typingsJapgolly.nodemailer.nodemailerStrings.custom__
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuthenticationTypeCustom
  extends StObject
     with Credentials
     with AuthenticationType {
  
  var method: String
  
  /** indicates the authetication type, defaults to ‘login’, other option is ‘oauth2’ or ‘custom’ */
  var `type`: custom__ | Custom_ | CUSTOM
}
object AuthenticationTypeCustom {
  
  inline def apply(method: String, pass: String, `type`: custom__ | Custom_ | CUSTOM, user: String): AuthenticationTypeCustom = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], pass = pass.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthenticationTypeCustom]
  }
  
  extension [Self <: AuthenticationTypeCustom](x: Self) {
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setType(value: custom__ | Custom_ | CUSTOM): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
