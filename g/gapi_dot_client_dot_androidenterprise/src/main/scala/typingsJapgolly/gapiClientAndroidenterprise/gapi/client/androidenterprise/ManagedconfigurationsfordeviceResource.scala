package typingsJapgolly.gapiClientAndroidenterprise.gapi.client.androidenterprise

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientAndroidenterprise.AnonAlt
import typingsJapgolly.gapiClientAndroidenterprise.AnonManagedConfigurationForDeviceId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ManagedconfigurationsfordeviceResource extends js.Object {
  /** Removes a per-device managed configuration for an app for the specified device. */
  def delete(request: AnonManagedConfigurationForDeviceId): Request_[Unit]
  /** Retrieves details of a per-device managed configuration. */
  def get(request: AnonManagedConfigurationForDeviceId): Request_[ManagedConfiguration]
  /** Lists all the per-device managed configurations for the specified device. Only the ID is set. */
  def list(request: AnonAlt): Request_[ManagedConfigurationsForDeviceListResponse]
  /** Adds or updates a per-device managed configuration for an app for the specified device. This method supports patch semantics. */
  def patch(request: AnonManagedConfigurationForDeviceId): Request_[ManagedConfiguration]
  /** Adds or updates a per-device managed configuration for an app for the specified device. */
  def update(request: AnonManagedConfigurationForDeviceId): Request_[ManagedConfiguration]
}

object ManagedconfigurationsfordeviceResource {
  @scala.inline
  def apply(
    delete: AnonManagedConfigurationForDeviceId => CallbackTo[Request_[Unit]],
    get: AnonManagedConfigurationForDeviceId => CallbackTo[Request_[ManagedConfiguration]],
    list: AnonAlt => CallbackTo[Request_[ManagedConfigurationsForDeviceListResponse]],
    patch: AnonManagedConfigurationForDeviceId => CallbackTo[Request_[ManagedConfiguration]],
    update: AnonManagedConfigurationForDeviceId => CallbackTo[Request_[ManagedConfiguration]]
  ): ManagedconfigurationsfordeviceResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAndroidenterprise.AnonManagedConfigurationForDeviceId) => delete(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAndroidenterprise.AnonManagedConfigurationForDeviceId) => get(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAndroidenterprise.AnonAlt) => list(t0).runNow()))
    __obj.updateDynamic("patch")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAndroidenterprise.AnonManagedConfigurationForDeviceId) => patch(t0).runNow()))
    __obj.updateDynamic("update")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAndroidenterprise.AnonManagedConfigurationForDeviceId) => update(t0).runNow()))
    __obj.asInstanceOf[ManagedconfigurationsfordeviceResource]
  }
}

