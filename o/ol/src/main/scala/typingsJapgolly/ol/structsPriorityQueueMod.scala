package typingsJapgolly.ol

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object structsPriorityQueueMod {
  
  @JSImport("ol/structs/PriorityQueue", JSImport.Default)
  @js.native
  open class default[T] protected ()
    extends StObject
       with PriorityQueue[T] {
    def this(priorityFunction: js.Function1[/* p0 */ T, Double], keyFunction: js.Function1[/* p0 */ T, String]) = this()
    
    /**
      * FIXME empty description for jsdoc
      */
    /* CompleteClass */
    override def clear(): Unit = js.native
    
    /**
      * Remove and return the highest-priority element. O(log N).
      */
    /* CompleteClass */
    override def dequeue(): T = js.native
    
    /**
      * Enqueue an element. O(log N).
      */
    /* CompleteClass */
    override def enqueue(element: T): Boolean = js.native
    
    /* CompleteClass */
    override def getCount(): Double = js.native
    
    /* CompleteClass */
    override def isEmpty(): Boolean = js.native
    
    /* CompleteClass */
    override def isKeyQueued(key: String): Boolean = js.native
    
    /* CompleteClass */
    override def isQueued(element: T): Boolean = js.native
    
    /**
      * FIXME empty description for jsdoc
      */
    /* CompleteClass */
    override def reprioritize(): Unit = js.native
  }
  
  @JSImport("ol/structs/PriorityQueue", "DROP")
  @js.native
  val DROP: Double = js.native
  
  trait PriorityQueue[T] extends StObject {
    
    /**
      * FIXME empty description for jsdoc
      */
    def clear(): Unit
    
    /**
      * Remove and return the highest-priority element. O(log N).
      */
    def dequeue(): T
    
    /**
      * Enqueue an element. O(log N).
      */
    def enqueue(element: T): Boolean
    
    def getCount(): Double
    
    def isEmpty(): Boolean
    
    def isKeyQueued(key: String): Boolean
    
    def isQueued(element: T): Boolean
    
    /**
      * FIXME empty description for jsdoc
      */
    def reprioritize(): Unit
  }
  object PriorityQueue {
    
    inline def apply[T](
      clear: Callback,
      dequeue: CallbackTo[T],
      enqueue: T => Boolean,
      getCount: CallbackTo[Double],
      isEmpty: CallbackTo[Boolean],
      isKeyQueued: String => Boolean,
      isQueued: T => Boolean,
      reprioritize: Callback
    ): PriorityQueue[T] = {
      val __obj = js.Dynamic.literal(clear = clear.toJsFn, dequeue = dequeue.toJsFn, enqueue = js.Any.fromFunction1(enqueue), getCount = getCount.toJsFn, isEmpty = isEmpty.toJsFn, isKeyQueued = js.Any.fromFunction1(isKeyQueued), isQueued = js.Any.fromFunction1(isQueued), reprioritize = reprioritize.toJsFn)
      __obj.asInstanceOf[PriorityQueue[T]]
    }
    
    extension [Self <: PriorityQueue[?], T](x: Self & PriorityQueue[T]) {
      
      inline def setClear(value: Callback): Self = StObject.set(x, "clear", value.toJsFn)
      
      inline def setDequeue(value: CallbackTo[T]): Self = StObject.set(x, "dequeue", value.toJsFn)
      
      inline def setEnqueue(value: T => Boolean): Self = StObject.set(x, "enqueue", js.Any.fromFunction1(value))
      
      inline def setGetCount(value: CallbackTo[Double]): Self = StObject.set(x, "getCount", value.toJsFn)
      
      inline def setIsEmpty(value: CallbackTo[Boolean]): Self = StObject.set(x, "isEmpty", value.toJsFn)
      
      inline def setIsKeyQueued(value: String => Boolean): Self = StObject.set(x, "isKeyQueued", js.Any.fromFunction1(value))
      
      inline def setIsQueued(value: T => Boolean): Self = StObject.set(x, "isQueued", js.Any.fromFunction1(value))
      
      inline def setReprioritize(value: Callback): Self = StObject.set(x, "reprioritize", value.toJsFn)
    }
  }
}
