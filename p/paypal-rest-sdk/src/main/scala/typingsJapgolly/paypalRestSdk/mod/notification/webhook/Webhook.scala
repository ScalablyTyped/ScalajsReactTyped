package typingsJapgolly.paypalRestSdk.mod.notification.webhook

import typingsJapgolly.paypalRestSdk.mod.Link
import typingsJapgolly.paypalRestSdk.mod.notification.NotificationEventType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Webhook extends js.Object {
  var event_types: js.Array[NotificationEventType]
  val id: js.UndefOr[String] = js.undefined
  val links: js.UndefOr[js.Array[Link]] = js.undefined
  var url: String
}

object Webhook {
  @scala.inline
  def apply(
    event_types: js.Array[NotificationEventType],
    url: String,
    id: String = null,
    links: js.Array[Link] = null
  ): Webhook = {
    val __obj = js.Dynamic.literal(event_types = event_types.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (links != null) __obj.updateDynamic("links")(links.asInstanceOf[js.Any])
    __obj.asInstanceOf[Webhook]
  }
}

