package typingsJapgolly.winrt.Windows.Networking.PushNotifications

import typingsJapgolly.winrt.Windows.Foundation.IAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Networking.PushNotifications.PushNotificationChannelManager")
@js.native
class PushNotificationChannelManager () extends js.Object

/* static members */
@JSGlobal("Windows.Networking.PushNotifications.PushNotificationChannelManager")
@js.native
object PushNotificationChannelManager extends js.Object {
  def createPushNotificationChannelForApplicationAsync(): IAsyncOperation[PushNotificationChannel] = js.native
  def createPushNotificationChannelForApplicationAsync(applicationId: String): IAsyncOperation[PushNotificationChannel] = js.native
  def createPushNotificationChannelForSecondaryTileAsync(tileId: String): IAsyncOperation[PushNotificationChannel] = js.native
}

