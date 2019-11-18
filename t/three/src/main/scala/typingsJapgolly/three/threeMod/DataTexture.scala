package typingsJapgolly.three.threeMod

import typingsJapgolly.three.srcPolyfillsMod.TypedArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three", "DataTexture")
@js.native
class DataTexture protected ()
  extends typingsJapgolly.three.srcTexturesDataTextureMod.DataTexture {
  def this(
    data: TypedArray,
    width: Double,
    height: Double,
    format: js.UndefOr[typingsJapgolly.three.srcConstantsMod.PixelFormat],
    `type`: js.UndefOr[typingsJapgolly.three.srcConstantsMod.TextureDataType],
    mapping: js.UndefOr[typingsJapgolly.three.srcConstantsMod.Mapping],
    wrapS: js.UndefOr[typingsJapgolly.three.srcConstantsMod.Wrapping],
    wrapT: js.UndefOr[typingsJapgolly.three.srcConstantsMod.Wrapping],
    magFilter: js.UndefOr[typingsJapgolly.three.srcConstantsMod.TextureFilter],
    minFilter: js.UndefOr[typingsJapgolly.three.srcConstantsMod.TextureFilter],
    anisotropy: js.UndefOr[Double],
    encoding: js.UndefOr[typingsJapgolly.three.srcConstantsMod.TextureEncoding]
  ) = this()
}

