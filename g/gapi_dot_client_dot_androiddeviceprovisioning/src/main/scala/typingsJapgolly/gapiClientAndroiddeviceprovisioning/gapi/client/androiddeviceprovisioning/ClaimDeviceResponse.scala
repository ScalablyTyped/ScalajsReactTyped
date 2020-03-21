package typingsJapgolly.gapiClientAndroiddeviceprovisioning.gapi.client.androiddeviceprovisioning

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClaimDeviceResponse extends js.Object {
  /** The device ID of the claimed device. */
  var deviceId: js.UndefOr[String] = js.undefined
  /**
    * The resource name of the device in the format
    * `partners/[PARTNER_ID]/devices/[DEVICE_ID]`.
    */
  var deviceName: js.UndefOr[String] = js.undefined
}

object ClaimDeviceResponse {
  @scala.inline
  def apply(deviceId: String = null, deviceName: String = null): ClaimDeviceResponse = {
    val __obj = js.Dynamic.literal()
    if (deviceId != null) __obj.updateDynamic("deviceId")(deviceId.asInstanceOf[js.Any])
    if (deviceName != null) __obj.updateDynamic("deviceName")(deviceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClaimDeviceResponse]
  }
}

