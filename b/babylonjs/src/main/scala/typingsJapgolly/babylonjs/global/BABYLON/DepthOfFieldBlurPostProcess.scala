package typingsJapgolly.babylonjs.global.BABYLON

import typingsJapgolly.babylonjs.BABYLON.Nullable
import typingsJapgolly.babylonjs.BABYLON.PostProcessOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.DepthOfFieldBlurPostProcess")
@js.native
open class DepthOfFieldBlurPostProcess protected ()
  extends StObject
     with typingsJapgolly.babylonjs.BABYLON.DepthOfFieldBlurPostProcess {
  /**
    * Creates a new instance DepthOfFieldBlurPostProcess
    * @param name The name of the effect.
    * @param scene The scene the effect belongs to.
    * @param direction The direction the blur should be applied.
    * @param kernel The size of the kernel used to blur.
    * @param options The required width/height ratio to downsize to before computing the render pass.
    * @param camera The camera to apply the render pass to.
    * @param circleOfConfusion The circle of confusion + depth map to be used to avoid blurring across edges
    * @param imageToBlur The image to apply the blur to (default: Current rendered frame)
    * @param samplingMode The sampling mode to be used when computing the pass. (default: 0)
    * @param engine The engine which the post process will be applied. (default: current engine)
    * @param reusable If the post process can be reused on the same frame. (default: false)
    * @param textureType Type of textures used when performing the post process. (default: 0)
    * @param blockCompilation If compilation of the shader should not be done in the constructor. The updateEffect method can be used to compile the shader at a later time. (default: false)
    */
  def this(
    name: String,
    scene: typingsJapgolly.babylonjs.BABYLON.Scene,
    direction: typingsJapgolly.babylonjs.BABYLON.Vector2,
    kernel: Double,
    options: Double | PostProcessOptions,
    camera: Nullable[typingsJapgolly.babylonjs.BABYLON.Camera],
    circleOfConfusion: typingsJapgolly.babylonjs.BABYLON.PostProcess,
    imageToBlur: js.UndefOr[Nullable[typingsJapgolly.babylonjs.BABYLON.PostProcess]],
    samplingMode: js.UndefOr[Double],
    engine: js.UndefOr[typingsJapgolly.babylonjs.BABYLON.Engine],
    reusable: js.UndefOr[Boolean],
    textureType: js.UndefOr[Double],
    blockCompilation: js.UndefOr[Boolean]
  ) = this()
}
