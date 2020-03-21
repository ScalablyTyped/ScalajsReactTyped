package typingsJapgolly.gapiClientAndroidenterprise.gapi.client.androidenterprise

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientAndroidenterprise.AnonEnterpriseId
import typingsJapgolly.gapiClientAndroidenterprise.AnonManagedConfigurationForUserId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ManagedconfigurationsforuserResource extends js.Object {
  /** Removes a per-user managed configuration for an app for the specified user. */
  def delete(request: AnonManagedConfigurationForUserId): Request_[Unit]
  /** Retrieves details of a per-user managed configuration for an app for the specified user. */
  def get(request: AnonManagedConfigurationForUserId): Request_[ManagedConfiguration]
  /** Lists all the per-user managed configurations for the specified user. Only the ID is set. */
  def list(request: AnonEnterpriseId): Request_[ManagedConfigurationsForUserListResponse]
  /** Adds or updates a per-user managed configuration for an app for the specified user. This method supports patch semantics. */
  def patch(request: AnonManagedConfigurationForUserId): Request_[ManagedConfiguration]
  /** Adds or updates a per-user managed configuration for an app for the specified user. */
  def update(request: AnonManagedConfigurationForUserId): Request_[ManagedConfiguration]
}

object ManagedconfigurationsforuserResource {
  @scala.inline
  def apply(
    delete: AnonManagedConfigurationForUserId => CallbackTo[Request_[Unit]],
    get: AnonManagedConfigurationForUserId => CallbackTo[Request_[ManagedConfiguration]],
    list: AnonEnterpriseId => CallbackTo[Request_[ManagedConfigurationsForUserListResponse]],
    patch: AnonManagedConfigurationForUserId => CallbackTo[Request_[ManagedConfiguration]],
    update: AnonManagedConfigurationForUserId => CallbackTo[Request_[ManagedConfiguration]]
  ): ManagedconfigurationsforuserResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAndroidenterprise.AnonManagedConfigurationForUserId) => delete(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAndroidenterprise.AnonManagedConfigurationForUserId) => get(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAndroidenterprise.AnonEnterpriseId) => list(t0).runNow()))
    __obj.updateDynamic("patch")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAndroidenterprise.AnonManagedConfigurationForUserId) => patch(t0).runNow()))
    __obj.updateDynamic("update")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAndroidenterprise.AnonManagedConfigurationForUserId) => update(t0).runNow()))
    __obj.asInstanceOf[ManagedconfigurationsforuserResource]
  }
}

