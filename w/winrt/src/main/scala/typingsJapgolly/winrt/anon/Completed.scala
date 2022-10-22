package typingsJapgolly.winrt.anon

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrt.Windows.Foundation.AsyncOperationProgressHandler
import typingsJapgolly.winrt.Windows.Foundation.AsyncOperationWithProgressCompletedHandler
import typingsJapgolly.winrt.Windows.Foundation.AsyncStatus
import typingsJapgolly.winrt.Windows.Foundation.IAsyncOperationWithProgress
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Completed[TResult, TProgress] extends StObject {
  
  def completed(asyncInfo: IAsyncOperationWithProgress[TResult, TProgress], asyncStatus: AsyncStatus): Unit
  @JSName("completed")
  var completed_Original: AsyncOperationWithProgressCompletedHandler[TResult, TProgress]
  
  def getResults(): TResult
  
  def progress(asyncInfo: IAsyncOperationWithProgress[TResult, TProgress], progressInfo: TProgress): Unit
  @JSName("progress")
  var progress_Original: AsyncOperationProgressHandler[TResult, TProgress]
}
object Completed {
  
  inline def apply[TResult, TProgress](
    completed: (/* asyncInfo */ IAsyncOperationWithProgress[TResult, TProgress], /* asyncStatus */ AsyncStatus) => Callback,
    getResults: CallbackTo[TResult],
    progress: (/* asyncInfo */ IAsyncOperationWithProgress[TResult, TProgress], TProgress) => Callback
  ): Completed[TResult, TProgress] = {
    val __obj = js.Dynamic.literal(completed = js.Any.fromFunction2((t0: /* asyncInfo */ IAsyncOperationWithProgress[TResult, TProgress], t1: /* asyncStatus */ AsyncStatus) => (completed(t0, t1)).runNow()), getResults = getResults.toJsFn, progress = js.Any.fromFunction2((t0: /* asyncInfo */ IAsyncOperationWithProgress[TResult, TProgress], t1: TProgress) => (progress(t0, t1)).runNow()))
    __obj.asInstanceOf[Completed[TResult, TProgress]]
  }
  
  extension [Self <: Completed[?, ?], TResult, TProgress](x: Self & (Completed[TResult, TProgress])) {
    
    inline def setCompleted(
      value: (/* asyncInfo */ IAsyncOperationWithProgress[TResult, TProgress], /* asyncStatus */ AsyncStatus) => Callback
    ): Self = StObject.set(x, "completed", js.Any.fromFunction2((t0: /* asyncInfo */ IAsyncOperationWithProgress[TResult, TProgress], t1: /* asyncStatus */ AsyncStatus) => (value(t0, t1)).runNow()))
    
    inline def setGetResults(value: CallbackTo[TResult]): Self = StObject.set(x, "getResults", value.toJsFn)
    
    inline def setProgress(value: (/* asyncInfo */ IAsyncOperationWithProgress[TResult, TProgress], TProgress) => Callback): Self = StObject.set(x, "progress", js.Any.fromFunction2((t0: /* asyncInfo */ IAsyncOperationWithProgress[TResult, TProgress], t1: TProgress) => (value(t0, t1)).runNow()))
  }
}
