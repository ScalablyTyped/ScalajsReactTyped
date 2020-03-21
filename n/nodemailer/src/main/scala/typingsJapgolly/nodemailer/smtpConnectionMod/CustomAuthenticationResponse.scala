package typingsJapgolly.nodemailer.smtpConnectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomAuthenticationResponse extends js.Object {
  var code: js.UndefOr[Double] = js.undefined
  var command: String
  var response: String
  var status: Double
  var text: String
}

object CustomAuthenticationResponse {
  @scala.inline
  def apply(command: String, response: String, status: Double, text: String, code: Int | Double = null): CustomAuthenticationResponse = {
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomAuthenticationResponse]
  }
}

