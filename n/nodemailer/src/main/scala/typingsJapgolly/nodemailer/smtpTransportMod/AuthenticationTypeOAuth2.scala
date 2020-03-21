package typingsJapgolly.nodemailer.smtpTransportMod

import typingsJapgolly.nodemailer.nodemailerStrings.OAUTH2
import typingsJapgolly.nodemailer.nodemailerStrings.XOAUTH2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthenticationTypeOAuth2 extends AuthenticationType {
  var method: XOAUTH2
  var oauth2: typingsJapgolly.nodemailer.xoauth2Mod.^
  var `type`: OAUTH2
  var user: String
}

object AuthenticationTypeOAuth2 {
  @scala.inline
  def apply(method: XOAUTH2, oauth2: typingsJapgolly.nodemailer.xoauth2Mod.^, `type`: OAUTH2, user: String): AuthenticationTypeOAuth2 = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], oauth2 = oauth2.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthenticationTypeOAuth2]
  }
}

