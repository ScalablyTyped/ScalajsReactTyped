package typingsJapgolly.gapiClientStorage.gapi.client.storage

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientStorage.AnonBucket
import typingsJapgolly.gapiClientStorage.AnonNotification
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotificationsResource extends js.Object {
  /** Permanently deletes a notification subscription. */
  def delete(request: AnonNotification): Request_[Unit]
  /** View a notification configuration. */
  def get(request: AnonNotification): Request_[Notification]
  /** Creates a notification subscription for a given bucket. */
  def insert(request: AnonBucket): Request_[Notification]
  /** Retrieves a list of notification subscriptions for a given bucket. */
  def list(request: AnonBucket): Request_[Notifications]
}

object NotificationsResource {
  @scala.inline
  def apply(
    delete: AnonNotification => CallbackTo[Request_[Unit]],
    get: AnonNotification => CallbackTo[Request_[Notification]],
    insert: AnonBucket => CallbackTo[Request_[Notification]],
    list: AnonBucket => CallbackTo[Request_[Notifications]]
  ): NotificationsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientStorage.AnonNotification) => delete(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientStorage.AnonNotification) => get(t0).runNow()))
    __obj.updateDynamic("insert")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientStorage.AnonBucket) => insert(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientStorage.AnonBucket) => list(t0).runNow()))
    __obj.asInstanceOf[NotificationsResource]
  }
}

