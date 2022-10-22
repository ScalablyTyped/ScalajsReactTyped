package typingsJapgolly.winrt.anon

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrt.Windows.Foundation.AsyncOperationCompletedHandler
import typingsJapgolly.winrt.Windows.Foundation.AsyncStatus
import typingsJapgolly.winrt.Windows.Foundation.IAsyncOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `7` extends StObject {
  
  def completed(asyncInfo: IAsyncOperation[Double], asyncStatus: AsyncStatus): Unit
  @JSName("completed")
  var completed_Original: AsyncOperationCompletedHandler[Double]
  
  def getResults(): Double
}
object `7` {
  
  inline def apply(
    completed: (/* asyncInfo */ IAsyncOperation[Double], /* asyncStatus */ AsyncStatus) => Callback,
    getResults: CallbackTo[Double]
  ): `7` = {
    val __obj = js.Dynamic.literal(completed = js.Any.fromFunction2((t0: /* asyncInfo */ IAsyncOperation[Double], t1: /* asyncStatus */ AsyncStatus) => (completed(t0, t1)).runNow()), getResults = getResults.toJsFn)
    __obj.asInstanceOf[`7`]
  }
  
  extension [Self <: `7`](x: Self) {
    
    inline def setCompleted(value: (/* asyncInfo */ IAsyncOperation[Double], /* asyncStatus */ AsyncStatus) => Callback): Self = StObject.set(x, "completed", js.Any.fromFunction2((t0: /* asyncInfo */ IAsyncOperation[Double], t1: /* asyncStatus */ AsyncStatus) => (value(t0, t1)).runNow()))
    
    inline def setGetResults(value: CallbackTo[Double]): Self = StObject.set(x, "getResults", value.toJsFn)
  }
}
