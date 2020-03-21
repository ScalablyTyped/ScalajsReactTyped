package typingsJapgolly.jimpTiff.mod

import typingsJapgolly.jimpTiff.AnonImagetiff
import typingsJapgolly.jimpTiff.AnonImagetiffDecoderFn
import typingsJapgolly.jimpTiff.AnonImagetiffEncoderFn
import typingsJapgolly.jimpTiff.AnonMIMETIFF
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Tiff extends js.Object {
  var constants: AnonMIMETIFF
  var decoders: AnonImagetiffDecoderFn
  var encoders: AnonImagetiffEncoderFn
  var mime: AnonImagetiff
}

object Tiff {
  @scala.inline
  def apply(
    constants: AnonMIMETIFF,
    decoders: AnonImagetiffDecoderFn,
    encoders: AnonImagetiffEncoderFn,
    mime: AnonImagetiff
  ): Tiff = {
    val __obj = js.Dynamic.literal(constants = constants.asInstanceOf[js.Any], decoders = decoders.asInstanceOf[js.Any], encoders = encoders.asInstanceOf[js.Any], mime = mime.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Tiff]
  }
}

