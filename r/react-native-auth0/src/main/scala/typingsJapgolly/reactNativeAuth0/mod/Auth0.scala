package typingsJapgolly.reactNativeAuth0.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Auth0 extends js.Object {
  var auth: Auth
  var webAuth: WebAuth
  def users(token: String): Users_
}

object Auth0 {
  @scala.inline
  def apply(auth: Auth, users: String => CallbackTo[Users_], webAuth: WebAuth): Auth0 = {
    val __obj = js.Dynamic.literal(auth = auth.asInstanceOf[js.Any], webAuth = webAuth.asInstanceOf[js.Any])
    __obj.updateDynamic("users")(js.Any.fromFunction1((t0: java.lang.String) => users(t0).runNow()))
    __obj.asInstanceOf[Auth0]
  }
}

