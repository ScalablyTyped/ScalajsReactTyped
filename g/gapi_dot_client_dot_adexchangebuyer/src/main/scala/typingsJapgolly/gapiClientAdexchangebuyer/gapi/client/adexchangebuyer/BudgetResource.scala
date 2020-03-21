package typingsJapgolly.gapiClientAdexchangebuyer.gapi.client.adexchangebuyer

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientAdexchangebuyer.AnonBillingId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BudgetResource extends js.Object {
  /** Returns the budget information for the adgroup specified by the accountId and billingId. */
  def get(request: AnonBillingId): Request_[Budget]
  /**
    * Updates the budget amount for the budget of the adgroup specified by the accountId and billingId, with the budget amount in the request. This method
    * supports patch semantics.
    */
  def patch(request: AnonBillingId): Request_[Budget]
  /** Updates the budget amount for the budget of the adgroup specified by the accountId and billingId, with the budget amount in the request. */
  def update(request: AnonBillingId): Request_[Budget]
}

object BudgetResource {
  @scala.inline
  def apply(
    get: AnonBillingId => CallbackTo[Request_[Budget]],
    patch: AnonBillingId => CallbackTo[Request_[Budget]],
    update: AnonBillingId => CallbackTo[Request_[Budget]]
  ): BudgetResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAdexchangebuyer.AnonBillingId) => get(t0).runNow()))
    __obj.updateDynamic("patch")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAdexchangebuyer.AnonBillingId) => patch(t0).runNow()))
    __obj.updateDynamic("update")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAdexchangebuyer.AnonBillingId) => update(t0).runNow()))
    __obj.asInstanceOf[BudgetResource]
  }
}

