package typingsJapgolly.gapiAuth2.gapi.auth2

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CurrentUser extends js.Object {
  /**
    * Returns a GoogleUser object that represents the current user. Note that in a newly-initialized
    * GoogleAuth instance, the current user has not been set. Use the currentUser.listen() method or the
    * GoogleAuth.then() to get an initialized GoogleAuth instance.
    */
  def get(): GoogleUser
  /**
    * Listen for changes in currentUser.
    */
  def listen(listener: js.Function1[/* user */ GoogleUser, _]): Unit
}

object CurrentUser {
  @scala.inline
  def apply(get: CallbackTo[GoogleUser], listen: js.Function1[/* user */ GoogleUser, js.Any] => Callback): CurrentUser = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(get.toJsFn)
    __obj.updateDynamic("listen")(js.Any.fromFunction1((t0: js.Function1[/* user */ typingsJapgolly.gapiAuth2.gapi.auth2.GoogleUser, js.Any]) => listen(t0).runNow()))
    __obj.asInstanceOf[CurrentUser]
  }
}

