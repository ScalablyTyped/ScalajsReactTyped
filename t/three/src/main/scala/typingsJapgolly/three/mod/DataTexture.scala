package typingsJapgolly.three.mod

import typingsJapgolly.three.polyfillsMod.TypedArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three", "DataTexture")
@js.native
class DataTexture protected ()
  extends typingsJapgolly.three.dataTextureMod.DataTexture {
  def this(
    data: TypedArray,
    width: Double,
    height: Double,
    format: js.UndefOr[typingsJapgolly.three.constantsMod.PixelFormat],
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

