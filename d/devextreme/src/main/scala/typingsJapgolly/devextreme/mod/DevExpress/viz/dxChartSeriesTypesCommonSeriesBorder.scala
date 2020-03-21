package typingsJapgolly.devextreme.mod.DevExpress.viz

import typingsJapgolly.devextreme.devextremeStrings.dash
import typingsJapgolly.devextreme.devextremeStrings.dot
import typingsJapgolly.devextreme.devextremeStrings.longDash
import typingsJapgolly.devextreme.devextremeStrings.solid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Configures the series border (in area-like series) or the series point border (in bar-like and bubble series). */
trait dxChartSeriesTypesCommonSeriesBorder extends js.Object {
  /** Colors the series border (in area-like series) or the series point border (in bar-like and bubble series). */
  var color: js.UndefOr[String] = js.undefined
  /** Sets a dash style for the series border (in area-like series) or for the series point border (in bar-like and bubble series). */
  var dashStyle: js.UndefOr[dash | dot | longDash | solid] = js.undefined
  /** Shows the series border (in area-like series) or the series point border (in bar-like and bubble series). */
  var visible: js.UndefOr[Boolean] = js.undefined
  /** Sets a pixel-measured width for the series border (in area-like series) or for the series point border (in bar-like and bubble series). */
  var width: js.UndefOr[Double] = js.undefined
}

object dxChartSeriesTypesCommonSeriesBorder {
  @scala.inline
  def apply(
    color: String = null,
    dashStyle: dash | dot | longDash | solid = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    width: Int | Double = null
  ): dxChartSeriesTypesCommonSeriesBorder = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (dashStyle != null) __obj.updateDynamic("dashStyle")(dashStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxChartSeriesTypesCommonSeriesBorder]
  }
}

