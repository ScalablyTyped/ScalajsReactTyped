package typingsJapgolly.gapiClientFusiontables.gapi.client.fusiontables

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientFusiontables.AnonAlt
import typingsJapgolly.gapiClientFusiontables.AnonFields
import typingsJapgolly.gapiClientFusiontables.AnonKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnResource extends js.Object {
  /** Deletes the specified column. */
  def delete(request: AnonAlt): Request_[Unit]
  /** Retrieves a specific column by its ID. */
  def get(request: AnonAlt): Request_[Column]
  /** Adds a new column to the table. */
  def insert(request: AnonFields): Request_[Column]
  /** Retrieves a list of columns. */
  def list(request: AnonKey): Request_[ColumnList]
  /** Updates the name or type of an existing column. This method supports patch semantics. */
  def patch(request: AnonAlt): Request_[Column]
  /** Updates the name or type of an existing column. */
  def update(request: AnonAlt): Request_[Column]
}

object ColumnResource {
  @scala.inline
  def apply(
    delete: AnonAlt => CallbackTo[Request_[Unit]],
    get: AnonAlt => CallbackTo[Request_[Column]],
    insert: AnonFields => CallbackTo[Request_[Column]],
    list: AnonKey => CallbackTo[Request_[ColumnList]],
    patch: AnonAlt => CallbackTo[Request_[Column]],
    update: AnonAlt => CallbackTo[Request_[Column]]
  ): ColumnResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientFusiontables.AnonAlt) => delete(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientFusiontables.AnonAlt) => get(t0).runNow()))
    __obj.updateDynamic("insert")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientFusiontables.AnonFields) => insert(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientFusiontables.AnonKey) => list(t0).runNow()))
    __obj.updateDynamic("patch")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientFusiontables.AnonAlt) => patch(t0).runNow()))
    __obj.updateDynamic("update")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientFusiontables.AnonAlt) => update(t0).runNow()))
    __obj.asInstanceOf[ColumnResource]
  }
}

