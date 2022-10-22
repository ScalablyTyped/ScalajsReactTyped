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

/** Retrieves an SmsDevice object asynchronously. */
trait GetSmsDeviceOperation extends StObject {
  
  /** Cancels the asynchronous SmsDevice object retrieval. */
  def cancel(): Unit
  
  /** Closes the asynchronous SmsDevice object retrieval operation. */
  def close(): Unit
  
  /** Specifies whether the asynchronous SmsDevice object retrieval operation has completed or not. */
  def completed(asyncInfo: IAsyncOperation[SmsDevice], asyncStatus: AsyncStatus): Unit
  /** Specifies whether the asynchronous SmsDevice object retrieval operation has completed or not. */
  @JSName("completed")
  var completed_Original: AsyncOperationCompletedHandler[SmsDevice]
  
  /** Specifies the error code for the asynchronous SmsDevice object retrieval operation */
  var errorCode: WinRTError
  
  /**
    * Gets the results of the asynchronous SmsDevice object retrieval operation.
    * @return A reference to an SmsDevice object.
    */
  def getResults(): SmsDevice
  
  /** Specifies the ID of the asynchronous SmsDevice object retrieval operation. */
  var id: Double
  
  /** Specifies the status of the asynchronous SmsDevice object retrieval operation. */
  var status: AsyncStatus
}
object GetSmsDeviceOperation {
  
  inline def apply(
    cancel: Callback,
    close: Callback,
    completed: (/* asyncInfo */ IAsyncOperation[SmsDevice], /* asyncStatus */ AsyncStatus) => Callback,
    errorCode: WinRTError,
    getResults: CallbackTo[SmsDevice],
    id: Double,
    status: AsyncStatus
  ): GetSmsDeviceOperation = {
    val __obj = js.Dynamic.literal(cancel = cancel.toJsFn, close = close.toJsFn, completed = js.Any.fromFunction2((t0: /* asyncInfo */ IAsyncOperation[SmsDevice], t1: /* asyncStatus */ AsyncStatus) => (completed(t0, t1)).runNow()), errorCode = errorCode.asInstanceOf[js.Any], getResults = getResults.toJsFn, id = id.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSmsDeviceOperation]
  }
  
  extension [Self <: GetSmsDeviceOperation](x: Self) {
    
    inline def setCancel(value: Callback): Self = StObject.set(x, "cancel", value.toJsFn)
    
    inline def setClose(value: Callback): Self = StObject.set(x, "close", value.toJsFn)
    
    inline def setCompleted(value: (/* asyncInfo */ IAsyncOperation[SmsDevice], /* asyncStatus */ AsyncStatus) => Callback): Self = StObject.set(x, "completed", js.Any.fromFunction2((t0: /* asyncInfo */ IAsyncOperation[SmsDevice], t1: /* asyncStatus */ AsyncStatus) => (value(t0, t1)).runNow()))
    
    inline def setErrorCode(value: WinRTError): Self = StObject.set(x, "errorCode", value.asInstanceOf[js.Any])
    
    inline def setGetResults(value: CallbackTo[SmsDevice]): Self = StObject.set(x, "getResults", value.toJsFn)
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: AsyncStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
