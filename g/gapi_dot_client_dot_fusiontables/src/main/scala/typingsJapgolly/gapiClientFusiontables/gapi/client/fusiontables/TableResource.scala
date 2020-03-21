package typingsJapgolly.gapiClientFusiontables.gapi.client.fusiontables

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientFusiontables.AnonCopyPresentation
import typingsJapgolly.gapiClientFusiontables.AnonDelimiter
import typingsJapgolly.gapiClientFusiontables.AnonEncoding
import typingsJapgolly.gapiClientFusiontables.AnonFields
import typingsJapgolly.gapiClientFusiontables.AnonMaxResults
import typingsJapgolly.gapiClientFusiontables.AnonPrettyPrint
import typingsJapgolly.gapiClientFusiontables.AnonQuotaUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableResource extends js.Object {
  /** Copies a table. */
  def copy(request: AnonCopyPresentation): Request_[Table]
  /** Deletes a table. */
  def delete(request: AnonFields): Request_[Unit]
  /** Retrieves a specific table by its ID. */
  def get(request: AnonFields): Request_[Table]
  /** Imports more rows into a table. */
  def importRows(request: AnonDelimiter): Request_[Import]
  /** Imports a new table. */
  def importTable(request: AnonEncoding): Request_[Table]
  /** Creates a new table. */
  def insert(request: AnonPrettyPrint): Request_[Table]
  /** Retrieves a list of tables a user owns. */
  def list(request: AnonMaxResults): Request_[TableList]
  /**
    * Updates an existing table. Unless explicitly requested, only the name, description, and attribution will be updated. This method supports patch
    * semantics.
    */
  def patch(request: AnonQuotaUser): Request_[Table]
  /** Replaces rows of an existing table. Current rows remain visible until all replacement rows are ready. */
  def replaceRows(request: AnonDelimiter): Request_[Task]
  /** Updates an existing table. Unless explicitly requested, only the name, description, and attribution will be updated. */
  def update(request: AnonQuotaUser): Request_[Table]
}

object TableResource {
  @scala.inline
  def apply(
    copy: AnonCopyPresentation => CallbackTo[Request_[Table]],
    delete: AnonFields => CallbackTo[Request_[Unit]],
    get: AnonFields => CallbackTo[Request_[Table]],
    importRows: AnonDelimiter => CallbackTo[Request_[Import]],
    importTable: AnonEncoding => CallbackTo[Request_[Table]],
    insert: AnonPrettyPrint => CallbackTo[Request_[Table]],
    list: AnonMaxResults => CallbackTo[Request_[TableList]],
    patch: AnonQuotaUser => CallbackTo[Request_[Table]],
    replaceRows: AnonDelimiter => CallbackTo[Request_[Task]],
    update: AnonQuotaUser => CallbackTo[Request_[Table]]
  ): TableResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("copy")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientFusiontables.AnonCopyPresentation) => copy(t0).runNow()))
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientFusiontables.AnonFields) => delete(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientFusiontables.AnonFields) => get(t0).runNow()))
    __obj.updateDynamic("importRows")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientFusiontables.AnonDelimiter) => importRows(t0).runNow()))
    __obj.updateDynamic("importTable")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientFusiontables.AnonEncoding) => importTable(t0).runNow()))
    __obj.updateDynamic("insert")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientFusiontables.AnonPrettyPrint) => insert(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientFusiontables.AnonMaxResults) => list(t0).runNow()))
    __obj.updateDynamic("patch")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientFusiontables.AnonQuotaUser) => patch(t0).runNow()))
    __obj.updateDynamic("replaceRows")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientFusiontables.AnonDelimiter) => replaceRows(t0).runNow()))
    __obj.updateDynamic("update")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientFusiontables.AnonQuotaUser) => update(t0).runNow()))
    __obj.asInstanceOf[TableResource]
  }
}

