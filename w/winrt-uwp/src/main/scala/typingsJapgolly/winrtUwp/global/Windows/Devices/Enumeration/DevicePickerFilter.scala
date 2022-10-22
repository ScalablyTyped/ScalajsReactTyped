package typingsJapgolly.winrtUwp.global.Windows.Devices.Enumeration

import typingsJapgolly.winrtUwp.Windows.Foundation.Collections.IVector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the filter used to determine which devices to show in the device picker. The filter parameters are OR-ed together to build the resulting filter. */
/* note: abstract class */ @JSGlobal("Windows.Devices.Enumeration.DevicePickerFilter")
@js.native
open class DevicePickerFilter ()
  extends StObject
     with typingsJapgolly.winrtUwp.Windows.Devices.Enumeration.DevicePickerFilter {
  
  /** Gets a list of supported device classes to show in the picker. This defaults to an empty list (no filter). You can add device classes to this vector and filter the devices list to those that are in one or more of the provided classes. */
  /* CompleteClass */
  var supportedDeviceClasses: IVector[typingsJapgolly.winrtUwp.Windows.Devices.Enumeration.DeviceClass] = js.native
  
  /** Gets a list of AQS filter strings. This defaults to empty list (no filter). You can add one or more AQS filter strings to this vector and filter the devices list to those that meet one or more of the provided filters. */
  /* CompleteClass */
  var supportedDeviceSelectors: IVector[String] = js.native
}
