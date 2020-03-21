package typingsJapgolly.gapiClientBooks.gapi.client.books

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientBooks.AnonNotificationid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotificationResource extends js.Object {
  /** Returns notification details for a given notification id. */
  def get(request: AnonNotificationid): Request_[Notification]
}

object NotificationResource {
  @scala.inline
  def apply(get: AnonNotificationid => CallbackTo[Request_[Notification]]): NotificationResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientBooks.AnonNotificationid) => get(t0).runNow()))
    __obj.asInstanceOf[NotificationResource]
  }
}

