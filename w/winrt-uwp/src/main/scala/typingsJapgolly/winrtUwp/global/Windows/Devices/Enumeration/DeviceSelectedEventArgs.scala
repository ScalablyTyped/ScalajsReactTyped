package typingsJapgolly.winrtUwp.global.Windows.Devices.Enumeration

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data for the DeviceSelected event on the DevicePicker object. */
/* note: abstract class */ @JSGlobal("Windows.Devices.Enumeration.DeviceSelectedEventArgs")
@js.native
open class DeviceSelectedEventArgs ()
  extends StObject
     with typingsJapgolly.winrtUwp.Windows.Devices.Enumeration.DeviceSelectedEventArgs {
  
  /** The device selected by the user in the picker. */
  /* CompleteClass */
  var selectedDevice: typingsJapgolly.winrtUwp.Windows.Devices.Enumeration.DeviceInformation = js.native
}
