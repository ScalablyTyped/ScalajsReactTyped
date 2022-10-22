package typingsJapgolly.jsGraphAlgorithms.JsGraphs

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Queue[T] extends StObject {
  
  /* private */ var N: Any
  
  def dequeue(): js.UndefOr[T]
  
  def enqueue(item: T): Unit
  
  /* private */ var first: Any
  
  def isEmpty(): Boolean
  
  /* private */ var last: Any
  
  def size(): Double
  
  def toArray(): js.Array[T]
}
object Queue {
  
  inline def apply[T](
    N: Any,
    dequeue: CallbackTo[js.UndefOr[T]],
    enqueue: T => Callback,
    first: Any,
    isEmpty: CallbackTo[Boolean],
    last: Any,
    size: CallbackTo[Double],
    toArray: CallbackTo[js.Array[T]]
  ): Queue[T] = {
    val __obj = js.Dynamic.literal(N = N.asInstanceOf[js.Any], dequeue = dequeue.toJsFn, enqueue = js.Any.fromFunction1((t0: T) => enqueue(t0).runNow()), first = first.asInstanceOf[js.Any], isEmpty = isEmpty.toJsFn, last = last.asInstanceOf[js.Any], size = size.toJsFn, toArray = toArray.toJsFn)
    __obj.asInstanceOf[Queue[T]]
  }
  
  extension [Self <: Queue[?], T](x: Self & Queue[T]) {
    
    inline def setDequeue(value: CallbackTo[js.UndefOr[T]]): Self = StObject.set(x, "dequeue", value.toJsFn)
    
    inline def setEnqueue(value: T => Callback): Self = StObject.set(x, "enqueue", js.Any.fromFunction1((t0: T) => value(t0).runNow()))
    
    inline def setFirst(value: Any): Self = StObject.set(x, "first", value.asInstanceOf[js.Any])
    
    inline def setIsEmpty(value: CallbackTo[Boolean]): Self = StObject.set(x, "isEmpty", value.toJsFn)
    
    inline def setLast(value: Any): Self = StObject.set(x, "last", value.asInstanceOf[js.Any])
    
    inline def setN(value: Any): Self = StObject.set(x, "N", value.asInstanceOf[js.Any])
    
    inline def setSize(value: CallbackTo[Double]): Self = StObject.set(x, "size", value.toJsFn)
    
    inline def setToArray(value: CallbackTo[js.Array[T]]): Self = StObject.set(x, "toArray", value.toJsFn)
  }
}
