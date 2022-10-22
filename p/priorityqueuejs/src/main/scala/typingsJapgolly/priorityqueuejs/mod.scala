package typingsJapgolly.priorityqueuejs

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("priorityqueuejs", JSImport.Namespace)
  @js.native
  /**
    * Initializes a new empty PriorityQueue wich uses .DEFAULT_COMPARATOR() as the comparator function for its elements.
    */
  open class ^[T] ()
    extends StObject
       with PriorityQueue[T] {
    /**
      * Initializes a new empty PriorityQueue with uses the given comparator(a, b) function as the comparator for its elements.
      * The comparator function must return a positive number when a > b, 0 when a == b and a negative number when a < b.
      */
    def this(comparator: Comparator[T]) = this()
    
    /**
      * Dequeues the top element of the priority queue.
      * Throws an Error when the queue is empty.
      */
    /* CompleteClass */
    override def deq(): T = js.native
    
    /**
      * Enqueues the element at the priority queue and returns its new size.
      * @param element The element to add
      */
    /* CompleteClass */
    override def enq(element: T): Double = js.native
    
    /**
      * Executes fn on each element.
      * Just be careful to not modify the priorities, since the queue won't reorder itself.
      * @param fn The value to pass to an Array.forEach call
      */
    /* CompleteClass */
    override def forEach(fn: js.Function3[T, /* index */ Double, /* array */ js.Array[T], Unit]): Unit = js.native
    
    /**
      * Returns whether the priority queue is empty or not.
      */
    /* CompleteClass */
    override def isEmpty(): Boolean = js.native
    
    /**
      * Peeks at the top element of the priority queue.
      * Throws an Error when the queue is empty.
      */
    /* CompleteClass */
    override def peek(): T = js.native
    
    /**
      * Returns the size of the priority queue.
      */
    /* CompleteClass */
    override def size(): Double = js.native
  }
  @JSImport("priorityqueuejs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Compares two Number or String objects.
    */
  /* static member */
  @JSImport("priorityqueuejs", "DEFAULT_COMPARATOR")
  @js.native
  def DEFAULT_COMPARATOR: Comparator[Double | String] = js.native
  inline def DEFAULT_COMPARATOR_=(x: Comparator[Double | String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_COMPARATOR")(x.asInstanceOf[js.Any])
  
  type Comparator[T] = js.Function2[/* a */ T, /* b */ T, Double]
  
  trait PriorityQueue[T] extends StObject {
    
    /**
      * Dequeues the top element of the priority queue.
      * Throws an Error when the queue is empty.
      */
    def deq(): T
    
    /**
      * Enqueues the element at the priority queue and returns its new size.
      * @param element The element to add
      */
    def enq(element: T): Double
    
    /**
      * Executes fn on each element.
      * Just be careful to not modify the priorities, since the queue won't reorder itself.
      * @param fn The value to pass to an Array.forEach call
      */
    def forEach(fn: js.Function3[/* value */ T, /* index */ Double, /* array */ js.Array[T], Unit]): Unit
    
    /**
      * Returns whether the priority queue is empty or not.
      */
    def isEmpty(): Boolean
    
    /**
      * Peeks at the top element of the priority queue.
      * Throws an Error when the queue is empty.
      */
    def peek(): T
    
    /**
      * Returns the size of the priority queue.
      */
    def size(): Double
  }
  object PriorityQueue {
    
    inline def apply[T](
      deq: CallbackTo[T],
      enq: T => Double,
      forEach: js.Function3[/* value */ T, /* index */ Double, /* array */ js.Array[T], Unit] => Callback,
      isEmpty: CallbackTo[Boolean],
      peek: CallbackTo[T],
      size: CallbackTo[Double]
    ): PriorityQueue[T] = {
      val __obj = js.Dynamic.literal(deq = deq.toJsFn, enq = js.Any.fromFunction1(enq), forEach = js.Any.fromFunction1((t0: js.Function3[/* value */ T, /* index */ Double, /* array */ js.Array[T], Unit]) => forEach(t0).runNow()), isEmpty = isEmpty.toJsFn, peek = peek.toJsFn, size = size.toJsFn)
      __obj.asInstanceOf[PriorityQueue[T]]
    }
    
    extension [Self <: PriorityQueue[?], T](x: Self & PriorityQueue[T]) {
      
      inline def setDeq(value: CallbackTo[T]): Self = StObject.set(x, "deq", value.toJsFn)
      
      inline def setEnq(value: T => Double): Self = StObject.set(x, "enq", js.Any.fromFunction1(value))
      
      inline def setForEach(value: js.Function3[/* value */ T, /* index */ Double, /* array */ js.Array[T], Unit] => Callback): Self = StObject.set(x, "forEach", js.Any.fromFunction1((t0: js.Function3[/* value */ T, /* index */ Double, /* array */ js.Array[T], Unit]) => value(t0).runNow()))
      
      inline def setIsEmpty(value: CallbackTo[Boolean]): Self = StObject.set(x, "isEmpty", value.toJsFn)
      
      inline def setPeek(value: CallbackTo[T]): Self = StObject.set(x, "peek", value.toJsFn)
      
      inline def setSize(value: CallbackTo[Double]): Self = StObject.set(x, "size", value.toJsFn)
    }
  }
}
