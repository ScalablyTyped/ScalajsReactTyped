package typingsJapgolly.gapiClientAdexchangebuyer.gapi.client.adexchangebuyer

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientAdexchangebuyer.AnonAccountId
import typingsJapgolly.gapiClientAdexchangebuyer.AnonFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BillingInfoResource extends js.Object {
  /** Returns the billing information for one account specified by account ID. */
  def get(request: AnonAccountId): Request_[BillingInfo]
  /** Retrieves a list of billing information for all accounts of the authenticated user. */
  def list(request: AnonFields): Request_[BillingInfoList]
}

object BillingInfoResource {
  @scala.inline
  def apply(
    get: AnonAccountId => CallbackTo[Request_[BillingInfo]],
    list: AnonFields => CallbackTo[Request_[BillingInfoList]]
  ): BillingInfoResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAdexchangebuyer.AnonAccountId) => get(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAdexchangebuyer.AnonFields) => list(t0).runNow()))
    __obj.asInstanceOf[BillingInfoResource]
  }
}

