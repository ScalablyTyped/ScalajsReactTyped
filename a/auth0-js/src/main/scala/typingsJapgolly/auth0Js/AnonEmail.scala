package typingsJapgolly.auth0Js

import typingsJapgolly.auth0Js.auth0JsStrings.email
import typingsJapgolly.auth0Js.auth0JsStrings.sms
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEmail extends js.Object {
  /** the connection name */
  var connection: String
  /** only if type = email */
  var email: js.UndefOr[String] = js.undefined
  /**  only if type = sms */
  var phoneNumber: js.UndefOr[String] = js.undefined
  var `type`: sms | email
  /** the TOTP code */
  var verificationCode: String
}

object AnonEmail {
  @scala.inline
  def apply(
    connection: String,
    `type`: sms | email,
    verificationCode: String,
    email: String = null,
    phoneNumber: String = null
  ): AnonEmail = {
    val __obj = js.Dynamic.literal(connection = connection.asInstanceOf[js.Any], verificationCode = verificationCode.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (email != null) __obj.updateDynamic("email")(email.asInstanceOf[js.Any])
    if (phoneNumber != null) __obj.updateDynamic("phoneNumber")(phoneNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEmail]
  }
}

