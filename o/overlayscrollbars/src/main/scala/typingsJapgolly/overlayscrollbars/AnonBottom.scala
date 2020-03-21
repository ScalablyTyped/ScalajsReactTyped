package typingsJapgolly.overlayscrollbars

import typingsJapgolly.overlayscrollbars.mod.Margin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBottom extends js.Object {
  var bottom: js.UndefOr[Margin] = js.undefined
  var left: js.UndefOr[Margin] = js.undefined
  var right: js.UndefOr[Margin] = js.undefined
  var top: js.UndefOr[Margin] = js.undefined
}

object AnonBottom {
  @scala.inline
  def apply(bottom: Margin = null, left: Margin = null, right: Margin = null, top: Margin = null): AnonBottom = {
    val __obj = js.Dynamic.literal()
    if (bottom != null) __obj.updateDynamic("bottom")(bottom.asInstanceOf[js.Any])
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (right != null) __obj.updateDynamic("right")(right.asInstanceOf[js.Any])
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBottom]
  }
}

