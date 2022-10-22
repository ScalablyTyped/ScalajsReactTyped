package typingsJapgolly.ydnDb.ydn.db

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Request extends StObject {
  
  def abort(): Any
  
  def always(callback: js.Function1[/* data */ Any, Unit]): Any
  
  def canAbort(): Boolean
  
  def done(callback: js.Function1[/* data */ Any, Unit]): Any
  
  def fail(callback: js.Function1[/* data */ Any, Unit]): Any
  
  def `then`(
    success_callback: js.Function1[/* data */ Any, Any],
    error_callback: js.Function1[/* data */ js.Error, Any]
  ): Any
}
object Request {
  
  inline def apply(
    abort: CallbackTo[Any],
    always: js.Function1[/* data */ Any, Unit] => Any,
    canAbort: CallbackTo[Boolean],
    done: js.Function1[/* data */ Any, Unit] => Any,
    fail: js.Function1[/* data */ Any, Unit] => Any,
    `then`: (js.Function1[/* data */ Any, Any], js.Function1[/* data */ js.Error, Any]) => Any
  ): Request = {
    val __obj = js.Dynamic.literal(abort = abort.toJsFn, always = js.Any.fromFunction1(always), canAbort = canAbort.toJsFn, done = js.Any.fromFunction1(done), fail = js.Any.fromFunction1(fail))
    __obj.updateDynamic("then")(js.Any.fromFunction2(`then`))
    __obj.asInstanceOf[Request]
  }
  
  extension [Self <: Request](x: Self) {
    
    inline def setAbort(value: CallbackTo[Any]): Self = StObject.set(x, "abort", value.toJsFn)
    
    inline def setAlways(value: js.Function1[/* data */ Any, Unit] => Any): Self = StObject.set(x, "always", js.Any.fromFunction1(value))
    
    inline def setCanAbort(value: CallbackTo[Boolean]): Self = StObject.set(x, "canAbort", value.toJsFn)
    
    inline def setDone(value: js.Function1[/* data */ Any, Unit] => Any): Self = StObject.set(x, "done", js.Any.fromFunction1(value))
    
    inline def setFail(value: js.Function1[/* data */ Any, Unit] => Any): Self = StObject.set(x, "fail", js.Any.fromFunction1(value))
    
    inline def setThen(value: (js.Function1[/* data */ Any, Any], js.Function1[/* data */ js.Error, Any]) => Any): Self = StObject.set(x, "then", js.Any.fromFunction2(value))
  }
}
