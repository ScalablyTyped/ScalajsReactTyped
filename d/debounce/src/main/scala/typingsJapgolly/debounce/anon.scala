package typingsJapgolly.debounce

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Clear extends StObject {
    
    def clear(): Unit
    
    def flush(): Unit
  }
  object Clear {
    
    inline def apply(clear: Callback, flush: Callback): Clear = {
      val __obj = js.Dynamic.literal(clear = clear.toJsFn, flush = flush.toJsFn)
      __obj.asInstanceOf[Clear]
    }
    
    extension [Self <: Clear](x: Self) {
      
      inline def setClear(value: Callback): Self = StObject.set(x, "clear", value.toJsFn)
      
      inline def setFlush(value: Callback): Self = StObject.set(x, "flush", value.toJsFn)
    }
  }
}
