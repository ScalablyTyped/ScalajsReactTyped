package typingsJapgolly.jimpPng.mod

import typingsJapgolly.jimpPng.Anon0
import typingsJapgolly.jimpPng.AnonImagepng
import typingsJapgolly.jimpPng.AnonImagepngDecoderFn
import typingsJapgolly.jimpPng.AnonImagepngEncoderFn
import typingsJapgolly.jimpPng.AnonMIMEPNG
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PNG extends js.Object {
  var `class`: PNGClass
  var constants: AnonMIMEPNG
  var decoders: AnonImagepngDecoderFn
  var encoders: AnonImagepngEncoderFn
  var hasAlpha: Anon0
  var mime: AnonImagepng
}

object PNG {
  @scala.inline
  def apply(
    `class`: PNGClass,
    constants: AnonMIMEPNG,
    decoders: AnonImagepngDecoderFn,
    encoders: AnonImagepngEncoderFn,
    hasAlpha: Anon0,
    mime: AnonImagepng
  ): PNG = {
    val __obj = js.Dynamic.literal(constants = constants.asInstanceOf[js.Any], decoders = decoders.asInstanceOf[js.Any], encoders = encoders.asInstanceOf[js.Any], hasAlpha = hasAlpha.asInstanceOf[js.Any], mime = mime.asInstanceOf[js.Any])
    __obj.updateDynamic("class")(`class`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PNG]
  }
}

