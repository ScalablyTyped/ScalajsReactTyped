package typingsJapgolly.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigatorYAxisPlotLinesEventsOptions extends js.Object {
  /**
    * (Highcharts, Highstock, Gantt) Click event on a plot band.
    */
  var click: js.UndefOr[EventCallbackFunction[PlotLineOrBand]] = js.undefined
  /**
    * (Highcharts, Highstock, Gantt) Mouse move event on a plot band.
    */
  var mousemove: js.UndefOr[EventCallbackFunction[PlotLineOrBand]] = js.undefined
  /**
    * (Highcharts, Highstock, Gantt) Mouse out event on the corner of a plot
    * band.
    */
  var mouseout: js.UndefOr[EventCallbackFunction[PlotLineOrBand]] = js.undefined
  /**
    * (Highcharts, Highstock, Gantt) Mouse over event on a plot band.
    */
  var mouseover: js.UndefOr[EventCallbackFunction[PlotLineOrBand]] = js.undefined
}

object NavigatorYAxisPlotLinesEventsOptions {
  @scala.inline
  def apply(
    click: EventCallbackFunction[PlotLineOrBand] = null,
    mousemove: EventCallbackFunction[PlotLineOrBand] = null,
    mouseout: EventCallbackFunction[PlotLineOrBand] = null,
    mouseover: EventCallbackFunction[PlotLineOrBand] = null
  ): NavigatorYAxisPlotLinesEventsOptions = {
    val __obj = js.Dynamic.literal()
    if (click != null) __obj.updateDynamic("click")(click.asInstanceOf[js.Any])
    if (mousemove != null) __obj.updateDynamic("mousemove")(mousemove.asInstanceOf[js.Any])
    if (mouseout != null) __obj.updateDynamic("mouseout")(mouseout.asInstanceOf[js.Any])
    if (mouseover != null) __obj.updateDynamic("mouseover")(mouseover.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigatorYAxisPlotLinesEventsOptions]
  }
}

