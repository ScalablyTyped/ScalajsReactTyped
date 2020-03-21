package typingsJapgolly.gapiClientDfareporting.gapi.client.dfareporting

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientDfareporting.AnonFields
import typingsJapgolly.gapiClientDfareporting.AnonKey
import typingsJapgolly.gapiClientDfareporting.AnonOauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubaccountsResource extends js.Object {
  /** Gets one subaccount by ID. */
  def get(request: AnonFields): Request_[Subaccount]
  /** Inserts a new subaccount. */
  def insert(request: AnonKey): Request_[Subaccount]
  /** Gets a list of subaccounts, possibly filtered. This method supports paging. */
  def list(request: AnonOauthtoken): Request_[SubaccountsListResponse]
  /** Updates an existing subaccount. This method supports patch semantics. */
  def patch(request: AnonFields): Request_[Subaccount]
  /** Updates an existing subaccount. */
  def update(request: AnonKey): Request_[Subaccount]
}

object SubaccountsResource {
  @scala.inline
  def apply(
    get: AnonFields => CallbackTo[Request_[Subaccount]],
    insert: AnonKey => CallbackTo[Request_[Subaccount]],
    list: AnonOauthtoken => CallbackTo[Request_[SubaccountsListResponse]],
    patch: AnonFields => CallbackTo[Request_[Subaccount]],
    update: AnonKey => CallbackTo[Request_[Subaccount]]
  ): SubaccountsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDfareporting.AnonFields) => get(t0).runNow()))
    __obj.updateDynamic("insert")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDfareporting.AnonKey) => insert(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDfareporting.AnonOauthtoken) => list(t0).runNow()))
    __obj.updateDynamic("patch")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDfareporting.AnonFields) => patch(t0).runNow()))
    __obj.updateDynamic("update")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDfareporting.AnonKey) => update(t0).runNow()))
    __obj.asInstanceOf[SubaccountsResource]
  }
}

