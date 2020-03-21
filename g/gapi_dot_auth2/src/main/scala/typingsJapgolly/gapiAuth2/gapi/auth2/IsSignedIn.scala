package typingsJapgolly.gapiAuth2.gapi.auth2

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IsSignedIn extends js.Object {
  /**
    * Returns whether the current user is currently signed in.
    */
  def get(): Boolean
  /**
    * Listen for changes in the current user's sign-in state.
    */
  def listen(listener: js.Function1[/* signedIn */ Boolean, _]): Unit
}

object IsSignedIn {
  @scala.inline
  def apply(get: CallbackTo[Boolean], listen: js.Function1[/* signedIn */ Boolean, js.Any] => Callback): IsSignedIn = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(get.toJsFn)
    __obj.updateDynamic("listen")(js.Any.fromFunction1((t0: js.Function1[/* signedIn */ scala.Boolean, js.Any]) => listen(t0).runNow()))
    __obj.asInstanceOf[IsSignedIn]
  }
}

