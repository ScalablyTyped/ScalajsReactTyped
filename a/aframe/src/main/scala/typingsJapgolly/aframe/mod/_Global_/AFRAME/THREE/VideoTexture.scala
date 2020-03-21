package typingsJapgolly.aframe.mod._Global_.AFRAME.THREE

import org.scalajs.dom.raw.HTMLVideoElement
import typingsJapgolly.three.constantsMod.Mapping
import typingsJapgolly.three.constantsMod.PixelFormat
import typingsJapgolly.three.constantsMod.TextureDataType
import typingsJapgolly.three.constantsMod.TextureFilter
import typingsJapgolly.three.constantsMod.Wrapping
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("AFRAME.THREE.VideoTexture")
@js.native
class VideoTexture protected ()
  extends typingsJapgolly.three.mod.VideoTexture {
  def this(
    video: HTMLVideoElement,
    mapping: js.UndefOr[Mapping],
    wrapS: js.UndefOr[Wrapping],
    wrapT: js.UndefOr[Wrapping],
    magFilter: js.UndefOr[TextureFilter],
    minFilter: js.UndefOr[TextureFilter],
    format: js.UndefOr[PixelFormat],
    `type`: js.UndefOr[TextureDataType],
    anisotropy: js.UndefOr[Double]
  ) = this()
}

