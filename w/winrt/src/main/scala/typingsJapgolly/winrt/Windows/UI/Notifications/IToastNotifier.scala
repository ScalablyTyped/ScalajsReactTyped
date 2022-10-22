package typingsJapgolly.winrt.Windows.UI.Notifications

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrt.Windows.Foundation.Collections.IVectorView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IToastNotifier extends StObject {
  
  def addToSchedule(scheduledToast: ScheduledToastNotification): Unit
  
  def getScheduledToastNotifications(): IVectorView[ScheduledToastNotification]
  
  def hide(notification: ToastNotification): Unit
  
  def removeFromSchedule(scheduledToast: ScheduledToastNotification): Unit
  
  var setting: NotificationSetting
  
  def show(notification: ToastNotification): Unit
}
object IToastNotifier {
  
  inline def apply(
    addToSchedule: ScheduledToastNotification => Callback,
    getScheduledToastNotifications: CallbackTo[IVectorView[ScheduledToastNotification]],
    hide: ToastNotification => Callback,
    removeFromSchedule: ScheduledToastNotification => Callback,
    setting: NotificationSetting,
    show: ToastNotification => Callback
  ): IToastNotifier = {
    val __obj = js.Dynamic.literal(addToSchedule = js.Any.fromFunction1((t0: ScheduledToastNotification) => addToSchedule(t0).runNow()), getScheduledToastNotifications = getScheduledToastNotifications.toJsFn, hide = js.Any.fromFunction1((t0: ToastNotification) => hide(t0).runNow()), removeFromSchedule = js.Any.fromFunction1((t0: ScheduledToastNotification) => removeFromSchedule(t0).runNow()), setting = setting.asInstanceOf[js.Any], show = js.Any.fromFunction1((t0: ToastNotification) => show(t0).runNow()))
    __obj.asInstanceOf[IToastNotifier]
  }
  
  extension [Self <: IToastNotifier](x: Self) {
    
    inline def setAddToSchedule(value: ScheduledToastNotification => Callback): Self = StObject.set(x, "addToSchedule", js.Any.fromFunction1((t0: ScheduledToastNotification) => value(t0).runNow()))
    
    inline def setGetScheduledToastNotifications(value: CallbackTo[IVectorView[ScheduledToastNotification]]): Self = StObject.set(x, "getScheduledToastNotifications", value.toJsFn)
    
    inline def setHide(value: ToastNotification => Callback): Self = StObject.set(x, "hide", js.Any.fromFunction1((t0: ToastNotification) => value(t0).runNow()))
    
    inline def setRemoveFromSchedule(value: ScheduledToastNotification => Callback): Self = StObject.set(x, "removeFromSchedule", js.Any.fromFunction1((t0: ScheduledToastNotification) => value(t0).runNow()))
    
    inline def setSetting(value: NotificationSetting): Self = StObject.set(x, "setting", value.asInstanceOf[js.Any])
    
    inline def setShow(value: ToastNotification => Callback): Self = StObject.set(x, "show", js.Any.fromFunction1((t0: ToastNotification) => value(t0).runNow()))
  }
}
