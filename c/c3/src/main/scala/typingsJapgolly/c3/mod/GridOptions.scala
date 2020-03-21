package typingsJapgolly.c3.mod

import typingsJapgolly.c3.AnonFront
import typingsJapgolly.c3.AnonShow
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridOptions extends js.Object {
  var focus: js.UndefOr[AnonShow] = js.undefined
  var lines: js.UndefOr[AnonFront] = js.undefined
  var x: js.UndefOr[AxisGridOptions] = js.undefined
  var y: js.UndefOr[AxisGridOptions] = js.undefined
}

object GridOptions {
  @scala.inline
  def apply(
    focus: AnonShow = null,
    lines: AnonFront = null,
    x: AxisGridOptions = null,
    y: AxisGridOptions = null
  ): GridOptions = {
    val __obj = js.Dynamic.literal()
    if (focus != null) __obj.updateDynamic("focus")(focus.asInstanceOf[js.Any])
    if (lines != null) __obj.updateDynamic("lines")(lines.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridOptions]
  }
}

