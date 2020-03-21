package typingsJapgolly.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotItemMarkerStatesOptions extends js.Object {
  /**
    * (Highcharts) The hover state for a single point marker.
    */
  var hover: js.UndefOr[PlotItemMarkerStatesHoverOptions] = js.undefined
  var inactive: js.UndefOr[PlotItemMarkerStatesInactiveOptions] = js.undefined
  /**
    * (Highcharts) The normal state of a single point marker. Currently only
    * used for setting animation when returning to normal state from hover.
    */
  var normal: js.UndefOr[PlotItemMarkerStatesNormalOptions] = js.undefined
  /**
    * (Highcharts) The appearance of the point marker when selected. In order
    * to allow a point to be selected, set the `series.allowPointSelect` option
    * to true.
    */
  var select: js.UndefOr[PlotItemMarkerStatesSelectOptions] = js.undefined
}

object PlotItemMarkerStatesOptions {
  @scala.inline
  def apply(
    hover: PlotItemMarkerStatesHoverOptions = null,
    inactive: PlotItemMarkerStatesInactiveOptions = null,
    normal: PlotItemMarkerStatesNormalOptions = null,
    select: PlotItemMarkerStatesSelectOptions = null
  ): PlotItemMarkerStatesOptions = {
    val __obj = js.Dynamic.literal()
    if (hover != null) __obj.updateDynamic("hover")(hover.asInstanceOf[js.Any])
    if (inactive != null) __obj.updateDynamic("inactive")(inactive.asInstanceOf[js.Any])
    if (normal != null) __obj.updateDynamic("normal")(normal.asInstanceOf[js.Any])
    if (select != null) __obj.updateDynamic("select")(select.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotItemMarkerStatesOptions]
  }
}

