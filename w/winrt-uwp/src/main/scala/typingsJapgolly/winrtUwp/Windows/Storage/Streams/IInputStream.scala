package typingsJapgolly.winrtUwp.Windows.Storage.Streams

import japgolly.scalajs.react.Callback
import typingsJapgolly.winrtUwp.Windows.Foundation.IClosable
import typingsJapgolly.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperationWithProgress
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a sequential stream of bytes to be read. */
trait IInputStream
  extends StObject
     with IClosable {
  
  /**
    * Reads data from the stream asynchronously.
    * @param buffer A buffer that may be used to return the bytes that are read. The return value contains the buffer that holds the results.
    * @param count The number of bytes to read that is less than or equal to the Capacity value.
    * @param options Specifies the type of the asynchronous read operation.
    * @return The asynchronous operation.
    */
  def readAsync(buffer: IBuffer, count: Double, options: InputStreamOptions): IPromiseWithIAsyncOperationWithProgress[IBuffer, Double]
}
object IInputStream {
  
  inline def apply(
    close: Callback,
    readAsync: (IBuffer, Double, InputStreamOptions) => IPromiseWithIAsyncOperationWithProgress[IBuffer, Double]
  ): IInputStream = {
    val __obj = js.Dynamic.literal(close = close.toJsFn, readAsync = js.Any.fromFunction3(readAsync))
    __obj.asInstanceOf[IInputStream]
  }
  
  extension [Self <: IInputStream](x: Self) {
    
    inline def setReadAsync(
      value: (IBuffer, Double, InputStreamOptions) => IPromiseWithIAsyncOperationWithProgress[IBuffer, Double]
    ): Self = StObject.set(x, "readAsync", js.Any.fromFunction3(value))
  }
}
