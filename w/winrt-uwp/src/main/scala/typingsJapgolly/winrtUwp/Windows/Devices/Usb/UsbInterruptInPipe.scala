package typingsJapgolly.winrtUwp.Windows.Devices.Usb

import typingsJapgolly.winrtUwp.Windows.Foundation.EventHandler
import typingsJapgolly.winrtUwp.Windows.Foundation.IPromiseWithIAsyncAction
import typingsJapgolly.winrtUwp.Windows.Foundation.TypedEventHandler
import typingsJapgolly.winrtUwp.Windows.WinRTEvent
import typingsJapgolly.winrtUwp.winrtUwpStrings.datareceived
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the pipe that the underlying USB driver opens to communicate with a USB interrupt IN endpoint of the device. The object also enables the app to specify an event handler. That handler that gets invoked when data is read from the endpoint. */
@js.native
trait UsbInterruptInPipe extends StObject {
  
  def addEventListener(`type`: String, listener: EventHandler[Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_datareceived(`type`: datareceived, listener: TypedEventHandler[UsbInterruptInPipe, UsbInterruptInEventArgs]): Unit = js.native
  
  /**
    * Starts an asynchronous operation to clear a stall condition (endpoint halt) on the USB interrupt IN endpoint that is associated with the pipe.
    * @return An IAsyncAction object that is used to control the asynchronous operation.
    */
  def clearStallAsync(): IPromiseWithIAsyncAction = js.native
  
  /** Gets the object that represents the endpoint descriptor associated with the USB interrupt IN endpoint. */
  var endpointDescriptor: UsbInterruptInEndpointDescriptor = js.native
  
  /** Raised when the interrupt pipe receives data from the interrupt IN endpoint. */
  def ondatareceived(ev: UsbInterruptInEventArgs & WinRTEvent[UsbInterruptInPipe]): Unit = js.native
  /** Raised when the interrupt pipe receives data from the interrupt IN endpoint. */
  @JSName("ondatareceived")
  var ondatareceived_Original: TypedEventHandler[UsbInterruptInPipe, UsbInterruptInEventArgs] = js.native
  
  def removeEventListener(`type`: String, listener: EventHandler[Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_datareceived(`type`: datareceived, listener: TypedEventHandler[UsbInterruptInPipe, UsbInterruptInEventArgs]): Unit = js.native
}
