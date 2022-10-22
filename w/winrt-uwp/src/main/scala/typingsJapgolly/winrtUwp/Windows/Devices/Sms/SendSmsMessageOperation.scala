package typingsJapgolly.winrtUwp.Windows.Devices.Sms

import japgolly.scalajs.react.Callback
import typingsJapgolly.winrtUwp.Windows.Foundation.AsyncActionCompletedHandler
import typingsJapgolly.winrtUwp.Windows.Foundation.AsyncStatus
import typingsJapgolly.winrtUwp.Windows.Foundation.IAsyncAction
import typingsJapgolly.winrtUwp.Windows.WinRTError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Enables the sending of a message. */
trait SendSmsMessageOperation extends StObject {
  
  /** Cancels the asynchronous operation. */
  def cancel(): Unit
  
  /** Closes the asynchronous operation. */
  def close(): Unit
  
  /** A handler for the completed event of an asynchronous action. */
  def completed(asyncInfo: IAsyncAction, asyncStatus: AsyncStatus): Unit
  /** A handler for the completed event of an asynchronous action. */
  @JSName("completed")
  var completed_Original: AsyncActionCompletedHandler
  
  /** Specifies the error code for the asynchronous message operation. */
  var errorCode: WinRTError
  
  /** Retrieves the result of the asynchronous operation. */
  def getResults(): Unit
  
  /** Indicates the ID of the asynchronous message operation. */
  var id: Double
  
  /** Specifies the status of the asynchronous message operation. */
  var status: AsyncStatus
}
object SendSmsMessageOperation {
  
  inline def apply(
    cancel: Callback,
    close: Callback,
    completed: (/* asyncInfo */ IAsyncAction, /* asyncStatus */ AsyncStatus) => Callback,
    errorCode: WinRTError,
    getResults: Callback,
    id: Double,
    status: AsyncStatus
  ): SendSmsMessageOperation = {
    val __obj = js.Dynamic.literal(cancel = cancel.toJsFn, close = close.toJsFn, completed = js.Any.fromFunction2((t0: /* asyncInfo */ IAsyncAction, t1: /* asyncStatus */ AsyncStatus) => (completed(t0, t1)).runNow()), errorCode = errorCode.asInstanceOf[js.Any], getResults = getResults.toJsFn, id = id.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendSmsMessageOperation]
  }
  
  extension [Self <: SendSmsMessageOperation](x: Self) {
    
    inline def setCancel(value: Callback): Self = StObject.set(x, "cancel", value.toJsFn)
    
    inline def setClose(value: Callback): Self = StObject.set(x, "close", value.toJsFn)
    
    inline def setCompleted(value: (/* asyncInfo */ IAsyncAction, /* asyncStatus */ AsyncStatus) => Callback): Self = StObject.set(x, "completed", js.Any.fromFunction2((t0: /* asyncInfo */ IAsyncAction, t1: /* asyncStatus */ AsyncStatus) => (value(t0, t1)).runNow()))
    
    inline def setErrorCode(value: WinRTError): Self = StObject.set(x, "errorCode", value.asInstanceOf[js.Any])
    
    inline def setGetResults(value: Callback): Self = StObject.set(x, "getResults", value.toJsFn)
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: AsyncStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
