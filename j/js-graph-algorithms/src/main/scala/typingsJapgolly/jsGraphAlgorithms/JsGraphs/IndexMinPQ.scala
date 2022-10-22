package typingsJapgolly.jsGraphAlgorithms.JsGraphs

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndexMinPQ[T] extends StObject {
  
  /* private */ var N: Any
  
  /* private */ var compare: Any
  
  def containsIndex(index: Double): Boolean
  
  def decreaseKey(index: Double, key: T): Unit
  
  def delMin(): Double
  
  def insert(index: Double, key: T): Unit
  
  def isEmpty(): Boolean
  
  /* private */ var keys: Any
  
  def min(): Double
  
  def minKey(): T | Null
  
  /* private */ var pq: Any
  
  /* private */ var qp: Any
  
  def sink(k: Double): Unit
  
  def size(): Double
  
  def swim(k: Double): Unit
}
object IndexMinPQ {
  
  inline def apply[T](
    N: Any,
    compare: Any,
    containsIndex: Double => Boolean,
    decreaseKey: (Double, T) => Callback,
    delMin: CallbackTo[Double],
    insert: (Double, T) => Callback,
    isEmpty: CallbackTo[Boolean],
    keys: Any,
    min: CallbackTo[Double],
    minKey: CallbackTo[T | Null],
    pq: Any,
    qp: Any,
    sink: Double => Callback,
    size: CallbackTo[Double],
    swim: Double => Callback
  ): IndexMinPQ[T] = {
    val __obj = js.Dynamic.literal(N = N.asInstanceOf[js.Any], compare = compare.asInstanceOf[js.Any], containsIndex = js.Any.fromFunction1(containsIndex), decreaseKey = js.Any.fromFunction2((t0: Double, t1: T) => (decreaseKey(t0, t1)).runNow()), delMin = delMin.toJsFn, insert = js.Any.fromFunction2((t0: Double, t1: T) => (insert(t0, t1)).runNow()), isEmpty = isEmpty.toJsFn, keys = keys.asInstanceOf[js.Any], min = min.toJsFn, minKey = minKey.toJsFn, pq = pq.asInstanceOf[js.Any], qp = qp.asInstanceOf[js.Any], sink = js.Any.fromFunction1((t0: Double) => sink(t0).runNow()), size = size.toJsFn, swim = js.Any.fromFunction1((t0: Double) => swim(t0).runNow()))
    __obj.asInstanceOf[IndexMinPQ[T]]
  }
  
  extension [Self <: IndexMinPQ[?], T](x: Self & IndexMinPQ[T]) {
    
    inline def setCompare(value: Any): Self = StObject.set(x, "compare", value.asInstanceOf[js.Any])
    
    inline def setContainsIndex(value: Double => Boolean): Self = StObject.set(x, "containsIndex", js.Any.fromFunction1(value))
    
    inline def setDecreaseKey(value: (Double, T) => Callback): Self = StObject.set(x, "decreaseKey", js.Any.fromFunction2((t0: Double, t1: T) => (value(t0, t1)).runNow()))
    
    inline def setDelMin(value: CallbackTo[Double]): Self = StObject.set(x, "delMin", value.toJsFn)
    
    inline def setInsert(value: (Double, T) => Callback): Self = StObject.set(x, "insert", js.Any.fromFunction2((t0: Double, t1: T) => (value(t0, t1)).runNow()))
    
    inline def setIsEmpty(value: CallbackTo[Boolean]): Self = StObject.set(x, "isEmpty", value.toJsFn)
    
    inline def setKeys(value: Any): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
    
    inline def setMin(value: CallbackTo[Double]): Self = StObject.set(x, "min", value.toJsFn)
    
    inline def setMinKey(value: CallbackTo[T | Null]): Self = StObject.set(x, "minKey", value.toJsFn)
    
    inline def setN(value: Any): Self = StObject.set(x, "N", value.asInstanceOf[js.Any])
    
    inline def setPq(value: Any): Self = StObject.set(x, "pq", value.asInstanceOf[js.Any])
    
    inline def setQp(value: Any): Self = StObject.set(x, "qp", value.asInstanceOf[js.Any])
    
    inline def setSink(value: Double => Callback): Self = StObject.set(x, "sink", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSize(value: CallbackTo[Double]): Self = StObject.set(x, "size", value.toJsFn)
    
    inline def setSwim(value: Double => Callback): Self = StObject.set(x, "swim", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
  }
}
