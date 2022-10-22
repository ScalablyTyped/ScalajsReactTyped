package typingsJapgolly.winrt.anon

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrt.Windows.Devices.Sms.ISmsMessage
import typingsJapgolly.winrt.Windows.Foundation.AsyncOperationCompletedHandler
import typingsJapgolly.winrt.Windows.Foundation.AsyncOperationProgressHandler
import typingsJapgolly.winrt.Windows.Foundation.AsyncStatus
import typingsJapgolly.winrt.Windows.Foundation.Collections.IVectorView
import typingsJapgolly.winrt.Windows.Foundation.IAsyncOperation
import typingsJapgolly.winrt.Windows.Foundation.IAsyncOperationWithProgress
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Progress extends StObject {
  
  def completed(asyncInfo: IAsyncOperation[IVectorView[ISmsMessage]], asyncStatus: AsyncStatus): Unit
  @JSName("completed")
  var completed_Original: AsyncOperationCompletedHandler[IVectorView[ISmsMessage]]
  
  def getResults(): IVectorView[ISmsMessage]
  
  def progress(asyncInfo: IAsyncOperationWithProgress[IVectorView[ISmsMessage], Double], progressInfo: Double): Unit
  @JSName("progress")
  var progress_Original: AsyncOperationProgressHandler[IVectorView[ISmsMessage], Double]
}
object Progress {
  
  inline def apply(
    completed: (/* asyncInfo */ IAsyncOperation[IVectorView[ISmsMessage]], /* asyncStatus */ AsyncStatus) => Callback,
    getResults: CallbackTo[IVectorView[ISmsMessage]],
    progress: (/* asyncInfo */ IAsyncOperationWithProgress[IVectorView[ISmsMessage], Double], Double) => Callback
  ): Progress = {
    val __obj = js.Dynamic.literal(completed = js.Any.fromFunction2((t0: /* asyncInfo */ IAsyncOperation[IVectorView[ISmsMessage]], t1: /* asyncStatus */ AsyncStatus) => (completed(t0, t1)).runNow()), getResults = getResults.toJsFn, progress = js.Any.fromFunction2((t0: /* asyncInfo */ IAsyncOperationWithProgress[IVectorView[ISmsMessage], Double], t1: Double) => (progress(t0, t1)).runNow()))
    __obj.asInstanceOf[Progress]
  }
  
  extension [Self <: Progress](x: Self) {
    
    inline def setCompleted(
      value: (/* asyncInfo */ IAsyncOperation[IVectorView[ISmsMessage]], /* asyncStatus */ AsyncStatus) => Callback
    ): Self = StObject.set(x, "completed", js.Any.fromFunction2((t0: /* asyncInfo */ IAsyncOperation[IVectorView[ISmsMessage]], t1: /* asyncStatus */ AsyncStatus) => (value(t0, t1)).runNow()))
    
    inline def setGetResults(value: CallbackTo[IVectorView[ISmsMessage]]): Self = StObject.set(x, "getResults", value.toJsFn)
    
    inline def setProgress(
      value: (/* asyncInfo */ IAsyncOperationWithProgress[IVectorView[ISmsMessage], Double], Double) => Callback
    ): Self = StObject.set(x, "progress", js.Any.fromFunction2((t0: /* asyncInfo */ IAsyncOperationWithProgress[IVectorView[ISmsMessage], Double], t1: Double) => (value(t0, t1)).runNow()))
  }
}
