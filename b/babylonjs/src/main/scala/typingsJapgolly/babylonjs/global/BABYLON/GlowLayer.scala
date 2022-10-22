package typingsJapgolly.babylonjs.global.BABYLON

import typingsJapgolly.babylonjs.anon.PartialIGlowLayerOptionsAlphaBlendingMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.GlowLayer")
@js.native
open class GlowLayer protected ()
  extends StObject
     with typingsJapgolly.babylonjs.BABYLON.GlowLayer {
  /**
    * Instantiates a new glow Layer and references it to the scene.
    * @param name The name of the layer
    * @param scene The scene to use the layer in
    * @param options Sets of none mandatory options to use with the layer (see IGlowLayerOptions for more information)
    */
  def this(name: String) = this()
  def this(name: String, scene: typingsJapgolly.babylonjs.BABYLON.Scene) = this()
  def this(name: String, scene: Unit, options: PartialIGlowLayerOptionsAlphaBlendingMode) = this()
  def this(
    name: String,
    scene: typingsJapgolly.babylonjs.BABYLON.Scene,
    options: PartialIGlowLayerOptionsAlphaBlendingMode
  ) = this()
}
/* static members */
object GlowLayer {
  
  @JSGlobal("BABYLON.GlowLayer")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * The default blur kernel size used for the glow.
    */
  @JSGlobal("BABYLON.GlowLayer.DefaultBlurKernelSize")
  @js.native
  def DefaultBlurKernelSize: Double = js.native
  inline def DefaultBlurKernelSize_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DefaultBlurKernelSize")(x.asInstanceOf[js.Any])
  
  /**
    * The default texture size ratio used for the glow.
    */
  @JSGlobal("BABYLON.GlowLayer.DefaultTextureRatio")
  @js.native
  def DefaultTextureRatio: Double = js.native
  inline def DefaultTextureRatio_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DefaultTextureRatio")(x.asInstanceOf[js.Any])
  
  /**
    * Effect Name of the layer.
    */
  @JSGlobal("BABYLON.GlowLayer.EffectName")
  @js.native
  val EffectName: /* "GlowLayer" */ String = js.native
  
  /**
    * Creates a Glow Layer from parsed glow layer data
    * @param parsedGlowLayer defines glow layer data
    * @param scene defines the current scene
    * @param rootUrl defines the root URL containing the glow layer information
    * @returns a parsed Glow Layer
    */
  inline def Parse(parsedGlowLayer: Any, scene: typingsJapgolly.babylonjs.BABYLON.Scene, rootUrl: String): typingsJapgolly.babylonjs.BABYLON.GlowLayer = (^.asInstanceOf[js.Dynamic].applyDynamic("Parse")(parsedGlowLayer.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.BABYLON.GlowLayer]
}
