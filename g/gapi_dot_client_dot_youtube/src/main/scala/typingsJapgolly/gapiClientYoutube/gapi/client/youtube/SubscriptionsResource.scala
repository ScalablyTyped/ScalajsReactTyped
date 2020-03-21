package typingsJapgolly.gapiClientYoutube.gapi.client.youtube

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientYoutube.AnonAlt
import typingsJapgolly.gapiClientYoutube.AnonForChannelId
import typingsJapgolly.gapiClientYoutube.AnonQuotaUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubscriptionsResource extends js.Object {
  /** Deletes a subscription. */
  def delete(request: AnonQuotaUser): Request_[Unit]
  /** Adds a subscription for the authenticated user's channel. */
  def insert(request: AnonAlt): Request_[Subscription]
  /** Returns subscription resources that match the API request criteria. */
  def list(request: AnonForChannelId): Request_[SubscriptionListResponse]
}

object SubscriptionsResource {
  @scala.inline
  def apply(
    delete: AnonQuotaUser => CallbackTo[Request_[Unit]],
    insert: AnonAlt => CallbackTo[Request_[Subscription]],
    list: AnonForChannelId => CallbackTo[Request_[SubscriptionListResponse]]
  ): SubscriptionsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientYoutube.AnonQuotaUser) => delete(t0).runNow()))
    __obj.updateDynamic("insert")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientYoutube.AnonAlt) => insert(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientYoutube.AnonForChannelId) => list(t0).runNow()))
    __obj.asInstanceOf[SubscriptionsResource]
  }
}

