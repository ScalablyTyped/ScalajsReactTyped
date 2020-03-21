package typingsJapgolly.orientjs.mod

import typingsJapgolly.orientjs.AnonMax
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ODatabaseSessionPoolOptions extends js.Object {
  var name: String
  var password: js.UndefOr[String] = js.undefined
  var pool: js.UndefOr[AnonMax] = js.undefined
  var username: js.UndefOr[String] = js.undefined
}

object ODatabaseSessionPoolOptions {
  @scala.inline
  def apply(name: String, password: String = null, pool: AnonMax = null, username: String = null): ODatabaseSessionPoolOptions = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (password != null) __obj.updateDynamic("password")(password.asInstanceOf[js.Any])
    if (pool != null) __obj.updateDynamic("pool")(pool.asInstanceOf[js.Any])
    if (username != null) __obj.updateDynamic("username")(username.asInstanceOf[js.Any])
    __obj.asInstanceOf[ODatabaseSessionPoolOptions]
  }
}

