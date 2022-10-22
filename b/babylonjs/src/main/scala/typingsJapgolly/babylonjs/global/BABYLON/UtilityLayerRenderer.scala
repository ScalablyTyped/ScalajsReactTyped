package typingsJapgolly.babylonjs.global.BABYLON

import typingsJapgolly.babylonjs.BABYLON.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.UtilityLayerRenderer")
@js.native
open class UtilityLayerRenderer protected ()
  extends StObject
     with typingsJapgolly.babylonjs.BABYLON.UtilityLayerRenderer {
  /**
    * Instantiates a UtilityLayerRenderer
    * @param originalScene the original scene that will be rendered on top of
    * @param handleEvents boolean indicating if the utility layer should handle events
    */
  def this(/** the original scene that will be rendered on top of */
  originalScene: typingsJapgolly.babylonjs.BABYLON.Scene) = this()
  def this(
    /** the original scene that will be rendered on top of */
  originalScene: typingsJapgolly.babylonjs.BABYLON.Scene,
    handleEvents: Boolean
  ) = this()
  
  /**
    * Releases all held resources
    */
  /* CompleteClass */
  override def dispose(): Unit = js.native
}
/* static members */
object UtilityLayerRenderer {
  
  @JSGlobal("BABYLON.UtilityLayerRenderer")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates an utility layer, and set it as a default utility layer
    * @param scene associated scene
    * @internal
    */
  inline def _CreateDefaultUtilityLayerFromScene(scene: typingsJapgolly.babylonjs.BABYLON.Scene): typingsJapgolly.babylonjs.BABYLON.UtilityLayerRenderer = ^.asInstanceOf[js.Dynamic].applyDynamic("_CreateDefaultUtilityLayerFromScene")(scene.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.babylonjs.BABYLON.UtilityLayerRenderer]
  
  /** @internal */
  @JSGlobal("BABYLON.UtilityLayerRenderer._DefaultKeepDepthUtilityLayer")
  @js.native
  def _DefaultKeepDepthUtilityLayer: Nullable[typingsJapgolly.babylonjs.BABYLON.UtilityLayerRenderer] = js.native
  inline def _DefaultKeepDepthUtilityLayer_=(x: Nullable[typingsJapgolly.babylonjs.BABYLON.UtilityLayerRenderer]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_DefaultKeepDepthUtilityLayer")(x.asInstanceOf[js.Any])
  
  /** @internal */
  @JSGlobal("BABYLON.UtilityLayerRenderer._DefaultUtilityLayer")
  @js.native
  def _DefaultUtilityLayer: Nullable[typingsJapgolly.babylonjs.BABYLON.UtilityLayerRenderer] = js.native
  inline def _DefaultUtilityLayer_=(x: Nullable[typingsJapgolly.babylonjs.BABYLON.UtilityLayerRenderer]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_DefaultUtilityLayer")(x.asInstanceOf[js.Any])
}
