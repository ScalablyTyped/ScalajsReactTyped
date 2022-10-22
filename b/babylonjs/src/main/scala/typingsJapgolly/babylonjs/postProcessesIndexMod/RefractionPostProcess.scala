package typingsJapgolly.babylonjs.postProcessesIndexMod

import typingsJapgolly.babylonjs.camerasCameraMod.Camera
import typingsJapgolly.babylonjs.enginesEngineMod.Engine
import typingsJapgolly.babylonjs.mathsMathDotcolorMod.Color3
import typingsJapgolly.babylonjs.postProcessesPostProcessMod.PostProcessOptions
import typingsJapgolly.babylonjs.sceneMod.Scene
import typingsJapgolly.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/PostProcesses/index", "RefractionPostProcess")
@js.native
open class RefractionPostProcess protected ()
  extends typingsJapgolly.babylonjs.postProcessesRefractionPostProcessMod.RefractionPostProcess {
  /**
    * Initializes the RefractionPostProcess
    * @see https://doc.babylonjs.com/how_to/how_to_use_postprocesses#refraction
    * @param name The name of the effect.
    * @param refractionTextureUrl Url of the refraction texture to use
    * @param color the base color of the refraction (used to taint the rendering)
    * @param depth simulated refraction depth
    * @param colorLevel the coefficient of the base color (0 to remove base color tainting)
    * @param options The required width/height ratio to downsize to before computing the render pass.
    * @param camera The camera to apply the render pass to.
    * @param samplingMode The sampling mode to be used when computing the pass. (default: 0)
    * @param engine The engine which the post process will be applied. (default: current engine)
    * @param reusable If the post process can be reused on the same frame. (default: false)
    */
  def this(
    name: String,
    refractionTextureUrl: String,
    color: Color3,
    depth: Double,
    colorLevel: Double,
    options: Double,
    camera: Nullable[Camera]
  ) = this()
  def this(
    name: String,
    refractionTextureUrl: String,
    color: Color3,
    depth: Double,
    colorLevel: Double,
    options: PostProcessOptions,
    camera: Nullable[Camera]
  ) = this()
  def this(
    name: String,
    refractionTextureUrl: String,
    color: Color3,
    depth: Double,
    colorLevel: Double,
    options: Double,
    camera: Nullable[Camera],
    samplingMode: Double
  ) = this()
  def this(
    name: String,
    refractionTextureUrl: String,
    color: Color3,
    depth: Double,
    colorLevel: Double,
    options: PostProcessOptions,
    camera: Nullable[Camera],
    samplingMode: Double
  ) = this()
  def this(
    name: String,
    refractionTextureUrl: String,
    color: Color3,
    depth: Double,
    colorLevel: Double,
    options: Double,
    camera: Nullable[Camera],
    samplingMode: Double,
    engine: Engine
  ) = this()
  def this(
    name: String,
    refractionTextureUrl: String,
    color: Color3,
    depth: Double,
    colorLevel: Double,
    options: Double,
    camera: Nullable[Camera],
    samplingMode: Unit,
    engine: Engine
  ) = this()
  def this(
    name: String,
    refractionTextureUrl: String,
    color: Color3,
    depth: Double,
    colorLevel: Double,
    options: PostProcessOptions,
    camera: Nullable[Camera],
    samplingMode: Double,
    engine: Engine
  ) = this()
  def this(
    name: String,
    refractionTextureUrl: String,
    color: Color3,
    depth: Double,
    colorLevel: Double,
    options: PostProcessOptions,
    camera: Nullable[Camera],
    samplingMode: Unit,
    engine: Engine
  ) = this()
  def this(
    name: String,
    refractionTextureUrl: String,
    color: Color3,
    depth: Double,
    colorLevel: Double,
    options: Double,
    camera: Nullable[Camera],
    samplingMode: Double,
    engine: Unit,
    reusable: Boolean
  ) = this()
  def this(
    name: String,
    refractionTextureUrl: String,
    color: Color3,
    depth: Double,
    colorLevel: Double,
    options: Double,
    camera: Nullable[Camera],
    samplingMode: Double,
    engine: Engine,
    reusable: Boolean
  ) = this()
  def this(
    name: String,
    refractionTextureUrl: String,
    color: Color3,
    depth: Double,
    colorLevel: Double,
    options: Double,
    camera: Nullable[Camera],
    samplingMode: Unit,
    engine: Unit,
    reusable: Boolean
  ) = this()
  def this(
    name: String,
    refractionTextureUrl: String,
    color: Color3,
    depth: Double,
    colorLevel: Double,
    options: Double,
    camera: Nullable[Camera],
    samplingMode: Unit,
    engine: Engine,
    reusable: Boolean
  ) = this()
  def this(
    name: String,
    refractionTextureUrl: String,
    color: Color3,
    depth: Double,
    colorLevel: Double,
    options: PostProcessOptions,
    camera: Nullable[Camera],
    samplingMode: Double,
    engine: Unit,
    reusable: Boolean
  ) = this()
  def this(
    name: String,
    refractionTextureUrl: String,
    color: Color3,
    depth: Double,
    colorLevel: Double,
    options: PostProcessOptions,
    camera: Nullable[Camera],
    samplingMode: Double,
    engine: Engine,
    reusable: Boolean
  ) = this()
  def this(
    name: String,
    refractionTextureUrl: String,
    color: Color3,
    depth: Double,
    colorLevel: Double,
    options: PostProcessOptions,
    camera: Nullable[Camera],
    samplingMode: Unit,
    engine: Unit,
    reusable: Boolean
  ) = this()
  def this(
    name: String,
    refractionTextureUrl: String,
    color: Color3,
    depth: Double,
    colorLevel: Double,
    options: PostProcessOptions,
    camera: Nullable[Camera],
    samplingMode: Unit,
    engine: Engine,
    reusable: Boolean
  ) = this()
}
/* static members */
object RefractionPostProcess {
  
  @JSImport("babylonjs/PostProcesses/index", "RefractionPostProcess")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * @internal
    */
  inline def _Parse(parsedPostProcess: Any, targetCamera: Camera, scene: Scene, rootUrl: String): typingsJapgolly.babylonjs.postProcessesRefractionPostProcessMod.RefractionPostProcess = (^.asInstanceOf[js.Dynamic].applyDynamic("_Parse")(parsedPostProcess.asInstanceOf[js.Any], targetCamera.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.postProcessesRefractionPostProcessMod.RefractionPostProcess]
}
