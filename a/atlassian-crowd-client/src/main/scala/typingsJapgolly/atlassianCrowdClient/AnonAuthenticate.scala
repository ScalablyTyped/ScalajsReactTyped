package typingsJapgolly.atlassianCrowdClient

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.atlassianCrowdClient.userMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAuthenticate extends js.Object {
  def authenticate(username: String, password: String): js.Promise[^]
}

object AnonAuthenticate {
  @scala.inline
  def apply(authenticate: (String, String) => CallbackTo[js.Promise[^]]): AnonAuthenticate = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("authenticate")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => authenticate(t0, t1).runNow()))
    __obj.asInstanceOf[AnonAuthenticate]
  }
}

