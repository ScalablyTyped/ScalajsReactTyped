package typingsJapgolly.ringbufferjs

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ringbufferjs", JSImport.Namespace)
  @js.native
  open class ^[T] protected ()
    extends StObject
       with RingBuffer[T] {
    def this(capacity: Double) = this()
    def this(capacity: Double, evictedCB: js.Function1[/* element */ T, Any]) = this()
    
    /* CompleteClass */
    var _elements: js.Array[T] = js.native
    
    /* CompleteClass */
    override def _evictedCb(element: T): Any = js.native
    
    /* CompleteClass */
    var _first: Double = js.native
    
    /* CompleteClass */
    var _last: Double = js.native
    
    /* CompleteClass */
    var _size: Double = js.native
    
    /* CompleteClass */
    override def capacity(): Double = js.native
    
    /* CompleteClass */
    override def deq(): T = js.native
    
    /* CompleteClass */
    override def deqN(count: Double): js.Array[T] = js.native
    
    /* CompleteClass */
    override def enq(element: T): Double = js.native
    
    /* CompleteClass */
    override def isEmpty(): Boolean = js.native
    
    /* CompleteClass */
    override def isFull(): Boolean = js.native
    
    /* CompleteClass */
    override def peek(): T = js.native
    
    /* CompleteClass */
    override def peekN(count: Double): js.Array[T] = js.native
    
    /* CompleteClass */
    override def size(): Double = js.native
  }
  
  trait RingBuffer[T] extends StObject {
    
    var _elements: js.Array[T]
    
    def _evictedCb(element: T): Any
    
    var _first: Double
    
    var _last: Double
    
    var _size: Double
    
    def capacity(): Double
    
    def deq(): T
    
    def deqN(count: Double): js.Array[T]
    
    def enq(element: T): Double
    
    def isEmpty(): Boolean
    
    def isFull(): Boolean
    
    def peek(): T
    
    def peekN(count: Double): js.Array[T]
    
    def size(): Double
  }
  object RingBuffer {
    
    inline def apply[T](
      _elements: js.Array[T],
      _evictedCb: T => Any,
      _first: Double,
      _last: Double,
      _size: Double,
      capacity: CallbackTo[Double],
      deq: CallbackTo[T],
      deqN: Double => js.Array[T],
      enq: T => Double,
      isEmpty: CallbackTo[Boolean],
      isFull: CallbackTo[Boolean],
      peek: CallbackTo[T],
      peekN: Double => js.Array[T],
      size: CallbackTo[Double]
    ): RingBuffer[T] = {
      val __obj = js.Dynamic.literal(_elements = _elements.asInstanceOf[js.Any], _evictedCb = js.Any.fromFunction1(_evictedCb), _first = _first.asInstanceOf[js.Any], _last = _last.asInstanceOf[js.Any], _size = _size.asInstanceOf[js.Any], capacity = capacity.toJsFn, deq = deq.toJsFn, deqN = js.Any.fromFunction1(deqN), enq = js.Any.fromFunction1(enq), isEmpty = isEmpty.toJsFn, isFull = isFull.toJsFn, peek = peek.toJsFn, peekN = js.Any.fromFunction1(peekN), size = size.toJsFn)
      __obj.asInstanceOf[RingBuffer[T]]
    }
    
    extension [Self <: RingBuffer[?], T](x: Self & RingBuffer[T]) {
      
      inline def setCapacity(value: CallbackTo[Double]): Self = StObject.set(x, "capacity", value.toJsFn)
      
      inline def setDeq(value: CallbackTo[T]): Self = StObject.set(x, "deq", value.toJsFn)
      
      inline def setDeqN(value: Double => js.Array[T]): Self = StObject.set(x, "deqN", js.Any.fromFunction1(value))
      
      inline def setEnq(value: T => Double): Self = StObject.set(x, "enq", js.Any.fromFunction1(value))
      
      inline def setIsEmpty(value: CallbackTo[Boolean]): Self = StObject.set(x, "isEmpty", value.toJsFn)
      
      inline def setIsFull(value: CallbackTo[Boolean]): Self = StObject.set(x, "isFull", value.toJsFn)
      
      inline def setPeek(value: CallbackTo[T]): Self = StObject.set(x, "peek", value.toJsFn)
      
      inline def setPeekN(value: Double => js.Array[T]): Self = StObject.set(x, "peekN", js.Any.fromFunction1(value))
      
      inline def setSize(value: CallbackTo[Double]): Self = StObject.set(x, "size", value.toJsFn)
      
      inline def set_elements(value: js.Array[T]): Self = StObject.set(x, "_elements", value.asInstanceOf[js.Any])
      
      inline def set_elementsVarargs(value: T*): Self = StObject.set(x, "_elements", js.Array(value*))
      
      inline def set_evictedCb(value: T => Any): Self = StObject.set(x, "_evictedCb", js.Any.fromFunction1(value))
      
      inline def set_first(value: Double): Self = StObject.set(x, "_first", value.asInstanceOf[js.Any])
      
      inline def set_last(value: Double): Self = StObject.set(x, "_last", value.asInstanceOf[js.Any])
      
      inline def set_size(value: Double): Self = StObject.set(x, "_size", value.asInstanceOf[js.Any])
    }
  }
}
