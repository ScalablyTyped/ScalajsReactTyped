package typingsJapgolly.fbjs

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libHeapMod {
  
  @JSImport("fbjs/lib/Heap", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with Heap {
    def this(items: js.Array[Any]) = this()
    def this(items: js.Array[Any], comparator: js.Function2[/* a */ Any, /* b */ Any, Boolean]) = this()
    def this(items: Unit, comparator: js.Function2[/* a */ Any, /* b */ Any, Boolean]) = this()
    
    /* CompleteClass */
    override def _bubbleUp(index: Double): Unit = js.native
    
    /* CompleteClass */
    override def _heapify(): Unit = js.native
    
    /* CompleteClass */
    override def _sinkDown(index: Double): Unit = js.native
    
    /* CompleteClass */
    override def empty(): Boolean = js.native
    
    /* CompleteClass */
    override def peek(): Any = js.native
    
    /* CompleteClass */
    override def pop(): Any = js.native
    
    /* CompleteClass */
    override def push(item: Any): Unit = js.native
    
    /* CompleteClass */
    override def size(): Double = js.native
  }
  
  trait Heap extends StObject {
    
    def _bubbleUp(index: Double): Unit
    
    def _heapify(): Unit
    
    def _sinkDown(index: Double): Unit
    
    def empty(): Boolean
    
    def peek(): Any
    
    def pop(): Any
    
    def push(item: Any): Unit
    
    def size(): Double
  }
  object Heap {
    
    inline def apply(
      _bubbleUp: Double => Callback,
      _heapify: Callback,
      _sinkDown: Double => Callback,
      empty: CallbackTo[Boolean],
      peek: CallbackTo[Any],
      pop: CallbackTo[Any],
      push: Any => Callback,
      size: CallbackTo[Double]
    ): Heap = {
      val __obj = js.Dynamic.literal(_bubbleUp = js.Any.fromFunction1((t0: Double) => _bubbleUp(t0).runNow()), _heapify = _heapify.toJsFn, _sinkDown = js.Any.fromFunction1((t0: Double) => _sinkDown(t0).runNow()), empty = empty.toJsFn, peek = peek.toJsFn, pop = pop.toJsFn, push = js.Any.fromFunction1((t0: Any) => push(t0).runNow()), size = size.toJsFn)
      __obj.asInstanceOf[Heap]
    }
    
    extension [Self <: Heap](x: Self) {
      
      inline def setEmpty(value: CallbackTo[Boolean]): Self = StObject.set(x, "empty", value.toJsFn)
      
      inline def setPeek(value: CallbackTo[Any]): Self = StObject.set(x, "peek", value.toJsFn)
      
      inline def setPop(value: CallbackTo[Any]): Self = StObject.set(x, "pop", value.toJsFn)
      
      inline def setPush(value: Any => Callback): Self = StObject.set(x, "push", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
      
      inline def setSize(value: CallbackTo[Double]): Self = StObject.set(x, "size", value.toJsFn)
      
      inline def set_bubbleUp(value: Double => Callback): Self = StObject.set(x, "_bubbleUp", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
      
      inline def set_heapify(value: Callback): Self = StObject.set(x, "_heapify", value.toJsFn)
      
      inline def set_sinkDown(value: Double => Callback): Self = StObject.set(x, "_sinkDown", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    }
  }
}
