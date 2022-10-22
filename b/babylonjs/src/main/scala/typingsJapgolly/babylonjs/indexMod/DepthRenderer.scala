package typingsJapgolly.babylonjs.indexMod

import typingsJapgolly.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/index", "DepthRenderer")
@js.native
open class DepthRenderer protected ()
  extends typingsJapgolly.babylonjs.renderingIndexMod.DepthRenderer {
  /**
    * Instantiates a depth renderer
    * @param scene The scene the renderer belongs to
    * @param type The texture type of the depth map (default: Engine.TEXTURETYPE_FLOAT)
    * @param camera The camera to be used to render the depth map (default: scene's active camera)
    * @param storeNonLinearDepth Defines whether the depth is stored linearly like in Babylon Shadows or directly like glFragCoord.z
    * @param samplingMode The sampling mode to be used with the render target (Linear, Nearest...)
    */
  def this(scene: typingsJapgolly.babylonjs.sceneMod.Scene) = this()
  def this(scene: typingsJapgolly.babylonjs.sceneMod.Scene, `type`: Double) = this()
  def this(
    scene: typingsJapgolly.babylonjs.sceneMod.Scene,
    `type`: Double,
    camera: Nullable[typingsJapgolly.babylonjs.camerasCameraMod.Camera]
  ) = this()
  def this(
    scene: typingsJapgolly.babylonjs.sceneMod.Scene,
    `type`: Unit,
    camera: Nullable[typingsJapgolly.babylonjs.camerasCameraMod.Camera]
  ) = this()
  def this(
    scene: typingsJapgolly.babylonjs.sceneMod.Scene,
    `type`: Double,
    camera: Unit,
    storeNonLinearDepth: Boolean
  ) = this()
  def this(
    scene: typingsJapgolly.babylonjs.sceneMod.Scene,
    `type`: Double,
    camera: Nullable[typingsJapgolly.babylonjs.camerasCameraMod.Camera],
    storeNonLinearDepth: Boolean
  ) = this()
  def this(
    scene: typingsJapgolly.babylonjs.sceneMod.Scene,
    `type`: Unit,
    camera: Unit,
    storeNonLinearDepth: Boolean
  ) = this()
  def this(
    scene: typingsJapgolly.babylonjs.sceneMod.Scene,
    `type`: Unit,
    camera: Nullable[typingsJapgolly.babylonjs.camerasCameraMod.Camera],
    storeNonLinearDepth: Boolean
  ) = this()
  def this(
    scene: typingsJapgolly.babylonjs.sceneMod.Scene,
    `type`: Double,
    camera: Unit,
    storeNonLinearDepth: Boolean,
    samplingMode: Double
  ) = this()
  def this(
    scene: typingsJapgolly.babylonjs.sceneMod.Scene,
    `type`: Double,
    camera: Unit,
    storeNonLinearDepth: Unit,
    samplingMode: Double
  ) = this()
  def this(
    scene: typingsJapgolly.babylonjs.sceneMod.Scene,
    `type`: Double,
    camera: Nullable[typingsJapgolly.babylonjs.camerasCameraMod.Camera],
    storeNonLinearDepth: Boolean,
    samplingMode: Double
  ) = this()
  def this(
    scene: typingsJapgolly.babylonjs.sceneMod.Scene,
    `type`: Double,
    camera: Nullable[typingsJapgolly.babylonjs.camerasCameraMod.Camera],
    storeNonLinearDepth: Unit,
    samplingMode: Double
  ) = this()
  def this(
    scene: typingsJapgolly.babylonjs.sceneMod.Scene,
    `type`: Unit,
    camera: Unit,
    storeNonLinearDepth: Boolean,
    samplingMode: Double
  ) = this()
  def this(
    scene: typingsJapgolly.babylonjs.sceneMod.Scene,
    `type`: Unit,
    camera: Unit,
    storeNonLinearDepth: Unit,
    samplingMode: Double
  ) = this()
  def this(
    scene: typingsJapgolly.babylonjs.sceneMod.Scene,
    `type`: Unit,
    camera: Nullable[typingsJapgolly.babylonjs.camerasCameraMod.Camera],
    storeNonLinearDepth: Boolean,
    samplingMode: Double
  ) = this()
  def this(
    scene: typingsJapgolly.babylonjs.sceneMod.Scene,
    `type`: Unit,
    camera: Nullable[typingsJapgolly.babylonjs.camerasCameraMod.Camera],
    storeNonLinearDepth: Unit,
    samplingMode: Double
  ) = this()
}
/* static members */
object DepthRenderer {
  
  @JSImport("babylonjs/index", "DepthRenderer")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * @internal
    */
  inline def _SceneComponentInitialization(scene: typingsJapgolly.babylonjs.sceneMod.Scene): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_SceneComponentInitialization")(scene.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
