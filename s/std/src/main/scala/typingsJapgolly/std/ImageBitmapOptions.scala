package typingsJapgolly.std

import typingsJapgolly.std.stdStrings.default
import typingsJapgolly.std.stdStrings.flipY
import typingsJapgolly.std.stdStrings.high
import typingsJapgolly.std.stdStrings.low
import typingsJapgolly.std.stdStrings.medium
import typingsJapgolly.std.stdStrings.none
import typingsJapgolly.std.stdStrings.pixelated
import typingsJapgolly.std.stdStrings.premultiply
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageBitmapOptions extends js.Object {
  var colorSpaceConversion: js.UndefOr[none | default] = js.undefined
  var imageOrientation: js.UndefOr[none | flipY] = js.undefined
  var premultiplyAlpha: js.UndefOr[none | premultiply | default] = js.undefined
  var resizeHeight: js.UndefOr[Double] = js.undefined
  var resizeQuality: js.UndefOr[pixelated | low | medium | high] = js.undefined
  var resizeWidth: js.UndefOr[Double] = js.undefined
}

object ImageBitmapOptions {
  @scala.inline
  def apply(
    colorSpaceConversion: none | default = null,
    imageOrientation: none | flipY = null,
    premultiplyAlpha: none | premultiply | default = null,
    resizeHeight: Int | Double = null,
    resizeQuality: pixelated | low | medium | high = null,
    resizeWidth: Int | Double = null
  ): ImageBitmapOptions = {
    val __obj = js.Dynamic.literal()
    if (colorSpaceConversion != null) __obj.updateDynamic("colorSpaceConversion")(colorSpaceConversion.asInstanceOf[js.Any])
    if (imageOrientation != null) __obj.updateDynamic("imageOrientation")(imageOrientation.asInstanceOf[js.Any])
    if (premultiplyAlpha != null) __obj.updateDynamic("premultiplyAlpha")(premultiplyAlpha.asInstanceOf[js.Any])
    if (resizeHeight != null) __obj.updateDynamic("resizeHeight")(resizeHeight.asInstanceOf[js.Any])
    if (resizeQuality != null) __obj.updateDynamic("resizeQuality")(resizeQuality.asInstanceOf[js.Any])
    if (resizeWidth != null) __obj.updateDynamic("resizeWidth")(resizeWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageBitmapOptions]
  }
}

