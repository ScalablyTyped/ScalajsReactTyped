package typingsJapgolly.winrtUwp.Windows.Storage

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrtUwp.Windows.Foundation.IPromiseWithIAsyncAction
import typingsJapgolly.winrtUwp.Windows.Storage.Streams.IRandomAccessStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a write transaction for a random-access stream. */
trait StorageStreamTransaction extends StObject {
  
  /** Releases system resources that are exposed by the stream, indicating that the data request is complete. */
  def close(): Unit
  
  /**
    * Save the stream to the underlying file.
    * @return No object or value is returned by this method.
    */
  def commitAsync(): IPromiseWithIAsyncAction
  
  /** Gets the random-access stream used in the transaction. */
  var stream: IRandomAccessStream
}
object StorageStreamTransaction {
  
  inline def apply(close: Callback, commitAsync: CallbackTo[IPromiseWithIAsyncAction], stream: IRandomAccessStream): StorageStreamTransaction = {
    val __obj = js.Dynamic.literal(close = close.toJsFn, commitAsync = commitAsync.toJsFn, stream = stream.asInstanceOf[js.Any])
    __obj.asInstanceOf[StorageStreamTransaction]
  }
  
  extension [Self <: StorageStreamTransaction](x: Self) {
    
    inline def setClose(value: Callback): Self = StObject.set(x, "close", value.toJsFn)
    
    inline def setCommitAsync(value: CallbackTo[IPromiseWithIAsyncAction]): Self = StObject.set(x, "commitAsync", value.toJsFn)
    
    inline def setStream(value: IRandomAccessStream): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
  }
}
