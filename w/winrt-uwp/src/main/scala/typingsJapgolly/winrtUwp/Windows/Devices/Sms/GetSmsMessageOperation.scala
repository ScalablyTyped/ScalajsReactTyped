package typingsJapgolly.winrtUwp.Windows.Devices.Sms

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrtUwp.Windows.Foundation.AsyncOperationCompletedHandler
import typingsJapgolly.winrtUwp.Windows.Foundation.AsyncStatus
import typingsJapgolly.winrtUwp.Windows.Foundation.IAsyncOperation
import typingsJapgolly.winrtUwp.Windows.WinRTError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Supports the retrieval of a message from the SMS message store. */
trait GetSmsMessageOperation extends StObject {
  
  /** Cancels the asynchronous SMS message retrieval operation. */
  def cancel(): Unit
  
  /** Closes the asynchronous SMS message retrieval operation. */
  def close(): Unit
  
  /** A handler for the completed event of an asynchronous SMS message retrieval operation. */
  def completed(asyncInfo: IAsyncOperation[ISmsMessage], asyncStatus: AsyncStatus): Unit
  /** A handler for the completed event of an asynchronous SMS message retrieval operation. */
  @JSName("completed")
  var completed_Original: AsyncOperationCompletedHandler[ISmsMessage]
  
  /** Specifies the error code for the asynchronous SMS message retrieval operation. */
  var errorCode: WinRTError
  
  /**
    * Retrieves the result of the asynchronous SMS message retrieval operation.
    * @return An interface that accesses the retrieved message.
    */
  def getResults(): ISmsMessage
  
  /** Specifies the ID of the asynchronous SMS message retrieval operation. */
  var id: Double
  
  /** Specifies the status of the asynchronous SMS message retrieval operation. */
  var status: AsyncStatus
}
object GetSmsMessageOperation {
  
  inline def apply(
    cancel: Callback,
    close: Callback,
    completed: (/* asyncInfo */ IAsyncOperation[ISmsMessage], /* asyncStatus */ AsyncStatus) => Callback,
    errorCode: WinRTError,
    getResults: CallbackTo[ISmsMessage],
    id: Double,
    status: AsyncStatus
  ): GetSmsMessageOperation = {
    val __obj = js.Dynamic.literal(cancel = cancel.toJsFn, close = close.toJsFn, completed = js.Any.fromFunction2((t0: /* asyncInfo */ IAsyncOperation[ISmsMessage], t1: /* asyncStatus */ AsyncStatus) => (completed(t0, t1)).runNow()), errorCode = errorCode.asInstanceOf[js.Any], getResults = getResults.toJsFn, id = id.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSmsMessageOperation]
  }
  
  extension [Self <: GetSmsMessageOperation](x: Self) {
    
    inline def setCancel(value: Callback): Self = StObject.set(x, "cancel", value.toJsFn)
    
    inline def setClose(value: Callback): Self = StObject.set(x, "close", value.toJsFn)
    
    inline def setCompleted(value: (/* asyncInfo */ IAsyncOperation[ISmsMessage], /* asyncStatus */ AsyncStatus) => Callback): Self = StObject.set(x, "completed", js.Any.fromFunction2((t0: /* asyncInfo */ IAsyncOperation[ISmsMessage], t1: /* asyncStatus */ AsyncStatus) => (value(t0, t1)).runNow()))
    
    inline def setErrorCode(value: WinRTError): Self = StObject.set(x, "errorCode", value.asInstanceOf[js.Any])
    
    inline def setGetResults(value: CallbackTo[ISmsMessage]): Self = StObject.set(x, "getResults", value.toJsFn)
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: AsyncStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
