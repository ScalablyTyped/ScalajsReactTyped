package typingsJapgolly.babylonjs.global.BABYLON

import typingsJapgolly.babylonjs.BABYLON.Nullable
import typingsJapgolly.babylonjs.BABYLON.PostProcessOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.PostProcess")
@js.native
open class PostProcess protected ()
  extends StObject
     with typingsJapgolly.babylonjs.BABYLON.PostProcess {
  /**
    * Creates a new instance PostProcess
    * @param name The name of the PostProcess.
    * @param fragmentUrl The url of the fragment shader to be used.
    * @param parameters Array of the names of uniform non-sampler2D variables that will be passed to the shader.
    * @param samplers Array of the names of uniform sampler2D variables that will be passed to the shader.
    * @param options The required width/height ratio to downsize to before computing the render pass. (Use 1.0 for full size)
    * @param camera The camera to apply the render pass to.
    * @param samplingMode The sampling mode to be used when computing the pass. (default: 0)
    * @param engine The engine which the post process will be applied. (default: current engine)
    * @param reusable If the post process can be reused on the same frame. (default: false)
    * @param defines String of defines that will be set when running the fragment shader. (default: null)
    * @param textureType Type of textures used when performing the post process. (default: 0)
    * @param vertexUrl The url of the vertex shader to be used. (default: "postprocess")
    * @param indexParameters The index parameters to be used for babylons include syntax "#include<kernelBlurVaryingDeclaration>[0..varyingCount]". (default: undefined) See usage in babylon.blurPostProcess.ts and kernelBlur.vertex.fx
    * @param blockCompilation If the shader should not be compiled immediatly. (default: false)
    * @param textureFormat Format of textures used when performing the post process. (default: TEXTUREFORMAT_RGBA)
    */
  def this(
    name: String,
    fragmentUrl: String,
    parameters: Nullable[js.Array[String]],
    samplers: Nullable[js.Array[String]],
    options: Double | PostProcessOptions,
    camera: Nullable[typingsJapgolly.babylonjs.BABYLON.Camera],
    samplingMode: js.UndefOr[Double],
    engine: js.UndefOr[typingsJapgolly.babylonjs.BABYLON.Engine],
    reusable: js.UndefOr[Boolean],
    defines: js.UndefOr[Nullable[String]],
    textureType: js.UndefOr[Double],
    vertexUrl: js.UndefOr[String],
    indexParameters: js.UndefOr[Any],
    blockCompilation: js.UndefOr[Boolean],
    textureFormat: js.UndefOr[Double]
  ) = this()
}
/* static members */
object PostProcess {
  
  @JSGlobal("BABYLON.PostProcess")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a material from parsed material data
    * @param parsedPostProcess defines parsed post process data
    * @param scene defines the hosting scene
    * @param rootUrl defines the root URL to use to load textures
    * @returns a new post process
    */
  inline def Parse(parsedPostProcess: Any, scene: typingsJapgolly.babylonjs.BABYLON.Scene, rootUrl: String): Nullable[typingsJapgolly.babylonjs.BABYLON.PostProcess] = (^.asInstanceOf[js.Dynamic].applyDynamic("Parse")(parsedPostProcess.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any])).asInstanceOf[Nullable[typingsJapgolly.babylonjs.BABYLON.PostProcess]]
  
  /**
    * @internal
    */
  inline def _Parse(
    parsedPostProcess: Any,
    targetCamera: typingsJapgolly.babylonjs.BABYLON.Camera,
    scene: typingsJapgolly.babylonjs.BABYLON.Scene,
    rootUrl: String
  ): Nullable[typingsJapgolly.babylonjs.BABYLON.PostProcess] = (^.asInstanceOf[js.Dynamic].applyDynamic("_Parse")(parsedPostProcess.asInstanceOf[js.Any], targetCamera.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any])).asInstanceOf[Nullable[typingsJapgolly.babylonjs.BABYLON.PostProcess]]
}
