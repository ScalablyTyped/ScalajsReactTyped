package typingsJapgolly.nodemailer.libSmtpConnectionMod

import typingsJapgolly.nodemailer.nodemailerStrings.CUSTOM
import typingsJapgolly.nodemailer.nodemailerStrings.Custom_
import typingsJapgolly.nodemailer.nodemailerStrings.custom__
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.nodemailer.libSmtpConnectionMod.AuthenticationTypeCustom
  - typingsJapgolly.nodemailer.libSmtpConnectionMod.AuthenticationTypeLogin
  - typingsJapgolly.nodemailer.libSmtpConnectionMod.AuthenticationTypeOAuth2
*/
trait AuthenticationType extends StObject
object AuthenticationType {
  
  inline def AuthenticationTypeCustom(method: String, pass: String, `type`: custom__ | Custom_ | CUSTOM, user: String): typingsJapgolly.nodemailer.libSmtpConnectionMod.AuthenticationTypeCustom = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], pass = pass.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.nodemailer.libSmtpConnectionMod.AuthenticationTypeCustom]
  }
  
  inline def AuthenticationTypeLogin(pass: String, user: String): typingsJapgolly.nodemailer.libSmtpConnectionMod.AuthenticationTypeLogin = {
    val __obj = js.Dynamic.literal(pass = pass.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.nodemailer.libSmtpConnectionMod.AuthenticationTypeLogin]
  }
  
  inline def AuthenticationTypeOAuth2(): typingsJapgolly.nodemailer.libSmtpConnectionMod.AuthenticationTypeOAuth2 = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[typingsJapgolly.nodemailer.libSmtpConnectionMod.AuthenticationTypeOAuth2]
  }
}
