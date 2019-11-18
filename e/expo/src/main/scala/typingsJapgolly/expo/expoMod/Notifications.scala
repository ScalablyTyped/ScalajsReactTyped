package typingsJapgolly.expo.expoMod

import typingsJapgolly.expo.Anon_Data
import typingsJapgolly.expo.Anon_Day
import typingsJapgolly.expo.Anon_DayHour
import typingsJapgolly.expo.Anon_GcmSenderId
import typingsJapgolly.expo.Anon_Interval
import typingsJapgolly.expo.buildNotificationsNotificationsDotTypesMod.ActionType
import typingsJapgolly.expo.buildNotificationsNotificationsDotTypesMod.Channel
import typingsJapgolly.expo.buildNotificationsNotificationsDotTypesMod.LocalNotification
import typingsJapgolly.expo.buildNotificationsNotificationsDotTypesMod.Notification
import typingsJapgolly.fbemitter.fbemitterMod.EventSubscription
import typingsJapgolly.react.reactMod.ReactText
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expo", "Notifications")
@js.native
object Notifications extends js.Object {
  def _setInitialNotification(notification: Notification): Unit = js.native
  def addListener(listener: js.Function1[/* notification */ Notification, _]): EventSubscription = js.native
  def cancelAllScheduledNotificationsAsync(): js.Promise[Unit] = js.native
  def cancelScheduledNotificationAsync(notificationId: ReactText): js.Promise[Unit] = js.native
  def createCategoryAsync(categoryId: String, actions: js.Array[ActionType]): js.Promise[Unit] = js.native
  def createChannelAndroidAsync(id: String, channel: Channel): js.Promise[Unit] = js.native
  def deleteCategoryAsync(categoryId: String): js.Promise[Unit] = js.native
  def deleteChannelAndroidAsync(id: String): js.Promise[Unit] = js.native
  def dismissAllNotificationsAsync(): js.Promise[Unit] = js.native
  def dismissNotificationAsync(notificationId: ReactText): js.Promise[Unit] = js.native
  def getBadgeNumberAsync(): js.Promise[Double] = js.native
  def getDevicePushTokenAsync(config: Anon_GcmSenderId): js.Promise[Anon_Data] = js.native
  def getExpoPushTokenAsync(): js.Promise[String] = js.native
  def presentLocalNotificationAsync(notification: LocalNotification): js.Promise[ReactText] = js.native
  def scheduleLocalNotificationAsync(notification: LocalNotification): js.Promise[ReactText] = js.native
  def scheduleLocalNotificationAsync(notification: LocalNotification, options: Anon_Day): js.Promise[ReactText] = js.native
  def scheduleNotificationWithCalendarAsync(notification: LocalNotification): js.Promise[String] = js.native
  def scheduleNotificationWithCalendarAsync(notification: LocalNotification, options: Anon_DayHour): js.Promise[String] = js.native
  def scheduleNotificationWithTimerAsync(notification: LocalNotification, options: Anon_Interval): js.Promise[String] = js.native
  def setBadgeNumberAsync(number: Double): js.Promise[Unit] = js.native
}

