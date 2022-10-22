package typingsJapgolly.rotJs

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSchedulerSchedulerMod {
  
  @JSImport("rot-js/lib/scheduler/scheduler", JSImport.Default)
  @js.native
  /**
    * @class Abstract scheduler
    */
  open class default[T] ()
    extends StObject
       with Scheduler[T] {
    
    /* CompleteClass */
    var _current: Any = js.native
    
    /* CompleteClass */
    var _queue: typingsJapgolly.rotJs.libEventqueueMod.default[T] = js.native
    
    /* CompleteClass */
    var _repeat: js.Array[T] = js.native
    
    /**
      * @param {?} item
      * @param {bool} repeat
      */
    /* CompleteClass */
    override def add(item: T, repeat: Boolean): this.type = js.native
    
    /**
      * Clear all items
      */
    /* CompleteClass */
    override def clear(): this.type = js.native
    
    /**
      * @see ROT.EventQueue#getTime
      */
    /* CompleteClass */
    override def getTime(): Double = js.native
    
    /**
      * Get the time the given item is scheduled for
      * @param {?} item
      * @returns {number} time
      */
    /* CompleteClass */
    override def getTimeOf(item: T): js.UndefOr[Double] = js.native
    
    /**
      * Schedule next item
      * @returns {?}
      */
    /* CompleteClass */
    override def next(): Any = js.native
    
    /**
      * Remove a previously added item
      * @param {?} item
      * @returns {bool} successful?
      */
    /* CompleteClass */
    override def remove(item: Any): Boolean = js.native
  }
  
  trait Scheduler[T] extends StObject {
    
    var _current: Any
    
    var _queue: typingsJapgolly.rotJs.libEventqueueMod.default[T]
    
    var _repeat: js.Array[T]
    
    /**
      * @param {?} item
      * @param {bool} repeat
      */
    def add(item: T, repeat: Boolean): this.type
    
    /**
      * Clear all items
      */
    def clear(): this.type
    
    /**
      * @see ROT.EventQueue#getTime
      */
    def getTime(): Double
    
    /**
      * Get the time the given item is scheduled for
      * @param {?} item
      * @returns {number} time
      */
    def getTimeOf(item: T): js.UndefOr[Double]
    
    /**
      * Schedule next item
      * @returns {?}
      */
    def next(): Any
    
    /**
      * Remove a previously added item
      * @param {?} item
      * @returns {bool} successful?
      */
    def remove(item: Any): Boolean
  }
  object Scheduler {
    
    inline def apply[T](
      _current: Any,
      _queue: typingsJapgolly.rotJs.libEventqueueMod.default[T],
      _repeat: js.Array[T],
      add: (T, Boolean) => Scheduler[T],
      clear: CallbackTo[Scheduler[T]],
      getTime: CallbackTo[Double],
      getTimeOf: T => js.UndefOr[Double],
      next: CallbackTo[Any],
      remove: Any => Boolean
    ): Scheduler[T] = {
      val __obj = js.Dynamic.literal(_current = _current.asInstanceOf[js.Any], _queue = _queue.asInstanceOf[js.Any], _repeat = _repeat.asInstanceOf[js.Any], add = js.Any.fromFunction2(add), clear = clear.toJsFn, getTime = getTime.toJsFn, getTimeOf = js.Any.fromFunction1(getTimeOf), next = next.toJsFn, remove = js.Any.fromFunction1(remove))
      __obj.asInstanceOf[Scheduler[T]]
    }
    
    extension [Self <: Scheduler[?], T](x: Self & Scheduler[T]) {
      
      inline def setAdd(value: (T, Boolean) => Scheduler[T]): Self = StObject.set(x, "add", js.Any.fromFunction2(value))
      
      inline def setClear(value: CallbackTo[Scheduler[T]]): Self = StObject.set(x, "clear", value.toJsFn)
      
      inline def setGetTime(value: CallbackTo[Double]): Self = StObject.set(x, "getTime", value.toJsFn)
      
      inline def setGetTimeOf(value: T => js.UndefOr[Double]): Self = StObject.set(x, "getTimeOf", js.Any.fromFunction1(value))
      
      inline def setNext(value: CallbackTo[Any]): Self = StObject.set(x, "next", value.toJsFn)
      
      inline def setRemove(value: Any => Boolean): Self = StObject.set(x, "remove", js.Any.fromFunction1(value))
      
      inline def set_current(value: Any): Self = StObject.set(x, "_current", value.asInstanceOf[js.Any])
      
      inline def set_queue(value: typingsJapgolly.rotJs.libEventqueueMod.default[T]): Self = StObject.set(x, "_queue", value.asInstanceOf[js.Any])
      
      inline def set_repeat(value: js.Array[T]): Self = StObject.set(x, "_repeat", value.asInstanceOf[js.Any])
      
      inline def set_repeatVarargs(value: T*): Self = StObject.set(x, "_repeat", js.Array(value*))
    }
  }
}
