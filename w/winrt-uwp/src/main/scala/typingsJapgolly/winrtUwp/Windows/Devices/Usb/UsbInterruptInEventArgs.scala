package typingsJapgolly.winrtUwp.Windows.Devices.Usb

import typingsJapgolly.winrtUwp.Windows.Storage.Streams.IBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the object that is passed as a parameter to the event handler for the DataReceived event. */
trait UsbInterruptInEventArgs extends StObject {
  
  /** Gets data from the interrupt IN endpoint. */
  var interruptData: IBuffer
}
object UsbInterruptInEventArgs {
  
  inline def apply(interruptData: IBuffer): UsbInterruptInEventArgs = {
    val __obj = js.Dynamic.literal(interruptData = interruptData.asInstanceOf[js.Any])
    __obj.asInstanceOf[UsbInterruptInEventArgs]
  }
  
  extension [Self <: UsbInterruptInEventArgs](x: Self) {
    
    inline def setInterruptData(value: IBuffer): Self = StObject.set(x, "interruptData", value.asInstanceOf[js.Any])
  }
}
