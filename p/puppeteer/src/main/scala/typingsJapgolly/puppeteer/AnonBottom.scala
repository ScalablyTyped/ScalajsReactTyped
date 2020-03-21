package typingsJapgolly.puppeteer

import typingsJapgolly.puppeteer.mod.LayoutDimension
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBottom extends js.Object {
  /** Bottom margin. */
  var bottom: js.UndefOr[LayoutDimension] = js.undefined
  /** Left margin. */
  var left: js.UndefOr[LayoutDimension] = js.undefined
  /** Right margin. */
  var right: js.UndefOr[LayoutDimension] = js.undefined
  /** Top margin. */
  var top: js.UndefOr[LayoutDimension] = js.undefined
}

object AnonBottom {
  @scala.inline
  def apply(
    bottom: LayoutDimension = null,
    left: LayoutDimension = null,
    right: LayoutDimension = null,
    top: LayoutDimension = null
  ): AnonBottom = {
    val __obj = js.Dynamic.literal()
    if (bottom != null) __obj.updateDynamic("bottom")(bottom.asInstanceOf[js.Any])
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (right != null) __obj.updateDynamic("right")(right.asInstanceOf[js.Any])
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBottom]
  }
}

