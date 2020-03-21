package typingsJapgolly.victory

import typingsJapgolly.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAxis extends js.Object {
  var axis: js.UndefOr[CSSProperties] = js.undefined
  var axisLabel: js.UndefOr[CSSProperties] = js.undefined
  var grid: js.UndefOr[CSSProperties] = js.undefined
  var tickLabels: js.UndefOr[CSSProperties] = js.undefined
  var ticks: js.UndefOr[CSSProperties] = js.undefined
}

object AnonAxis {
  @scala.inline
  def apply(
    axis: CSSProperties = null,
    axisLabel: CSSProperties = null,
    grid: CSSProperties = null,
    tickLabels: CSSProperties = null,
    ticks: CSSProperties = null
  ): AnonAxis = {
    val __obj = js.Dynamic.literal()
    if (axis != null) __obj.updateDynamic("axis")(axis.asInstanceOf[js.Any])
    if (axisLabel != null) __obj.updateDynamic("axisLabel")(axisLabel.asInstanceOf[js.Any])
    if (grid != null) __obj.updateDynamic("grid")(grid.asInstanceOf[js.Any])
    if (tickLabels != null) __obj.updateDynamic("tickLabels")(tickLabels.asInstanceOf[js.Any])
    if (ticks != null) __obj.updateDynamic("ticks")(ticks.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAxis]
  }
}

