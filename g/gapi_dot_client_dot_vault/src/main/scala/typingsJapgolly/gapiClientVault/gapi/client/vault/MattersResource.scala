package typingsJapgolly.gapiClientVault.gapi.client.vault

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientVault.AnonAlt
import typingsJapgolly.gapiClientVault.AnonCallback
import typingsJapgolly.gapiClientVault.AnonFields
import typingsJapgolly.gapiClientVault.AnonKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MattersResource extends js.Object {
  var holds: HoldsResource
  /** Adds an account as a matter collaborator. */
  def addPermissions(request: AnonAlt): Request_[MatterPermission]
  /** Closes the specified matter. Returns matter with updated state. */
  def close(request: AnonAlt): Request_[CloseMatterResponse]
  /**
    * Creates a new matter with the given name and description. The initial state
    * is open, and the owner is the method caller. Returns the created matter
    * with default view.
    */
  def create(request: AnonCallback): Request_[Matter]
  /** Deletes the specified matter. Returns matter with updated state. */
  def delete(request: AnonAlt): Request_[Matter]
  /** Gets the specified matter. */
  def get(request: AnonFields): Request_[Matter]
  /** Lists matters the user has access to. */
  def list(request: AnonKey): Request_[ListMattersResponse]
  /** Removes an account as a matter collaborator. */
  def removePermissions(request: AnonAlt): Request_[js.Object]
  /** Reopens the specified matter. Returns matter with updated state. */
  def reopen(request: AnonAlt): Request_[ReopenMatterResponse]
  /** Undeletes the specified matter. Returns matter with updated state. */
  def undelete(request: AnonAlt): Request_[Matter]
  /**
    * Updates the specified matter.
    * This updates only the name and description of the matter, identified by
    * matter id. Changes to any other fields are ignored.
    * Returns the default view of the matter.
    */
  def update(request: AnonAlt): Request_[Matter]
}

object MattersResource {
  @scala.inline
  def apply(
    addPermissions: AnonAlt => CallbackTo[Request_[MatterPermission]],
    close: AnonAlt => CallbackTo[Request_[CloseMatterResponse]],
    create: AnonCallback => CallbackTo[Request_[Matter]],
    delete: AnonAlt => CallbackTo[Request_[Matter]],
    get: AnonFields => CallbackTo[Request_[Matter]],
    holds: HoldsResource,
    list: AnonKey => CallbackTo[Request_[ListMattersResponse]],
    removePermissions: AnonAlt => CallbackTo[Request_[js.Object]],
    reopen: AnonAlt => CallbackTo[Request_[ReopenMatterResponse]],
    undelete: AnonAlt => CallbackTo[Request_[Matter]],
    update: AnonAlt => CallbackTo[Request_[Matter]]
  ): MattersResource = {
    val __obj = js.Dynamic.literal(holds = holds.asInstanceOf[js.Any])
    __obj.updateDynamic("addPermissions")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientVault.AnonAlt) => addPermissions(t0).runNow()))
    __obj.updateDynamic("close")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientVault.AnonAlt) => close(t0).runNow()))
    __obj.updateDynamic("create")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientVault.AnonCallback) => create(t0).runNow()))
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientVault.AnonAlt) => delete(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientVault.AnonFields) => get(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientVault.AnonKey) => list(t0).runNow()))
    __obj.updateDynamic("removePermissions")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientVault.AnonAlt) => removePermissions(t0).runNow()))
    __obj.updateDynamic("reopen")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientVault.AnonAlt) => reopen(t0).runNow()))
    __obj.updateDynamic("undelete")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientVault.AnonAlt) => undelete(t0).runNow()))
    __obj.updateDynamic("update")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientVault.AnonAlt) => update(t0).runNow()))
    __obj.asInstanceOf[MattersResource]
  }
}

