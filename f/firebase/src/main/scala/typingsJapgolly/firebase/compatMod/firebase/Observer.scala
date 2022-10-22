package typingsJapgolly.firebase.compatMod.firebase

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @hidden
  */
trait Observer[T, E] extends StObject {
  
  def complete(): Unit
  @JSName("complete")
  var complete_Original: CompleteFn
  
  def error(error: E): Unit
  @JSName("error")
  var error_Original: ErrorFn[E]
  
  def next(value: T): Unit
  @JSName("next")
  var next_Original: NextFn[T]
}
object Observer {
  
  inline def apply[T, E](complete: Callback, error: E => Callback, next: T => Callback): Observer[T, E] = {
    val __obj = js.Dynamic.literal(complete = complete.toJsFn, error = js.Any.fromFunction1((t0: E) => error(t0).runNow()), next = js.Any.fromFunction1((t0: T) => next(t0).runNow()))
    __obj.asInstanceOf[Observer[T, E]]
  }
  
  extension [Self <: Observer[?, ?], T, E](x: Self & (Observer[T, E])) {
    
    inline def setComplete(value: Callback): Self = StObject.set(x, "complete", value.toJsFn)
    
    inline def setError(value: E => Callback): Self = StObject.set(x, "error", js.Any.fromFunction1((t0: E) => value(t0).runNow()))
    
    inline def setNext(value: T => Callback): Self = StObject.set(x, "next", js.Any.fromFunction1((t0: T) => value(t0).runNow()))
  }
}
