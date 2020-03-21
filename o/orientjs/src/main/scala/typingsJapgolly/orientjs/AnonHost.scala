package typingsJapgolly.orientjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHost extends js.Object {
  var host: String
  var name: String
  var password: js.UndefOr[String] = js.undefined
  var port: js.UndefOr[Double] = js.undefined
  var username: js.UndefOr[String] = js.undefined
}

object AnonHost {
  @scala.inline
  def apply(
    host: String,
    name: String,
    password: String = null,
    port: Int | Double = null,
    username: String = null
  ): AnonHost = {
    val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (password != null) __obj.updateDynamic("password")(password.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (username != null) __obj.updateDynamic("username")(username.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonHost]
  }
}

