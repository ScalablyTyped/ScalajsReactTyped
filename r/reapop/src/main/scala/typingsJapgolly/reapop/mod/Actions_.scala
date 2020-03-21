package typingsJapgolly.reapop.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.reapop.AnonPayload
import typingsJapgolly.reapop.AnonType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Action creators
trait Actions_ extends js.Object {
  def addNotification(notification: Notification): Notification
  def removeNotification(notification: Notification): AnonPayload
  def removeNotifications(): AnonType
  def updateNotification(notification: Notification): Notification
}

object Actions_ {
  @scala.inline
  def apply(
    addNotification: Notification => CallbackTo[Notification],
    removeNotification: Notification => CallbackTo[AnonPayload],
    removeNotifications: CallbackTo[AnonType],
    updateNotification: Notification => CallbackTo[Notification]
  ): Actions_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addNotification")(js.Any.fromFunction1((t0: typingsJapgolly.reapop.mod.Notification) => addNotification(t0).runNow()))
    __obj.updateDynamic("removeNotification")(js.Any.fromFunction1((t0: typingsJapgolly.reapop.mod.Notification) => removeNotification(t0).runNow()))
    __obj.updateDynamic("removeNotifications")(removeNotifications.toJsFn)
    __obj.updateDynamic("updateNotification")(js.Any.fromFunction1((t0: typingsJapgolly.reapop.mod.Notification) => updateNotification(t0).runNow()))
    __obj.asInstanceOf[Actions_]
  }
}

