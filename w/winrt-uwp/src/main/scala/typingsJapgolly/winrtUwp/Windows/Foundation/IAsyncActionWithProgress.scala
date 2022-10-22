package typingsJapgolly.winrtUwp.Windows.Foundation

import japgolly.scalajs.react.Callback
import typingsJapgolly.winrtUwp.Windows.WinRTError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an asynchronous action that can report progress updates to callers. This is the return type for all Windows Runtime asynchronous methods that don't have a result object, but do report progress to callback listeners. */
trait IAsyncActionWithProgress[TProgress]
  extends StObject
     with IAsyncInfo {
  
  /** Gets or sets the method that handles the action completed notification. */
  def completed(asyncInfo: IAsyncActionWithProgress[TProgress], asyncStatus: AsyncStatus): Unit
  /** Gets or sets the method that handles the action completed notification. */
  @JSName("completed")
  var completed_Original: AsyncActionWithProgressCompletedHandler[TProgress]
  
  /** Returns the results of the action. */
  def getResults(): Unit
  
  /** Gets or sets the callback method that receives progress notification. */
  def progress(asyncInfo: IAsyncActionWithProgress[TProgress], progressInfo: TProgress): Unit
  /** Gets or sets the callback method that receives progress notification. */
  @JSName("progress")
  var progress_Original: AsyncActionProgressHandler[TProgress]
}
object IAsyncActionWithProgress {
  
  inline def apply[TProgress](
    cancel: Callback,
    close: Callback,
    completed: (/* asyncInfo */ IAsyncActionWithProgress[TProgress], /* asyncStatus */ AsyncStatus) => Callback,
    errorCode: WinRTError,
    getResults: Callback,
    id: Double,
    progress: (/* asyncInfo */ IAsyncActionWithProgress[TProgress], TProgress) => Callback,
    status: AsyncStatus
  ): IAsyncActionWithProgress[TProgress] = {
    val __obj = js.Dynamic.literal(cancel = cancel.toJsFn, close = close.toJsFn, completed = js.Any.fromFunction2((t0: /* asyncInfo */ IAsyncActionWithProgress[TProgress], t1: /* asyncStatus */ AsyncStatus) => (completed(t0, t1)).runNow()), errorCode = errorCode.asInstanceOf[js.Any], getResults = getResults.toJsFn, id = id.asInstanceOf[js.Any], progress = js.Any.fromFunction2((t0: /* asyncInfo */ IAsyncActionWithProgress[TProgress], t1: TProgress) => (progress(t0, t1)).runNow()), status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAsyncActionWithProgress[TProgress]]
  }
  
  extension [Self <: IAsyncActionWithProgress[?], TProgress](x: Self & IAsyncActionWithProgress[TProgress]) {
    
    inline def setCompleted(
      value: (/* asyncInfo */ IAsyncActionWithProgress[TProgress], /* asyncStatus */ AsyncStatus) => Callback
    ): Self = StObject.set(x, "completed", js.Any.fromFunction2((t0: /* asyncInfo */ IAsyncActionWithProgress[TProgress], t1: /* asyncStatus */ AsyncStatus) => (value(t0, t1)).runNow()))
    
    inline def setGetResults(value: Callback): Self = StObject.set(x, "getResults", value.toJsFn)
    
    inline def setProgress(value: (/* asyncInfo */ IAsyncActionWithProgress[TProgress], TProgress) => Callback): Self = StObject.set(x, "progress", js.Any.fromFunction2((t0: /* asyncInfo */ IAsyncActionWithProgress[TProgress], t1: TProgress) => (value(t0, t1)).runNow()))
  }
}
