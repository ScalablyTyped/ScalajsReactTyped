package typingsJapgolly.babylonjs.global.BABYLON

import typingsJapgolly.babylonjs.BABYLON.Nullable
import typingsJapgolly.babylonjs.BABYLON.PostProcessOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.DisplayPassPostProcess")
@js.native
open class DisplayPassPostProcess protected ()
  extends StObject
     with typingsJapgolly.babylonjs.BABYLON.DisplayPassPostProcess {
  /**
    * Creates the DisplayPassPostProcess
    * @param name The name of the effect.
    * @param options The required width/height ratio to downsize to before computing the render pass.
    * @param camera The camera to apply the render pass to.
    * @param samplingMode The sampling mode to be used when computing the pass. (default: 0)
    * @param engine The engine which the post process will be applied. (default: current engine)
    * @param reusable If the post process can be reused on the same frame. (default: false)
    */
  def this(name: String, options: Double, camera: Nullable[typingsJapgolly.babylonjs.BABYLON.Camera]) = this()
  def this(
    name: String,
    options: PostProcessOptions,
    camera: Nullable[typingsJapgolly.babylonjs.BABYLON.Camera]
  ) = this()
  def this(
    name: String,
    options: Double,
    camera: Nullable[typingsJapgolly.babylonjs.BABYLON.Camera],
    samplingMode: Double
  ) = this()
  def this(
    name: String,
    options: PostProcessOptions,
    camera: Nullable[typingsJapgolly.babylonjs.BABYLON.Camera],
    samplingMode: Double
  ) = this()
  def this(
    name: String,
    options: Double,
    camera: Nullable[typingsJapgolly.babylonjs.BABYLON.Camera],
    samplingMode: Double,
    engine: typingsJapgolly.babylonjs.BABYLON.Engine
  ) = this()
  def this(
    name: String,
    options: Double,
    camera: Nullable[typingsJapgolly.babylonjs.BABYLON.Camera],
    samplingMode: Unit,
    engine: typingsJapgolly.babylonjs.BABYLON.Engine
  ) = this()
  def this(
    name: String,
    options: PostProcessOptions,
    camera: Nullable[typingsJapgolly.babylonjs.BABYLON.Camera],
    samplingMode: Double,
    engine: typingsJapgolly.babylonjs.BABYLON.Engine
  ) = this()
  def this(
    name: String,
    options: PostProcessOptions,
    camera: Nullable[typingsJapgolly.babylonjs.BABYLON.Camera],
    samplingMode: Unit,
    engine: typingsJapgolly.babylonjs.BABYLON.Engine
  ) = this()
  def this(
    name: String,
    options: Double,
    camera: Nullable[typingsJapgolly.babylonjs.BABYLON.Camera],
    samplingMode: Double,
    engine: Unit,
    reusable: Boolean
  ) = this()
  def this(
    name: String,
    options: Double,
    camera: Nullable[typingsJapgolly.babylonjs.BABYLON.Camera],
    samplingMode: Double,
    engine: typingsJapgolly.babylonjs.BABYLON.Engine,
    reusable: Boolean
  ) = this()
  def this(
    name: String,
    options: Double,
    camera: Nullable[typingsJapgolly.babylonjs.BABYLON.Camera],
    samplingMode: Unit,
    engine: Unit,
    reusable: Boolean
  ) = this()
  def this(
    name: String,
    options: Double,
    camera: Nullable[typingsJapgolly.babylonjs.BABYLON.Camera],
    samplingMode: Unit,
    engine: typingsJapgolly.babylonjs.BABYLON.Engine,
    reusable: Boolean
  ) = this()
  def this(
    name: String,
    options: PostProcessOptions,
    camera: Nullable[typingsJapgolly.babylonjs.BABYLON.Camera],
    samplingMode: Double,
    engine: Unit,
    reusable: Boolean
  ) = this()
  def this(
    name: String,
    options: PostProcessOptions,
    camera: Nullable[typingsJapgolly.babylonjs.BABYLON.Camera],
    samplingMode: Double,
    engine: typingsJapgolly.babylonjs.BABYLON.Engine,
    reusable: Boolean
  ) = this()
  def this(
    name: String,
    options: PostProcessOptions,
    camera: Nullable[typingsJapgolly.babylonjs.BABYLON.Camera],
    samplingMode: Unit,
    engine: Unit,
    reusable: Boolean
  ) = this()
  def this(
    name: String,
    options: PostProcessOptions,
    camera: Nullable[typingsJapgolly.babylonjs.BABYLON.Camera],
    samplingMode: Unit,
    engine: typingsJapgolly.babylonjs.BABYLON.Engine,
    reusable: Boolean
  ) = this()
}
/* static members */
object DisplayPassPostProcess {
  
  @JSGlobal("BABYLON.DisplayPassPostProcess")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * @internal
    */
  inline def _Parse(
    parsedPostProcess: Any,
    targetCamera: typingsJapgolly.babylonjs.BABYLON.Camera,
    scene: typingsJapgolly.babylonjs.BABYLON.Scene,
    rootUrl: String
  ): Nullable[typingsJapgolly.babylonjs.BABYLON.DisplayPassPostProcess] = (^.asInstanceOf[js.Dynamic].applyDynamic("_Parse")(parsedPostProcess.asInstanceOf[js.Any], targetCamera.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any])).asInstanceOf[Nullable[typingsJapgolly.babylonjs.BABYLON.DisplayPassPostProcess]]
}
