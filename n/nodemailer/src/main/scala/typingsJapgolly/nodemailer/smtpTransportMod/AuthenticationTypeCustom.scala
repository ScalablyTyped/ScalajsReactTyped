package typingsJapgolly.nodemailer.smtpTransportMod

import typingsJapgolly.nodemailer.nodemailerStrings.CUSTOM
import typingsJapgolly.nodemailer.smtpConnectionMod.Credentials
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthenticationTypeCustom extends Credentials {
  var method: String
  var `type`: CUSTOM
}

object AuthenticationTypeCustom {
  @scala.inline
  def apply(method: String, pass: String, `type`: CUSTOM, user: String): AuthenticationTypeCustom = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], pass = pass.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthenticationTypeCustom]
  }
}

