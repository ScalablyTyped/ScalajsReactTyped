package typingsJapgolly.babylonjs.anon

import typingsJapgolly.babylonjs.animationsRuntimeAnimationMod.RuntimeAnimation
import typingsJapgolly.babylonjs.mathsMathDotvectorMod.Quaternion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Animations extends StObject {
  
  var additiveAnimations: js.Array[RuntimeAnimation]
  
  var animations: js.Array[RuntimeAnimation]
  
  var originalValue: Quaternion
  
  var totalAdditiveWeight: Double
  
  var totalWeight: Double
}
object Animations {
  
  inline def apply(
    additiveAnimations: js.Array[RuntimeAnimation],
    animations: js.Array[RuntimeAnimation],
    originalValue: Quaternion,
    totalAdditiveWeight: Double,
    totalWeight: Double
  ): Animations = {
    val __obj = js.Dynamic.literal(additiveAnimations = additiveAnimations.asInstanceOf[js.Any], animations = animations.asInstanceOf[js.Any], originalValue = originalValue.asInstanceOf[js.Any], totalAdditiveWeight = totalAdditiveWeight.asInstanceOf[js.Any], totalWeight = totalWeight.asInstanceOf[js.Any])
    __obj.asInstanceOf[Animations]
  }
  
  extension [Self <: Animations](x: Self) {
    
    inline def setAdditiveAnimations(value: js.Array[RuntimeAnimation]): Self = StObject.set(x, "additiveAnimations", value.asInstanceOf[js.Any])
    
    inline def setAdditiveAnimationsVarargs(value: RuntimeAnimation*): Self = StObject.set(x, "additiveAnimations", js.Array(value*))
    
    inline def setAnimations(value: js.Array[RuntimeAnimation]): Self = StObject.set(x, "animations", value.asInstanceOf[js.Any])
    
    inline def setAnimationsVarargs(value: RuntimeAnimation*): Self = StObject.set(x, "animations", js.Array(value*))
    
    inline def setOriginalValue(value: Quaternion): Self = StObject.set(x, "originalValue", value.asInstanceOf[js.Any])
    
    inline def setTotalAdditiveWeight(value: Double): Self = StObject.set(x, "totalAdditiveWeight", value.asInstanceOf[js.Any])
    
    inline def setTotalWeight(value: Double): Self = StObject.set(x, "totalWeight", value.asInstanceOf[js.Any])
  }
}
