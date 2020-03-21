package typingsJapgolly.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotTilemapStatesOptions extends js.Object {
  /**
    * (Highcharts, Highmaps) Options for the hovered series. These settings
    * override the normal state options when a series is moused over or
    * touched.
    */
  var hover: js.UndefOr[PlotTilemapStatesHoverOptions] = js.undefined
  /**
    * (Highcharts, Highmaps) The opposite state of a hover for series.
    */
  var inactive: js.UndefOr[PlotTilemapStatesInactiveOptions] = js.undefined
  /**
    * (Highcharts, Highmaps) The normal state of a series, or for point items
    * in column, pie and similar series. Currently only used for setting
    * animation when returning to normal state from hover.
    */
  var normal: js.UndefOr[PlotTilemapStatesNormalOptions] = js.undefined
  /**
    * (Highcharts, Highmaps) Specific options for point in selected states,
    * after being selected by allowPointSelect or programmatically.
    */
  var select: js.UndefOr[PlotTilemapStatesSelectOptions] = js.undefined
}

object PlotTilemapStatesOptions {
  @scala.inline
  def apply(
    hover: PlotTilemapStatesHoverOptions = null,
    inactive: PlotTilemapStatesInactiveOptions = null,
    normal: PlotTilemapStatesNormalOptions = null,
    select: PlotTilemapStatesSelectOptions = null
  ): PlotTilemapStatesOptions = {
    val __obj = js.Dynamic.literal()
    if (hover != null) __obj.updateDynamic("hover")(hover.asInstanceOf[js.Any])
    if (inactive != null) __obj.updateDynamic("inactive")(inactive.asInstanceOf[js.Any])
    if (normal != null) __obj.updateDynamic("normal")(normal.asInstanceOf[js.Any])
    if (select != null) __obj.updateDynamic("select")(select.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotTilemapStatesOptions]
  }
}

