package typingsJapgolly.auth0Js.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResourceOwnerLoginOptions extends LoginOptions {
  var connection: String
  var device: js.UndefOr[String] = js.undefined
}

object ResourceOwnerLoginOptions {
  @scala.inline
  def apply(
    connection: String,
    password: String,
    username: String,
    device: String = null,
    scope: String = null
  ): ResourceOwnerLoginOptions = {
    val __obj = js.Dynamic.literal(connection = connection.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    if (device != null) __obj.updateDynamic("device")(device.asInstanceOf[js.Any])
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceOwnerLoginOptions]
  }
}

