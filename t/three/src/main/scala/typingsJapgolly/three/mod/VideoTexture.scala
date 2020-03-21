package typingsJapgolly.three.mod

import org.scalajs.dom.raw.HTMLVideoElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three", "VideoTexture")
@js.native
class VideoTexture protected ()
  extends typingsJapgolly.three.videoTextureMod.VideoTexture {
  def this(
    video: HTMLVideoElement,
    mapping: js.UndefOr[typingsJapgolly.three.constantsMod.Mapping],
    wrapS: js.UndefOr[typingsJapgolly.three.constantsMod.Wrapping],
    wrapT: js.UndefOr[typingsJapgolly.three.constantsMod.Wrapping],
    magFilter: js.UndefOr[typingsJapgolly.three.constantsMod.TextureFilter],
    minFilter: js.UndefOr[typingsJapgolly.three.constantsMod.TextureFilter],
    format: js.UndefOr[typingsJapgolly.three.constantsMod.PixelFormat],
    `type`: js.UndefOr[typingsJapgolly.three.constantsMod.TextureDataType],
    anisotropy: js.UndefOr[Double]
  ) = this()
}

