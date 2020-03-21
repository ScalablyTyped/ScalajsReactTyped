package typingsJapgolly.gapiClientDfareporting.gapi.client.dfareporting

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientDfareporting.AnonFieldsKey
import typingsJapgolly.gapiClientDfareporting.AnonKey
import typingsJapgolly.gapiClientDfareporting.AnonScope
import typingsJapgolly.gapiClientDfareporting.AnonSynchronous
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReportsResource extends js.Object {
  var compatibleFields: CompatibleFieldsResource
  var files: FilesResource
  /** Deletes a report by its ID. */
  def delete(request: AnonFieldsKey): Request_[Unit]
  /** Retrieves a report by its ID. */
  def get(request: AnonFieldsKey): Request_[Report]
  /** Creates a report. */
  def insert(request: AnonKey): Request_[Report]
  /** Retrieves list of reports. */
  def list(request: AnonScope): Request_[ReportList]
  /** Updates a report. This method supports patch semantics. */
  def patch(request: AnonFieldsKey): Request_[Report]
  /** Runs a report. */
  def run(request: AnonSynchronous): Request_[File]
  /** Updates a report. */
  def update(request: AnonFieldsKey): Request_[Report]
}

object ReportsResource {
  @scala.inline
  def apply(
    compatibleFields: CompatibleFieldsResource,
    delete: AnonFieldsKey => CallbackTo[Request_[Unit]],
    files: FilesResource,
    get: AnonFieldsKey => CallbackTo[Request_[Report]],
    insert: AnonKey => CallbackTo[Request_[Report]],
    list: AnonScope => CallbackTo[Request_[ReportList]],
    patch: AnonFieldsKey => CallbackTo[Request_[Report]],
    run: AnonSynchronous => CallbackTo[Request_[File]],
    update: AnonFieldsKey => CallbackTo[Request_[Report]]
  ): ReportsResource = {
    val __obj = js.Dynamic.literal(compatibleFields = compatibleFields.asInstanceOf[js.Any], files = files.asInstanceOf[js.Any])
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDfareporting.AnonFieldsKey) => delete(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDfareporting.AnonFieldsKey) => get(t0).runNow()))
    __obj.updateDynamic("insert")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDfareporting.AnonKey) => insert(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDfareporting.AnonScope) => list(t0).runNow()))
    __obj.updateDynamic("patch")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDfareporting.AnonFieldsKey) => patch(t0).runNow()))
    __obj.updateDynamic("run")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDfareporting.AnonSynchronous) => run(t0).runNow()))
    __obj.updateDynamic("update")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDfareporting.AnonFieldsKey) => update(t0).runNow()))
    __obj.asInstanceOf[ReportsResource]
  }
}

