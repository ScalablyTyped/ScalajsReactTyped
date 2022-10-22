package typingsJapgolly.winrt.anon

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrt.Windows.Devices.Sms.SmsDevice
import typingsJapgolly.winrt.Windows.Foundation.AsyncOperationCompletedHandler
import typingsJapgolly.winrt.Windows.Foundation.AsyncStatus
import typingsJapgolly.winrt.Windows.Foundation.IAsyncOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompletedAsyncOperationCompletedHandlerGetResults extends StObject {
  
  def completed(asyncInfo: IAsyncOperation[SmsDevice], asyncStatus: AsyncStatus): Unit
  @JSName("completed")
  var completed_Original: AsyncOperationCompletedHandler[SmsDevice]
  
  def getResults(): SmsDevice
}
object CompletedAsyncOperationCompletedHandlerGetResults {
  
  inline def apply(
    completed: (/* asyncInfo */ IAsyncOperation[SmsDevice], /* asyncStatus */ AsyncStatus) => Callback,
    getResults: CallbackTo[SmsDevice]
  ): CompletedAsyncOperationCompletedHandlerGetResults = {
    val __obj = js.Dynamic.literal(completed = js.Any.fromFunction2((t0: /* asyncInfo */ IAsyncOperation[SmsDevice], t1: /* asyncStatus */ AsyncStatus) => (completed(t0, t1)).runNow()), getResults = getResults.toJsFn)
    __obj.asInstanceOf[CompletedAsyncOperationCompletedHandlerGetResults]
  }
  
  extension [Self <: CompletedAsyncOperationCompletedHandlerGetResults](x: Self) {
    
    inline def setCompleted(value: (/* asyncInfo */ IAsyncOperation[SmsDevice], /* asyncStatus */ AsyncStatus) => Callback): Self = StObject.set(x, "completed", js.Any.fromFunction2((t0: /* asyncInfo */ IAsyncOperation[SmsDevice], t1: /* asyncStatus */ AsyncStatus) => (value(t0, t1)).runNow()))
    
    inline def setGetResults(value: CallbackTo[SmsDevice]): Self = StObject.set(x, "getResults", value.toJsFn)
  }
}
