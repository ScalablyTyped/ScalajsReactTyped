package typingsJapgolly.three

import org.scalajs.dom.raw.ImageData
import typingsJapgolly.three.srcConstantsMod.Mapping
import typingsJapgolly.three.srcConstantsMod.PixelFormat
import typingsJapgolly.three.srcConstantsMod.TextureDataType
import typingsJapgolly.three.srcConstantsMod.TextureEncoding
import typingsJapgolly.three.srcConstantsMod.TextureFilter
import typingsJapgolly.three.srcConstantsMod.Wrapping
import typingsJapgolly.three.srcPolyfillsMod.TypedArray
import typingsJapgolly.three.srcTexturesTextureMod.Texture
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/textures/DataTexture", JSImport.Namespace)
@js.native
object srcTexturesDataTextureMod extends js.Object {
  @js.native
  class DataTexture protected () extends Texture {
    def this(
      data: TypedArray,
      width: Double,
      height: Double,
      format: js.UndefOr[PixelFormat],
      `type`: js.UndefOr[TextureDataType],
      mapping: js.UndefOr[Mapping],
      wrapS: js.UndefOr[Wrapping],
      wrapT: js.UndefOr[Wrapping],
      magFilter: js.UndefOr[TextureFilter],
      minFilter: js.UndefOr[TextureFilter],
      anisotropy: js.UndefOr[Double],
      encoding: js.UndefOr[TextureEncoding]
    ) = this()
    @JSName("image")
    var image_DataTexture: ImageData = js.native
  }
  
}

