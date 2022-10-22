package typingsJapgolly.slackMock.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IncomingWebhooks[T] extends StObject {
  
  def addResponse(opts: IncomingWebhookOptions[T]): Unit
  
  var calls: js.Array[IncomingWebhookCall[T]]
  
  def reset(): Unit
}
object IncomingWebhooks {
  
  inline def apply[T](
    addResponse: IncomingWebhookOptions[T] => Callback,
    calls: js.Array[IncomingWebhookCall[T]],
    reset: Callback
  ): IncomingWebhooks[T] = {
    val __obj = js.Dynamic.literal(addResponse = js.Any.fromFunction1((t0: IncomingWebhookOptions[T]) => addResponse(t0).runNow()), calls = calls.asInstanceOf[js.Any], reset = reset.toJsFn)
    __obj.asInstanceOf[IncomingWebhooks[T]]
  }
  
  extension [Self <: IncomingWebhooks[?], T](x: Self & IncomingWebhooks[T]) {
    
    inline def setAddResponse(value: IncomingWebhookOptions[T] => Callback): Self = StObject.set(x, "addResponse", js.Any.fromFunction1((t0: IncomingWebhookOptions[T]) => value(t0).runNow()))
    
    inline def setCalls(value: js.Array[IncomingWebhookCall[T]]): Self = StObject.set(x, "calls", value.asInstanceOf[js.Any])
    
    inline def setCallsVarargs(value: IncomingWebhookCall[T]*): Self = StObject.set(x, "calls", js.Array(value*))
    
    inline def setReset(value: Callback): Self = StObject.set(x, "reset", value.toJsFn)
  }
}
