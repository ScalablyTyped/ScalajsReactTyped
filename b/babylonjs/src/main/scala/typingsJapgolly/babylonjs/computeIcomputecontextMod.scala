package typingsJapgolly.babylonjs

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object computeIcomputecontextMod {
  
  trait IComputeContext extends StObject {
    
    def clear(): Unit
  }
  object IComputeContext {
    
    inline def apply(clear: Callback): IComputeContext = {
      val __obj = js.Dynamic.literal(clear = clear.toJsFn)
      __obj.asInstanceOf[IComputeContext]
    }
    
    extension [Self <: IComputeContext](x: Self) {
      
      inline def setClear(value: Callback): Self = StObject.set(x, "clear", value.toJsFn)
    }
  }
}
