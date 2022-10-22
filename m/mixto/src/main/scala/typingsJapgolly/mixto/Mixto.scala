package typingsJapgolly.mixto

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Mixto {
  
  trait IMixinStatic extends StObject {
    
    def extend(`object`: Any): Unit
    
    def includeInto(constructor: Any): Unit
  }
  object IMixinStatic {
    
    inline def apply(extend: Any => Callback, includeInto: Any => Callback): IMixinStatic = {
      val __obj = js.Dynamic.literal(extend = js.Any.fromFunction1((t0: Any) => extend(t0).runNow()), includeInto = js.Any.fromFunction1((t0: Any) => includeInto(t0).runNow()))
      __obj.asInstanceOf[IMixinStatic]
    }
    
    extension [Self <: IMixinStatic](x: Self) {
      
      inline def setExtend(value: Any => Callback): Self = StObject.set(x, "extend", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
      
      inline def setIncludeInto(value: Any => Callback): Self = StObject.set(x, "includeInto", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    }
  }
}
