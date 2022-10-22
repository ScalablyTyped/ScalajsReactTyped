package typingsJapgolly.winrtUwp.Windows.Foundation

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrtUwp.Windows.WinRTError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an asynchronous operation that can report progress updates to callers. This is the return type for many Windows Runtime asynchronous methods that have results and also report progress. */
trait IAsyncOperationWithProgress[TResult, TProgress]
  extends StObject
     with IAsyncInfo {
  
  /** Gets or sets the method that handles the operation completed notification. */
  def completed(asyncInfo: IAsyncOperationWithProgress[TResult, TProgress], asyncStatus: AsyncStatus): Unit
  /** Gets or sets the method that handles the operation completed notification. */
  @JSName("completed")
  var completed_Original: AsyncOperationWithProgressCompletedHandler[TResult, TProgress]
  
  /**
    * Returns the results of the operation.
    * @return The results of the operation.
    */
  def getResults(): TResult
  
  /** Gets or sets the method that handles progress notifications. */
  def progress(asyncInfo: IAsyncOperationWithProgress[TResult, TProgress], progressInfo: TProgress): Unit
  /** Gets or sets the method that handles progress notifications. */
  @JSName("progress")
  var progress_Original: AsyncOperationProgressHandler[TResult, TProgress]
}
object IAsyncOperationWithProgress {
  
  inline def apply[TResult, TProgress](
    cancel: Callback,
    close: Callback,
    completed: (/* asyncInfo */ IAsyncOperationWithProgress[TResult, TProgress], /* asyncStatus */ AsyncStatus) => Callback,
    errorCode: WinRTError,
    getResults: CallbackTo[TResult],
    id: Double,
    progress: (/* asyncInfo */ IAsyncOperationWithProgress[TResult, TProgress], TProgress) => Callback,
    status: AsyncStatus
  ): IAsyncOperationWithProgress[TResult, TProgress] = {
    val __obj = js.Dynamic.literal(cancel = cancel.toJsFn, close = close.toJsFn, completed = js.Any.fromFunction2((t0: /* asyncInfo */ IAsyncOperationWithProgress[TResult, TProgress], t1: /* asyncStatus */ AsyncStatus) => (completed(t0, t1)).runNow()), errorCode = errorCode.asInstanceOf[js.Any], getResults = getResults.toJsFn, id = id.asInstanceOf[js.Any], progress = js.Any.fromFunction2((t0: /* asyncInfo */ IAsyncOperationWithProgress[TResult, TProgress], t1: TProgress) => (progress(t0, t1)).runNow()), status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAsyncOperationWithProgress[TResult, TProgress]]
  }
  
  extension [Self <: IAsyncOperationWithProgress[?, ?], TResult, TProgress](x: Self & (IAsyncOperationWithProgress[TResult, TProgress])) {
    
    inline def setCompleted(
      value: (/* asyncInfo */ IAsyncOperationWithProgress[TResult, TProgress], /* asyncStatus */ AsyncStatus) => Callback
    ): Self = StObject.set(x, "completed", js.Any.fromFunction2((t0: /* asyncInfo */ IAsyncOperationWithProgress[TResult, TProgress], t1: /* asyncStatus */ AsyncStatus) => (value(t0, t1)).runNow()))
    
    inline def setGetResults(value: CallbackTo[TResult]): Self = StObject.set(x, "getResults", value.toJsFn)
    
    inline def setProgress(value: (/* asyncInfo */ IAsyncOperationWithProgress[TResult, TProgress], TProgress) => Callback): Self = StObject.set(x, "progress", js.Any.fromFunction2((t0: /* asyncInfo */ IAsyncOperationWithProgress[TResult, TProgress], t1: TProgress) => (value(t0, t1)).runNow()))
  }
}
