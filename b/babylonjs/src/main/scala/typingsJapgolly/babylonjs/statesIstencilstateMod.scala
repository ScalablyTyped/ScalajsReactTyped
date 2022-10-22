package typingsJapgolly.babylonjs

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object statesIstencilstateMod {
  
  trait IStencilState extends StObject {
    
    var enabled: Boolean
    
    var func: Double
    
    var funcMask: Double
    
    var funcRef: Double
    
    var mask: Double
    
    var opDepthFail: Double
    
    var opStencilDepthPass: Double
    
    var opStencilFail: Double
    
    def reset(): Unit
  }
  object IStencilState {
    
    inline def apply(
      enabled: Boolean,
      func: Double,
      funcMask: Double,
      funcRef: Double,
      mask: Double,
      opDepthFail: Double,
      opStencilDepthPass: Double,
      opStencilFail: Double,
      reset: Callback
    ): IStencilState = {
      val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any], func = func.asInstanceOf[js.Any], funcMask = funcMask.asInstanceOf[js.Any], funcRef = funcRef.asInstanceOf[js.Any], mask = mask.asInstanceOf[js.Any], opDepthFail = opDepthFail.asInstanceOf[js.Any], opStencilDepthPass = opStencilDepthPass.asInstanceOf[js.Any], opStencilFail = opStencilFail.asInstanceOf[js.Any], reset = reset.toJsFn)
      __obj.asInstanceOf[IStencilState]
    }
    
    extension [Self <: IStencilState](x: Self) {
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setFunc(value: Double): Self = StObject.set(x, "func", value.asInstanceOf[js.Any])
      
      inline def setFuncMask(value: Double): Self = StObject.set(x, "funcMask", value.asInstanceOf[js.Any])
      
      inline def setFuncRef(value: Double): Self = StObject.set(x, "funcRef", value.asInstanceOf[js.Any])
      
      inline def setMask(value: Double): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
      
      inline def setOpDepthFail(value: Double): Self = StObject.set(x, "opDepthFail", value.asInstanceOf[js.Any])
      
      inline def setOpStencilDepthPass(value: Double): Self = StObject.set(x, "opStencilDepthPass", value.asInstanceOf[js.Any])
      
      inline def setOpStencilFail(value: Double): Self = StObject.set(x, "opStencilFail", value.asInstanceOf[js.Any])
      
      inline def setReset(value: Callback): Self = StObject.set(x, "reset", value.toJsFn)
    }
  }
}
