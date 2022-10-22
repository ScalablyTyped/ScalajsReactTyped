package typingsJapgolly.babylonjs.postProcessesIndexMod

import typingsJapgolly.babylonjs.camerasCameraMod.Camera
import typingsJapgolly.babylonjs.enginesEngineMod.Engine
import typingsJapgolly.babylonjs.postProcessesPostProcessMod.PostProcessOptions
import typingsJapgolly.babylonjs.sceneMod.Scene
import typingsJapgolly.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/PostProcesses/index", "ChromaticAberrationPostProcess")
@js.native
open class ChromaticAberrationPostProcess protected ()
  extends typingsJapgolly.babylonjs.postProcessesChromaticAberrationPostProcessMod.ChromaticAberrationPostProcess {
  /**
    * Creates a new instance ChromaticAberrationPostProcess
    * @param name The name of the effect.
    * @param screenWidth The width of the screen to apply the effect on.
    * @param screenHeight The height of the screen to apply the effect on.
    * @param options The required width/height ratio to downsize to before computing the render pass.
    * @param camera The camera to apply the render pass to.
    * @param samplingMode The sampling mode to be used when computing the pass. (default: 0)
    * @param engine The engine which the post process will be applied. (default: current engine)
    * @param reusable If the post process can be reused on the same frame. (default: false)
    * @param textureType Type of textures used when performing the post process. (default: 0)
    * @param blockCompilation If compilation of the shader should not be done in the constructor. The updateEffect method can be used to compile the shader at a later time. (default: false)
    */
  def this(
    name: String,
    screenWidth: Double,
    screenHeight: Double,
    options: Double | PostProcessOptions,
    camera: Nullable[Camera],
    samplingMode: js.UndefOr[Double],
    engine: js.UndefOr[Engine],
    reusable: js.UndefOr[Boolean],
    textureType: js.UndefOr[Double],
    blockCompilation: js.UndefOr[Boolean]
  ) = this()
}
/* static members */
object ChromaticAberrationPostProcess {
  
  @JSImport("babylonjs/PostProcesses/index", "ChromaticAberrationPostProcess")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * @internal
    */
  inline def _Parse(parsedPostProcess: Any, targetCamera: Camera, scene: Scene, rootUrl: String): Nullable[
    typingsJapgolly.babylonjs.postProcessesChromaticAberrationPostProcessMod.ChromaticAberrationPostProcess
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("_Parse")(parsedPostProcess.asInstanceOf[js.Any], targetCamera.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any])).asInstanceOf[Nullable[
    typingsJapgolly.babylonjs.postProcessesChromaticAberrationPostProcessMod.ChromaticAberrationPostProcess
  ]]
}
