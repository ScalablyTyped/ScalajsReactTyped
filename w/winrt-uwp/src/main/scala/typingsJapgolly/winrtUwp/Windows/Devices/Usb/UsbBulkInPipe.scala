package typingsJapgolly.winrtUwp.Windows.Devices.Usb

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrtUwp.Windows.Foundation.IPromiseWithIAsyncAction
import typingsJapgolly.winrtUwp.Windows.Storage.Streams.IInputStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the pipe that the underlying USB driver opens to communicate with a USB bulk IN endpoint of the device. The app can get an input stream from the pipe and access data is being read from the endpoint. */
trait UsbBulkInPipe extends StObject {
  
  /**
    * Starts an asynchronous operation to clear a stall condition (endpoint halt) on the USB bulk IN endpoint that is associated with the pipe.
    * @return An IAsyncAction object that is used to control the asynchronous operation.
    */
  def clearStallAsync(): IPromiseWithIAsyncAction
  
  /** Gets the object that represents endpoint descriptor associated with the USB bulk IN endpoint. */
  var endpointDescriptor: UsbBulkInEndpointDescriptor
  
  /** Discards any data that is cached in the bulk IN pipe. */
  def flushBuffer(): Unit
  
  /** Input stream that stores the data that the bulk IN pipe received from the endpoint. */
  var inputStream: IInputStream
  
  /** Gets the maximum number of bytes that can be read from the bulk IN pipe in a single transfer. */
  var maxTransferSizeBytes: Double
  
  /** Gets or sets configuration flags that controls the behavior of the pipe that reads data from a USB bulk IN endpoint. */
  var readOptions: UsbReadOptions
}
object UsbBulkInPipe {
  
  inline def apply(
    clearStallAsync: CallbackTo[IPromiseWithIAsyncAction],
    endpointDescriptor: UsbBulkInEndpointDescriptor,
    flushBuffer: Callback,
    inputStream: IInputStream,
    maxTransferSizeBytes: Double,
    readOptions: UsbReadOptions
  ): UsbBulkInPipe = {
    val __obj = js.Dynamic.literal(clearStallAsync = clearStallAsync.toJsFn, endpointDescriptor = endpointDescriptor.asInstanceOf[js.Any], flushBuffer = flushBuffer.toJsFn, inputStream = inputStream.asInstanceOf[js.Any], maxTransferSizeBytes = maxTransferSizeBytes.asInstanceOf[js.Any], readOptions = readOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[UsbBulkInPipe]
  }
  
  extension [Self <: UsbBulkInPipe](x: Self) {
    
    inline def setClearStallAsync(value: CallbackTo[IPromiseWithIAsyncAction]): Self = StObject.set(x, "clearStallAsync", value.toJsFn)
    
    inline def setEndpointDescriptor(value: UsbBulkInEndpointDescriptor): Self = StObject.set(x, "endpointDescriptor", value.asInstanceOf[js.Any])
    
    inline def setFlushBuffer(value: Callback): Self = StObject.set(x, "flushBuffer", value.toJsFn)
    
    inline def setInputStream(value: IInputStream): Self = StObject.set(x, "inputStream", value.asInstanceOf[js.Any])
    
    inline def setMaxTransferSizeBytes(value: Double): Self = StObject.set(x, "maxTransferSizeBytes", value.asInstanceOf[js.Any])
    
    inline def setReadOptions(value: UsbReadOptions): Self = StObject.set(x, "readOptions", value.asInstanceOf[js.Any])
  }
}
