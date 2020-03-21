package typingsJapgolly.three

import org.scalajs.dom.raw.ImageData
import typingsJapgolly.three.constantsMod.Mapping
import typingsJapgolly.three.constantsMod.PixelFormat
import typingsJapgolly.three.constantsMod.TextureDataType
import typingsJapgolly.three.constantsMod.TextureEncoding
import typingsJapgolly.three.constantsMod.TextureFilter
import typingsJapgolly.three.constantsMod.Wrapping
import typingsJapgolly.three.polyfillsMod.TypedArray
import typingsJapgolly.three.textureMod.Texture
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/textures/DataTexture", JSImport.Namespace)
@js.native
object dataTextureMod extends js.Object {
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

