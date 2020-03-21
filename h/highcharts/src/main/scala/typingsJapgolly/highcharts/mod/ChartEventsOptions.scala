package typingsJapgolly.highcharts.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartEventsOptions extends js.Object {
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Fires when a series is added to
    * the chart after load time, using the `addSeries` method. One parameter,
    * `event`, is passed to the function, containing common event information.
    * Through `event.options` you can access the series options that were
    * passed to the `addSeries` method. Returning false prevents the series
    * from being added.
    */
  var addSeries: js.UndefOr[ChartAddSeriesCallbackFunction] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Fires after a chart is printed
    * through the context menu item or the `Chart.print` method.
    */
  var afterPrint: js.UndefOr[ExportingAfterPrintCallbackFunction] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Fires before a chart is printed
    * through the context menu item or the `Chart.print` method.
    */
  var beforePrint: js.UndefOr[ExportingBeforePrintCallbackFunction] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Fires when clicking on the plot
    * background. One parameter, `event`, is passed to the function, containing
    * common event information.
    *
    * Information on the clicked spot can be found through `event.xAxis` and
    * `event.yAxis`, which are arrays containing the axes of each dimension and
    * each axis' value at the clicked spot. The primary axes are
    * `event.xAxis[0]` and `event.yAxis[0]`. Remember the unit of a datetime
    * axis is milliseconds since 1970-01-01 00:00:00.
    *
    *  (see online documentation for example)
    */
  var click: js.UndefOr[ChartClickCallbackFunction] = js.undefined
  /**
    * (Highcharts, Highmaps) Fires when a drilldown point is clicked, before
    * the new series is added. This event is also utilized for async drilldown,
    * where the seriesOptions are not added by option, but rather loaded async.
    * Note that when clicking a category label to trigger multiple series
    * drilldown, one `drilldown` event is triggered per point in the category.
    *
    * Event arguments:
    *
    * - `category`: If a category label was clicked, which index.</dd>
    *
    * - `originalEvent`: The original browser event (usually click) that
    * triggered the drilldown.
    *
    * - `point`: The originating point.
    *
    * - `points`: If a category label was clicked, this array holds all points
    * corresponing to the category.</dd>
    *
    * - `seriesOptions`: Options for the new series.
    */
  var drilldown: js.UndefOr[DrilldownCallbackFunction] = js.undefined
  /**
    * (Highcharts, Highmaps) Fires when drilling up from a drilldown series.
    */
  var drillup: js.UndefOr[DrillupCallbackFunction] = js.undefined
  /**
    * (Highcharts, Highmaps) In a chart with multiple drilldown series, this
    * event fires after all the series have been drilled up.
    */
  var drillupall: js.UndefOr[DrillupAllCallbackFunction] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Callback that fires while
    * exporting data. This allows the modification of data rows before
    * processed into the final format.
    */
  var exportData: js.UndefOr[ExportDataCallbackFunction] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Fires when the chart is finished
    * loading. Since v4.2.2, it also waits for images to be loaded, for example
    * from point markers. One parameter, `event`, is passed to the function,
    * containing common event information.
    *
    * There is also a second parameter to the chart constructor where a
    * callback function can be passed to be executed on chart.load.
    */
  var load: js.UndefOr[ChartLoadCallbackFunction] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Fires when the chart is redrawn,
    * either after a call to `chart.redraw()` or after an axis, series or point
    * is modified with the `redraw` option set to `true`. One parameter,
    * `event`, is passed to the function, containing common event information.
    */
  var redraw: js.UndefOr[ChartRedrawCallbackFunction] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Fires after initial load of the
    * chart (directly after the `load` event), and after each redraw (directly
    * after the `redraw` event).
    */
  var render: js.UndefOr[ChartRenderCallbackFunction] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Fires when an area of the chart
    * has been selected. Selection is enabled by setting the chart's zoomType.
    * One parameter, `event`, is passed to the function, containing common
    * event information. The default action for the selection event is to zoom
    * the chart to the selected area. It can be prevented by calling
    * `event.preventDefault()` or return false.
    *
    * Information on the selected area can be found through `event.xAxis` and
    * `event.yAxis`, which are arrays containing the axes of each dimension and
    * each axis' min and max values. The primary axes are `event.xAxis[0]` and
    * `event.yAxis[0]`. Remember the unit of a datetime axis is milliseconds
    * since 1970-01-01 00:00:00.
    *
    *  (see online documentation for example)
    */
  var selection: js.UndefOr[ChartSelectionCallbackFunction] = js.undefined
}

object ChartEventsOptions {
  @scala.inline
  def apply(
    addSeries: ChartAddSeriesCallbackFunction = null,
    afterPrint: (/* chart */ Chart_, /* event */ Event_) => Callback = null,
    beforePrint: (/* chart */ Chart_, /* event */ Event_) => Callback = null,
    click: ChartClickCallbackFunction = null,
    drilldown: DrilldownCallbackFunction = null,
    drillup: DrillupCallbackFunction = null,
    drillupall: DrillupAllCallbackFunction = null,
    exportData: ExportDataCallbackFunction = null,
    load: ChartLoadCallbackFunction = null,
    redraw: ChartRedrawCallbackFunction = null,
    render: ChartRenderCallbackFunction = null,
    selection: ChartSelectionCallbackFunction = null
  ): ChartEventsOptions = {
    val __obj = js.Dynamic.literal()
    if (addSeries != null) __obj.updateDynamic("addSeries")(addSeries.asInstanceOf[js.Any])
    if (afterPrint != null) __obj.updateDynamic("afterPrint")(js.Any.fromFunction2((t0: /* chart */ typingsJapgolly.highcharts.mod.Chart_, t1: /* event */ typingsJapgolly.std.Event_) => afterPrint(t0, t1).runNow()))
    if (beforePrint != null) __obj.updateDynamic("beforePrint")(js.Any.fromFunction2((t0: /* chart */ typingsJapgolly.highcharts.mod.Chart_, t1: /* event */ typingsJapgolly.std.Event_) => beforePrint(t0, t1).runNow()))
    if (click != null) __obj.updateDynamic("click")(click.asInstanceOf[js.Any])
    if (drilldown != null) __obj.updateDynamic("drilldown")(drilldown.asInstanceOf[js.Any])
    if (drillup != null) __obj.updateDynamic("drillup")(drillup.asInstanceOf[js.Any])
    if (drillupall != null) __obj.updateDynamic("drillupall")(drillupall.asInstanceOf[js.Any])
    if (exportData != null) __obj.updateDynamic("exportData")(exportData.asInstanceOf[js.Any])
    if (load != null) __obj.updateDynamic("load")(load.asInstanceOf[js.Any])
    if (redraw != null) __obj.updateDynamic("redraw")(redraw.asInstanceOf[js.Any])
    if (render != null) __obj.updateDynamic("render")(render.asInstanceOf[js.Any])
    if (selection != null) __obj.updateDynamic("selection")(selection.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartEventsOptions]
  }
}

