package typingsJapgolly.gapiClientDfareporting.gapi.client.dfareporting

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientDfareporting.AnonFields
import typingsJapgolly.gapiClientDfareporting.AnonKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountPermissionsResource extends js.Object {
  /** Gets one account permission by ID. */
  def get(request: AnonFields): Request_[AccountPermission]
  /** Retrieves the list of account permissions. */
  def list(request: AnonKey): Request_[AccountPermissionsListResponse]
}

object AccountPermissionsResource {
  @scala.inline
  def apply(
    get: AnonFields => CallbackTo[Request_[AccountPermission]],
    list: AnonKey => CallbackTo[Request_[AccountPermissionsListResponse]]
  ): AccountPermissionsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDfareporting.AnonFields) => get(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDfareporting.AnonKey) => list(t0).runNow()))
    __obj.asInstanceOf[AccountPermissionsResource]
  }
}

