package typingsJapgolly.plupload

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait pluploadResize extends js.Object {
  var crop: js.UndefOr[Boolean] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var preserve_headers: js.UndefOr[Boolean] = js.undefined
  var quality: js.UndefOr[Double] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object pluploadResize {
  @scala.inline
  def apply(
    crop: js.UndefOr[Boolean] = js.undefined,
    height: Int | Double = null,
    preserve_headers: js.UndefOr[Boolean] = js.undefined,
    quality: Int | Double = null,
    width: Int | Double = null
  ): pluploadResize = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(crop)) __obj.updateDynamic("crop")(crop.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(preserve_headers)) __obj.updateDynamic("preserve_headers")(preserve_headers.asInstanceOf[js.Any])
    if (quality != null) __obj.updateDynamic("quality")(quality.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[pluploadResize]
  }
}

