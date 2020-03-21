package typingsJapgolly.gapiClientCloudiot.gapi.client.cloudiot

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientCloudiot.AnonBearertoken
import typingsJapgolly.gapiClientCloudiot.AnonCallback
import typingsJapgolly.gapiClientCloudiot.AnonDeviceIds
import typingsJapgolly.gapiClientCloudiot.AnonFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DevicesResource extends js.Object {
  var configVersions: ConfigVersionsResource
  var states: StatesResource
  /** Creates a device in a device registry. */
  def create(request: AnonBearertoken): Request_[Device]
  /** Deletes a device. */
  def delete(request: AnonCallback): Request_[js.Object]
  /** Gets details about a device. */
  def get(request: AnonCallback): Request_[Device]
  /** List devices in a device registry. */
  def list(request: AnonDeviceIds): Request_[ListDevicesResponse]
  /**
    * Modifies the configuration for the device, which is eventually sent from
    * the Cloud IoT Core servers. Returns the modified configuration version and
    * its metadata.
    */
  def modifyCloudToDeviceConfig(request: AnonCallback): Request_[DeviceConfig]
  /** Updates a device. */
  def patch(request: AnonFields): Request_[Device]
}

object DevicesResource {
  @scala.inline
  def apply(
    configVersions: ConfigVersionsResource,
    create: AnonBearertoken => CallbackTo[Request_[Device]],
    delete: AnonCallback => CallbackTo[Request_[js.Object]],
    get: AnonCallback => CallbackTo[Request_[Device]],
    list: AnonDeviceIds => CallbackTo[Request_[ListDevicesResponse]],
    modifyCloudToDeviceConfig: AnonCallback => CallbackTo[Request_[DeviceConfig]],
    patch: AnonFields => CallbackTo[Request_[Device]],
    states: StatesResource
  ): DevicesResource = {
    val __obj = js.Dynamic.literal(configVersions = configVersions.asInstanceOf[js.Any], states = states.asInstanceOf[js.Any])
    __obj.updateDynamic("create")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCloudiot.AnonBearertoken) => create(t0).runNow()))
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCloudiot.AnonCallback) => delete(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCloudiot.AnonCallback) => get(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCloudiot.AnonDeviceIds) => list(t0).runNow()))
    __obj.updateDynamic("modifyCloudToDeviceConfig")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCloudiot.AnonCallback) => modifyCloudToDeviceConfig(t0).runNow()))
    __obj.updateDynamic("patch")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCloudiot.AnonFields) => patch(t0).runNow()))
    __obj.asInstanceOf[DevicesResource]
  }
}

