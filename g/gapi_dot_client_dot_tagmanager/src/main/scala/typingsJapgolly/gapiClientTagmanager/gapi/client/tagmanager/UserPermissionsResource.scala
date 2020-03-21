package typingsJapgolly.gapiClientTagmanager.gapi.client.tagmanager

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientTagmanager.AnonAlt
import typingsJapgolly.gapiClientTagmanager.AnonFields
import typingsJapgolly.gapiClientTagmanager.AnonKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserPermissionsResource extends js.Object {
  /** Creates a user's Account & Container access. */
  def create(request: AnonAlt): Request_[UserPermission]
  /** Removes a user from the account, revoking access to it and all of its containers. */
  def delete(request: AnonFields): Request_[Unit]
  /** Gets a user's Account & Container access. */
  def get(request: AnonFields): Request_[UserPermission]
  /** List all users that have access to the account along with Account and Container user access granted to each of them. */
  def list(request: AnonKey): Request_[ListUserPermissionsResponse]
  /** Updates a user's Account & Container access. */
  def update(request: AnonFields): Request_[UserPermission]
}

object UserPermissionsResource {
  @scala.inline
  def apply(
    create: AnonAlt => CallbackTo[Request_[UserPermission]],
    delete: AnonFields => CallbackTo[Request_[Unit]],
    get: AnonFields => CallbackTo[Request_[UserPermission]],
    list: AnonKey => CallbackTo[Request_[ListUserPermissionsResponse]],
    update: AnonFields => CallbackTo[Request_[UserPermission]]
  ): UserPermissionsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("create")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientTagmanager.AnonAlt) => create(t0).runNow()))
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientTagmanager.AnonFields) => delete(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientTagmanager.AnonFields) => get(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientTagmanager.AnonKey) => list(t0).runNow()))
    __obj.updateDynamic("update")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientTagmanager.AnonFields) => update(t0).runNow()))
    __obj.asInstanceOf[UserPermissionsResource]
  }
}

