package typingsJapgolly.slackMock.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Events[T] extends StObject {
  
  var calls: js.Array[EventCall[T]]
  
  def reset(): Unit
  
  def send(targetUrl: EventUrl, body: T): js.Promise[Unit]
}
object Events {
  
  inline def apply[T](calls: js.Array[EventCall[T]], reset: Callback, send: (EventUrl, T) => js.Promise[Unit]): Events[T] = {
    val __obj = js.Dynamic.literal(calls = calls.asInstanceOf[js.Any], reset = reset.toJsFn, send = js.Any.fromFunction2(send))
    __obj.asInstanceOf[Events[T]]
  }
  
  extension [Self <: Events[?], T](x: Self & Events[T]) {
    
    inline def setCalls(value: js.Array[EventCall[T]]): Self = StObject.set(x, "calls", value.asInstanceOf[js.Any])
    
    inline def setCallsVarargs(value: EventCall[T]*): Self = StObject.set(x, "calls", js.Array(value*))
    
    inline def setReset(value: Callback): Self = StObject.set(x, "reset", value.toJsFn)
    
    inline def setSend(value: (EventUrl, T) => js.Promise[Unit]): Self = StObject.set(x, "send", js.Any.fromFunction2(value))
  }
}
