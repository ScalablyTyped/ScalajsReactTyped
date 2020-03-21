package typingsJapgolly.gapiClientSqladmin.gapi.client.sqladmin

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientSqladmin.AnonFields
import typingsJapgolly.gapiClientSqladmin.AnonHost
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UsersResource extends js.Object {
  /** Deletes a user from a Cloud SQL instance. */
  def delete(request: AnonHost): Request_[Operation]
  /** Creates a new user in a Cloud SQL instance. */
  def insert(request: AnonFields): Request_[Operation]
  /** Lists users in the specified Cloud SQL instance. */
  def list(request: AnonFields): Request_[UsersListResponse]
  /** Updates an existing user in a Cloud SQL instance. */
  def update(request: AnonHost): Request_[Operation]
}

object UsersResource {
  @scala.inline
  def apply(
    delete: AnonHost => CallbackTo[Request_[Operation]],
    insert: AnonFields => CallbackTo[Request_[Operation]],
    list: AnonFields => CallbackTo[Request_[UsersListResponse]],
    update: AnonHost => CallbackTo[Request_[Operation]]
  ): UsersResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientSqladmin.AnonHost) => delete(t0).runNow()))
    __obj.updateDynamic("insert")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientSqladmin.AnonFields) => insert(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientSqladmin.AnonFields) => list(t0).runNow()))
    __obj.updateDynamic("update")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientSqladmin.AnonHost) => update(t0).runNow()))
    __obj.asInstanceOf[UsersResource]
  }
}

