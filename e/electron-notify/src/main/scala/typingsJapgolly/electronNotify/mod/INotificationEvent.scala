package typingsJapgolly.electronNotify.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.electronNotify.electronNotifyStrings.click
import typingsJapgolly.electronNotify.electronNotifyStrings.close
import typingsJapgolly.electronNotify.electronNotifyStrings.show
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait INotificationEvent extends ICloseNotificationEvent {
  def closeNotification(reason: js.Any): Unit
}

object INotificationEvent {
  @scala.inline
  def apply(closeNotification: js.Any => Callback, event: close | show | click, id: Double): INotificationEvent = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("closeNotification")(js.Any.fromFunction1((t0: js.Any) => closeNotification(t0).runNow()))
    __obj.asInstanceOf[INotificationEvent]
  }
}

