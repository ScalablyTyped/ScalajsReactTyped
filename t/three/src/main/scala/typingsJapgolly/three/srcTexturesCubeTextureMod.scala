package typingsJapgolly.three

import typingsJapgolly.three.srcConstantsMod.Mapping
import typingsJapgolly.three.srcConstantsMod.PixelFormat
import typingsJapgolly.three.srcConstantsMod.TextureDataType
import typingsJapgolly.three.srcConstantsMod.TextureEncoding
import typingsJapgolly.three.srcConstantsMod.TextureFilter
import typingsJapgolly.three.srcConstantsMod.Wrapping
import typingsJapgolly.three.srcTexturesTextureMod.Texture
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/textures/CubeTexture", JSImport.Namespace)
@js.native
object srcTexturesCubeTextureMod extends js.Object {
  @js.native
  class CubeTexture protected () extends Texture {
    def this(
       // HTMLImageElement or HTMLCanvasElement
    images: js.UndefOr[js.Array[_]],
      mapping: js.UndefOr[Mapping],
      wrapS: js.UndefOr[Wrapping],
      wrapT: js.UndefOr[Wrapping],
      magFilter: js.UndefOr[TextureFilter],
      minFilter: js.UndefOr[TextureFilter],
      format: js.UndefOr[PixelFormat],
      `type`: js.UndefOr[TextureDataType],
      anisotropy: js.UndefOr[Double],
      encoding: js.UndefOr[TextureEncoding]
    ) = this()
    var images: js.Any = js.native
  }
  
}

