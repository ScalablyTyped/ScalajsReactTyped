package typingsJapgolly.winrt.anon

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrt.Windows.Foundation.AsyncOperationCompletedHandler
import typingsJapgolly.winrt.Windows.Foundation.AsyncStatus
import typingsJapgolly.winrt.Windows.Foundation.IAsyncOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResults[TResult] extends StObject {
  
  def completed(asyncInfo: IAsyncOperation[TResult], asyncStatus: AsyncStatus): Unit
  @JSName("completed")
  var completed_Original: AsyncOperationCompletedHandler[TResult]
  
  def getResults(): TResult
}
object GetResults {
  
  inline def apply[TResult](
    completed: (/* asyncInfo */ IAsyncOperation[TResult], /* asyncStatus */ AsyncStatus) => Callback,
    getResults: CallbackTo[TResult]
  ): GetResults[TResult] = {
    val __obj = js.Dynamic.literal(completed = js.Any.fromFunction2((t0: /* asyncInfo */ IAsyncOperation[TResult], t1: /* asyncStatus */ AsyncStatus) => (completed(t0, t1)).runNow()), getResults = getResults.toJsFn)
    __obj.asInstanceOf[GetResults[TResult]]
  }
  
  extension [Self <: GetResults[?], TResult](x: Self & GetResults[TResult]) {
    
    inline def setCompleted(value: (/* asyncInfo */ IAsyncOperation[TResult], /* asyncStatus */ AsyncStatus) => Callback): Self = StObject.set(x, "completed", js.Any.fromFunction2((t0: /* asyncInfo */ IAsyncOperation[TResult], t1: /* asyncStatus */ AsyncStatus) => (value(t0, t1)).runNow()))
    
    inline def setGetResults(value: CallbackTo[TResult]): Self = StObject.set(x, "getResults", value.toJsFn)
  }
}
