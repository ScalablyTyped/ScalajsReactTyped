package typingsJapgolly.gapiClientSqladmin.gapi.client.sqladmin

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientSqladmin.AnonAlt
import typingsJapgolly.gapiClientSqladmin.AnonFields
import typingsJapgolly.gapiClientSqladmin.AnonInstance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BackupRunsResource extends js.Object {
  /** Deletes the backup taken by a backup run. */
  def delete(request: AnonAlt): Request_[Operation]
  /** Retrieves a resource containing information about a backup run. */
  def get(request: AnonAlt): Request_[BackupRun]
  /** Creates a new backup run on demand. This method is applicable only to Second Generation instances. */
  def insert(request: AnonFields): Request_[Operation]
  /** Lists all backup runs associated with a given instance and configuration in the reverse chronological order of the enqueued time. */
  def list(request: AnonInstance): Request_[BackupRunsListResponse]
}

object BackupRunsResource {
  @scala.inline
  def apply(
    delete: AnonAlt => CallbackTo[Request_[Operation]],
    get: AnonAlt => CallbackTo[Request_[BackupRun]],
    insert: AnonFields => CallbackTo[Request_[Operation]],
    list: AnonInstance => CallbackTo[Request_[BackupRunsListResponse]]
  ): BackupRunsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientSqladmin.AnonAlt) => delete(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientSqladmin.AnonAlt) => get(t0).runNow()))
    __obj.updateDynamic("insert")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientSqladmin.AnonFields) => insert(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientSqladmin.AnonInstance) => list(t0).runNow()))
    __obj.asInstanceOf[BackupRunsResource]
  }
}

