package typingsJapgolly.zipkin.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Context[T] extends StObject {
  
  def getContext(): T
  
  def letContext[V](ctx: T, callback: js.Function0[V]): V
  
  def scoped[V](callback: js.Function0[V]): V
  
  def setContext(ctx: T): Unit
}
object Context {
  
  inline def apply[T](
    getContext: CallbackTo[T],
    letContext: (T, js.Function0[Any]) => Any,
    scoped: js.Function0[Any] => Any,
    setContext: T => Callback
  ): Context[T] = {
    val __obj = js.Dynamic.literal(getContext = getContext.toJsFn, letContext = js.Any.fromFunction2(letContext), scoped = js.Any.fromFunction1(scoped), setContext = js.Any.fromFunction1((t0: T) => setContext(t0).runNow()))
    __obj.asInstanceOf[Context[T]]
  }
  
  extension [Self <: Context[?], T](x: Self & Context[T]) {
    
    inline def setGetContext(value: CallbackTo[T]): Self = StObject.set(x, "getContext", value.toJsFn)
    
    inline def setLetContext(value: (T, js.Function0[Any]) => Any): Self = StObject.set(x, "letContext", js.Any.fromFunction2(value))
    
    inline def setScoped(value: js.Function0[Any] => Any): Self = StObject.set(x, "scoped", js.Any.fromFunction1(value))
    
    inline def setSetContext(value: T => Callback): Self = StObject.set(x, "setContext", js.Any.fromFunction1((t0: T) => value(t0).runNow()))
  }
}
