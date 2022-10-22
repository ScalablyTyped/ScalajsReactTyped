package typingsJapgolly.babylonjs.BABYLON

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextureOptimization
  extends StObject
     with SceneOptimization {
  
  /**
    * Defines the maximum sized allowed for textures (1024 is the default value). If a texture is bigger, it will be scaled down using a factor defined by the step parameter
    */
  var maximumSize: Double
  
  /**
    * Defines the factor (0.5 by default) used to scale down textures bigger than maximum sized allowed.
    */
  var step: Double
}
object TextureOptimization {
  
  inline def apply(
    apply: (Scene, SceneOptimizer) => Boolean,
    getDescription: CallbackTo[String],
    maximumSize: Double,
    priority: Double,
    step: Double
  ): TextureOptimization = {
    val __obj = js.Dynamic.literal(apply = js.Any.fromFunction2(apply), getDescription = getDescription.toJsFn, maximumSize = maximumSize.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any], step = step.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextureOptimization]
  }
  
  extension [Self <: TextureOptimization](x: Self) {
    
    inline def setMaximumSize(value: Double): Self = StObject.set(x, "maximumSize", value.asInstanceOf[js.Any])
    
    inline def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
  }
}
