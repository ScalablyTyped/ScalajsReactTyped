package typingsJapgolly.kendoUi.kendo.drawing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SurfaceTooltipAnimation extends js.Object {
  var close: js.UndefOr[SurfaceTooltipAnimationClose] = js.undefined
  var open: js.UndefOr[SurfaceTooltipAnimationOpen] = js.undefined
}

object SurfaceTooltipAnimation {
  @scala.inline
  def apply(close: SurfaceTooltipAnimationClose = null, open: SurfaceTooltipAnimationOpen = null): SurfaceTooltipAnimation = {
    val __obj = js.Dynamic.literal()
    if (close != null) __obj.updateDynamic("close")(close.asInstanceOf[js.Any])
    if (open != null) __obj.updateDynamic("open")(open.asInstanceOf[js.Any])
    __obj.asInstanceOf[SurfaceTooltipAnimation]
  }
}

