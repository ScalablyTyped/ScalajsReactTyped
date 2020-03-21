package typingsJapgolly.gapiClientVault.gapi.client.vault

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientVault.AnonAccesstoken
import typingsJapgolly.gapiClientVault.AnonAlt
import typingsJapgolly.gapiClientVault.AnonBearertoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HoldsResource extends js.Object {
  var accounts: AccountsResource
  /** Creates a hold in the given matter. */
  def create(request: AnonAlt): Request_[Hold]
  /** Removes a hold by ID. This will release any HeldAccounts on this Hold. */
  def delete(request: AnonAccesstoken): Request_[js.Object]
  /** Gets a hold by ID. */
  def get(request: AnonAccesstoken): Request_[Hold]
  /**
    * Lists holds within a matter. An empty page token in ListHoldsResponse
    * denotes no more holds to list.
    */
  def list(request: AnonBearertoken): Request_[ListHoldsResponse]
  /**
    * Updates the OU and/or query parameters of a hold. You cannot add accounts
    * to a hold that covers an OU, nor can you add OUs to a hold that covers
    * individual accounts. Accounts listed in the hold will be ignored.
    */
  def update(request: AnonAccesstoken): Request_[Hold]
}

object HoldsResource {
  @scala.inline
  def apply(
    accounts: AccountsResource,
    create: AnonAlt => CallbackTo[Request_[Hold]],
    delete: AnonAccesstoken => CallbackTo[Request_[js.Object]],
    get: AnonAccesstoken => CallbackTo[Request_[Hold]],
    list: AnonBearertoken => CallbackTo[Request_[ListHoldsResponse]],
    update: AnonAccesstoken => CallbackTo[Request_[Hold]]
  ): HoldsResource = {
    val __obj = js.Dynamic.literal(accounts = accounts.asInstanceOf[js.Any])
    __obj.updateDynamic("create")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientVault.AnonAlt) => create(t0).runNow()))
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientVault.AnonAccesstoken) => delete(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientVault.AnonAccesstoken) => get(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientVault.AnonBearertoken) => list(t0).runNow()))
    __obj.updateDynamic("update")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientVault.AnonAccesstoken) => update(t0).runNow()))
    __obj.asInstanceOf[HoldsResource]
  }
}

