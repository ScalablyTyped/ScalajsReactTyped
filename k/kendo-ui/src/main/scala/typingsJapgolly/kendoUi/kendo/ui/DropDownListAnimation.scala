package typingsJapgolly.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DropDownListAnimation extends js.Object {
  var close: js.UndefOr[DropDownListAnimationClose] = js.undefined
  var open: js.UndefOr[DropDownListAnimationOpen] = js.undefined
}

object DropDownListAnimation {
  @scala.inline
  def apply(close: DropDownListAnimationClose = null, open: DropDownListAnimationOpen = null): DropDownListAnimation = {
    val __obj = js.Dynamic.literal()
    if (close != null) __obj.updateDynamic("close")(close.asInstanceOf[js.Any])
    if (open != null) __obj.updateDynamic("open")(open.asInstanceOf[js.Any])
    __obj.asInstanceOf[DropDownListAnimation]
  }
}

