package typingsJapgolly.babylonjs.global.BABYLON

import typingsJapgolly.babylonjs.BABYLON.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.DepthRenderer")
@js.native
open class DepthRenderer protected ()
  extends StObject
     with typingsJapgolly.babylonjs.BABYLON.DepthRenderer {
  /**
    * Instantiates a depth renderer
    * @param scene The scene the renderer belongs to
    * @param type The texture type of the depth map (default: Engine.TEXTURETYPE_FLOAT)
    * @param camera The camera to be used to render the depth map (default: scene's active camera)
    * @param storeNonLinearDepth Defines whether the depth is stored linearly like in Babylon Shadows or directly like glFragCoord.z
    * @param samplingMode The sampling mode to be used with the render target (Linear, Nearest...)
    */
  def this(scene: typingsJapgolly.babylonjs.BABYLON.Scene) = this()
  def this(scene: typingsJapgolly.babylonjs.BABYLON.Scene, `type`: Double) = this()
  def this(
    scene: typingsJapgolly.babylonjs.BABYLON.Scene,
    `type`: Double,
    camera: Nullable[typingsJapgolly.babylonjs.BABYLON.Camera]
  ) = this()
  def this(
    scene: typingsJapgolly.babylonjs.BABYLON.Scene,
    `type`: Unit,
    camera: Nullable[typingsJapgolly.babylonjs.BABYLON.Camera]
  ) = this()
  def this(
    scene: typingsJapgolly.babylonjs.BABYLON.Scene,
    `type`: Double,
    camera: Unit,
    storeNonLinearDepth: Boolean
  ) = this()
  def this(
    scene: typingsJapgolly.babylonjs.BABYLON.Scene,
    `type`: Double,
    camera: Nullable[typingsJapgolly.babylonjs.BABYLON.Camera],
    storeNonLinearDepth: Boolean
  ) = this()
  def this(
    scene: typingsJapgolly.babylonjs.BABYLON.Scene,
    `type`: Unit,
    camera: Unit,
    storeNonLinearDepth: Boolean
  ) = this()
  def this(
    scene: typingsJapgolly.babylonjs.BABYLON.Scene,
    `type`: Unit,
    camera: Nullable[typingsJapgolly.babylonjs.BABYLON.Camera],
    storeNonLinearDepth: Boolean
  ) = this()
  def this(
    scene: typingsJapgolly.babylonjs.BABYLON.Scene,
    `type`: Double,
    camera: Unit,
    storeNonLinearDepth: Boolean,
    samplingMode: Double
  ) = this()
  def this(
    scene: typingsJapgolly.babylonjs.BABYLON.Scene,
    `type`: Double,
    camera: Unit,
    storeNonLinearDepth: Unit,
    samplingMode: Double
  ) = this()
  def this(
    scene: typingsJapgolly.babylonjs.BABYLON.Scene,
    `type`: Double,
    camera: Nullable[typingsJapgolly.babylonjs.BABYLON.Camera],
    storeNonLinearDepth: Boolean,
    samplingMode: Double
  ) = this()
  def this(
    scene: typingsJapgolly.babylonjs.BABYLON.Scene,
    `type`: Double,
    camera: Nullable[typingsJapgolly.babylonjs.BABYLON.Camera],
    storeNonLinearDepth: Unit,
    samplingMode: Double
  ) = this()
  def this(
    scene: typingsJapgolly.babylonjs.BABYLON.Scene,
    `type`: Unit,
    camera: Unit,
    storeNonLinearDepth: Boolean,
    samplingMode: Double
  ) = this()
  def this(
    scene: typingsJapgolly.babylonjs.BABYLON.Scene,
    `type`: Unit,
    camera: Unit,
    storeNonLinearDepth: Unit,
    samplingMode: Double
  ) = this()
  def this(
    scene: typingsJapgolly.babylonjs.BABYLON.Scene,
    `type`: Unit,
    camera: Nullable[typingsJapgolly.babylonjs.BABYLON.Camera],
    storeNonLinearDepth: Boolean,
    samplingMode: Double
  ) = this()
  def this(
    scene: typingsJapgolly.babylonjs.BABYLON.Scene,
    `type`: Unit,
    camera: Nullable[typingsJapgolly.babylonjs.BABYLON.Camera],
    storeNonLinearDepth: Unit,
    samplingMode: Double
  ) = this()
}
/* static members */
object DepthRenderer {
  
  @JSGlobal("BABYLON.DepthRenderer")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * @internal
    */
  inline def _SceneComponentInitialization(scene: typingsJapgolly.babylonjs.BABYLON.Scene): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_SceneComponentInitialization")(scene.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
