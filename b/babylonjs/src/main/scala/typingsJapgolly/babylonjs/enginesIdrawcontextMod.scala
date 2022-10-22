package typingsJapgolly.babylonjs

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object enginesIdrawcontextMod {
  
  trait IDrawContext extends StObject {
    
    def dispose(): Unit
    
    def reset(): Unit
    
    var uniqueId: Double
    
    var useInstancing: Boolean
  }
  object IDrawContext {
    
    inline def apply(dispose: Callback, reset: Callback, uniqueId: Double, useInstancing: Boolean): IDrawContext = {
      val __obj = js.Dynamic.literal(dispose = dispose.toJsFn, reset = reset.toJsFn, uniqueId = uniqueId.asInstanceOf[js.Any], useInstancing = useInstancing.asInstanceOf[js.Any])
      __obj.asInstanceOf[IDrawContext]
    }
    
    extension [Self <: IDrawContext](x: Self) {
      
      inline def setDispose(value: Callback): Self = StObject.set(x, "dispose", value.toJsFn)
      
      inline def setReset(value: Callback): Self = StObject.set(x, "reset", value.toJsFn)
      
      inline def setUniqueId(value: Double): Self = StObject.set(x, "uniqueId", value.asInstanceOf[js.Any])
      
      inline def setUseInstancing(value: Boolean): Self = StObject.set(x, "useInstancing", value.asInstanceOf[js.Any])
    }
  }
}
