package typingsJapgolly.winrt.Windows.UI.Notifications

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrt.Windows.Foundation.Collections.IVectorView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ToastNotifier
  extends StObject
     with IToastNotifier
object ToastNotifier {
  
  inline def apply(
    addToSchedule: ScheduledToastNotification => Callback,
    getScheduledToastNotifications: CallbackTo[IVectorView[ScheduledToastNotification]],
    hide: ToastNotification => Callback,
    removeFromSchedule: ScheduledToastNotification => Callback,
    setting: NotificationSetting,
    show: ToastNotification => Callback
  ): ToastNotifier = {
    val __obj = js.Dynamic.literal(addToSchedule = js.Any.fromFunction1((t0: ScheduledToastNotification) => addToSchedule(t0).runNow()), getScheduledToastNotifications = getScheduledToastNotifications.toJsFn, hide = js.Any.fromFunction1((t0: ToastNotification) => hide(t0).runNow()), removeFromSchedule = js.Any.fromFunction1((t0: ScheduledToastNotification) => removeFromSchedule(t0).runNow()), setting = setting.asInstanceOf[js.Any], show = js.Any.fromFunction1((t0: ToastNotification) => show(t0).runNow()))
    __obj.asInstanceOf[ToastNotifier]
  }
}
