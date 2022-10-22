package typingsJapgolly.flushable

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(onComplete: FlushableOnCompleteHandler, delay: Double): FlushableOperation = (^.asInstanceOf[js.Dynamic].apply(onComplete.asInstanceOf[js.Any], delay.asInstanceOf[js.Any])).asInstanceOf[FlushableOperation]
  
  @JSImport("flushable", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type FlushableOnCompleteHandler = js.Function1[/* flushed */ Boolean, Any]
  
  trait FlushableOperation extends StObject {
    
    /** Stops the callback from being executed */
    def cancel(): Unit
    
    /** Immediately executes the callback */
    def flush(): Unit
    
    /** Returns whether or not the callback has been executed */
    def pending(): Boolean
  }
  object FlushableOperation {
    
    inline def apply(cancel: Callback, flush: Callback, pending: CallbackTo[Boolean]): FlushableOperation = {
      val __obj = js.Dynamic.literal(cancel = cancel.toJsFn, flush = flush.toJsFn, pending = pending.toJsFn)
      __obj.asInstanceOf[FlushableOperation]
    }
    
    extension [Self <: FlushableOperation](x: Self) {
      
      inline def setCancel(value: Callback): Self = StObject.set(x, "cancel", value.toJsFn)
      
      inline def setFlush(value: Callback): Self = StObject.set(x, "flush", value.toJsFn)
      
      inline def setPending(value: CallbackTo[Boolean]): Self = StObject.set(x, "pending", value.toJsFn)
    }
  }
}
