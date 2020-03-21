package typingsJapgolly.googleAppsScript.GoogleAppsScript.Mirror.Collection

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Mirror.Schema.Subscription
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Mirror.Schema.SubscriptionsListResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubscriptionsCollection extends js.Object {
  // Creates a new subscription.
  def insert(resource: Subscription): Subscription
  // Retrieves a list of subscriptions for the authenticated user and service.
  def list(): SubscriptionsListResponse
  // Deletes a subscription.
  def remove(id: String): Unit
  // Updates an existing subscription in place.
  def update(resource: Subscription, id: String): Subscription
}

object SubscriptionsCollection {
  @scala.inline
  def apply(
    insert: Subscription => CallbackTo[Subscription],
    list: CallbackTo[SubscriptionsListResponse],
    remove: String => Callback,
    update: (Subscription, String) => CallbackTo[Subscription]
  ): SubscriptionsCollection = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("insert")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.Mirror.Schema.Subscription) => insert(t0).runNow()))
    __obj.updateDynamic("list")(list.toJsFn)
    __obj.updateDynamic("remove")(js.Any.fromFunction1((t0: java.lang.String) => remove(t0).runNow()))
    __obj.updateDynamic("update")(js.Any.fromFunction2((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.Mirror.Schema.Subscription, t1: java.lang.String) => update(t0, t1).runNow()))
    __obj.asInstanceOf[SubscriptionsCollection]
  }
}

