package typingsJapgolly.slackMock.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OutgoingWebhooks[T] extends StObject {
  
  var calls: js.Array[OutgoingWebhookCall[T]]
  
  def reset(): Unit
  
  def send(targetUrl: OutgoingWebhookUrl, body: T): js.Promise[Unit]
}
object OutgoingWebhooks {
  
  inline def apply[T](
    calls: js.Array[OutgoingWebhookCall[T]],
    reset: Callback,
    send: (OutgoingWebhookUrl, T) => js.Promise[Unit]
  ): OutgoingWebhooks[T] = {
    val __obj = js.Dynamic.literal(calls = calls.asInstanceOf[js.Any], reset = reset.toJsFn, send = js.Any.fromFunction2(send))
    __obj.asInstanceOf[OutgoingWebhooks[T]]
  }
  
  extension [Self <: OutgoingWebhooks[?], T](x: Self & OutgoingWebhooks[T]) {
    
    inline def setCalls(value: js.Array[OutgoingWebhookCall[T]]): Self = StObject.set(x, "calls", value.asInstanceOf[js.Any])
    
    inline def setCallsVarargs(value: OutgoingWebhookCall[T]*): Self = StObject.set(x, "calls", js.Array(value*))
    
    inline def setReset(value: Callback): Self = StObject.set(x, "reset", value.toJsFn)
    
    inline def setSend(value: (OutgoingWebhookUrl, T) => js.Promise[Unit]): Self = StObject.set(x, "send", js.Any.fromFunction2(value))
  }
}
