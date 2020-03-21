package typingsJapgolly.gapiClientAndroidenterprise.gapi.client.androidenterprise

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientAndroidenterprise.AnonGroupLicenseId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GrouplicenseusersResource extends js.Object {
  /** Retrieves the IDs of the users who have been granted entitlements under the license. */
  def list(request: AnonGroupLicenseId): Request_[GroupLicenseUsersListResponse]
}

object GrouplicenseusersResource {
  @scala.inline
  def apply(list: AnonGroupLicenseId => CallbackTo[Request_[GroupLicenseUsersListResponse]]): GrouplicenseusersResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAndroidenterprise.AnonGroupLicenseId) => list(t0).runNow()))
    __obj.asInstanceOf[GrouplicenseusersResource]
  }
}

