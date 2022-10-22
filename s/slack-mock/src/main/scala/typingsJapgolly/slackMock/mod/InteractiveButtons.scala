package typingsJapgolly.slackMock.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InteractiveButtons[T] extends StObject {
  
  def addResponse(opts: InteractiveButtonOptions[T]): Unit
  
  var calls: js.Array[InteractiveButtonCall[T]]
  
  def reset(): Unit
  
  def send(targetUrl: InteractiveButtonUrl, body: T): js.Promise[Unit]
}
object InteractiveButtons {
  
  inline def apply[T](
    addResponse: InteractiveButtonOptions[T] => Callback,
    calls: js.Array[InteractiveButtonCall[T]],
    reset: Callback,
    send: (InteractiveButtonUrl, T) => js.Promise[Unit]
  ): InteractiveButtons[T] = {
    val __obj = js.Dynamic.literal(addResponse = js.Any.fromFunction1((t0: InteractiveButtonOptions[T]) => addResponse(t0).runNow()), calls = calls.asInstanceOf[js.Any], reset = reset.toJsFn, send = js.Any.fromFunction2(send))
    __obj.asInstanceOf[InteractiveButtons[T]]
  }
  
  extension [Self <: InteractiveButtons[?], T](x: Self & InteractiveButtons[T]) {
    
    inline def setAddResponse(value: InteractiveButtonOptions[T] => Callback): Self = StObject.set(x, "addResponse", js.Any.fromFunction1((t0: InteractiveButtonOptions[T]) => value(t0).runNow()))
    
    inline def setCalls(value: js.Array[InteractiveButtonCall[T]]): Self = StObject.set(x, "calls", value.asInstanceOf[js.Any])
    
    inline def setCallsVarargs(value: InteractiveButtonCall[T]*): Self = StObject.set(x, "calls", js.Array(value*))
    
    inline def setReset(value: Callback): Self = StObject.set(x, "reset", value.toJsFn)
    
    inline def setSend(value: (InteractiveButtonUrl, T) => js.Promise[Unit]): Self = StObject.set(x, "send", js.Any.fromFunction2(value))
  }
}
