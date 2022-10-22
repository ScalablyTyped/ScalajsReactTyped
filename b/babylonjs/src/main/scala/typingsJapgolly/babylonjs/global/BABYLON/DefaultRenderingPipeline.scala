package typingsJapgolly.babylonjs.global.BABYLON

import typingsJapgolly.babylonjs.BABYLON.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.DefaultRenderingPipeline")
@js.native
/**
  * @constructor
  * @param name - The rendering pipeline name (default: "")
  * @param hdr - If high dynamic range textures should be used (default: true)
  * @param scene - The scene linked to this pipeline (default: the last created scene)
  * @param cameras - The array of cameras that the rendering pipeline will be attached to (default: scene.cameras)
  * @param automaticBuild - if false, you will have to manually call prepare() to update the pipeline (default: true)
  */
open class DefaultRenderingPipeline ()
  extends StObject
     with typingsJapgolly.babylonjs.BABYLON.DefaultRenderingPipeline {
  def this(name: String) = this()
  def this(name: String, hdr: Boolean) = this()
  def this(name: Unit, hdr: Boolean) = this()
  def this(name: String, hdr: Boolean, scene: typingsJapgolly.babylonjs.BABYLON.Scene) = this()
  def this(name: String, hdr: Unit, scene: typingsJapgolly.babylonjs.BABYLON.Scene) = this()
  def this(name: Unit, hdr: Boolean, scene: typingsJapgolly.babylonjs.BABYLON.Scene) = this()
  def this(name: Unit, hdr: Unit, scene: typingsJapgolly.babylonjs.BABYLON.Scene) = this()
  def this(
    name: String,
    hdr: Boolean,
    scene: Unit,
    cameras: js.Array[typingsJapgolly.babylonjs.BABYLON.Camera]
  ) = this()
  def this(
    name: String,
    hdr: Boolean,
    scene: typingsJapgolly.babylonjs.BABYLON.Scene,
    cameras: js.Array[typingsJapgolly.babylonjs.BABYLON.Camera]
  ) = this()
  def this(name: String, hdr: Unit, scene: Unit, cameras: js.Array[typingsJapgolly.babylonjs.BABYLON.Camera]) = this()
  def this(
    name: String,
    hdr: Unit,
    scene: typingsJapgolly.babylonjs.BABYLON.Scene,
    cameras: js.Array[typingsJapgolly.babylonjs.BABYLON.Camera]
  ) = this()
  def this(name: Unit, hdr: Boolean, scene: Unit, cameras: js.Array[typingsJapgolly.babylonjs.BABYLON.Camera]) = this()
  def this(
    name: Unit,
    hdr: Boolean,
    scene: typingsJapgolly.babylonjs.BABYLON.Scene,
    cameras: js.Array[typingsJapgolly.babylonjs.BABYLON.Camera]
  ) = this()
  def this(name: Unit, hdr: Unit, scene: Unit, cameras: js.Array[typingsJapgolly.babylonjs.BABYLON.Camera]) = this()
  def this(
    name: Unit,
    hdr: Unit,
    scene: typingsJapgolly.babylonjs.BABYLON.Scene,
    cameras: js.Array[typingsJapgolly.babylonjs.BABYLON.Camera]
  ) = this()
  def this(
    name: String,
    hdr: Boolean,
    scene: Unit,
    cameras: js.Array[typingsJapgolly.babylonjs.BABYLON.Camera],
    automaticBuild: Boolean
  ) = this()
  def this(name: String, hdr: Boolean, scene: Unit, cameras: Unit, automaticBuild: Boolean) = this()
  def this(
    name: String,
    hdr: Boolean,
    scene: typingsJapgolly.babylonjs.BABYLON.Scene,
    cameras: js.Array[typingsJapgolly.babylonjs.BABYLON.Camera],
    automaticBuild: Boolean
  ) = this()
  def this(
    name: String,
    hdr: Boolean,
    scene: typingsJapgolly.babylonjs.BABYLON.Scene,
    cameras: Unit,
    automaticBuild: Boolean
  ) = this()
  def this(
    name: String,
    hdr: Unit,
    scene: Unit,
    cameras: js.Array[typingsJapgolly.babylonjs.BABYLON.Camera],
    automaticBuild: Boolean
  ) = this()
  def this(name: String, hdr: Unit, scene: Unit, cameras: Unit, automaticBuild: Boolean) = this()
  def this(
    name: String,
    hdr: Unit,
    scene: typingsJapgolly.babylonjs.BABYLON.Scene,
    cameras: js.Array[typingsJapgolly.babylonjs.BABYLON.Camera],
    automaticBuild: Boolean
  ) = this()
  def this(
    name: String,
    hdr: Unit,
    scene: typingsJapgolly.babylonjs.BABYLON.Scene,
    cameras: Unit,
    automaticBuild: Boolean
  ) = this()
  def this(
    name: Unit,
    hdr: Boolean,
    scene: Unit,
    cameras: js.Array[typingsJapgolly.babylonjs.BABYLON.Camera],
    automaticBuild: Boolean
  ) = this()
  def this(name: Unit, hdr: Boolean, scene: Unit, cameras: Unit, automaticBuild: Boolean) = this()
  def this(
    name: Unit,
    hdr: Boolean,
    scene: typingsJapgolly.babylonjs.BABYLON.Scene,
    cameras: js.Array[typingsJapgolly.babylonjs.BABYLON.Camera],
    automaticBuild: Boolean
  ) = this()
  def this(
    name: Unit,
    hdr: Boolean,
    scene: typingsJapgolly.babylonjs.BABYLON.Scene,
    cameras: Unit,
    automaticBuild: Boolean
  ) = this()
  def this(
    name: Unit,
    hdr: Unit,
    scene: Unit,
    cameras: js.Array[typingsJapgolly.babylonjs.BABYLON.Camera],
    automaticBuild: Boolean
  ) = this()
  def this(name: Unit, hdr: Unit, scene: Unit, cameras: Unit, automaticBuild: Boolean) = this()
  def this(
    name: Unit,
    hdr: Unit,
    scene: typingsJapgolly.babylonjs.BABYLON.Scene,
    cameras: js.Array[typingsJapgolly.babylonjs.BABYLON.Camera],
    automaticBuild: Boolean
  ) = this()
  def this(
    name: Unit,
    hdr: Unit,
    scene: typingsJapgolly.babylonjs.BABYLON.Scene,
    cameras: Unit,
    automaticBuild: Boolean
  ) = this()
  
  /**
    * Array of animations
    */
  /* CompleteClass */
  var animations: Nullable[js.Array[typingsJapgolly.babylonjs.BABYLON.Animation]] = js.native
  
  /**
    * Releases all held resources
    */
  /* InferMemberOverrides */
  override def dispose(): Unit = js.native
}
/* static members */
object DefaultRenderingPipeline {
  
  @JSGlobal("BABYLON.DefaultRenderingPipeline")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Parse the serialized pipeline
    * @param source Source pipeline.
    * @param scene The scene to load the pipeline to.
    * @param rootUrl The URL of the serialized pipeline.
    * @returns An instantiated pipeline from the serialized object.
    */
  inline def Parse(source: Any, scene: typingsJapgolly.babylonjs.BABYLON.Scene, rootUrl: String): typingsJapgolly.babylonjs.BABYLON.DefaultRenderingPipeline = (^.asInstanceOf[js.Dynamic].applyDynamic("Parse")(source.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.BABYLON.DefaultRenderingPipeline]
}
