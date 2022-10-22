package typingsJapgolly.babylonjs.renderingIndexMod

import typingsJapgolly.babylonjs.sceneMod.Scene
import typingsJapgolly.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Rendering/index", "UtilityLayerRenderer")
@js.native
open class UtilityLayerRenderer protected ()
  extends typingsJapgolly.babylonjs.renderingUtilityLayerRendererMod.UtilityLayerRenderer {
  /**
    * Instantiates a UtilityLayerRenderer
    * @param originalScene the original scene that will be rendered on top of
    * @param handleEvents boolean indicating if the utility layer should handle events
    */
  def this(/** the original scene that will be rendered on top of */
  originalScene: Scene) = this()
  def this(
    /** the original scene that will be rendered on top of */
  originalScene: Scene,
    handleEvents: Boolean
  ) = this()
}
/* static members */
object UtilityLayerRenderer {
  
  @JSImport("babylonjs/Rendering/index", "UtilityLayerRenderer")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates an utility layer, and set it as a default utility layer
    * @param scene associated scene
    * @internal
    */
  inline def _CreateDefaultUtilityLayerFromScene(scene: Scene): typingsJapgolly.babylonjs.renderingUtilityLayerRendererMod.UtilityLayerRenderer = ^.asInstanceOf[js.Dynamic].applyDynamic("_CreateDefaultUtilityLayerFromScene")(scene.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.babylonjs.renderingUtilityLayerRendererMod.UtilityLayerRenderer]
  
  /** @internal */
  @JSImport("babylonjs/Rendering/index", "UtilityLayerRenderer._DefaultKeepDepthUtilityLayer")
  @js.native
  def _DefaultKeepDepthUtilityLayer: Nullable[typingsJapgolly.babylonjs.renderingUtilityLayerRendererMod.UtilityLayerRenderer] = js.native
  inline def _DefaultKeepDepthUtilityLayer_=(x: Nullable[typingsJapgolly.babylonjs.renderingUtilityLayerRendererMod.UtilityLayerRenderer]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_DefaultKeepDepthUtilityLayer")(x.asInstanceOf[js.Any])
  
  /** @internal */
  @JSImport("babylonjs/Rendering/index", "UtilityLayerRenderer._DefaultUtilityLayer")
  @js.native
  def _DefaultUtilityLayer: Nullable[typingsJapgolly.babylonjs.renderingUtilityLayerRendererMod.UtilityLayerRenderer] = js.native
  inline def _DefaultUtilityLayer_=(x: Nullable[typingsJapgolly.babylonjs.renderingUtilityLayerRendererMod.UtilityLayerRenderer]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_DefaultUtilityLayer")(x.asInstanceOf[js.Any])
}
