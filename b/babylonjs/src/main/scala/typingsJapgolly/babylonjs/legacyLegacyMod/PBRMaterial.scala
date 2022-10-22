package typingsJapgolly.babylonjs.legacyLegacyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Legacy/legacy", "PBRMaterial")
@js.native
open class PBRMaterial protected ()
  extends typingsJapgolly.babylonjs.indexMod.PBRMaterial {
  /**
    * Instantiates a new PBRMaterial instance.
    *
    * @param name The material name
    * @param scene The scene the material will be use in.
    */
  def this(name: String) = this()
  def this(name: String, scene: typingsJapgolly.babylonjs.sceneMod.Scene) = this()
}
/* static members */
object PBRMaterial {
  
  @JSImport("babylonjs/Legacy/legacy", "PBRMaterial")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Defines the default value of how much AO map is occluding the analytical lights
    * (point spot...).
    */
  @JSImport("babylonjs/Legacy/legacy", "PBRMaterial.DEFAULT_AO_ON_ANALYTICAL_LIGHTS")
  @js.native
  def DEFAULT_AO_ON_ANALYTICAL_LIGHTS: Double = js.native
  inline def DEFAULT_AO_ON_ANALYTICAL_LIGHTS_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_AO_ON_ANALYTICAL_LIGHTS")(x.asInstanceOf[js.Any])
  
  /**
    * PBRMaterialTransparencyMode: Pixels are blended (according to the alpha mode) with the already drawn pixels in the current frame buffer.
    */
  @JSImport("babylonjs/Legacy/legacy", "PBRMaterial.PBRMATERIAL_ALPHABLEND")
  @js.native
  val PBRMATERIAL_ALPHABLEND: Double = js.native
  
  /**
    * PBRMaterialTransparencyMode: Alpha Test mode, pixel are discarded below a certain threshold defined by the alpha cutoff value.
    */
  @JSImport("babylonjs/Legacy/legacy", "PBRMaterial.PBRMATERIAL_ALPHATEST")
  @js.native
  val PBRMATERIAL_ALPHATEST: Double = js.native
  
  /**
    * PBRMaterialTransparencyMode: Pixels are blended (according to the alpha mode) with the already drawn pixels in the current frame buffer.
    * They are also discarded below the alpha cutoff threshold to improve performances.
    */
  @JSImport("babylonjs/Legacy/legacy", "PBRMaterial.PBRMATERIAL_ALPHATESTANDBLEND")
  @js.native
  val PBRMATERIAL_ALPHATESTANDBLEND: Double = js.native
  
  /**
    * PBRMaterialTransparencyMode: No transparency mode, Alpha channel is not use.
    */
  @JSImport("babylonjs/Legacy/legacy", "PBRMaterial.PBRMATERIAL_OPAQUE")
  @js.native
  val PBRMATERIAL_OPAQUE: Double = js.native
  
  /**
    * Parses a PBR Material from a serialized object.
    * @param source - Serialized object.
    * @param scene - BJS scene instance.
    * @param rootUrl - url for the scene object
    * @returns - PBRMaterial
    */
  inline def Parse(source: Any, scene: typingsJapgolly.babylonjs.sceneMod.Scene, rootUrl: String): typingsJapgolly.babylonjs.materialsPbrPbrMaterialMod.PBRMaterial = (^.asInstanceOf[js.Dynamic].applyDynamic("Parse")(source.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.materialsPbrPbrMaterialMod.PBRMaterial]
}
