package typingsJapgolly.jsGraphAlgorithms.JsGraphs

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MinPQ[T] extends StObject {
  
  /* private */ var N: Any
  
  /* private */ var compare: Any
  
  def delMin(): js.UndefOr[T]
  
  def enqueue(item: T): Unit
  
  def isEmpty(): Boolean
  
  /* private */ var s: Any
  
  def sink(k: Double): Unit
  
  def size(): Double
  
  def swim(k: Double): Unit
}
object MinPQ {
  
  inline def apply[T](
    N: Any,
    compare: Any,
    delMin: CallbackTo[js.UndefOr[T]],
    enqueue: T => Callback,
    isEmpty: CallbackTo[Boolean],
    s: Any,
    sink: Double => Callback,
    size: CallbackTo[Double],
    swim: Double => Callback
  ): MinPQ[T] = {
    val __obj = js.Dynamic.literal(N = N.asInstanceOf[js.Any], compare = compare.asInstanceOf[js.Any], delMin = delMin.toJsFn, enqueue = js.Any.fromFunction1((t0: T) => enqueue(t0).runNow()), isEmpty = isEmpty.toJsFn, s = s.asInstanceOf[js.Any], sink = js.Any.fromFunction1((t0: Double) => sink(t0).runNow()), size = size.toJsFn, swim = js.Any.fromFunction1((t0: Double) => swim(t0).runNow()))
    __obj.asInstanceOf[MinPQ[T]]
  }
  
  extension [Self <: MinPQ[?], T](x: Self & MinPQ[T]) {
    
    inline def setCompare(value: Any): Self = StObject.set(x, "compare", value.asInstanceOf[js.Any])
    
    inline def setDelMin(value: CallbackTo[js.UndefOr[T]]): Self = StObject.set(x, "delMin", value.toJsFn)
    
    inline def setEnqueue(value: T => Callback): Self = StObject.set(x, "enqueue", js.Any.fromFunction1((t0: T) => value(t0).runNow()))
    
    inline def setIsEmpty(value: CallbackTo[Boolean]): Self = StObject.set(x, "isEmpty", value.toJsFn)
    
    inline def setN(value: Any): Self = StObject.set(x, "N", value.asInstanceOf[js.Any])
    
    inline def setS(value: Any): Self = StObject.set(x, "s", value.asInstanceOf[js.Any])
    
    inline def setSink(value: Double => Callback): Self = StObject.set(x, "sink", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSize(value: CallbackTo[Double]): Self = StObject.set(x, "size", value.toJsFn)
    
    inline def setSwim(value: Double => Callback): Self = StObject.set(x, "swim", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
  }
}
