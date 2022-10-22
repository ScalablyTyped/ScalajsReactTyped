package typingsJapgolly.braintree.anon

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Between[T] extends StObject {
  
  /** Inclusive */
  def between(lowerBound: T, upperBoundIncl: T): Unit
  
  def is(input: T): Unit
  
  def max(maximum: T): Unit
  
  def min(minimum: T): Unit
}
object Between {
  
  inline def apply[T](between: (T, T) => Callback, is: T => Callback, max: T => Callback, min: T => Callback): Between[T] = {
    val __obj = js.Dynamic.literal(between = js.Any.fromFunction2((t0: T, t1: T) => (between(t0, t1)).runNow()), is = js.Any.fromFunction1((t0: T) => is(t0).runNow()), max = js.Any.fromFunction1((t0: T) => max(t0).runNow()), min = js.Any.fromFunction1((t0: T) => min(t0).runNow()))
    __obj.asInstanceOf[Between[T]]
  }
  
  extension [Self <: Between[?], T](x: Self & Between[T]) {
    
    inline def setBetween(value: (T, T) => Callback): Self = StObject.set(x, "between", js.Any.fromFunction2((t0: T, t1: T) => (value(t0, t1)).runNow()))
    
    inline def setIs(value: T => Callback): Self = StObject.set(x, "is", js.Any.fromFunction1((t0: T) => value(t0).runNow()))
    
    inline def setMax(value: T => Callback): Self = StObject.set(x, "max", js.Any.fromFunction1((t0: T) => value(t0).runNow()))
    
    inline def setMin(value: T => Callback): Self = StObject.set(x, "min", js.Any.fromFunction1((t0: T) => value(t0).runNow()))
  }
}
