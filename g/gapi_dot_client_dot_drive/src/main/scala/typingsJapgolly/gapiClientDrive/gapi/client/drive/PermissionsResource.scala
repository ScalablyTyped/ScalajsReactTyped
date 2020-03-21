package typingsJapgolly.gapiClientDrive.gapi.client.drive

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientDrive.AnonEmailMessage
import typingsJapgolly.gapiClientDrive.AnonPageSize
import typingsJapgolly.gapiClientDrive.AnonPermissionId
import typingsJapgolly.gapiClientDrive.AnonQuotaUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PermissionsResource extends js.Object {
  /** Creates a permission for a file or Team Drive. */
  def create(request: AnonEmailMessage): Request_[Permission]
  /** Deletes a permission. */
  def delete(request: AnonPermissionId): Request_[Unit]
  /** Gets a permission by ID. */
  def get(request: AnonPermissionId): Request_[Permission]
  /** Lists a file's or Team Drive's permissions. */
  def list(request: AnonPageSize): Request_[PermissionList]
  /** Updates a permission with patch semantics. */
  def update(request: AnonQuotaUser): Request_[Permission]
}

object PermissionsResource {
  @scala.inline
  def apply(
    create: AnonEmailMessage => CallbackTo[Request_[Permission]],
    delete: AnonPermissionId => CallbackTo[Request_[Unit]],
    get: AnonPermissionId => CallbackTo[Request_[Permission]],
    list: AnonPageSize => CallbackTo[Request_[PermissionList]],
    update: AnonQuotaUser => CallbackTo[Request_[Permission]]
  ): PermissionsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("create")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDrive.AnonEmailMessage) => create(t0).runNow()))
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDrive.AnonPermissionId) => delete(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDrive.AnonPermissionId) => get(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDrive.AnonPageSize) => list(t0).runNow()))
    __obj.updateDynamic("update")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDrive.AnonQuotaUser) => update(t0).runNow()))
    __obj.asInstanceOf[PermissionsResource]
  }
}

