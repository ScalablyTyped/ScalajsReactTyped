package typingsJapgolly.angularUiNotification.mod.uiNotification

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait INotificationProvider extends js.Object {
  def setOptions(options: IGlobalMessageOptions): Unit
}

object INotificationProvider {
  @scala.inline
  def apply(setOptions: IGlobalMessageOptions => Callback): INotificationProvider = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("setOptions")(js.Any.fromFunction1((t0: typingsJapgolly.angularUiNotification.mod.uiNotification.IGlobalMessageOptions) => setOptions(t0).runNow()))
    __obj.asInstanceOf[INotificationProvider]
  }
}

