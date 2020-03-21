package typingsJapgolly.gapiClientDfareporting.gapi.client.dfareporting

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientDfareporting.AnonFields
import typingsJapgolly.gapiClientDfareporting.AnonKey
import typingsJapgolly.gapiClientDfareporting.AnonMaxResults
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountsResource extends js.Object {
  /** Gets one account by ID. */
  def get(request: AnonFields): Request_[Account]
  /** Retrieves the list of accounts, possibly filtered. This method supports paging. */
  def list(request: AnonMaxResults): Request_[AccountsListResponse]
  /** Updates an existing account. This method supports patch semantics. */
  def patch(request: AnonFields): Request_[Account]
  /** Updates an existing account. */
  def update(request: AnonKey): Request_[Account]
}

object AccountsResource {
  @scala.inline
  def apply(
    get: AnonFields => CallbackTo[Request_[Account]],
    list: AnonMaxResults => CallbackTo[Request_[AccountsListResponse]],
    patch: AnonFields => CallbackTo[Request_[Account]],
    update: AnonKey => CallbackTo[Request_[Account]]
  ): AccountsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDfareporting.AnonFields) => get(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDfareporting.AnonMaxResults) => list(t0).runNow()))
    __obj.updateDynamic("patch")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDfareporting.AnonFields) => patch(t0).runNow()))
    __obj.updateDynamic("update")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDfareporting.AnonKey) => update(t0).runNow()))
    __obj.asInstanceOf[AccountsResource]
  }
}

