package typingsJapgolly.angularUiNotification.mod.uiNotification

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait INotificationScope extends js.Object {
  def kill(isHard: Boolean): Unit
}

object INotificationScope {
  @scala.inline
  def apply(kill: Boolean => Callback): INotificationScope = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("kill")(js.Any.fromFunction1((t0: scala.Boolean) => kill(t0).runNow()))
    __obj.asInstanceOf[INotificationScope]
  }
}

