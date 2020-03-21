package typingsJapgolly.gapiClientReseller.gapi.client.reseller

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientReseller.AnonCustomerAuthToken
import typingsJapgolly.gapiClientReseller.AnonCustomerId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomersResource extends js.Object {
  /** Get a customer account. */
  def get(request: AnonCustomerId): Request_[Customer]
  /** Order a new customer's account. */
  def insert(request: AnonCustomerAuthToken): Request_[Customer]
  /** Update a customer account's settings. This method supports patch semantics. */
  def patch(request: AnonCustomerId): Request_[Customer]
  /** Update a customer account's settings. */
  def update(request: AnonCustomerId): Request_[Customer]
}

object CustomersResource {
  @scala.inline
  def apply(
    get: AnonCustomerId => CallbackTo[Request_[Customer]],
    insert: AnonCustomerAuthToken => CallbackTo[Request_[Customer]],
    patch: AnonCustomerId => CallbackTo[Request_[Customer]],
    update: AnonCustomerId => CallbackTo[Request_[Customer]]
  ): CustomersResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientReseller.AnonCustomerId) => get(t0).runNow()))
    __obj.updateDynamic("insert")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientReseller.AnonCustomerAuthToken) => insert(t0).runNow()))
    __obj.updateDynamic("patch")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientReseller.AnonCustomerId) => patch(t0).runNow()))
    __obj.updateDynamic("update")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientReseller.AnonCustomerId) => update(t0).runNow()))
    __obj.asInstanceOf[CustomersResource]
  }
}

