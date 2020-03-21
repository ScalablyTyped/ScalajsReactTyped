package typingsJapgolly.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotMapbubbleMarkerStatesOptions extends js.Object {
  /**
    * (Highmaps) The hover state for a single point marker.
    */
  var hover: js.UndefOr[PlotMapbubbleMarkerStatesHoverOptions] = js.undefined
  var inactive: js.UndefOr[PlotMapbubbleMarkerStatesInactiveOptions] = js.undefined
  /**
    * (Highmaps) The normal state of a single point marker. Currently only used
    * for setting animation when returning to normal state from hover.
    */
  var normal: js.UndefOr[PlotMapbubbleMarkerStatesNormalOptions] = js.undefined
  /**
    * (Highmaps) The appearance of the point marker when selected. In order to
    * allow a point to be selected, set the `series.allowPointSelect` option to
    * true.
    */
  var select: js.UndefOr[PlotMapbubbleMarkerStatesSelectOptions] = js.undefined
}

object PlotMapbubbleMarkerStatesOptions {
  @scala.inline
  def apply(
    hover: PlotMapbubbleMarkerStatesHoverOptions = null,
    inactive: PlotMapbubbleMarkerStatesInactiveOptions = null,
    normal: PlotMapbubbleMarkerStatesNormalOptions = null,
    select: PlotMapbubbleMarkerStatesSelectOptions = null
  ): PlotMapbubbleMarkerStatesOptions = {
    val __obj = js.Dynamic.literal()
    if (hover != null) __obj.updateDynamic("hover")(hover.asInstanceOf[js.Any])
    if (inactive != null) __obj.updateDynamic("inactive")(inactive.asInstanceOf[js.Any])
    if (normal != null) __obj.updateDynamic("normal")(normal.asInstanceOf[js.Any])
    if (select != null) __obj.updateDynamic("select")(select.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotMapbubbleMarkerStatesOptions]
  }
}

