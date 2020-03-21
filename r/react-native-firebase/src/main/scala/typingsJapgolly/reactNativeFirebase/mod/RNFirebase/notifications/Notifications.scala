package typingsJapgolly.reactNativeFirebase.mod.RNFirebase.notifications

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Notifications extends js.Object {
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
  def onNotification(listener: js.Function1[/* notification */ Notification, _]): js.Function0[_]
  def onNotificationDisplayed(listener: js.Function1[/* notification */ Notification, _]): js.Function0[_]
  def onNotificationOpened(listener: js.Function1[/* notificationOpen */ NotificationOpen, _]): js.Function0[_]
  def removeAllDeliveredNotifications(): Unit
  def removeDeliveredNotification(notificationId: String): Unit
  /**
    * Schedule a local notification to be shown on the device.
    */
  def scheduleNotification(notification: Notification, schedule: Schedule): js.Any
  /**
    * Sets the badge number on the iOS app icon.
    */
  def setBadge(badge: Double): Unit
}

object Notifications {
  @scala.inline
  def apply(
    android: AndroidNotifications,
    cancelAllNotifications: Callback,
    cancelNotification: String => Callback,
    displayNotification: Notification => CallbackTo[js.Promise[Unit]],
    getBadge: CallbackTo[js.Promise[Double]],
    getInitialNotification: CallbackTo[js.Promise[NotificationOpen]],
    getScheduledNotifications: CallbackTo[js.Promise[js.Array[Notification]]],
    onNotification: js.Function1[/* notification */ Notification, js.Any] => CallbackTo[js.Function0[js.Any]],
    onNotificationDisplayed: js.Function1[/* notification */ Notification, js.Any] => CallbackTo[js.Function0[js.Any]],
    onNotificationOpened: js.Function1[/* notificationOpen */ NotificationOpen, js.Any] => CallbackTo[js.Function0[js.Any]],
    removeAllDeliveredNotifications: Callback,
    removeDeliveredNotification: String => Callback,
    scheduleNotification: (Notification, Schedule) => CallbackTo[js.Any],
    setBadge: Double => Callback
  ): Notifications = {
    val __obj = js.Dynamic.literal(android = android.asInstanceOf[js.Any])
    __obj.updateDynamic("cancelAllNotifications")(cancelAllNotifications.toJsFn)
    __obj.updateDynamic("cancelNotification")(js.Any.fromFunction1((t0: java.lang.String) => cancelNotification(t0).runNow()))
    __obj.updateDynamic("displayNotification")(js.Any.fromFunction1((t0: typingsJapgolly.reactNativeFirebase.mod.RNFirebase.notifications.Notification) => displayNotification(t0).runNow()))
    __obj.updateDynamic("getBadge")(getBadge.toJsFn)
    __obj.updateDynamic("getInitialNotification")(getInitialNotification.toJsFn)
    __obj.updateDynamic("getScheduledNotifications")(getScheduledNotifications.toJsFn)
    __obj.updateDynamic("onNotification")(js.Any.fromFunction1((t0: js.Function1[
  /* notification */ typingsJapgolly.reactNativeFirebase.mod.RNFirebase.notifications.Notification, 
  js.Any]) => onNotification(t0).runNow()))
    __obj.updateDynamic("onNotificationDisplayed")(js.Any.fromFunction1((t0: js.Function1[
  /* notification */ typingsJapgolly.reactNativeFirebase.mod.RNFirebase.notifications.Notification, 
  js.Any]) => onNotificationDisplayed(t0).runNow()))
    __obj.updateDynamic("onNotificationOpened")(js.Any.fromFunction1((t0: js.Function1[
  /* notificationOpen */ typingsJapgolly.reactNativeFirebase.mod.RNFirebase.notifications.NotificationOpen, 
  js.Any]) => onNotificationOpened(t0).runNow()))
    __obj.updateDynamic("removeAllDeliveredNotifications")(removeAllDeliveredNotifications.toJsFn)
    __obj.updateDynamic("removeDeliveredNotification")(js.Any.fromFunction1((t0: java.lang.String) => removeDeliveredNotification(t0).runNow()))
    __obj.updateDynamic("scheduleNotification")(js.Any.fromFunction2((t0: typingsJapgolly.reactNativeFirebase.mod.RNFirebase.notifications.Notification, t1: typingsJapgolly.reactNativeFirebase.mod.RNFirebase.notifications.Schedule) => scheduleNotification(t0, t1).runNow()))
    __obj.updateDynamic("setBadge")(js.Any.fromFunction1((t0: scala.Double) => setBadge(t0).runNow()))
    __obj.asInstanceOf[Notifications]
  }
}

