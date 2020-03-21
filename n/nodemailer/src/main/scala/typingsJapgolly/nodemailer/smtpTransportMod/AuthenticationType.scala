package typingsJapgolly.nodemailer.smtpTransportMod

import typingsJapgolly.nodemailer.nodemailerBooleans.`false`
import typingsJapgolly.nodemailer.nodemailerStrings.LOGIN
import typingsJapgolly.nodemailer.nodemailerStrings.OAUTH2
import typingsJapgolly.nodemailer.nodemailerStrings.XOAUTH2
import typingsJapgolly.nodemailer.smtpConnectionMod.Credentials
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.nodemailer.smtpTransportMod.AuthenticationTypeLogin
  - typingsJapgolly.nodemailer.smtpTransportMod.AuthenticationTypeOAuth2
*/
trait AuthenticationType extends js.Object

object AuthenticationType {
  @scala.inline
  def AuthenticationTypeLogin(credentials: Credentials, method: String | `false`, `type`: LOGIN, user: String): AuthenticationType = {
    val __obj = js.Dynamic.literal(credentials = credentials.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthenticationType]
  }
  @scala.inline
  def AuthenticationTypeOAuth2(method: XOAUTH2, oauth2: typingsJapgolly.nodemailer.xoauth2Mod.^, `type`: OAUTH2, user: String): AuthenticationType = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], oauth2 = oauth2.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthenticationType]
  }
}

