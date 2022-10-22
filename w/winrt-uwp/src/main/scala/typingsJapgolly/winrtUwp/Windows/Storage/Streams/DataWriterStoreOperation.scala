package typingsJapgolly.winrtUwp.Windows.Storage.Streams

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrtUwp.Windows.Foundation.AsyncOperationCompletedHandler
import typingsJapgolly.winrtUwp.Windows.Foundation.AsyncStatus
import typingsJapgolly.winrtUwp.Windows.Foundation.IAsyncOperation
import typingsJapgolly.winrtUwp.Windows.WinRTError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Commits data in a buffer to a backing store. */
trait DataWriterStoreOperation extends StObject {
  
  /** Requests the cancellation of the data store operation. */
  def cancel(): Unit
  
  /** Requests that work associated with the data store operation should stop. */
  def close(): Unit
  
  /** Gets or sets the handler to call when the data store operation is complete. */
  def completed(asyncInfo: IAsyncOperation[Double], asyncStatus: AsyncStatus): Unit
  /** Gets or sets the handler to call when the data store operation is complete. */
  @JSName("completed")
  var completed_Original: AsyncOperationCompletedHandler[Double]
  
  /** Gets the error code for the data store operation if it fails. */
  var errorCode: WinRTError
  
  /**
    * Returns the result of the data store operation.
    * @return The result of the operation.
    */
  def getResults(): Double
  
  /** Gets a unique identifier that represents the data store operation. */
  var id: Double
  
  /** Gets the current status of the data store operation. */
  var status: AsyncStatus
}
object DataWriterStoreOperation {
  
  inline def apply(
    cancel: Callback,
    close: Callback,
    completed: (/* asyncInfo */ IAsyncOperation[Double], /* asyncStatus */ AsyncStatus) => Callback,
    errorCode: WinRTError,
    getResults: CallbackTo[Double],
    id: Double,
    status: AsyncStatus
  ): DataWriterStoreOperation = {
    val __obj = js.Dynamic.literal(cancel = cancel.toJsFn, close = close.toJsFn, completed = js.Any.fromFunction2((t0: /* asyncInfo */ IAsyncOperation[Double], t1: /* asyncStatus */ AsyncStatus) => (completed(t0, t1)).runNow()), errorCode = errorCode.asInstanceOf[js.Any], getResults = getResults.toJsFn, id = id.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataWriterStoreOperation]
  }
  
  extension [Self <: DataWriterStoreOperation](x: Self) {
    
    inline def setCancel(value: Callback): Self = StObject.set(x, "cancel", value.toJsFn)
    
    inline def setClose(value: Callback): Self = StObject.set(x, "close", value.toJsFn)
    
    inline def setCompleted(value: (/* asyncInfo */ IAsyncOperation[Double], /* asyncStatus */ AsyncStatus) => Callback): Self = StObject.set(x, "completed", js.Any.fromFunction2((t0: /* asyncInfo */ IAsyncOperation[Double], t1: /* asyncStatus */ AsyncStatus) => (value(t0, t1)).runNow()))
    
    inline def setErrorCode(value: WinRTError): Self = StObject.set(x, "errorCode", value.asInstanceOf[js.Any])
    
    inline def setGetResults(value: CallbackTo[Double]): Self = StObject.set(x, "getResults", value.toJsFn)
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: AsyncStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
