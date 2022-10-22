package typingsJapgolly.winrtUwp.Windows.Devices.Sms

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrtUwp.Windows.Foundation.AsyncOperationProgressHandler
import typingsJapgolly.winrtUwp.Windows.Foundation.AsyncOperationWithProgressCompletedHandler
import typingsJapgolly.winrtUwp.Windows.Foundation.AsyncStatus
import typingsJapgolly.winrtUwp.Windows.Foundation.Collections.IVectorView
import typingsJapgolly.winrtUwp.Windows.Foundation.IAsyncOperationWithProgress
import typingsJapgolly.winrtUwp.Windows.WinRTError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Supports the retrieval of messages. */
trait GetSmsMessagesOperation extends StObject {
  
  /** Cancels the asynchronous operations. */
  def cancel(): Unit
  
  /** Closes the asynchronous operations. */
  def close(): Unit
  
  /** Specifies whether the asynchronous message retrieval operation has completed or not. */
  def completed(asyncInfo: IAsyncOperationWithProgress[IVectorView[Any], Double], asyncStatus: AsyncStatus): Unit
  /** Specifies whether the asynchronous message retrieval operation has completed or not. */
  @JSName("completed")
  var completed_Original: AsyncOperationWithProgressCompletedHandler[IVectorView[Any], Double]
  
  /** Specifies the error code for the asynchronous message operation. */
  var errorCode: WinRTError
  
  /**
    * Retrieves the result of the asynchronous message retrieval operation.
    * @return A reference to the SMS messages retrieved.
    */
  def getResults(): IVectorView[ISmsMessage]
  
  /** Indicates the ID of the asynchronous message operation. */
  var id: Double
  
  /** Specifies the progress status of the asynchronous message operation. */
  def progress(asyncInfo: IAsyncOperationWithProgress[IVectorView[Any], Double], progressInfo: Double): Unit
  /** Specifies the progress status of the asynchronous message operation. */
  @JSName("progress")
  var progress_Original: AsyncOperationProgressHandler[IVectorView[Any], Double]
  
  /** Specifies the status of the asynchronous message operations. */
  var status: AsyncStatus
}
object GetSmsMessagesOperation {
  
  inline def apply(
    cancel: Callback,
    close: Callback,
    completed: (/* asyncInfo */ IAsyncOperationWithProgress[IVectorView[Any], Double], /* asyncStatus */ AsyncStatus) => Callback,
    errorCode: WinRTError,
    getResults: CallbackTo[IVectorView[ISmsMessage]],
    id: Double,
    progress: (/* asyncInfo */ IAsyncOperationWithProgress[IVectorView[Any], Double], Double) => Callback,
    status: AsyncStatus
  ): GetSmsMessagesOperation = {
    val __obj = js.Dynamic.literal(cancel = cancel.toJsFn, close = close.toJsFn, completed = js.Any.fromFunction2((t0: /* asyncInfo */ IAsyncOperationWithProgress[IVectorView[Any], Double], t1: /* asyncStatus */ AsyncStatus) => (completed(t0, t1)).runNow()), errorCode = errorCode.asInstanceOf[js.Any], getResults = getResults.toJsFn, id = id.asInstanceOf[js.Any], progress = js.Any.fromFunction2((t0: /* asyncInfo */ IAsyncOperationWithProgress[IVectorView[Any], Double], t1: Double) => (progress(t0, t1)).runNow()), status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSmsMessagesOperation]
  }
  
  extension [Self <: GetSmsMessagesOperation](x: Self) {
    
    inline def setCancel(value: Callback): Self = StObject.set(x, "cancel", value.toJsFn)
    
    inline def setClose(value: Callback): Self = StObject.set(x, "close", value.toJsFn)
    
    inline def setCompleted(
      value: (/* asyncInfo */ IAsyncOperationWithProgress[IVectorView[Any], Double], /* asyncStatus */ AsyncStatus) => Callback
    ): Self = StObject.set(x, "completed", js.Any.fromFunction2((t0: /* asyncInfo */ IAsyncOperationWithProgress[IVectorView[Any], Double], t1: /* asyncStatus */ AsyncStatus) => (value(t0, t1)).runNow()))
    
    inline def setErrorCode(value: WinRTError): Self = StObject.set(x, "errorCode", value.asInstanceOf[js.Any])
    
    inline def setGetResults(value: CallbackTo[IVectorView[ISmsMessage]]): Self = StObject.set(x, "getResults", value.toJsFn)
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setProgress(value: (/* asyncInfo */ IAsyncOperationWithProgress[IVectorView[Any], Double], Double) => Callback): Self = StObject.set(x, "progress", js.Any.fromFunction2((t0: /* asyncInfo */ IAsyncOperationWithProgress[IVectorView[Any], Double], t1: Double) => (value(t0, t1)).runNow()))
    
    inline def setStatus(value: AsyncStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
