package typingsJapgolly.winrtUwp.global.Windows.Devices.Enumeration

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Indicates what you'd like the device picker to show about a given device. Used with the SetDisplayStatus method on the DevicePicker object. */
@JSGlobal("Windows.Devices.Enumeration.DevicePickerDisplayStatusOptions")
@js.native
object DevicePickerDisplayStatusOptions extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[
    typingsJapgolly.winrtUwp.Windows.Devices.Enumeration.DevicePickerDisplayStatusOptions & Double
  ] = js.native
  
  /* 0 */ val none: typingsJapgolly.winrtUwp.Windows.Devices.Enumeration.DevicePickerDisplayStatusOptions.none & Double = js.native
  
  /* 2 */ val showDisconnectButton: typingsJapgolly.winrtUwp.Windows.Devices.Enumeration.DevicePickerDisplayStatusOptions.showDisconnectButton & Double = js.native
  
  /* 1 */ val showProgress: typingsJapgolly.winrtUwp.Windows.Devices.Enumeration.DevicePickerDisplayStatusOptions.showProgress & Double = js.native
  
  /* 3 */ val showRetryButton: typingsJapgolly.winrtUwp.Windows.Devices.Enumeration.DevicePickerDisplayStatusOptions.showRetryButton & Double = js.native
}
