package typingsJapgolly.vis.mod

import typingsJapgolly.vis.visStrings.cap
import typingsJapgolly.vis.visStrings.flip
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimelineTooltipOption extends js.Object {
  var followMouse: js.UndefOr[Boolean] = js.undefined
  var overflowMethod: js.UndefOr[cap | flip] = js.undefined
}

object TimelineTooltipOption {
  @scala.inline
  def apply(followMouse: js.UndefOr[Boolean] = js.undefined, overflowMethod: cap | flip = null): TimelineTooltipOption = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(followMouse)) __obj.updateDynamic("followMouse")(followMouse.asInstanceOf[js.Any])
    if (overflowMethod != null) __obj.updateDynamic("overflowMethod")(overflowMethod.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimelineTooltipOption]
  }
}

