package typingsJapgolly.googleAppsScript.GoogleAppsScript

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.googleAppsScript.GoogleAppsScript.AdminReseller.Collection.CustomersCollection
import typingsJapgolly.googleAppsScript.GoogleAppsScript.AdminReseller.Collection.ResellernotifyCollection
import typingsJapgolly.googleAppsScript.GoogleAppsScript.AdminReseller.Collection.SubscriptionsCollection
import typingsJapgolly.googleAppsScript.GoogleAppsScript.AdminReseller.Schema.Address
import typingsJapgolly.googleAppsScript.GoogleAppsScript.AdminReseller.Schema.ChangePlanRequest
import typingsJapgolly.googleAppsScript.GoogleAppsScript.AdminReseller.Schema.Customer
import typingsJapgolly.googleAppsScript.GoogleAppsScript.AdminReseller.Schema.RenewalSettings
import typingsJapgolly.googleAppsScript.GoogleAppsScript.AdminReseller.Schema.Seats
import typingsJapgolly.googleAppsScript.GoogleAppsScript.AdminReseller.Schema.Subscription
import typingsJapgolly.googleAppsScript.GoogleAppsScript.AdminReseller.Schema.SubscriptionPlan
import typingsJapgolly.googleAppsScript.GoogleAppsScript.AdminReseller.Schema.SubscriptionPlanCommitmentInterval
import typingsJapgolly.googleAppsScript.GoogleAppsScript.AdminReseller.Schema.SubscriptionTransferInfo
import typingsJapgolly.googleAppsScript.GoogleAppsScript.AdminReseller.Schema.SubscriptionTrialSettings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdminReseller_ extends js.Object {
  var Customers: js.UndefOr[CustomersCollection] = js.undefined
  var Resellernotify: js.UndefOr[ResellernotifyCollection] = js.undefined
  var Subscriptions: js.UndefOr[SubscriptionsCollection] = js.undefined
  // Create a new instance of Address
  def newAddress(): Address
  // Create a new instance of ChangePlanRequest
  def newChangePlanRequest(): ChangePlanRequest
  // Create a new instance of Customer
  def newCustomer(): Customer
  // Create a new instance of RenewalSettings
  def newRenewalSettings(): RenewalSettings
  // Create a new instance of Seats
  def newSeats(): Seats
  // Create a new instance of Subscription
  def newSubscription(): Subscription
  // Create a new instance of SubscriptionPlan
  def newSubscriptionPlan(): SubscriptionPlan
  // Create a new instance of SubscriptionPlanCommitmentInterval
  def newSubscriptionPlanCommitmentInterval(): SubscriptionPlanCommitmentInterval
  // Create a new instance of SubscriptionTransferInfo
  def newSubscriptionTransferInfo(): SubscriptionTransferInfo
  // Create a new instance of SubscriptionTrialSettings
  def newSubscriptionTrialSettings(): SubscriptionTrialSettings
}

object AdminReseller_ {
  @scala.inline
  def apply(
    newAddress: CallbackTo[Address],
    newChangePlanRequest: CallbackTo[ChangePlanRequest],
    newCustomer: CallbackTo[Customer],
    newRenewalSettings: CallbackTo[RenewalSettings],
    newSeats: CallbackTo[Seats],
    newSubscription: CallbackTo[Subscription],
    newSubscriptionPlan: CallbackTo[SubscriptionPlan],
    newSubscriptionPlanCommitmentInterval: CallbackTo[SubscriptionPlanCommitmentInterval],
    newSubscriptionTransferInfo: CallbackTo[SubscriptionTransferInfo],
    newSubscriptionTrialSettings: CallbackTo[SubscriptionTrialSettings],
    Customers: CustomersCollection = null,
    Resellernotify: ResellernotifyCollection = null,
    Subscriptions: SubscriptionsCollection = null
  ): AdminReseller_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("newAddress")(newAddress.toJsFn)
    __obj.updateDynamic("newChangePlanRequest")(newChangePlanRequest.toJsFn)
    __obj.updateDynamic("newCustomer")(newCustomer.toJsFn)
    __obj.updateDynamic("newRenewalSettings")(newRenewalSettings.toJsFn)
    __obj.updateDynamic("newSeats")(newSeats.toJsFn)
    __obj.updateDynamic("newSubscription")(newSubscription.toJsFn)
    __obj.updateDynamic("newSubscriptionPlan")(newSubscriptionPlan.toJsFn)
    __obj.updateDynamic("newSubscriptionPlanCommitmentInterval")(newSubscriptionPlanCommitmentInterval.toJsFn)
    __obj.updateDynamic("newSubscriptionTransferInfo")(newSubscriptionTransferInfo.toJsFn)
    __obj.updateDynamic("newSubscriptionTrialSettings")(newSubscriptionTrialSettings.toJsFn)
    if (Customers != null) __obj.updateDynamic("Customers")(Customers.asInstanceOf[js.Any])
    if (Resellernotify != null) __obj.updateDynamic("Resellernotify")(Resellernotify.asInstanceOf[js.Any])
    if (Subscriptions != null) __obj.updateDynamic("Subscriptions")(Subscriptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdminReseller_]
  }
}

