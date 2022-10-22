package typingsJapgolly.winrtUwp.Windows.Devices.Sms

import japgolly.scalajs.react.Callback
import typingsJapgolly.winrtUwp.Windows.Foundation.AsyncActionCompletedHandler
import typingsJapgolly.winrtUwp.Windows.Foundation.AsyncStatus
import typingsJapgolly.winrtUwp.Windows.Foundation.IAsyncAction
import typingsJapgolly.winrtUwp.Windows.WinRTError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Enables start, track, and end an asynchronous message delete operation for a single message. */
trait DeleteSmsMessageOperation extends StObject {
  
  /** Cancels the asynchronous SMS message delete operation. */
  def cancel(): Unit
  
  /** Closes the asynchronous SMS message delete operation. */
  def close(): Unit
  
  /** Specifies whether the asynchronous SMS message delete operation has completed or not. */
  def completed(asyncInfo: IAsyncAction, asyncStatus: AsyncStatus): Unit
  /** Specifies whether the asynchronous SMS message delete operation has completed or not. */
  @JSName("completed")
  var completed_Original: AsyncActionCompletedHandler
  
  /** Specifies the error code for the asynchronous SMS message delete operation. */
  var errorCode: WinRTError
  
  /** Retrieves the result of the asynchronous SMS message delete operation. */
  def getResults(): Unit
  
  /** Specifies the ID of the asynchronous SMS message delete operation. */
  var id: Double
  
  /** Specifies the status of the asynchronous SMS message delete operation. */
  var status: AsyncStatus
}
object DeleteSmsMessageOperation {
  
  inline def apply(
    cancel: Callback,
    close: Callback,
    completed: (/* asyncInfo */ IAsyncAction, /* asyncStatus */ AsyncStatus) => Callback,
    errorCode: WinRTError,
    getResults: Callback,
    id: Double,
    status: AsyncStatus
  ): DeleteSmsMessageOperation = {
    val __obj = js.Dynamic.literal(cancel = cancel.toJsFn, close = close.toJsFn, completed = js.Any.fromFunction2((t0: /* asyncInfo */ IAsyncAction, t1: /* asyncStatus */ AsyncStatus) => (completed(t0, t1)).runNow()), errorCode = errorCode.asInstanceOf[js.Any], getResults = getResults.toJsFn, id = id.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteSmsMessageOperation]
  }
  
  extension [Self <: DeleteSmsMessageOperation](x: Self) {
    
    inline def setCancel(value: Callback): Self = StObject.set(x, "cancel", value.toJsFn)
    
    inline def setClose(value: Callback): Self = StObject.set(x, "close", value.toJsFn)
    
    inline def setCompleted(value: (/* asyncInfo */ IAsyncAction, /* asyncStatus */ AsyncStatus) => Callback): Self = StObject.set(x, "completed", js.Any.fromFunction2((t0: /* asyncInfo */ IAsyncAction, t1: /* asyncStatus */ AsyncStatus) => (value(t0, t1)).runNow()))
    
    inline def setErrorCode(value: WinRTError): Self = StObject.set(x, "errorCode", value.asInstanceOf[js.Any])
    
    inline def setGetResults(value: Callback): Self = StObject.set(x, "getResults", value.toJsFn)
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: AsyncStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
