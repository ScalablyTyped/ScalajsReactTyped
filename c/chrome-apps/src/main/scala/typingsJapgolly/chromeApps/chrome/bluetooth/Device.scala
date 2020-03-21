package typingsJapgolly.chromeApps.chrome.bluetooth

import typingsJapgolly.chromeApps.chrome.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Device extends js.Object {
  /** The address of the device, in the format 'XX:XX:XX:XX:XX:XX'. */
  var address: String
  /**
    * Indicates whether the device is connectable.
    * @since Chrome 48
    */
  var connectable: js.UndefOr[Boolean] = js.undefined
  /** Indicates whether the device is currently connected to the system. */
  var connected: js.UndefOr[Boolean] = js.undefined
  /**
    * Indicates whether the device is currently connecting to the system.
    * @since Chrome 48
    */
  var connecting: js.UndefOr[Boolean] = js.undefined
  /** The class of the device, a bit-field defined by http://www.bluetooth.org/en-us/specification/assigned-numbers/baseband. */
  var deviceClass: js.UndefOr[integer] = js.undefined
  var deviceId: js.UndefOr[integer] = js.undefined
  /**
    * The received signal strength, in dBm. This field is avaliable and valid only during discovery. Outside of discovery it's value is not specified.
    * @since Chrome 44
    */
  var inquiryRssi: integer
  /**
    * The transmitted power level. This field is avaliable only for LE devices that include this field in AD. It is avaliable and valid only during discovery.
    * @since Chrome 44
    */
  var inquiryTxPower: integer
  /** The human-readable name of the device. */
  var name: js.UndefOr[String] = js.undefined
  /** Indicates whether or not the device is paired with the system. */
  var paired: js.UndefOr[Boolean] = js.undefined
  var productId: js.UndefOr[integer] = js.undefined
  /**
    * The type of the device, if recognized by Chrome.
    * This is obtained from the |deviceClass| field and only represents a small fraction of the possible device types.
    * When in doubt you should use the |deviceClass| field directly.
    */
  var `type`: js.UndefOr[DeviceType] = js.undefined
  /**
    * UUIDs of protocols, profiles and services advertised by the device.
    * For classic Bluetooth devices, this list is obtained from EIR data and SDP tables.
    * For Low Energy devices, this list is obtained from AD and GATT primary services.
    * For dual mode devices this may be obtained from both.
    */
  var uuids: js.UndefOr[js.Array[String]] = js.undefined
  var vendorId: js.UndefOr[integer] = js.undefined
  /** The Device ID record of the device, where available. */
  var vendorIdSource: js.UndefOr[DeviceVendorIdSource] = js.undefined
}

object Device {
  @scala.inline
  def apply(
    address: String,
    inquiryRssi: integer,
    inquiryTxPower: integer,
    connectable: js.UndefOr[Boolean] = js.undefined,
    connected: js.UndefOr[Boolean] = js.undefined,
    connecting: js.UndefOr[Boolean] = js.undefined,
    deviceClass: Int | Double = null,
    deviceId: Int | Double = null,
    name: String = null,
    paired: js.UndefOr[Boolean] = js.undefined,
    productId: Int | Double = null,
    `type`: DeviceType = null,
    uuids: js.Array[String] = null,
    vendorId: Int | Double = null,
    vendorIdSource: DeviceVendorIdSource = null
  ): Device = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], inquiryRssi = inquiryRssi.asInstanceOf[js.Any], inquiryTxPower = inquiryTxPower.asInstanceOf[js.Any])
    if (!js.isUndefined(connectable)) __obj.updateDynamic("connectable")(connectable.asInstanceOf[js.Any])
    if (!js.isUndefined(connected)) __obj.updateDynamic("connected")(connected.asInstanceOf[js.Any])
    if (!js.isUndefined(connecting)) __obj.updateDynamic("connecting")(connecting.asInstanceOf[js.Any])
    if (deviceClass != null) __obj.updateDynamic("deviceClass")(deviceClass.asInstanceOf[js.Any])
    if (deviceId != null) __obj.updateDynamic("deviceId")(deviceId.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(paired)) __obj.updateDynamic("paired")(paired.asInstanceOf[js.Any])
    if (productId != null) __obj.updateDynamic("productId")(productId.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (uuids != null) __obj.updateDynamic("uuids")(uuids.asInstanceOf[js.Any])
    if (vendorId != null) __obj.updateDynamic("vendorId")(vendorId.asInstanceOf[js.Any])
    if (vendorIdSource != null) __obj.updateDynamic("vendorIdSource")(vendorIdSource.asInstanceOf[js.Any])
    __obj.asInstanceOf[Device]
  }
}

