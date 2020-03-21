package typingsJapgolly.winrt.Windows.Media.MediaProperties

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IImageEncodingPropertiesStatics extends js.Object {
  def createJpeg(): ImageEncodingProperties
  def createJpegXR(): ImageEncodingProperties
  def createPng(): ImageEncodingProperties
}

object IImageEncodingPropertiesStatics {
  @scala.inline
  def apply(
    createJpeg: CallbackTo[ImageEncodingProperties],
    createJpegXR: CallbackTo[ImageEncodingProperties],
    createPng: CallbackTo[ImageEncodingProperties]
  ): IImageEncodingPropertiesStatics = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("createJpeg")(createJpeg.toJsFn)
    __obj.updateDynamic("createJpegXR")(createJpegXR.toJsFn)
    __obj.updateDynamic("createPng")(createPng.toJsFn)
    __obj.asInstanceOf[IImageEncodingPropertiesStatics]
  }
}

