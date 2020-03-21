package typingsJapgolly.three.mod

import org.scalajs.dom.raw.HTMLCanvasElement
import org.scalajs.dom.raw.HTMLImageElement
import org.scalajs.dom.raw.HTMLVideoElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three", "Texture")
@js.native
class Texture protected ()
  extends typingsJapgolly.three.textureMod.Texture {
  def this(
    image: js.UndefOr[HTMLCanvasElement | HTMLImageElement | HTMLVideoElement],
    mapping: js.UndefOr[typingsJapgolly.three.constantsMod.Mapping],
    wrapS: js.UndefOr[typingsJapgolly.three.constantsMod.Wrapping],
    wrapT: js.UndefOr[typingsJapgolly.three.constantsMod.Wrapping],
    magFilter: js.UndefOr[typingsJapgolly.three.constantsMod.TextureFilter],
    minFilter: js.UndefOr[typingsJapgolly.three.constantsMod.TextureFilter],
    format: js.UndefOr[typingsJapgolly.three.constantsMod.PixelFormat],
    `type`: js.UndefOr[typingsJapgolly.three.constantsMod.TextureDataType],
    anisotropy: js.UndefOr[Double],
    encoding: js.UndefOr[typingsJapgolly.three.constantsMod.TextureEncoding]
  ) = this()
}

/* static members */
@JSImport("three", "Texture")
@js.native
object Texture extends js.Object {
  var DEFAULT_IMAGE: js.Any = js.native
  var DEFAULT_MAPPING: js.Any = js.native
}

