package typingsJapgolly.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotNetworkgraphStatesOptions extends js.Object {
  /**
    * (Highcharts) Options for the hovered series. These settings override the
    * normal state options when a series is moused over or touched.
    */
  var hover: js.UndefOr[PlotNetworkgraphStatesHoverOptions] = js.undefined
  /**
    * (Highcharts) The opposite state of a hover for a single point link.
    * Applied to all links that are not comming from the hovered node.
    */
  var inactive: js.UndefOr[PlotNetworkgraphStatesInactiveOptions] = js.undefined
  /**
    * (Highcharts) The normal state of a series, or for point items in column,
    * pie and similar series. Currently only used for setting animation when
    * returning to normal state from hover.
    */
  var normal: js.UndefOr[PlotNetworkgraphStatesNormalOptions] = js.undefined
  /**
    * (Highcharts) Specific options for point in selected states, after being
    * selected by allowPointSelect or programmatically.
    */
  var select: js.UndefOr[PlotNetworkgraphStatesSelectOptions] = js.undefined
}

object PlotNetworkgraphStatesOptions {
  @scala.inline
  def apply(
    hover: PlotNetworkgraphStatesHoverOptions = null,
    inactive: PlotNetworkgraphStatesInactiveOptions = null,
    normal: PlotNetworkgraphStatesNormalOptions = null,
    select: PlotNetworkgraphStatesSelectOptions = null
  ): PlotNetworkgraphStatesOptions = {
    val __obj = js.Dynamic.literal()
    if (hover != null) __obj.updateDynamic("hover")(hover.asInstanceOf[js.Any])
    if (inactive != null) __obj.updateDynamic("inactive")(inactive.asInstanceOf[js.Any])
    if (normal != null) __obj.updateDynamic("normal")(normal.asInstanceOf[js.Any])
    if (select != null) __obj.updateDynamic("select")(select.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotNetworkgraphStatesOptions]
  }
}

