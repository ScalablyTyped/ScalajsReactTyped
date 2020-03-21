package typingsJapgolly.blueimpLoadImage.mod

import typingsJapgolly.blueimpLoadImage.blueimpLoadImageBooleans.`false`
import typingsJapgolly.blueimpLoadImage.blueimpLoadImageBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.blueimpLoadImage.mod.CanvasTrueOptions
  - typingsJapgolly.blueimpLoadImage.mod.CropFalseOptions
*/
trait CropOptions extends js.Object

object CropOptions {
  @scala.inline
  def CanvasTrueOptions(
    canvas: `true`,
    bottom: Int | Double = null,
    crop: js.UndefOr[Boolean] = js.undefined,
    downsamplingRatio: Int | Double = null,
    left: Int | Double = null,
    orientation: Orientation = null,
    pixelRatio: Int | Double = null,
    right: Int | Double = null,
    sourceHeight: Int | Double = null,
    sourceWidth: Int | Double = null,
    top: Int | Double = null
  ): CropOptions = {
    val __obj = js.Dynamic.literal(canvas = canvas.asInstanceOf[js.Any])
    if (bottom != null) __obj.updateDynamic("bottom")(bottom.asInstanceOf[js.Any])
    if (!js.isUndefined(crop)) __obj.updateDynamic("crop")(crop.asInstanceOf[js.Any])
    if (downsamplingRatio != null) __obj.updateDynamic("downsamplingRatio")(downsamplingRatio.asInstanceOf[js.Any])
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    if (pixelRatio != null) __obj.updateDynamic("pixelRatio")(pixelRatio.asInstanceOf[js.Any])
    if (right != null) __obj.updateDynamic("right")(right.asInstanceOf[js.Any])
    if (sourceHeight != null) __obj.updateDynamic("sourceHeight")(sourceHeight.asInstanceOf[js.Any])
    if (sourceWidth != null) __obj.updateDynamic("sourceWidth")(sourceWidth.asInstanceOf[js.Any])
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    __obj.asInstanceOf[CropOptions]
  }
  @scala.inline
  def CropFalseOptions(crop: `false` = null): CropOptions = {
    val __obj = js.Dynamic.literal()
    if (crop != null) __obj.updateDynamic("crop")(crop.asInstanceOf[js.Any])
    __obj.asInstanceOf[CropOptions]
  }
}

