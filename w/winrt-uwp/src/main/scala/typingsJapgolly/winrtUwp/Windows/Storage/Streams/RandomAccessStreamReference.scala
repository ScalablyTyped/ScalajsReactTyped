package typingsJapgolly.winrtUwp.Windows.Storage.Streams

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides random access of data in input and output streams for a file. */
trait RandomAccessStreamReference extends StObject {
  
  /**
    * Opens a stream for random access.
    * @return The asynchronous operation.
    */
  def openReadAsync(): IPromiseWithIAsyncOperation[IRandomAccessStreamWithContentType]
}
object RandomAccessStreamReference {
  
  inline def apply(openReadAsync: CallbackTo[IPromiseWithIAsyncOperation[IRandomAccessStreamWithContentType]]): RandomAccessStreamReference = {
    val __obj = js.Dynamic.literal(openReadAsync = openReadAsync.toJsFn)
    __obj.asInstanceOf[RandomAccessStreamReference]
  }
  
  extension [Self <: RandomAccessStreamReference](x: Self) {
    
    inline def setOpenReadAsync(value: CallbackTo[IPromiseWithIAsyncOperation[IRandomAccessStreamWithContentType]]): Self = StObject.set(x, "openReadAsync", value.toJsFn)
  }
}
