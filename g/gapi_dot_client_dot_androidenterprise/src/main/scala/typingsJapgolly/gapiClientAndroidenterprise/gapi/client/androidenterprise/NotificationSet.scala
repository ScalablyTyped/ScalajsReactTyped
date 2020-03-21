package typingsJapgolly.gapiClientAndroidenterprise.gapi.client.androidenterprise

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotificationSet extends js.Object {
  /** Identifies what kind of resource this is. Value: the fixed string "androidenterprise#notificationSet". */
  var kind: js.UndefOr[String] = js.undefined
  /** The notifications received, or empty if no notifications are present. */
  var notification: js.UndefOr[js.Array[Notification]] = js.undefined
  /**
    * The notification set ID, required to mark the notification as received with the Enterprises.AcknowledgeNotification API. This will be omitted if no
    * notifications are present.
    */
  var notificationSetId: js.UndefOr[String] = js.undefined
}

object NotificationSet {
  @scala.inline
  def apply(kind: String = null, notification: js.Array[Notification] = null, notificationSetId: String = null): NotificationSet = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (notification != null) __obj.updateDynamic("notification")(notification.asInstanceOf[js.Any])
    if (notificationSetId != null) __obj.updateDynamic("notificationSetId")(notificationSetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationSet]
  }
}

