package typingsJapgolly.winrtUwp.Windows.Devices.Usb

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrtUwp.Windows.Foundation.IPromiseWithIAsyncAction
import typingsJapgolly.winrtUwp.Windows.Storage.Streams.IOutputStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the pipe that the underlying USB driver opens to communicate with a USB interrupt OUT endpoint of the device. The object provides access to an output stream to which the app can write data to send to the endpoint. */
trait UsbInterruptOutPipe extends StObject {
  
  /**
    * Starts an asynchronous operation to clear a stall condition (endpoint halt) on the USB interrupt OUT endpoint that is associated with the pipe.
    * @return An IAsyncAction object that is used to control the asynchronous operation.
    */
  def clearStallAsync(): IPromiseWithIAsyncAction
  
  /** Gets the object that represents the endpoint descriptor associated with the USB interrupt OUT endpoint. */
  var endpointDescriptor: UsbInterruptOutEndpointDescriptor
  
  /** Gets an output stream to which the app can write data to send to the endpoint. */
  var outputStream: IOutputStream
  
  /** Gets or sets configuration flags that controls the behavior of the pipe that writes data to a USB interrupt OUT endpoint. */
  var writeOptions: UsbWriteOptions
}
object UsbInterruptOutPipe {
  
  inline def apply(
    clearStallAsync: CallbackTo[IPromiseWithIAsyncAction],
    endpointDescriptor: UsbInterruptOutEndpointDescriptor,
    outputStream: IOutputStream,
    writeOptions: UsbWriteOptions
  ): UsbInterruptOutPipe = {
    val __obj = js.Dynamic.literal(clearStallAsync = clearStallAsync.toJsFn, endpointDescriptor = endpointDescriptor.asInstanceOf[js.Any], outputStream = outputStream.asInstanceOf[js.Any], writeOptions = writeOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[UsbInterruptOutPipe]
  }
  
  extension [Self <: UsbInterruptOutPipe](x: Self) {
    
    inline def setClearStallAsync(value: CallbackTo[IPromiseWithIAsyncAction]): Self = StObject.set(x, "clearStallAsync", value.toJsFn)
    
    inline def setEndpointDescriptor(value: UsbInterruptOutEndpointDescriptor): Self = StObject.set(x, "endpointDescriptor", value.asInstanceOf[js.Any])
    
    inline def setOutputStream(value: IOutputStream): Self = StObject.set(x, "outputStream", value.asInstanceOf[js.Any])
    
    inline def setWriteOptions(value: UsbWriteOptions): Self = StObject.set(x, "writeOptions", value.asInstanceOf[js.Any])
  }
}
