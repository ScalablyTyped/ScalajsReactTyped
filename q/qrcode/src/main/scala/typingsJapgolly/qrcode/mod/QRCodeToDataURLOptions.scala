package typingsJapgolly.qrcode.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.qrcode.AnonDark
import typingsJapgolly.qrcode.AnonQuality
import typingsJapgolly.qrcode.qrcodeStrings.imageSlashjpeg
import typingsJapgolly.qrcode.qrcodeStrings.imageSlashpng
import typingsJapgolly.qrcode.qrcodeStrings.imageSlashwebp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QRCodeToDataURLOptions extends QRCodeRenderersOptions {
  var rendererOpts: js.UndefOr[AnonQuality] = js.undefined
  /**
    * Data URI format.
    * Default: image/png
    */
  var `type`: js.UndefOr[imageSlashpng | imageSlashjpeg | imageSlashwebp] = js.undefined
}

object QRCodeToDataURLOptions {
  @scala.inline
  def apply(
    color: AnonDark = null,
    errorCorrectionLevel: QRCodeErrorCorrectionLevel = null,
    margin: Int | Double = null,
    rendererOpts: AnonQuality = null,
    scale: Int | Double = null,
    toSJISFunc: /* codePoint */ String => CallbackTo[Double] = null,
    `type`: imageSlashpng | imageSlashjpeg | imageSlashwebp = null,
    version: Int | Double = null,
    width: Int | Double = null
  ): QRCodeToDataURLOptions = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (errorCorrectionLevel != null) __obj.updateDynamic("errorCorrectionLevel")(errorCorrectionLevel.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (rendererOpts != null) __obj.updateDynamic("rendererOpts")(rendererOpts.asInstanceOf[js.Any])
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (toSJISFunc != null) __obj.updateDynamic("toSJISFunc")(js.Any.fromFunction1((t0: /* codePoint */ java.lang.String) => toSJISFunc(t0).runNow()))
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[QRCodeToDataURLOptions]
  }
}

