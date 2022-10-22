package typingsJapgolly.babylonjs.enginesIndexMod

import typingsJapgolly.babylonjs.camerasCameraMod.Camera
import typingsJapgolly.babylonjs.materialsUniformBufferMod.UniformBuffer
import typingsJapgolly.babylonjs.mathsMathDotvectorMod.Matrix
import typingsJapgolly.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object babylonjsSceneAugmentingMod {
  
  @js.native
  trait Scene extends StObject {
    
    /** @internal */
    def _createMultiviewUbo(): Unit = js.native
    
    /** @internal */
    var _multiviewSceneUbo: Nullable[UniformBuffer] = js.native
    
    /** @internal */
    def _renderMultiviewToSingleView(camera: Camera): Unit = js.native
    
    /** @internal */
    var _transformMatrixR: Matrix = js.native
    
    /** @internal */
    def _updateMultiviewUbo(): Unit = js.native
    def _updateMultiviewUbo(viewR: Unit, projectionR: Matrix): Unit = js.native
    def _updateMultiviewUbo(viewR: Matrix): Unit = js.native
    def _updateMultiviewUbo(viewR: Matrix, projectionR: Matrix): Unit = js.native
  }
}
