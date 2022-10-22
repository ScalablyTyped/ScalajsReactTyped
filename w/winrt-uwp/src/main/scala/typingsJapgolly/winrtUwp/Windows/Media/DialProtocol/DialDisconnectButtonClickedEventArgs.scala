package typingsJapgolly.winrtUwp.Windows.Media.DialProtocol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the event arguments for the DisconnectButtonClicked event on the DialDevicePicker object. */
trait DialDisconnectButtonClickedEventArgs extends StObject {
  
  /** Gets the DialDevice object that represents the remote device that the user wants to disconnect. */
  var device: DialDevice
}
object DialDisconnectButtonClickedEventArgs {
  
  inline def apply(device: DialDevice): DialDisconnectButtonClickedEventArgs = {
    val __obj = js.Dynamic.literal(device = device.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialDisconnectButtonClickedEventArgs]
  }
  
  extension [Self <: DialDisconnectButtonClickedEventArgs](x: Self) {
    
    inline def setDevice(value: DialDevice): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
  }
}
