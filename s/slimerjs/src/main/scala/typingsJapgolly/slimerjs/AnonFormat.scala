package typingsJapgolly.slimerjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFormat extends js.Object {
  var format: js.UndefOr[String] = js.undefined
  var onlyViewport: js.UndefOr[Boolean] = js.undefined
  var quality: js.UndefOr[String] = js.undefined
  var ratio: js.UndefOr[Double] = js.undefined
}

object AnonFormat {
  @scala.inline
  def apply(
    format: String = null,
    onlyViewport: js.UndefOr[Boolean] = js.undefined,
    quality: String = null,
    ratio: Int | Double = null
  ): AnonFormat = {
    val __obj = js.Dynamic.literal()
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (!js.isUndefined(onlyViewport)) __obj.updateDynamic("onlyViewport")(onlyViewport.asInstanceOf[js.Any])
    if (quality != null) __obj.updateDynamic("quality")(quality.asInstanceOf[js.Any])
    if (ratio != null) __obj.updateDynamic("ratio")(ratio.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFormat]
  }
}

