package typingsJapgolly.naverWhale.whale.notifications

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.notifications.update")
@js.native
object update extends js.Object {
  def apply(notificationId: String, options: typingsJapgolly.chrome.chrome.notifications.NotificationOptions): Unit = js.native
  def apply(
    notificationId: String,
    options: typingsJapgolly.chrome.chrome.notifications.NotificationOptions,
    callback: js.Function1[/* wasUpdated */ Boolean, Unit]
  ): Unit = js.native
}

