package typingsJapgolly.gapiClientDfareporting.gapi.client.dfareporting

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientDfareporting.AnonAccountUserRoleOnly
import typingsJapgolly.gapiClientDfareporting.AnonFields
import typingsJapgolly.gapiClientDfareporting.AnonKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserRolesResource extends js.Object {
  /** Deletes an existing user role. */
  def delete(request: AnonFields): Request_[Unit]
  /** Gets one user role by ID. */
  def get(request: AnonFields): Request_[UserRole]
  /** Inserts a new user role. */
  def insert(request: AnonKey): Request_[UserRole]
  /** Retrieves a list of user roles, possibly filtered. This method supports paging. */
  def list(request: AnonAccountUserRoleOnly): Request_[UserRolesListResponse]
  /** Updates an existing user role. This method supports patch semantics. */
  def patch(request: AnonFields): Request_[UserRole]
  /** Updates an existing user role. */
  def update(request: AnonKey): Request_[UserRole]
}

object UserRolesResource {
  @scala.inline
  def apply(
    delete: AnonFields => CallbackTo[Request_[Unit]],
    get: AnonFields => CallbackTo[Request_[UserRole]],
    insert: AnonKey => CallbackTo[Request_[UserRole]],
    list: AnonAccountUserRoleOnly => CallbackTo[Request_[UserRolesListResponse]],
    patch: AnonFields => CallbackTo[Request_[UserRole]],
    update: AnonKey => CallbackTo[Request_[UserRole]]
  ): UserRolesResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDfareporting.AnonFields) => delete(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDfareporting.AnonFields) => get(t0).runNow()))
    __obj.updateDynamic("insert")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDfareporting.AnonKey) => insert(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDfareporting.AnonAccountUserRoleOnly) => list(t0).runNow()))
    __obj.updateDynamic("patch")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDfareporting.AnonFields) => patch(t0).runNow()))
    __obj.updateDynamic("update")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDfareporting.AnonKey) => update(t0).runNow()))
    __obj.asInstanceOf[UserRolesResource]
  }
}

