package typingsJapgolly.victory

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined victory.victory.Omit<victory.victory.BlockProps, 'left' | 'right'> */
trait OmitBlockPropsleftright extends js.Object {
  var bottom: js.UndefOr[Double] = js.undefined
  var top: js.UndefOr[Double] = js.undefined
}

object OmitBlockPropsleftright {
  @scala.inline
  def apply(bottom: Int | Double = null, top: Int | Double = null): OmitBlockPropsleftright = {
    val __obj = js.Dynamic.literal()
    if (bottom != null) __obj.updateDynamic("bottom")(bottom.asInstanceOf[js.Any])
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    __obj.asInstanceOf[OmitBlockPropsleftright]
  }
}

