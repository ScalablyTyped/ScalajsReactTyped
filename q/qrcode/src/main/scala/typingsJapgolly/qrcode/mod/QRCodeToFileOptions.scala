package typingsJapgolly.qrcode.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.qrcode.AnonDark
import typingsJapgolly.qrcode.AnonDeflateLevel
import typingsJapgolly.qrcode.qrcodeStrings.png
import typingsJapgolly.qrcode.qrcodeStrings.svg
import typingsJapgolly.qrcode.qrcodeStrings.utf8
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QRCodeToFileOptions extends QRCodeRenderersOptions {
  var rendererOpts: js.UndefOr[AnonDeflateLevel] = js.undefined
  /**
    * Output format.
    * Default: png
    */
  var `type`: js.UndefOr[png | svg | utf8] = js.undefined
}

object QRCodeToFileOptions {
  @scala.inline
  def apply(
    color: AnonDark = null,
    errorCorrectionLevel: QRCodeErrorCorrectionLevel = null,
    margin: Int | Double = null,
    rendererOpts: AnonDeflateLevel = null,
    scale: Int | Double = null,
    toSJISFunc: /* codePoint */ String => CallbackTo[Double] = null,
    `type`: png | svg | utf8 = null,
    version: Int | Double = null,
    width: Int | Double = null
  ): QRCodeToFileOptions = {
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
    __obj.asInstanceOf[QRCodeToFileOptions]
  }
}

