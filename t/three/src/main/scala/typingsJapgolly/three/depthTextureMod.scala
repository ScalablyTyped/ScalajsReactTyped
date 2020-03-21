package typingsJapgolly.three

import typingsJapgolly.three.constantsMod.Mapping
import typingsJapgolly.three.constantsMod.TextureDataType
import typingsJapgolly.three.constantsMod.TextureFilter
import typingsJapgolly.three.constantsMod.Wrapping
import typingsJapgolly.three.textureMod.Texture
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/textures/DepthTexture", JSImport.Namespace)
@js.native
object depthTextureMod extends js.Object {
  @js.native
  class DepthTexture protected () extends Texture {
    def this(
      width: Double,
      heighht: Double,
      `type`: js.UndefOr[TextureDataType],
      mapping: js.UndefOr[Mapping],
      wrapS: js.UndefOr[Wrapping],
      wrapT: js.UndefOr[Wrapping],
      magFilter: js.UndefOr[TextureFilter],
      minFilter: js.UndefOr[TextureFilter],
      anisotropy: js.UndefOr[Double]
    ) = this()
    @JSName("image")
    var image_DepthTexture: AnonHeightWidth = js.native
  }
  
}

