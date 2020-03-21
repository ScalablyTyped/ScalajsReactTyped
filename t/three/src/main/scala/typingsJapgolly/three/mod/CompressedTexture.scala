package typingsJapgolly.three.mod

import org.scalajs.dom.raw.ImageData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three", "CompressedTexture")
@js.native
class CompressedTexture protected ()
  extends typingsJapgolly.three.compressedTextureMod.CompressedTexture {
  def this(
    mipmaps: js.Array[ImageData],
    width: Double,
    height: Double,
    format: js.UndefOr[typingsJapgolly.three.constantsMod.CompressedPixelFormat],
    `type`: js.UndefOr[typingsJapgolly.three.constantsMod.TextureDataType],
    mapping: js.UndefOr[typingsJapgolly.three.constantsMod.Mapping],
    wrapS: js.UndefOr[typingsJapgolly.three.constantsMod.Wrapping],
    wrapT: js.UndefOr[typingsJapgolly.three.constantsMod.Wrapping],
    magFilter: js.UndefOr[typingsJapgolly.three.constantsMod.TextureFilter],
    minFilter: js.UndefOr[typingsJapgolly.three.constantsMod.TextureFilter],
    anisotropy: js.UndefOr[Double],
    encoding: js.UndefOr[typingsJapgolly.three.constantsMod.TextureEncoding]
  ) = this()
}

