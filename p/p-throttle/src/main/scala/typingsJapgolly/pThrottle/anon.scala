package typingsJapgolly.pThrottle

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Abort extends StObject {
    
    /**
    		Abort pending executions. All unresolved promises are rejected with a `pThrottle.AbortError` error.
    		*/
    def abort(): Unit
    
    /**
    		Whether future function calls should be throttled or count towards throttling thresholds.
    		@default true
    		*/
    var isEnabled: Boolean
  }
  object Abort {
    
    inline def apply(abort: Callback, isEnabled: Boolean): Abort = {
      val __obj = js.Dynamic.literal(abort = abort.toJsFn, isEnabled = isEnabled.asInstanceOf[js.Any])
      __obj.asInstanceOf[Abort]
    }
    
    extension [Self <: Abort](x: Self) {
      
      inline def setAbort(value: Callback): Self = StObject.set(x, "abort", value.toJsFn)
      
      inline def setIsEnabled(value: Boolean): Self = StObject.set(x, "isEnabled", value.asInstanceOf[js.Any])
    }
  }
}
