package typingsJapgolly.winrt.Windows.UI.Notifications

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrt.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IToastNotifier extends js.Object {
  var setting: NotificationSetting
  def addToSchedule(scheduledToast: ScheduledToastNotification): Unit
  def getScheduledToastNotifications(): IVectorView[ScheduledToastNotification]
  def hide(notification: ToastNotification): Unit
  def removeFromSchedule(scheduledToast: ScheduledToastNotification): Unit
  def show(notification: ToastNotification): Unit
}

object IToastNotifier {
  @scala.inline
  def apply(
    addToSchedule: ScheduledToastNotification => Callback,
    getScheduledToastNotifications: CallbackTo[IVectorView[ScheduledToastNotification]],
    hide: ToastNotification => Callback,
    removeFromSchedule: ScheduledToastNotification => Callback,
    setting: NotificationSetting,
    show: ToastNotification => Callback
  ): IToastNotifier = {
    val __obj = js.Dynamic.literal(setting = setting.asInstanceOf[js.Any])
    __obj.updateDynamic("addToSchedule")(js.Any.fromFunction1((t0: typingsJapgolly.winrt.Windows.UI.Notifications.ScheduledToastNotification) => addToSchedule(t0).runNow()))
    __obj.updateDynamic("getScheduledToastNotifications")(getScheduledToastNotifications.toJsFn)
    __obj.updateDynamic("hide")(js.Any.fromFunction1((t0: typingsJapgolly.winrt.Windows.UI.Notifications.ToastNotification) => hide(t0).runNow()))
    __obj.updateDynamic("removeFromSchedule")(js.Any.fromFunction1((t0: typingsJapgolly.winrt.Windows.UI.Notifications.ScheduledToastNotification) => removeFromSchedule(t0).runNow()))
    __obj.updateDynamic("show")(js.Any.fromFunction1((t0: typingsJapgolly.winrt.Windows.UI.Notifications.ToastNotification) => show(t0).runNow()))
    __obj.asInstanceOf[IToastNotifier]
  }
}

