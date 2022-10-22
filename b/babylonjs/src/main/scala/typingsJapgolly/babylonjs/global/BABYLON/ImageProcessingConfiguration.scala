package typingsJapgolly.babylonjs.global.BABYLON

import typingsJapgolly.babylonjs.BABYLON.IImageProcessingConfigurationDefines
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.ImageProcessingConfiguration")
@js.native
open class ImageProcessingConfiguration ()
  extends StObject
     with typingsJapgolly.babylonjs.BABYLON.ImageProcessingConfiguration
/* static members */
object ImageProcessingConfiguration {
  
  @JSGlobal("BABYLON.ImageProcessingConfiguration")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Parses the image processing from a json representation.
    * @param source the JSON source to parse
    * @returns The parsed image processing
    */
  inline def Parse(source: Any): typingsJapgolly.babylonjs.BABYLON.ImageProcessingConfiguration = ^.asInstanceOf[js.Dynamic].applyDynamic("Parse")(source.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.babylonjs.BABYLON.ImageProcessingConfiguration]
  
  /**
    * Prepare the list of samplers associated with the Image Processing effects.
    * @param samplersList The list of uniforms used in the effect
    * @param defines the list of defines currently in use
    */
  inline def PrepareSamplers(samplersList: js.Array[String], defines: IImageProcessingConfigurationDefines): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("PrepareSamplers")(samplersList.asInstanceOf[js.Any], defines.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Prepare the list of uniforms associated with the Image Processing effects.
    * @param uniforms The list of uniforms used in the effect
    * @param defines the list of defines currently in use
    */
  inline def PrepareUniforms(uniforms: js.Array[String], defines: IImageProcessingConfigurationDefines): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("PrepareUniforms")(uniforms.asInstanceOf[js.Any], defines.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * ACES Tone mapping (used by default in unreal and unity). This can help getting closer
    * to other engines rendering to increase portability.
    */
  @JSGlobal("BABYLON.ImageProcessingConfiguration.TONEMAPPING_ACES")
  @js.native
  val TONEMAPPING_ACES: /* 1 */ Double = js.native
  
  /**
    * Default tone mapping applied in BabylonJS.
    */
  @JSGlobal("BABYLON.ImageProcessingConfiguration.TONEMAPPING_STANDARD")
  @js.native
  val TONEMAPPING_STANDARD: /* 0 */ Double = js.native
  
  @JSGlobal("BABYLON.ImageProcessingConfiguration._VIGNETTEMODE_MULTIPLY")
  @js.native
  def _VIGNETTEMODE_MULTIPLY: Any = js.native
  inline def _VIGNETTEMODE_MULTIPLY_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_VIGNETTEMODE_MULTIPLY")(x.asInstanceOf[js.Any])
  
  @JSGlobal("BABYLON.ImageProcessingConfiguration._VIGNETTEMODE_OPAQUE")
  @js.native
  def _VIGNETTEMODE_OPAQUE: Any = js.native
  inline def _VIGNETTEMODE_OPAQUE_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_VIGNETTEMODE_OPAQUE")(x.asInstanceOf[js.Any])
}
