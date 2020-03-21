package typingsJapgolly.gapiClientDfareporting.gapi.client.dfareporting

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientDfareporting.AnonAltFields
import typingsJapgolly.gapiClientDfareporting.AnonFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserRolePermissionsResource extends js.Object {
  /** Gets one user role permission by ID. */
  def get(request: AnonFields): Request_[UserRolePermission]
  /** Gets a list of user role permissions, possibly filtered. */
  def list(request: AnonAltFields): Request_[UserRolePermissionsListResponse]
}

object UserRolePermissionsResource {
  @scala.inline
  def apply(
    get: AnonFields => CallbackTo[Request_[UserRolePermission]],
    list: AnonAltFields => CallbackTo[Request_[UserRolePermissionsListResponse]]
  ): UserRolePermissionsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDfareporting.AnonFields) => get(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDfareporting.AnonAltFields) => list(t0).runNow()))
    __obj.asInstanceOf[UserRolePermissionsResource]
  }
}

