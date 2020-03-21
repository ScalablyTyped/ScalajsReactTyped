package typingsJapgolly.gapiClientAndroiddeviceprovisioning.gapi.client.androiddeviceprovisioning

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientAndroiddeviceprovisioning.AnonAccesstoken
import typingsJapgolly.gapiClientAndroiddeviceprovisioning.AnonBearertoken
import typingsJapgolly.gapiClientAndroiddeviceprovisioning.AnonCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DevicesResource extends js.Object {
  /** Claim the device identified by device identifier. */
  def claim(request: AnonBearertoken): Request_[ClaimDeviceResponse]
  /** Claim devices asynchronously. */
  def claimAsync(request: AnonBearertoken): Request_[Operation]
  /** Find devices by device identifier. */
  def findByIdentifier(request: AnonBearertoken): Request_[FindDevicesByDeviceIdentifierResponse]
  /** Find devices by ownership. */
  def findByOwner(request: AnonBearertoken): Request_[FindDevicesByOwnerResponse]
  /** Get a device. */
  def get(request: AnonAccesstoken): Request_[Device]
  /** Update the metadata. */
  def metadata(request: AnonCallback): Request_[DeviceMetadata]
  /** Unclaim the device identified by the `device_id` or the `deviceIdentifier`. */
  def unclaim(request: AnonBearertoken): Request_[js.Object]
  /** Unclaim devices asynchronously. */
  def unclaimAsync(request: AnonBearertoken): Request_[Operation]
  /** Set metadata in batch asynchronously. */
  def updateMetadataAsync(request: AnonBearertoken): Request_[Operation]
}

object DevicesResource {
  @scala.inline
  def apply(
    claim: AnonBearertoken => CallbackTo[Request_[ClaimDeviceResponse]],
    claimAsync: AnonBearertoken => CallbackTo[Request_[Operation]],
    findByIdentifier: AnonBearertoken => CallbackTo[Request_[FindDevicesByDeviceIdentifierResponse]],
    findByOwner: AnonBearertoken => CallbackTo[Request_[FindDevicesByOwnerResponse]],
    get: AnonAccesstoken => CallbackTo[Request_[Device]],
    metadata: AnonCallback => CallbackTo[Request_[DeviceMetadata]],
    unclaim: AnonBearertoken => CallbackTo[Request_[js.Object]],
    unclaimAsync: AnonBearertoken => CallbackTo[Request_[Operation]],
    updateMetadataAsync: AnonBearertoken => CallbackTo[Request_[Operation]]
  ): DevicesResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("claim")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAndroiddeviceprovisioning.AnonBearertoken) => claim(t0).runNow()))
    __obj.updateDynamic("claimAsync")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAndroiddeviceprovisioning.AnonBearertoken) => claimAsync(t0).runNow()))
    __obj.updateDynamic("findByIdentifier")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAndroiddeviceprovisioning.AnonBearertoken) => findByIdentifier(t0).runNow()))
    __obj.updateDynamic("findByOwner")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAndroiddeviceprovisioning.AnonBearertoken) => findByOwner(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAndroiddeviceprovisioning.AnonAccesstoken) => get(t0).runNow()))
    __obj.updateDynamic("metadata")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAndroiddeviceprovisioning.AnonCallback) => metadata(t0).runNow()))
    __obj.updateDynamic("unclaim")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAndroiddeviceprovisioning.AnonBearertoken) => unclaim(t0).runNow()))
    __obj.updateDynamic("unclaimAsync")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAndroiddeviceprovisioning.AnonBearertoken) => unclaimAsync(t0).runNow()))
    __obj.updateDynamic("updateMetadataAsync")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAndroiddeviceprovisioning.AnonBearertoken) => updateMetadataAsync(t0).runNow()))
    __obj.asInstanceOf[DevicesResource]
  }
}

