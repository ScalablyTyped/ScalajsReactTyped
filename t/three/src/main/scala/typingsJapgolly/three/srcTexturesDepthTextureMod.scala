package typingsJapgolly.three

import typingsJapgolly.three.anon.Width
import typingsJapgolly.three.srcConstantsMod.Mapping
import typingsJapgolly.three.srcConstantsMod.TextureDataType
import typingsJapgolly.three.srcConstantsMod.TextureFilter
import typingsJapgolly.three.srcConstantsMod.Wrapping
import typingsJapgolly.three.srcTexturesTextureMod.Texture
import typingsJapgolly.three.threeBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcTexturesDepthTextureMod {
  
  @JSImport("three/src/textures/DepthTexture", "DepthTexture")
  @js.native
  open class DepthTexture protected () extends Texture {
    /**
      * @param width
      * @param height
      * @param type
      * @param [mapping=THREE.Texture.DEFAULT_MAPPING]
      * @param [wrapS=THREE.ClampToEdgeWrapping]
      * @param [wrapT=THREE.ClampToEdgeWrapping]
      * @param [magFilter=THREE.NearestFilter]
      * @param [minFilter=THREE.NearestFilter]
      * @param [anisotropy=1]
      */
    def this(
      width: Double,
      height: Double,
      `type`: js.UndefOr[TextureDataType],
      mapping: js.UndefOr[Mapping],
      wrapS: js.UndefOr[Wrapping],
      wrapT: js.UndefOr[Wrapping],
      magFilter: js.UndefOr[TextureFilter],
      minFilter: js.UndefOr[TextureFilter],
      anisotropy: js.UndefOr[Double]
    ) = this()
    
    def image_=(value: Width): Unit = js.native
    
    val isDepthTexture: `true` = js.native
  }
}
