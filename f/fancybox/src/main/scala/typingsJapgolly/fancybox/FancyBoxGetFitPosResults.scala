package typingsJapgolly.fancybox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FancyBoxGetFitPosResults extends js.Object {
  var height: js.UndefOr[Double] = js.undefined
  var left: js.UndefOr[Double] = js.undefined
  var top: js.UndefOr[Double] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object FancyBoxGetFitPosResults {
  @scala.inline
  def apply(
    height: Int | Double = null,
    left: Int | Double = null,
    top: Int | Double = null,
    width: Int | Double = null
  ): FancyBoxGetFitPosResults = {
    val __obj = js.Dynamic.literal()
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[FancyBoxGetFitPosResults]
  }
}

