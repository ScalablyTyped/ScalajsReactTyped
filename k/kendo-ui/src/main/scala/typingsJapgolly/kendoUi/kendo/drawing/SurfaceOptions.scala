package typingsJapgolly.kendoUi.kendo.drawing

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SurfaceOptions extends js.Object {
  var click: js.UndefOr[js.Function1[/* e */ SurfaceClickEvent, Unit]] = js.undefined
  var height: js.UndefOr[String] = js.undefined
  var mouseenter: js.UndefOr[js.Function1[/* e */ SurfaceMouseenterEvent, Unit]] = js.undefined
  var mouseleave: js.UndefOr[js.Function1[/* e */ SurfaceMouseleaveEvent, Unit]] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var tooltip: js.UndefOr[SurfaceTooltip] = js.undefined
  var tooltipClose: js.UndefOr[js.Function1[/* e */ SurfaceTooltipCloseEvent, Unit]] = js.undefined
  var tooltipOpen: js.UndefOr[js.Function1[/* e */ SurfaceTooltipOpenEvent, Unit]] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
  var width: js.UndefOr[String] = js.undefined
}

object SurfaceOptions {
  @scala.inline
  def apply(
    click: /* e */ SurfaceClickEvent => Callback = null,
    height: String = null,
    mouseenter: /* e */ SurfaceMouseenterEvent => Callback = null,
    mouseleave: /* e */ SurfaceMouseleaveEvent => Callback = null,
    name: String = null,
    tooltip: SurfaceTooltip = null,
    tooltipClose: /* e */ SurfaceTooltipCloseEvent => Callback = null,
    tooltipOpen: /* e */ SurfaceTooltipOpenEvent => Callback = null,
    `type`: String = null,
    width: String = null
  ): SurfaceOptions = {
    val __obj = js.Dynamic.literal()
    if (click != null) __obj.updateDynamic("click")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.drawing.SurfaceClickEvent) => click(t0).runNow()))
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (mouseenter != null) __obj.updateDynamic("mouseenter")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.drawing.SurfaceMouseenterEvent) => mouseenter(t0).runNow()))
    if (mouseleave != null) __obj.updateDynamic("mouseleave")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.drawing.SurfaceMouseleaveEvent) => mouseleave(t0).runNow()))
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    if (tooltipClose != null) __obj.updateDynamic("tooltipClose")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.drawing.SurfaceTooltipCloseEvent) => tooltipClose(t0).runNow()))
    if (tooltipOpen != null) __obj.updateDynamic("tooltipOpen")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.drawing.SurfaceTooltipOpenEvent) => tooltipOpen(t0).runNow()))
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[SurfaceOptions]
  }
}

