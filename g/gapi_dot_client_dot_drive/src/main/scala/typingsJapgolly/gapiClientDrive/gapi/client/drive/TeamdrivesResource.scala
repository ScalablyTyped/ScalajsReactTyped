package typingsJapgolly.gapiClientDrive.gapi.client.drive

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientDrive.AnonQ
import typingsJapgolly.gapiClientDrive.AnonRequestId
import typingsJapgolly.gapiClientDrive.AnonTeamDriveId
import typingsJapgolly.gapiClientDrive.AnonUseDomainAdminAccess
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamdrivesResource extends js.Object {
  /** Creates a new Team Drive. */
  def create(request: AnonRequestId): Request_[TeamDrive]
  /** Permanently deletes a Team Drive for which the user is an organizer. The Team Drive cannot contain any untrashed items. */
  def delete(request: AnonTeamDriveId): Request_[Unit]
  /** Gets a Team Drive's metadata by ID. */
  def get(request: AnonUseDomainAdminAccess): Request_[TeamDrive]
  /** Lists the user's Team Drives. */
  def list(request: AnonQ): Request_[TeamDriveList]
  /** Updates a Team Drive's metadata */
  def update(request: AnonTeamDriveId): Request_[TeamDrive]
}

object TeamdrivesResource {
  @scala.inline
  def apply(
    create: AnonRequestId => CallbackTo[Request_[TeamDrive]],
    delete: AnonTeamDriveId => CallbackTo[Request_[Unit]],
    get: AnonUseDomainAdminAccess => CallbackTo[Request_[TeamDrive]],
    list: AnonQ => CallbackTo[Request_[TeamDriveList]],
    update: AnonTeamDriveId => CallbackTo[Request_[TeamDrive]]
  ): TeamdrivesResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("create")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDrive.AnonRequestId) => create(t0).runNow()))
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDrive.AnonTeamDriveId) => delete(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDrive.AnonUseDomainAdminAccess) => get(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDrive.AnonQ) => list(t0).runNow()))
    __obj.updateDynamic("update")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDrive.AnonTeamDriveId) => update(t0).runNow()))
    __obj.asInstanceOf[TeamdrivesResource]
  }
}

