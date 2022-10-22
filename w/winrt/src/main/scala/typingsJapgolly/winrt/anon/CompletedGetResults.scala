package typingsJapgolly.winrt.anon

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrt.Windows.Foundation.AsyncOperationCompletedHandler
import typingsJapgolly.winrt.Windows.Foundation.AsyncStatus
import typingsJapgolly.winrt.Windows.Foundation.IAsyncOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompletedGetResults extends StObject {
  
  def completed(asyncInfo: IAsyncOperation[Any], asyncStatus: AsyncStatus): Unit
  @JSName("completed")
  var completed_Original: AsyncOperationCompletedHandler[Any]
  
  def getResults(): Any
}
object CompletedGetResults {
  
  inline def apply(
    completed: (/* asyncInfo */ IAsyncOperation[Any], /* asyncStatus */ AsyncStatus) => Callback,
    getResults: CallbackTo[Any]
  ): CompletedGetResults = {
    val __obj = js.Dynamic.literal(completed = js.Any.fromFunction2((t0: /* asyncInfo */ IAsyncOperation[Any], t1: /* asyncStatus */ AsyncStatus) => (completed(t0, t1)).runNow()), getResults = getResults.toJsFn)
    __obj.asInstanceOf[CompletedGetResults]
  }
  
  extension [Self <: CompletedGetResults](x: Self) {
    
    inline def setCompleted(value: (/* asyncInfo */ IAsyncOperation[Any], /* asyncStatus */ AsyncStatus) => Callback): Self = StObject.set(x, "completed", js.Any.fromFunction2((t0: /* asyncInfo */ IAsyncOperation[Any], t1: /* asyncStatus */ AsyncStatus) => (value(t0, t1)).runNow()))
    
    inline def setGetResults(value: CallbackTo[Any]): Self = StObject.set(x, "getResults", value.toJsFn)
  }
}
