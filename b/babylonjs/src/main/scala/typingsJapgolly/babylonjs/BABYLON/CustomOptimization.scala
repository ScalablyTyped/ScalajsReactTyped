package typingsJapgolly.babylonjs.BABYLON

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomOptimization
  extends StObject
     with SceneOptimization {
  
  /**
    * Callback called to apply the custom optimization.
    */
  def onApply(scene: Scene, optimizer: SceneOptimizer): Boolean
  
  /**
    * Callback called to get custom description
    */
  def onGetDescription(): String
}
object CustomOptimization {
  
  inline def apply(
    apply: (Scene, SceneOptimizer) => Boolean,
    getDescription: CallbackTo[String],
    onApply: (Scene, SceneOptimizer) => Boolean,
    onGetDescription: CallbackTo[String],
    priority: Double
  ): CustomOptimization = {
    val __obj = js.Dynamic.literal(apply = js.Any.fromFunction2(apply), getDescription = getDescription.toJsFn, onApply = js.Any.fromFunction2(onApply), onGetDescription = onGetDescription.toJsFn, priority = priority.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomOptimization]
  }
  
  extension [Self <: CustomOptimization](x: Self) {
    
    inline def setOnApply(value: (Scene, SceneOptimizer) => Boolean): Self = StObject.set(x, "onApply", js.Any.fromFunction2(value))
    
    inline def setOnGetDescription(value: CallbackTo[String]): Self = StObject.set(x, "onGetDescription", value.toJsFn)
  }
}
