package typingsJapgolly.gapiClientSqladmin.gapi.client.sqladmin

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientSqladmin.AnonDatabase
import typingsJapgolly.gapiClientSqladmin.AnonFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatabasesResource extends js.Object {
  /** Deletes a database from a Cloud SQL instance. */
  def delete(request: AnonDatabase): Request_[Operation]
  /** Retrieves a resource containing information about a database inside a Cloud SQL instance. */
  def get(request: AnonDatabase): Request_[Database]
  /** Inserts a resource containing information about a database inside a Cloud SQL instance. */
  def insert(request: AnonFields): Request_[Operation]
  /** Lists databases in the specified Cloud SQL instance. */
  def list(request: AnonFields): Request_[DatabasesListResponse]
  /** Updates a resource containing information about a database inside a Cloud SQL instance. This method supports patch semantics. */
  def patch(request: AnonDatabase): Request_[Operation]
  /** Updates a resource containing information about a database inside a Cloud SQL instance. */
  def update(request: AnonDatabase): Request_[Operation]
}

object DatabasesResource {
  @scala.inline
  def apply(
    delete: AnonDatabase => CallbackTo[Request_[Operation]],
    get: AnonDatabase => CallbackTo[Request_[Database]],
    insert: AnonFields => CallbackTo[Request_[Operation]],
    list: AnonFields => CallbackTo[Request_[DatabasesListResponse]],
    patch: AnonDatabase => CallbackTo[Request_[Operation]],
    update: AnonDatabase => CallbackTo[Request_[Operation]]
  ): DatabasesResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientSqladmin.AnonDatabase) => delete(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientSqladmin.AnonDatabase) => get(t0).runNow()))
    __obj.updateDynamic("insert")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientSqladmin.AnonFields) => insert(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientSqladmin.AnonFields) => list(t0).runNow()))
    __obj.updateDynamic("patch")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientSqladmin.AnonDatabase) => patch(t0).runNow()))
    __obj.updateDynamic("update")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientSqladmin.AnonDatabase) => update(t0).runNow()))
    __obj.asInstanceOf[DatabasesResource]
  }
}

