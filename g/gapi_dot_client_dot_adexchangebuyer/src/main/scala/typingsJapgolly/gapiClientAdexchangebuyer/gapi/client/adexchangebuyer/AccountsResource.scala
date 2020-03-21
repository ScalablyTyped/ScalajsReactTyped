package typingsJapgolly.gapiClientAdexchangebuyer.gapi.client.adexchangebuyer

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientAdexchangebuyer.AnonAlt
import typingsJapgolly.gapiClientAdexchangebuyer.AnonConfirmUnsafeAccountChange
import typingsJapgolly.gapiClientAdexchangebuyer.AnonFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountsResource extends js.Object {
  /** Gets one account by ID. */
  def get(request: AnonAlt): Request_[Account]
  /** Retrieves the authenticated user's list of accounts. */
  def list(request: AnonFields): Request_[AccountsList]
  /** Updates an existing account. This method supports patch semantics. */
  def patch(request: AnonConfirmUnsafeAccountChange): Request_[Account]
  /** Updates an existing account. */
  def update(request: AnonConfirmUnsafeAccountChange): Request_[Account]
}

object AccountsResource {
  @scala.inline
  def apply(
    get: AnonAlt => CallbackTo[Request_[Account]],
    list: AnonFields => CallbackTo[Request_[AccountsList]],
    patch: AnonConfirmUnsafeAccountChange => CallbackTo[Request_[Account]],
    update: AnonConfirmUnsafeAccountChange => CallbackTo[Request_[Account]]
  ): AccountsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAdexchangebuyer.AnonAlt) => get(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAdexchangebuyer.AnonFields) => list(t0).runNow()))
    __obj.updateDynamic("patch")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAdexchangebuyer.AnonConfirmUnsafeAccountChange) => patch(t0).runNow()))
    __obj.updateDynamic("update")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAdexchangebuyer.AnonConfirmUnsafeAccountChange) => update(t0).runNow()))
    __obj.asInstanceOf[AccountsResource]
  }
}

