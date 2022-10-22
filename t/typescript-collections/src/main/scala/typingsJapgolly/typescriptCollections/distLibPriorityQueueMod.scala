package typingsJapgolly.typescriptCollections

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.typescriptCollections.distLibUtilMod.ICompareFunction
import typingsJapgolly.typescriptCollections.distLibUtilMod.ILoopFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibPriorityQueueMod {
  
  @JSImport("typescript-collections/dist/lib/PriorityQueue", JSImport.Default)
  @js.native
  /**
    * Creates an empty priority queue.
    * @class <p>In a priority queue each element is associated with a "priority",
    * elements are dequeued in highest-priority-first order (the elements with the
    * highest priority are dequeued first). Priority Queues are implemented as heaps.
    * If the inserted elements are custom objects a compare function must be provided,
    * otherwise the <=, === and >= operators are used to compare object priority.</p>
    * <pre>
    * function compare(a, b) {
    *  if (a is less than b by some ordering criterion) {
    *     return -1;
    *  } if (a is greater than b by the ordering criterion) {
    *     return 1;
    *  }
    *  // a must be equal to b
    *  return 0;
    * }
    * </pre>
    * @constructor
    * @param {function(Object,Object):number=} compareFunction optional
    * function used to compare two element priorities. Must return a negative integer,
    * zero, or a positive integer as the first argument is less than, equal to,
    * or greater than the second.
    */
  open class default[T] ()
    extends StObject
       with PriorityQueue[T] {
    def this(compareFunction: ICompareFunction[T]) = this()
    
    /**
      * Inserts the specified element into this priority queue.
      * @param {Object} element the element to insert.
      * @return {boolean} true if the element was inserted, or false if it is undefined.
      */
    /* CompleteClass */
    override def add(element: T): Boolean = js.native
    
    /**
      * Removes all of the elements from this priority queue.
      */
    /* CompleteClass */
    override def clear(): Unit = js.native
    
    /**
      * Returns true if this priority queue contains the specified element.
      * @param {Object} element element to search for.
      * @return {boolean} true if this priority queue contains the specified element,
      * false otherwise.
      */
    /* CompleteClass */
    override def contains(element: T): Boolean = js.native
    
    /**
      * Retrieves and removes the highest priority element of this queue.
      * @return {*} the the highest priority element of this queue,
      *  or undefined if this queue is empty.
      */
    /* CompleteClass */
    override def dequeue(): js.UndefOr[T] = js.native
    
    /**
      * Inserts the specified element into this priority queue.
      * @param {Object} element the element to insert.
      * @return {boolean} true if the element was inserted, or false if it is undefined.
      */
    /* CompleteClass */
    override def enqueue(element: T): Boolean = js.native
    
    /**
      * Executes the provided function once for each element present in this queue in
      * no particular order.
      * @param {function(Object):*} callback function to execute, it is
      * invoked with one argument: the element value, to break the iteration you can
      * optionally return false.
      */
    /* CompleteClass */
    override def forEach(callback: ILoopFunction[T]): Unit = js.native
    
    /* private */ /* CompleteClass */
    var heap: Any = js.native
    
    /**
      * Checks if this priority queue is empty.
      * @return {boolean} true if and only if this priority queue contains no items; false
      * otherwise.
      */
    /* CompleteClass */
    override def isEmpty(): Boolean = js.native
    
    /**
      * Retrieves, but does not remove, the highest priority element of this queue.
      * @return {*} the highest priority element of this queue, or undefined if this queue is empty.
      */
    /* CompleteClass */
    override def peek(): js.UndefOr[T] = js.native
    
    /**
      * Returns the number of elements in this priority queue.
      * @return {number} the number of elements in this priority queue.
      */
    /* CompleteClass */
    override def size(): Double = js.native
  }
  
  trait PriorityQueue[T] extends StObject {
    
    /**
      * Inserts the specified element into this priority queue.
      * @param {Object} element the element to insert.
      * @return {boolean} true if the element was inserted, or false if it is undefined.
      */
    def add(element: T): Boolean
    
    /**
      * Removes all of the elements from this priority queue.
      */
    def clear(): Unit
    
    /**
      * Returns true if this priority queue contains the specified element.
      * @param {Object} element element to search for.
      * @return {boolean} true if this priority queue contains the specified element,
      * false otherwise.
      */
    def contains(element: T): Boolean
    
    /**
      * Retrieves and removes the highest priority element of this queue.
      * @return {*} the the highest priority element of this queue,
      *  or undefined if this queue is empty.
      */
    def dequeue(): js.UndefOr[T]
    
    /**
      * Inserts the specified element into this priority queue.
      * @param {Object} element the element to insert.
      * @return {boolean} true if the element was inserted, or false if it is undefined.
      */
    def enqueue(element: T): Boolean
    
    /**
      * Executes the provided function once for each element present in this queue in
      * no particular order.
      * @param {function(Object):*} callback function to execute, it is
      * invoked with one argument: the element value, to break the iteration you can
      * optionally return false.
      */
    def forEach(callback: ILoopFunction[T]): Unit
    
    /* private */ var heap: Any
    
    /**
      * Checks if this priority queue is empty.
      * @return {boolean} true if and only if this priority queue contains no items; false
      * otherwise.
      */
    def isEmpty(): Boolean
    
    /**
      * Retrieves, but does not remove, the highest priority element of this queue.
      * @return {*} the highest priority element of this queue, or undefined if this queue is empty.
      */
    def peek(): js.UndefOr[T]
    
    /**
      * Returns the number of elements in this priority queue.
      * @return {number} the number of elements in this priority queue.
      */
    def size(): Double
  }
  object PriorityQueue {
    
    inline def apply[T](
      add: T => Boolean,
      clear: Callback,
      contains: T => Boolean,
      dequeue: CallbackTo[js.UndefOr[T]],
      enqueue: T => Boolean,
      forEach: ILoopFunction[T] => Callback,
      heap: Any,
      isEmpty: CallbackTo[Boolean],
      peek: CallbackTo[js.UndefOr[T]],
      size: CallbackTo[Double]
    ): PriorityQueue[T] = {
      val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), clear = clear.toJsFn, contains = js.Any.fromFunction1(contains), dequeue = dequeue.toJsFn, enqueue = js.Any.fromFunction1(enqueue), forEach = js.Any.fromFunction1((t0: ILoopFunction[T]) => forEach(t0).runNow()), heap = heap.asInstanceOf[js.Any], isEmpty = isEmpty.toJsFn, peek = peek.toJsFn, size = size.toJsFn)
      __obj.asInstanceOf[PriorityQueue[T]]
    }
    
    extension [Self <: PriorityQueue[?], T](x: Self & PriorityQueue[T]) {
      
      inline def setAdd(value: T => Boolean): Self = StObject.set(x, "add", js.Any.fromFunction1(value))
      
      inline def setClear(value: Callback): Self = StObject.set(x, "clear", value.toJsFn)
      
      inline def setContains(value: T => Boolean): Self = StObject.set(x, "contains", js.Any.fromFunction1(value))
      
      inline def setDequeue(value: CallbackTo[js.UndefOr[T]]): Self = StObject.set(x, "dequeue", value.toJsFn)
      
      inline def setEnqueue(value: T => Boolean): Self = StObject.set(x, "enqueue", js.Any.fromFunction1(value))
      
      inline def setForEach(value: ILoopFunction[T] => Callback): Self = StObject.set(x, "forEach", js.Any.fromFunction1((t0: ILoopFunction[T]) => value(t0).runNow()))
      
      inline def setHeap(value: Any): Self = StObject.set(x, "heap", value.asInstanceOf[js.Any])
      
      inline def setIsEmpty(value: CallbackTo[Boolean]): Self = StObject.set(x, "isEmpty", value.toJsFn)
      
      inline def setPeek(value: CallbackTo[js.UndefOr[T]]): Self = StObject.set(x, "peek", value.toJsFn)
      
      inline def setSize(value: CallbackTo[Double]): Self = StObject.set(x, "size", value.toJsFn)
    }
  }
}
