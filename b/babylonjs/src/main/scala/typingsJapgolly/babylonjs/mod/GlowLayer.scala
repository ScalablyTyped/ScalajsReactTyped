package typingsJapgolly.babylonjs.mod

import typingsJapgolly.babylonjs.anon.PartialIGlowLayerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs", "GlowLayer")
@js.native
open class GlowLayer protected ()
  extends typingsJapgolly.babylonjs.legacyLegacyMod.GlowLayer {
  /**
    * Instantiates a new glow Layer and references it to the scene.
    * @param name The name of the layer
    * @param scene The scene to use the layer in
    * @param options Sets of none mandatory options to use with the layer (see IGlowLayerOptions for more information)
    */
  def this(name: String) = this()
  def this(name: String, scene: typingsJapgolly.babylonjs.sceneMod.Scene) = this()
  def this(name: String, scene: Unit, options: PartialIGlowLayerOptions) = this()
  def this(name: String, scene: typingsJapgolly.babylonjs.sceneMod.Scene, options: PartialIGlowLayerOptions) = this()
}
/* static members */
object GlowLayer {
  
  @JSImport("babylonjs", "GlowLayer")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * The default blur kernel size used for the glow.
    */
  @JSImport("babylonjs", "GlowLayer.DefaultBlurKernelSize")
  @js.native
  def DefaultBlurKernelSize: Double = js.native
  inline def DefaultBlurKernelSize_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DefaultBlurKernelSize")(x.asInstanceOf[js.Any])
  
  /**
    * The default texture size ratio used for the glow.
    */
  @JSImport("babylonjs", "GlowLayer.DefaultTextureRatio")
  @js.native
  def DefaultTextureRatio: Double = js.native
  inline def DefaultTextureRatio_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DefaultTextureRatio")(x.asInstanceOf[js.Any])
  
  /**
    * Effect Name of the layer.
    */
  @JSImport("babylonjs", "GlowLayer.EffectName")
  @js.native
  val EffectName: String = js.native
  
  /**
    * Creates a Glow Layer from parsed glow layer data
    * @param parsedGlowLayer defines glow layer data
    * @param scene defines the current scene
    * @param rootUrl defines the root URL containing the glow layer information
    * @returns a parsed Glow Layer
    */
  inline def Parse(parsedGlowLayer: Any, scene: typingsJapgolly.babylonjs.sceneMod.Scene, rootUrl: String): typingsJapgolly.babylonjs.layersGlowLayerMod.GlowLayer = (^.asInstanceOf[js.Dynamic].applyDynamic("Parse")(parsedGlowLayer.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.layersGlowLayerMod.GlowLayer]
}
