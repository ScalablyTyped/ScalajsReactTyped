package typingsJapgolly.winrtUwp.Windows.UI.Notifications

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrtUwp.Windows.Foundation.Collections.IVectorView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Raises a toast notification to the specific app to which the ToastNotifier is bound. This class also lets you schedule and remove toast notifications. */
trait ToastNotifier extends StObject {
  
  /**
    * Adds a ScheduledToastNotification for later display by Windows.
    * @param scheduledToast The scheduled toast notification, which includes its content and timing instructions.
    */
  def addToSchedule(scheduledToast: ScheduledToastNotification): Unit
  
  /**
    * Gets the collection of ScheduledToastNotification objects that this app has scheduled for display.
    * @return The collection of scheduled toast notifications that the app bound to this notifier has scheduled for timed display.
    */
  def getScheduledToastNotifications(): IVectorView[ScheduledToastNotification]
  
  /**
    * Removes the specified toast notification from the screen.
    * @param notification The object that specifies the toast to hide.
    */
  def hide(notification: ToastNotification): Unit
  
  /**
    * Cancels the scheduled display of a specified ScheduledToastNotification .
    * @param scheduledToast The notification to remove from the schedule.
    */
  def removeFromSchedule(scheduledToast: ScheduledToastNotification): Unit
  
  /** Gets a value that tells you whether there is an app, user, or system block that prevents the display of a toast notification. */
  var setting: NotificationSetting
  
  /**
    * Displays the specified toast notification.
    * @param notification The object that contains the content of the toast notification to display.
    */
  def show(notification: ToastNotification): Unit
}
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
  
  extension [Self <: ToastNotifier](x: Self) {
    
    inline def setAddToSchedule(value: ScheduledToastNotification => Callback): Self = StObject.set(x, "addToSchedule", js.Any.fromFunction1((t0: ScheduledToastNotification) => value(t0).runNow()))
    
    inline def setGetScheduledToastNotifications(value: CallbackTo[IVectorView[ScheduledToastNotification]]): Self = StObject.set(x, "getScheduledToastNotifications", value.toJsFn)
    
    inline def setHide(value: ToastNotification => Callback): Self = StObject.set(x, "hide", js.Any.fromFunction1((t0: ToastNotification) => value(t0).runNow()))
    
    inline def setRemoveFromSchedule(value: ScheduledToastNotification => Callback): Self = StObject.set(x, "removeFromSchedule", js.Any.fromFunction1((t0: ScheduledToastNotification) => value(t0).runNow()))
    
    inline def setSetting(value: NotificationSetting): Self = StObject.set(x, "setting", value.asInstanceOf[js.Any])
    
    inline def setShow(value: ToastNotification => Callback): Self = StObject.set(x, "show", js.Any.fromFunction1((t0: ToastNotification) => value(t0).runNow()))
  }
}
