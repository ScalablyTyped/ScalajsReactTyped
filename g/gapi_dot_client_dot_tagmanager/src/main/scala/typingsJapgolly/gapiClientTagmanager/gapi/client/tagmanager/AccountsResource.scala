package typingsJapgolly.gapiClientTagmanager.gapi.client.tagmanager

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientTagmanager.AnonFields
import typingsJapgolly.gapiClientTagmanager.AnonFingerprint
import typingsJapgolly.gapiClientTagmanager.AnonQuotaUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountsResource extends js.Object {
  var containers: ContainersResource
  var user_permissions: UserPermissionsResource
  /** Gets a GTM Account. */
  def get(request: AnonFields): Request_[Account]
  /** Lists all GTM Accounts that a user has access to. */
  def list(request: AnonQuotaUser): Request_[ListAccountsResponse]
  /** Updates a GTM Account. */
  def update(request: AnonFingerprint): Request_[Account]
}

object AccountsResource {
  @scala.inline
  def apply(
    containers: ContainersResource,
    get: AnonFields => CallbackTo[Request_[Account]],
    list: AnonQuotaUser => CallbackTo[Request_[ListAccountsResponse]],
    update: AnonFingerprint => CallbackTo[Request_[Account]],
    user_permissions: UserPermissionsResource
  ): AccountsResource = {
    val __obj = js.Dynamic.literal(containers = containers.asInstanceOf[js.Any], user_permissions = user_permissions.asInstanceOf[js.Any])
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientTagmanager.AnonFields) => get(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientTagmanager.AnonQuotaUser) => list(t0).runNow()))
    __obj.updateDynamic("update")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientTagmanager.AnonFingerprint) => update(t0).runNow()))
    __obj.asInstanceOf[AccountsResource]
  }
}

