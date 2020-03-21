package typingsJapgolly.gapiClientReseller.gapi.client.reseller

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientReseller.AnonCustomerNamePrefix
import typingsJapgolly.gapiClientReseller.AnonDeletionType
import typingsJapgolly.gapiClientReseller.AnonKey
import typingsJapgolly.gapiClientReseller.AnonOauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubscriptionsResource extends js.Object {
  /** Activates a subscription previously suspended by the reseller */
  def activate(request: AnonKey): Request_[Subscription]
  /**
    * Update a subscription plan. Use this method to update a plan for a 30-day trial or a flexible plan subscription to an annual commitment plan with
    * monthly or yearly payments.
    */
  def changePlan(request: AnonKey): Request_[Subscription]
  /** Update a user license's renewal settings. This is applicable for accounts with annual commitment plans only. */
  def changeRenewalSettings(request: AnonKey): Request_[Subscription]
  /** Update a subscription's user license settings. */
  def changeSeats(request: AnonKey): Request_[Subscription]
  /** Cancel, suspend or transfer a subscription to direct. */
  def delete(request: AnonDeletionType): Request_[Unit]
  /** Get a specific subscription. */
  def get(request: AnonKey): Request_[Subscription]
  /** Create or transfer a subscription. */
  def insert(request: AnonOauthtoken): Request_[Subscription]
  /**
    * List of subscriptions managed by the reseller. The list can be all subscriptions, all of a customer's subscriptions, or all of a customer's
    * transferable subscriptions.
    */
  def list(request: AnonCustomerNamePrefix): Request_[Subscriptions]
  /** Immediately move a 30-day free trial subscription to a paid service subscription. */
  def startPaidService(request: AnonKey): Request_[Subscription]
  /** Suspends an active subscription. */
  def suspend(request: AnonKey): Request_[Subscription]
}

object SubscriptionsResource {
  @scala.inline
  def apply(
    activate: AnonKey => CallbackTo[Request_[Subscription]],
    changePlan: AnonKey => CallbackTo[Request_[Subscription]],
    changeRenewalSettings: AnonKey => CallbackTo[Request_[Subscription]],
    changeSeats: AnonKey => CallbackTo[Request_[Subscription]],
    delete: AnonDeletionType => CallbackTo[Request_[Unit]],
    get: AnonKey => CallbackTo[Request_[Subscription]],
    insert: AnonOauthtoken => CallbackTo[Request_[Subscription]],
    list: AnonCustomerNamePrefix => CallbackTo[Request_[Subscriptions]],
    startPaidService: AnonKey => CallbackTo[Request_[Subscription]],
    suspend: AnonKey => CallbackTo[Request_[Subscription]]
  ): SubscriptionsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("activate")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientReseller.AnonKey) => activate(t0).runNow()))
    __obj.updateDynamic("changePlan")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientReseller.AnonKey) => changePlan(t0).runNow()))
    __obj.updateDynamic("changeRenewalSettings")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientReseller.AnonKey) => changeRenewalSettings(t0).runNow()))
    __obj.updateDynamic("changeSeats")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientReseller.AnonKey) => changeSeats(t0).runNow()))
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientReseller.AnonDeletionType) => delete(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientReseller.AnonKey) => get(t0).runNow()))
    __obj.updateDynamic("insert")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientReseller.AnonOauthtoken) => insert(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientReseller.AnonCustomerNamePrefix) => list(t0).runNow()))
    __obj.updateDynamic("startPaidService")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientReseller.AnonKey) => startPaidService(t0).runNow()))
    __obj.updateDynamic("suspend")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientReseller.AnonKey) => suspend(t0).runNow()))
    __obj.asInstanceOf[SubscriptionsResource]
  }
}

