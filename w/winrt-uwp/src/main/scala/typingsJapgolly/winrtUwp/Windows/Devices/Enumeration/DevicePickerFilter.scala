package typingsJapgolly.winrtUwp.Windows.Devices.Enumeration

import typingsJapgolly.winrtUwp.Windows.Foundation.Collections.IVector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the filter used to determine which devices to show in the device picker. The filter parameters are OR-ed together to build the resulting filter. */
@JSGlobal("Windows.Devices.Enumeration.DevicePickerFilter")
@js.native
abstract class DevicePickerFilter () extends js.Object {
  /** Gets a list of supported device classes to show in the picker. This defaults to an empty list (no filter). You can add device classes to this vector and filter the devices list to those that are in one or more of the provided classes. */
  var supportedDeviceClasses: IVector[DeviceClass] = js.native
  /** Gets a list of AQS filter strings. This defaults to empty list (no filter). You can add one or more AQS filter strings to this vector and filter the devices list to those that meet one or more of the provided filters. */
  var supportedDeviceSelectors: IVector[String] = js.native
}

