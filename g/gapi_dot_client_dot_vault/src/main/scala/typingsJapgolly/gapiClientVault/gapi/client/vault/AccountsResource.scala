package typingsJapgolly.gapiClientVault.gapi.client.vault

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientVault.AnonAccesstoken
import typingsJapgolly.gapiClientVault.AnonAccountId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountsResource extends js.Object {
  /**
    * Adds a HeldAccount to a hold. Accounts can only be added to a hold that
    * has no held_org_unit set. Attempting to add an account to an OU-based
    * hold will result in an error.
    */
  def create(request: AnonAccesstoken): Request_[HeldAccount]
  /**
    * Removes a HeldAccount from a hold. If this request leaves the hold with
    * no held accounts, the hold will not apply to any accounts.
    */
  def delete(request: AnonAccountId): Request_[js.Object]
  /**
    * Lists HeldAccounts for a hold. This will only list individually specified
    * held accounts. If the hold is on an OU, then use
    * <a href="https://developers.google.com/admin-sdk/">Admin SDK</a>
    * to enumerate its members.
    */
  def list(request: AnonAccesstoken): Request_[ListHeldAccountsResponse]
}

object AccountsResource {
  @scala.inline
  def apply(
    create: AnonAccesstoken => CallbackTo[Request_[HeldAccount]],
    delete: AnonAccountId => CallbackTo[Request_[js.Object]],
    list: AnonAccesstoken => CallbackTo[Request_[ListHeldAccountsResponse]]
  ): AccountsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("create")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientVault.AnonAccesstoken) => create(t0).runNow()))
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientVault.AnonAccountId) => delete(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientVault.AnonAccesstoken) => list(t0).runNow()))
    __obj.asInstanceOf[AccountsResource]
  }
}

