package typingsJapgolly.babylonjs.global.BABYLON

import typingsJapgolly.babylonjs.BABYLON.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.HDRCubeTexture")
@js.native
open class HDRCubeTexture protected ()
  extends StObject
     with typingsJapgolly.babylonjs.BABYLON.HDRCubeTexture {
  /**
    * Instantiates an HDRTexture from the following parameters.
    *
    * @param url The location of the HDR raw data (Panorama stored in RGBE format)
    * @param sceneOrEngine The scene or engine the texture will be used in
    * @param size The cubemap desired size (the more it increases the longer the generation will be)
    * @param noMipmap Forces to not generate the mipmap if true
    * @param generateHarmonics Specifies whether you want to extract the polynomial harmonics during the generation process
    * @param gammaSpace Specifies if the texture will be use in gamma or linear space (the PBR material requires those texture in linear space, but the standard material would require them in Gamma space)
    * @param prefilterOnLoad Prefilters HDR texture to allow use of this texture as a PBR reflection texture.
    * @param onLoad
    * @param onError
    */
  def this(
    url: String,
    sceneOrEngine: typingsJapgolly.babylonjs.BABYLON.Scene | typingsJapgolly.babylonjs.BABYLON.ThinEngine,
    size: Double,
    noMipmap: js.UndefOr[Boolean],
    generateHarmonics: js.UndefOr[Boolean],
    gammaSpace: js.UndefOr[Boolean],
    prefilterOnLoad: js.UndefOr[Boolean],
    onLoad: js.UndefOr[Nullable[js.Function0[Unit]]],
    onError: js.UndefOr[
        Nullable[
          js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[Any], Unit]
        ]
      ]
  ) = this()
  
  /**
    * Array of animations
    */
  /* CompleteClass */
  var animations: Nullable[js.Array[typingsJapgolly.babylonjs.BABYLON.Animation]] = js.native
}
/* static members */
object HDRCubeTexture {
  
  @JSGlobal("BABYLON.HDRCubeTexture")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Parses a JSON representation of an HDR Texture in order to create the texture
    * @param parsedTexture Define the JSON representation
    * @param scene Define the scene the texture should be created in
    * @param rootUrl Define the root url in case we need to load relative dependencies
    * @returns the newly created texture after parsing
    */
  inline def Parse(parsedTexture: Any, scene: typingsJapgolly.babylonjs.BABYLON.Scene, rootUrl: String): Nullable[typingsJapgolly.babylonjs.BABYLON.HDRCubeTexture] = (^.asInstanceOf[js.Dynamic].applyDynamic("Parse")(parsedTexture.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any])).asInstanceOf[Nullable[typingsJapgolly.babylonjs.BABYLON.HDRCubeTexture]]
  
  @JSGlobal("BABYLON.HDRCubeTexture._FacesMapping")
  @js.native
  def _FacesMapping: Any = js.native
  inline def _FacesMapping_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_FacesMapping")(x.asInstanceOf[js.Any])
}
