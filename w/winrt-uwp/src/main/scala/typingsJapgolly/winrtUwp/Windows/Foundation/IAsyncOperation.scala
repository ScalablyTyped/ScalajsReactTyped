package typingsJapgolly.winrtUwp.Windows.Foundation

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrtUwp.Windows.WinRTError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an asynchronous operation, which returns a result upon completion. This is the return type for many Windows Runtime asynchronous methods that have results but don't report progress. */
trait IAsyncOperation[TResult]
  extends StObject
     with IAsyncInfo {
  
  /** Gets or sets the method that handles the operation completed notification. */
  def completed(asyncInfo: IAsyncOperation[TResult], asyncStatus: AsyncStatus): Unit
  /** Gets or sets the method that handles the operation completed notification. */
  @JSName("completed")
  var completed_Original: AsyncOperationCompletedHandler[TResult]
  
  /**
    * Returns the results of the operation.
    * @return The results of the operation.
    */
  def getResults(): TResult
}
object IAsyncOperation {
  
  inline def apply[TResult](
    cancel: Callback,
    close: Callback,
    completed: (/* asyncInfo */ IAsyncOperation[TResult], /* asyncStatus */ AsyncStatus) => Callback,
    errorCode: WinRTError,
    getResults: CallbackTo[TResult],
    id: Double,
    status: AsyncStatus
  ): IAsyncOperation[TResult] = {
    val __obj = js.Dynamic.literal(cancel = cancel.toJsFn, close = close.toJsFn, completed = js.Any.fromFunction2((t0: /* asyncInfo */ IAsyncOperation[TResult], t1: /* asyncStatus */ AsyncStatus) => (completed(t0, t1)).runNow()), errorCode = errorCode.asInstanceOf[js.Any], getResults = getResults.toJsFn, id = id.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAsyncOperation[TResult]]
  }
  
  extension [Self <: IAsyncOperation[?], TResult](x: Self & IAsyncOperation[TResult]) {
    
    inline def setCompleted(value: (/* asyncInfo */ IAsyncOperation[TResult], /* asyncStatus */ AsyncStatus) => Callback): Self = StObject.set(x, "completed", js.Any.fromFunction2((t0: /* asyncInfo */ IAsyncOperation[TResult], t1: /* asyncStatus */ AsyncStatus) => (value(t0, t1)).runNow()))
    
    inline def setGetResults(value: CallbackTo[TResult]): Self = StObject.set(x, "getResults", value.toJsFn)
  }
}
