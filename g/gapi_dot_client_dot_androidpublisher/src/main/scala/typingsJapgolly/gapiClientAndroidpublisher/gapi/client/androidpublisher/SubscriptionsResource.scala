package typingsJapgolly.gapiClientAndroidpublisher.gapi.client.androidpublisher

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientAndroidpublisher.AnonSubscriptionId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubscriptionsResource extends js.Object {
  /** Cancels a user's subscription purchase. The subscription remains valid until its expiration time. */
  def cancel(request: AnonSubscriptionId): Request_[Unit]
  /** Defers a user's subscription purchase until a specified future expiration time. */
  def defer(request: AnonSubscriptionId): Request_[SubscriptionPurchasesDeferResponse]
  /** Checks whether a user's subscription purchase is valid and returns its expiry time. */
  def get(request: AnonSubscriptionId): Request_[SubscriptionPurchase]
  /** Refunds a user's subscription purchase, but the subscription remains valid until its expiration time and it will continue to recur. */
  def refund(request: AnonSubscriptionId): Request_[Unit]
  /** Refunds and immediately revokes a user's subscription purchase. Access to the subscription will be terminated immediately and it will stop recurring. */
  def revoke(request: AnonSubscriptionId): Request_[Unit]
}

object SubscriptionsResource {
  @scala.inline
  def apply(
    cancel: AnonSubscriptionId => CallbackTo[Request_[Unit]],
    defer: AnonSubscriptionId => CallbackTo[Request_[SubscriptionPurchasesDeferResponse]],
    get: AnonSubscriptionId => CallbackTo[Request_[SubscriptionPurchase]],
    refund: AnonSubscriptionId => CallbackTo[Request_[Unit]],
    revoke: AnonSubscriptionId => CallbackTo[Request_[Unit]]
  ): SubscriptionsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cancel")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAndroidpublisher.AnonSubscriptionId) => cancel(t0).runNow()))
    __obj.updateDynamic("defer")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAndroidpublisher.AnonSubscriptionId) => defer(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAndroidpublisher.AnonSubscriptionId) => get(t0).runNow()))
    __obj.updateDynamic("refund")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAndroidpublisher.AnonSubscriptionId) => refund(t0).runNow()))
    __obj.updateDynamic("revoke")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAndroidpublisher.AnonSubscriptionId) => revoke(t0).runNow()))
    __obj.asInstanceOf[SubscriptionsResource]
  }
}

