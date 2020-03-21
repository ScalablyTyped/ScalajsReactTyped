package typingsJapgolly.chromeApps.chrome.notifications

import typingsJapgolly.chromeApps.PartialNotificationOption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.notifications.update")
@js.native
object update extends js.Object {
  /**
    * Updates an existing notification.
    * @param notificationId The id of the notification to be updated. This is returned by notifications.create method.
    * @param options Contents of the notification to update to.
    * @param [callback] Called to indicate whether a matching notification existed.
    */
  def apply(notificationId: String, options: PartialNotificationOption): Unit = js.native
  def apply(
    notificationId: String,
    options: PartialNotificationOption,
    callback: js.Function1[/* wasUpdated */ Boolean, Unit]
  ): Unit = js.native
}

