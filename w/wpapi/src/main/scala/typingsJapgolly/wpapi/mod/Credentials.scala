package typingsJapgolly.wpapi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Authentication credentials */
trait Credentials extends js.Object {
  /** A WP nonce for use with cookie authentication */
  var nonce: js.UndefOr[String] = js.undefined
  /** A WP-API Basic HTTP Authentication password */
  var password: js.UndefOr[String] = js.undefined
  /** A WP-API Basic HTTP Authentication username */
  var username: js.UndefOr[String] = js.undefined
}

object Credentials {
  @scala.inline
  def apply(nonce: String = null, password: String = null, username: String = null): Credentials = {
    val __obj = js.Dynamic.literal()
    if (nonce != null) __obj.updateDynamic("nonce")(nonce.asInstanceOf[js.Any])
    if (password != null) __obj.updateDynamic("password")(password.asInstanceOf[js.Any])
    if (username != null) __obj.updateDynamic("username")(username.asInstanceOf[js.Any])
    __obj.asInstanceOf[Credentials]
  }
}

