package typingsJapgolly.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Device extends js.Object {
  /**
    * The ARN of a device.
    */
  var DeviceArn: js.UndefOr[Arn] = js.native
  /**
    * The name of a device.
    */
  var DeviceName: js.UndefOr[typingsJapgolly.awsSdk.alexaforbusinessMod.DeviceName] = js.native
  /**
    * The serial number of a device.
    */
  var DeviceSerialNumber: js.UndefOr[typingsJapgolly.awsSdk.alexaforbusinessMod.DeviceSerialNumber] = js.native
  /**
    * The status of a device. If the status is not READY, check the DeviceStatusInfo value for details.
    */
  var DeviceStatus: js.UndefOr[typingsJapgolly.awsSdk.alexaforbusinessMod.DeviceStatus] = js.native
  /**
    * Detailed information about a device's status.
    */
  var DeviceStatusInfo: js.UndefOr[typingsJapgolly.awsSdk.alexaforbusinessMod.DeviceStatusInfo] = js.native
  /**
    * The type of a device.
    */
  var DeviceType: js.UndefOr[typingsJapgolly.awsSdk.alexaforbusinessMod.DeviceType] = js.native
  /**
    * The MAC address of a device.
    */
  var MacAddress: js.UndefOr[typingsJapgolly.awsSdk.alexaforbusinessMod.MacAddress] = js.native
  /**
    * Detailed information about a device's network profile.
    */
  var NetworkProfileInfo: js.UndefOr[DeviceNetworkProfileInfo] = js.native
  /**
    * The room ARN of a device.
    */
  var RoomArn: js.UndefOr[Arn] = js.native
  /**
    * The software version of a device.
    */
  var SoftwareVersion: js.UndefOr[typingsJapgolly.awsSdk.alexaforbusinessMod.SoftwareVersion] = js.native
}

object Device {
  @scala.inline
  def apply(
    DeviceArn: Arn = null,
    DeviceName: DeviceName = null,
    DeviceSerialNumber: DeviceSerialNumber = null,
    DeviceStatus: DeviceStatus = null,
    DeviceStatusInfo: DeviceStatusInfo = null,
    DeviceType: DeviceType = null,
    MacAddress: MacAddress = null,
    NetworkProfileInfo: DeviceNetworkProfileInfo = null,
    RoomArn: Arn = null,
    SoftwareVersion: SoftwareVersion = null
  ): Device = {
    val __obj = js.Dynamic.literal()
    if (DeviceArn != null) __obj.updateDynamic("DeviceArn")(DeviceArn.asInstanceOf[js.Any])
    if (DeviceName != null) __obj.updateDynamic("DeviceName")(DeviceName.asInstanceOf[js.Any])
    if (DeviceSerialNumber != null) __obj.updateDynamic("DeviceSerialNumber")(DeviceSerialNumber.asInstanceOf[js.Any])
    if (DeviceStatus != null) __obj.updateDynamic("DeviceStatus")(DeviceStatus.asInstanceOf[js.Any])
    if (DeviceStatusInfo != null) __obj.updateDynamic("DeviceStatusInfo")(DeviceStatusInfo.asInstanceOf[js.Any])
    if (DeviceType != null) __obj.updateDynamic("DeviceType")(DeviceType.asInstanceOf[js.Any])
    if (MacAddress != null) __obj.updateDynamic("MacAddress")(MacAddress.asInstanceOf[js.Any])
    if (NetworkProfileInfo != null) __obj.updateDynamic("NetworkProfileInfo")(NetworkProfileInfo.asInstanceOf[js.Any])
    if (RoomArn != null) __obj.updateDynamic("RoomArn")(RoomArn.asInstanceOf[js.Any])
    if (SoftwareVersion != null) __obj.updateDynamic("SoftwareVersion")(SoftwareVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[Device]
  }
}

