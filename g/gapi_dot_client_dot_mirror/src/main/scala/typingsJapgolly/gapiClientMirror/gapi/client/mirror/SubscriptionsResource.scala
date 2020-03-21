package typingsJapgolly.gapiClientMirror.gapi.client.mirror

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientMirror.AnonAlt
import typingsJapgolly.gapiClientMirror.AnonFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubscriptionsResource extends js.Object {
  /** Deletes a subscription. */
  def delete(request: AnonAlt): Request_[Unit]
  /** Creates a new subscription. */
  def insert(request: AnonFields): Request_[Subscription]
  /** Retrieves a list of subscriptions for the authenticated user and service. */
  def list(request: AnonFields): Request_[SubscriptionsListResponse]
  /** Updates an existing subscription in place. */
  def update(request: AnonAlt): Request_[Subscription]
}

object SubscriptionsResource {
  @scala.inline
  def apply(
    delete: AnonAlt => CallbackTo[Request_[Unit]],
    insert: AnonFields => CallbackTo[Request_[Subscription]],
    list: AnonFields => CallbackTo[Request_[SubscriptionsListResponse]],
    update: AnonAlt => CallbackTo[Request_[Subscription]]
  ): SubscriptionsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientMirror.AnonAlt) => delete(t0).runNow()))
    __obj.updateDynamic("insert")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientMirror.AnonFields) => insert(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientMirror.AnonFields) => list(t0).runNow()))
    __obj.updateDynamic("update")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientMirror.AnonAlt) => update(t0).runNow()))
    __obj.asInstanceOf[SubscriptionsResource]
  }
}

