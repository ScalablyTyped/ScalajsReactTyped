package typingsJapgolly.babylonjs.global.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.MergeMeshesOptimization")
@js.native
open class MergeMeshesOptimization ()
  extends StObject
     with typingsJapgolly.babylonjs.BABYLON.MergeMeshesOptimization {
  
  /**
    * This function will be called by the SceneOptimizer when its priority is reached in order to apply the change required by the current optimization
    * @param scene defines the current scene where to apply this optimization
    * @param optimizer defines the current optimizer
    * @returns true if everything that can be done was applied
    */
  /* CompleteClass */
  @JSName("apply")
  override def apply(
    scene: typingsJapgolly.babylonjs.BABYLON.Scene,
    optimizer: typingsJapgolly.babylonjs.BABYLON.SceneOptimizer
  ): Boolean = js.native
  
  /**
    * Gets a string describing the action executed by the current optimization
    * @returns description string
    */
  /* CompleteClass */
  override def getDescription(): String = js.native
  
  /**
    * Defines the priority of this optimization (0 by default which means first in the list)
    */
  /* CompleteClass */
  var priority: Double = js.native
}
/* static members */
object MergeMeshesOptimization {
  
  @JSGlobal("BABYLON.MergeMeshesOptimization")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("BABYLON.MergeMeshesOptimization._UpdateSelectionTree")
  @js.native
  def _UpdateSelectionTree: Any = js.native
  inline def _UpdateSelectionTree_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_UpdateSelectionTree")(x.asInstanceOf[js.Any])
}
