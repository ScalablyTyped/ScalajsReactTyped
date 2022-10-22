package typingsJapgolly.reactNativeFirebase.mod.RNFirebase.notifications

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Notifications extends StObject {
  
  var android: AndroidNotifications
  
  /**
    * Cancels all notifications
    */
  def cancelAllNotifications(): Unit
  
  /**
    * Cancels a notification by ID
    */
  def cancelNotification(notificationId: String): Unit
  
  def displayNotification(notification: Notification): js.Promise[Unit]
  
  /**
    * Returns the current badge number on the app icon.
    */
  def getBadge(): js.Promise[Double]
  
  def getInitialNotification(): js.Promise[NotificationOpen]
  
  def getScheduledNotifications(): js.Promise[js.Array[Notification]]
  
  def onNotification(listener: js.Function1[/* notification */ Notification, Any]): js.Function0[Any]
  
  def onNotificationDisplayed(listener: js.Function1[/* notification */ Notification, Any]): js.Function0[Any]
  
  def onNotificationOpened(listener: js.Function1[/* notificationOpen */ NotificationOpen, Any]): js.Function0[Any]
  
  def removeAllDeliveredNotifications(): Unit
  
  def removeDeliveredNotification(notificationId: String): Unit
  
  /**
    * Schedule a local notification to be shown on the device.
    */
  def scheduleNotification(notification: Notification, schedule: Schedule): Any
  
  /**
    * Sets the badge number on the iOS app icon.
    */
  def setBadge(badge: Double): Unit
}
object Notifications {
  
  inline def apply(
    android: AndroidNotifications,
    cancelAllNotifications: Callback,
    cancelNotification: String => Callback,
    displayNotification: Notification => js.Promise[Unit],
    getBadge: CallbackTo[js.Promise[Double]],
    getInitialNotification: CallbackTo[js.Promise[NotificationOpen]],
    getScheduledNotifications: CallbackTo[js.Promise[js.Array[Notification]]],
    onNotification: js.Function1[/* notification */ Notification, Any] => js.Function0[Any],
    onNotificationDisplayed: js.Function1[/* notification */ Notification, Any] => js.Function0[Any],
    onNotificationOpened: js.Function1[/* notificationOpen */ NotificationOpen, Any] => js.Function0[Any],
    removeAllDeliveredNotifications: Callback,
    removeDeliveredNotification: String => Callback,
    scheduleNotification: (Notification, Schedule) => Any,
    setBadge: Double => Callback
  ): Notifications = {
    val __obj = js.Dynamic.literal(android = android.asInstanceOf[js.Any], cancelAllNotifications = cancelAllNotifications.toJsFn, cancelNotification = js.Any.fromFunction1((t0: String) => cancelNotification(t0).runNow()), displayNotification = js.Any.fromFunction1(displayNotification), getBadge = getBadge.toJsFn, getInitialNotification = getInitialNotification.toJsFn, getScheduledNotifications = getScheduledNotifications.toJsFn, onNotification = js.Any.fromFunction1(onNotification), onNotificationDisplayed = js.Any.fromFunction1(onNotificationDisplayed), onNotificationOpened = js.Any.fromFunction1(onNotificationOpened), removeAllDeliveredNotifications = removeAllDeliveredNotifications.toJsFn, removeDeliveredNotification = js.Any.fromFunction1((t0: String) => removeDeliveredNotification(t0).runNow()), scheduleNotification = js.Any.fromFunction2(scheduleNotification), setBadge = js.Any.fromFunction1((t0: Double) => setBadge(t0).runNow()))
    __obj.asInstanceOf[Notifications]
  }
  
  extension [Self <: Notifications](x: Self) {
    
    inline def setAndroid(value: AndroidNotifications): Self = StObject.set(x, "android", value.asInstanceOf[js.Any])
    
    inline def setCancelAllNotifications(value: Callback): Self = StObject.set(x, "cancelAllNotifications", value.toJsFn)
    
    inline def setCancelNotification(value: String => Callback): Self = StObject.set(x, "cancelNotification", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setDisplayNotification(value: Notification => js.Promise[Unit]): Self = StObject.set(x, "displayNotification", js.Any.fromFunction1(value))
    
    inline def setGetBadge(value: CallbackTo[js.Promise[Double]]): Self = StObject.set(x, "getBadge", value.toJsFn)
    
    inline def setGetInitialNotification(value: CallbackTo[js.Promise[NotificationOpen]]): Self = StObject.set(x, "getInitialNotification", value.toJsFn)
    
    inline def setGetScheduledNotifications(value: CallbackTo[js.Promise[js.Array[Notification]]]): Self = StObject.set(x, "getScheduledNotifications", value.toJsFn)
    
    inline def setOnNotification(value: js.Function1[/* notification */ Notification, Any] => js.Function0[Any]): Self = StObject.set(x, "onNotification", js.Any.fromFunction1(value))
    
    inline def setOnNotificationDisplayed(value: js.Function1[/* notification */ Notification, Any] => js.Function0[Any]): Self = StObject.set(x, "onNotificationDisplayed", js.Any.fromFunction1(value))
    
    inline def setOnNotificationOpened(value: js.Function1[/* notificationOpen */ NotificationOpen, Any] => js.Function0[Any]): Self = StObject.set(x, "onNotificationOpened", js.Any.fromFunction1(value))
    
    inline def setRemoveAllDeliveredNotifications(value: Callback): Self = StObject.set(x, "removeAllDeliveredNotifications", value.toJsFn)
    
    inline def setRemoveDeliveredNotification(value: String => Callback): Self = StObject.set(x, "removeDeliveredNotification", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setScheduleNotification(value: (Notification, Schedule) => Any): Self = StObject.set(x, "scheduleNotification", js.Any.fromFunction2(value))
    
    inline def setSetBadge(value: Double => Callback): Self = StObject.set(x, "setBadge", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
  }
}
