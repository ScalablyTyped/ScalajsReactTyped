package typingsJapgolly.slackMock.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Web[T] extends StObject {
  
  def addResponse(opts: WebOptions[T]): Unit
  
  var calls: js.Array[WebCall[T]]
  
  def reset(): Unit
}
object Web {
  
  inline def apply[T](addResponse: WebOptions[T] => Callback, calls: js.Array[WebCall[T]], reset: Callback): Web[T] = {
    val __obj = js.Dynamic.literal(addResponse = js.Any.fromFunction1((t0: WebOptions[T]) => addResponse(t0).runNow()), calls = calls.asInstanceOf[js.Any], reset = reset.toJsFn)
    __obj.asInstanceOf[Web[T]]
  }
  
  extension [Self <: Web[?], T](x: Self & Web[T]) {
    
    inline def setAddResponse(value: WebOptions[T] => Callback): Self = StObject.set(x, "addResponse", js.Any.fromFunction1((t0: WebOptions[T]) => value(t0).runNow()))
    
    inline def setCalls(value: js.Array[WebCall[T]]): Self = StObject.set(x, "calls", value.asInstanceOf[js.Any])
    
    inline def setCallsVarargs(value: WebCall[T]*): Self = StObject.set(x, "calls", js.Array(value*))
    
    inline def setReset(value: Callback): Self = StObject.set(x, "reset", value.toJsFn)
  }
}
