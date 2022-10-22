package typingsJapgolly.wordpressPriorityQueue

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@wordpress/priority-queue", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createQueue(): WPPriorityQueue = ^.asInstanceOf[js.Dynamic].applyDynamic("createQueue")().asInstanceOf[WPPriorityQueue]
  
  trait WPPriorityQueue extends StObject {
    
    /**
      * Add callback to queue for context.
      */
    def add(element: WPPriorityQueueContext, item: WPPriorityQueueCallback): Unit
    /**
      * Add callback to queue for context.
      */
    @JSName("add")
    var add_Original: WPPriorityQueueAdd
    
    /**
      * Clear queue for context.
      */
    def cancel(element: WPPriorityQueueContext): Boolean
    /**
      * Clear queue for context.
      */
    @JSName("cancel")
    var cancel_Original: WPPriorityQueueFlush
    
    /**
      * Flush queue for context.
      */
    def flush(element: WPPriorityQueueContext): Boolean
    /**
      * Flush queue for context.
      */
    @JSName("flush")
    var flush_Original: WPPriorityQueueFlush
    
    /**
      * Reset queue.
      */
    def reset(): Unit
    /**
      * Reset queue.
      */
    @JSName("reset")
    var reset_Original: WPPriorityQueueReset
  }
  object WPPriorityQueue {
    
    inline def apply(
      add: (/* element */ WPPriorityQueueContext, /* item */ WPPriorityQueueCallback) => Callback,
      cancel: /* element */ WPPriorityQueueContext => Boolean,
      flush: /* element */ WPPriorityQueueContext => Boolean,
      reset: Callback
    ): WPPriorityQueue = {
      val __obj = js.Dynamic.literal(add = js.Any.fromFunction2((t0: /* element */ WPPriorityQueueContext, t1: /* item */ WPPriorityQueueCallback) => (add(t0, t1)).runNow()), cancel = js.Any.fromFunction1(cancel), flush = js.Any.fromFunction1(flush), reset = reset.toJsFn)
      __obj.asInstanceOf[WPPriorityQueue]
    }
    
    extension [Self <: WPPriorityQueue](x: Self) {
      
      inline def setAdd(value: (/* element */ WPPriorityQueueContext, /* item */ WPPriorityQueueCallback) => Callback): Self = StObject.set(x, "add", js.Any.fromFunction2((t0: /* element */ WPPriorityQueueContext, t1: /* item */ WPPriorityQueueCallback) => (value(t0, t1)).runNow()))
      
      inline def setCancel(value: /* element */ WPPriorityQueueContext => Boolean): Self = StObject.set(x, "cancel", js.Any.fromFunction1(value))
      
      inline def setFlush(value: /* element */ WPPriorityQueueContext => Boolean): Self = StObject.set(x, "flush", js.Any.fromFunction1(value))
      
      inline def setReset(value: Callback): Self = StObject.set(x, "reset", value.toJsFn)
    }
  }
  
  type WPPriorityQueueAdd = js.Function2[/* element */ WPPriorityQueueContext, /* item */ WPPriorityQueueCallback, Unit]
  
  type WPPriorityQueueCallback = js.Function0[Unit]
  
  type WPPriorityQueueContext = js.Object
  
  type WPPriorityQueueFlush = js.Function1[/* element */ WPPriorityQueueContext, Boolean]
  
  type WPPriorityQueueReset = js.Function0[Unit]
}
