package typingsJapgolly.gapiClientSqladmin.gapi.client.sqladmin

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientSqladmin.AnonFields
import typingsJapgolly.gapiClientSqladmin.AnonFilter
import typingsJapgolly.gapiClientSqladmin.AnonKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InstancesResource extends js.Object {
  /** Creates a Cloud SQL instance as a clone of the source instance. The API is not ready for Second Generation instances yet. */
  def clone(request: AnonFields): Request_[Operation]
  /** Deletes a Cloud SQL instance. */
  def delete(request: AnonFields): Request_[Operation]
  /** Exports data from a Cloud SQL instance to a Google Cloud Storage bucket as a MySQL dump file. */
  def export(request: AnonFields): Request_[Operation]
  /** Failover the instance to its failover replica instance. */
  def failover(request: AnonFields): Request_[Operation]
  /** Retrieves a resource containing information about a Cloud SQL instance. */
  def get(request: AnonFields): Request_[DatabaseInstance]
  /** Imports data into a Cloud SQL instance from a MySQL dump file in Google Cloud Storage. */
  def `import`(request: AnonFields): Request_[Operation]
  /** Creates a new Cloud SQL instance. */
  def insert(request: AnonKey): Request_[Operation]
  /** Lists instances under a given project in the alphabetical order of the instance name. */
  def list(request: AnonFilter): Request_[InstancesListResponse]
  /**
    * Updates settings of a Cloud SQL instance. Caution: This is not a partial update, so you must include values for all the settings that you want to
    * retain. For partial updates, use patch.. This method supports patch semantics.
    */
  def patch(request: AnonFields): Request_[Operation]
  /** Promotes the read replica instance to be a stand-alone Cloud SQL instance. */
  def promoteReplica(request: AnonFields): Request_[Operation]
  /**
    * Deletes all client certificates and generates a new server SSL certificate for the instance. The changes will not take effect until the instance is
    * restarted. Existing instances without a server certificate will need to call this once to set a server certificate.
    */
  def resetSslConfig(request: AnonFields): Request_[Operation]
  /** Restarts a Cloud SQL instance. */
  def restart(request: AnonFields): Request_[Operation]
  /** Restores a backup of a Cloud SQL instance. */
  def restoreBackup(request: AnonFields): Request_[Operation]
  /** Starts the replication in the read replica instance. */
  def startReplica(request: AnonFields): Request_[Operation]
  /** Stops the replication in the read replica instance. */
  def stopReplica(request: AnonFields): Request_[Operation]
  /** Truncate MySQL general and slow query log tables */
  def truncateLog(request: AnonFields): Request_[Operation]
  /**
    * Updates settings of a Cloud SQL instance. Caution: This is not a partial update, so you must include values for all the settings that you want to
    * retain. For partial updates, use patch.
    */
  def update(request: AnonFields): Request_[Operation]
}

object InstancesResource {
  @scala.inline
  def apply(
    clone: AnonFields => CallbackTo[Request_[Operation]],
    delete: AnonFields => CallbackTo[Request_[Operation]],
    export: AnonFields => CallbackTo[Request_[Operation]],
    failover: AnonFields => CallbackTo[Request_[Operation]],
    get: AnonFields => CallbackTo[Request_[DatabaseInstance]],
    `import`: AnonFields => CallbackTo[Request_[Operation]],
    insert: AnonKey => CallbackTo[Request_[Operation]],
    list: AnonFilter => CallbackTo[Request_[InstancesListResponse]],
    patch: AnonFields => CallbackTo[Request_[Operation]],
    promoteReplica: AnonFields => CallbackTo[Request_[Operation]],
    resetSslConfig: AnonFields => CallbackTo[Request_[Operation]],
    restart: AnonFields => CallbackTo[Request_[Operation]],
    restoreBackup: AnonFields => CallbackTo[Request_[Operation]],
    startReplica: AnonFields => CallbackTo[Request_[Operation]],
    stopReplica: AnonFields => CallbackTo[Request_[Operation]],
    truncateLog: AnonFields => CallbackTo[Request_[Operation]],
    update: AnonFields => CallbackTo[Request_[Operation]]
  ): InstancesResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("clone")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientSqladmin.AnonFields) => clone(t0).runNow()))
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientSqladmin.AnonFields) => delete(t0).runNow()))
    __obj.updateDynamic("export")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientSqladmin.AnonFields) => export(t0).runNow()))
    __obj.updateDynamic("failover")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientSqladmin.AnonFields) => failover(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientSqladmin.AnonFields) => get(t0).runNow()))
    __obj.updateDynamic("import")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientSqladmin.AnonFields) => `import`(t0).runNow()))
    __obj.updateDynamic("insert")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientSqladmin.AnonKey) => insert(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientSqladmin.AnonFilter) => list(t0).runNow()))
    __obj.updateDynamic("patch")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientSqladmin.AnonFields) => patch(t0).runNow()))
    __obj.updateDynamic("promoteReplica")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientSqladmin.AnonFields) => promoteReplica(t0).runNow()))
    __obj.updateDynamic("resetSslConfig")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientSqladmin.AnonFields) => resetSslConfig(t0).runNow()))
    __obj.updateDynamic("restart")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientSqladmin.AnonFields) => restart(t0).runNow()))
    __obj.updateDynamic("restoreBackup")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientSqladmin.AnonFields) => restoreBackup(t0).runNow()))
    __obj.updateDynamic("startReplica")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientSqladmin.AnonFields) => startReplica(t0).runNow()))
    __obj.updateDynamic("stopReplica")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientSqladmin.AnonFields) => stopReplica(t0).runNow()))
    __obj.updateDynamic("truncateLog")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientSqladmin.AnonFields) => truncateLog(t0).runNow()))
    __obj.updateDynamic("update")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientSqladmin.AnonFields) => update(t0).runNow()))
    __obj.asInstanceOf[InstancesResource]
  }
}

