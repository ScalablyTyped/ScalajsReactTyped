package typingsJapgolly.connectEnsureLogin.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoggedInOptions extends js.Object {
  /**
    * URL to redirect to for login, defaults to _/login_
    */
  var redirectTo: js.UndefOr[String] = js.undefined
  /**
    * set redirectTo in session, defaults to _true_
    */
  var setRedirectTo: js.UndefOr[Boolean] = js.undefined
}

object LoggedInOptions {
  @scala.inline
  def apply(redirectTo: String = null, setRedirectTo: js.UndefOr[Boolean] = js.undefined): LoggedInOptions = {
    val __obj = js.Dynamic.literal()
    if (redirectTo != null) __obj.updateDynamic("redirectTo")(redirectTo.asInstanceOf[js.Any])
    if (!js.isUndefined(setRedirectTo)) __obj.updateDynamic("setRedirectTo")(setRedirectTo.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoggedInOptions]
  }
}

