package typingsJapgolly.babylonjs

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object materialsTexturesHardwareTextureWrapperMod {
  
  trait HardwareTextureWrapper extends StObject {
    
    def release(): Unit
    
    def reset(): Unit
    
    def set(hardwareTexture: Any): Unit
    
    def setUsage(textureSource: Double, generateMipMaps: Boolean, isCube: Boolean, width: Double, height: Double): Unit
    
    var underlyingResource: Any
  }
  object HardwareTextureWrapper {
    
    inline def apply(
      release: Callback,
      reset: Callback,
      set: Any => Callback,
      setUsage: (Double, Boolean, Boolean, Double, Double) => Callback,
      underlyingResource: Any
    ): HardwareTextureWrapper = {
      val __obj = js.Dynamic.literal(release = release.toJsFn, reset = reset.toJsFn, set = js.Any.fromFunction1((t0: Any) => set(t0).runNow()), setUsage = js.Any.fromFunction5((t0: Double, t1: Boolean, t2: Boolean, t3: Double, t4: Double) => (setUsage(t0, t1, t2, t3, t4)).runNow()), underlyingResource = underlyingResource.asInstanceOf[js.Any])
      __obj.asInstanceOf[HardwareTextureWrapper]
    }
    
    extension [Self <: HardwareTextureWrapper](x: Self) {
      
      inline def setRelease(value: Callback): Self = StObject.set(x, "release", value.toJsFn)
      
      inline def setReset(value: Callback): Self = StObject.set(x, "reset", value.toJsFn)
      
      inline def setSet(value: Any => Callback): Self = StObject.set(x, "set", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
      
      inline def setSetUsage(value: (Double, Boolean, Boolean, Double, Double) => Callback): Self = StObject.set(x, "setUsage", js.Any.fromFunction5((t0: Double, t1: Boolean, t2: Boolean, t3: Double, t4: Double) => (value(t0, t1, t2, t3, t4)).runNow()))
      
      inline def setUnderlyingResource(value: Any): Self = StObject.set(x, "underlyingResource", value.asInstanceOf[js.Any])
    }
  }
}
