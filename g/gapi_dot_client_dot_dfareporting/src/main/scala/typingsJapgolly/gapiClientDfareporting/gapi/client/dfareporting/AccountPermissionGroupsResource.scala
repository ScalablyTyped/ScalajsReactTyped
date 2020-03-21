package typingsJapgolly.gapiClientDfareporting.gapi.client.dfareporting

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientDfareporting.AnonFields
import typingsJapgolly.gapiClientDfareporting.AnonKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountPermissionGroupsResource extends js.Object {
  /** Gets one account permission group by ID. */
  def get(request: AnonFields): Request_[AccountPermissionGroup]
  /** Retrieves the list of account permission groups. */
  def list(request: AnonKey): Request_[AccountPermissionGroupsListResponse]
}

object AccountPermissionGroupsResource {
  @scala.inline
  def apply(
    get: AnonFields => CallbackTo[Request_[AccountPermissionGroup]],
    list: AnonKey => CallbackTo[Request_[AccountPermissionGroupsListResponse]]
  ): AccountPermissionGroupsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDfareporting.AnonFields) => get(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDfareporting.AnonKey) => list(t0).runNow()))
    __obj.asInstanceOf[AccountPermissionGroupsResource]
  }
}

