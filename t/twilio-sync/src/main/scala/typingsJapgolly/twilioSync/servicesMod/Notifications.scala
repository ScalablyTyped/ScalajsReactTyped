package typingsJapgolly.twilioSync.servicesMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Notifications extends js.Object {
  var connectionState: js.Any
  def updateToken(token: String): js.Promise[Notifications]
}

object Notifications {
  @scala.inline
  def apply(connectionState: js.Any, updateToken: String => CallbackTo[js.Promise[Notifications]]): Notifications = {
    val __obj = js.Dynamic.literal(connectionState = connectionState.asInstanceOf[js.Any])
    __obj.updateDynamic("updateToken")(js.Any.fromFunction1((t0: java.lang.String) => updateToken(t0).runNow()))
    __obj.asInstanceOf[Notifications]
  }
}

