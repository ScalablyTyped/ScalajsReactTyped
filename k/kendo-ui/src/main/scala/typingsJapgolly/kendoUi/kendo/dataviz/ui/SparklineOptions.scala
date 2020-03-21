package typingsJapgolly.kendoUi.kendo.dataviz.ui

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SparklineOptions extends js.Object {
  var autoBind: js.UndefOr[Boolean] = js.undefined
  var axisDefaults: js.UndefOr[js.Any] = js.undefined
  var axisLabelClick: js.UndefOr[js.Function1[/* e */ SparklineAxisLabelClickEvent, Unit]] = js.undefined
  var categoryAxis: js.UndefOr[SparklineCategoryAxisItem | js.Array[SparklineCategoryAxisItem]] = js.undefined
  var chartArea: js.UndefOr[SparklineChartArea] = js.undefined
  var data: js.UndefOr[js.Any] = js.undefined
  var dataBound: js.UndefOr[js.Function1[/* e */ SparklineEvent, Unit]] = js.undefined
  var dataSource: js.UndefOr[js.Any] = js.undefined
  var drag: js.UndefOr[js.Function1[/* e */ SparklineDragEvent, Unit]] = js.undefined
  var dragEnd: js.UndefOr[js.Function1[/* e */ SparklineDragEndEvent, Unit]] = js.undefined
  var dragStart: js.UndefOr[js.Function1[/* e */ SparklineDragStartEvent, Unit]] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var paneRender: js.UndefOr[js.Function1[/* e */ SparklinePaneRenderEvent, Unit]] = js.undefined
  var plotArea: js.UndefOr[SparklinePlotArea] = js.undefined
  var plotAreaClick: js.UndefOr[js.Function1[/* e */ SparklinePlotAreaClickEvent, Unit]] = js.undefined
  var plotAreaHover: js.UndefOr[js.Function1[/* e */ SparklinePlotAreaHoverEvent, Unit]] = js.undefined
  var plotAreaLeave: js.UndefOr[js.Function1[/* e */ SparklinePlotAreaLeaveEvent, Unit]] = js.undefined
  var pointWidth: js.UndefOr[Double] = js.undefined
  var renderAs: js.UndefOr[String] = js.undefined
  var series: js.UndefOr[js.Array[SparklineSeriesItem]] = js.undefined
  var seriesClick: js.UndefOr[js.Function1[/* e */ SparklineSeriesClickEvent, Unit]] = js.undefined
  var seriesColors: js.UndefOr[js.Any] = js.undefined
  var seriesDefaults: js.UndefOr[SparklineSeriesDefaults] = js.undefined
  var seriesHover: js.UndefOr[js.Function1[/* e */ SparklineSeriesHoverEvent, Unit]] = js.undefined
  var seriesLeave: js.UndefOr[js.Function1[/* e */ SparklineSeriesLeaveEvent, Unit]] = js.undefined
  var seriesOver: js.UndefOr[js.Function1[/* e */ SparklineSeriesOverEvent, Unit]] = js.undefined
  var theme: js.UndefOr[String] = js.undefined
  var tooltip: js.UndefOr[SparklineTooltip] = js.undefined
  var transitions: js.UndefOr[Boolean] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
  var valueAxis: js.UndefOr[SparklineValueAxisItem | js.Array[SparklineValueAxisItem]] = js.undefined
  var zoom: js.UndefOr[js.Function1[/* e */ SparklineZoomEvent, Unit]] = js.undefined
  var zoomEnd: js.UndefOr[js.Function1[/* e */ SparklineZoomEndEvent, Unit]] = js.undefined
  var zoomStart: js.UndefOr[js.Function1[/* e */ SparklineZoomStartEvent, Unit]] = js.undefined
}

object SparklineOptions {
  @scala.inline
  def apply(
    autoBind: js.UndefOr[Boolean] = js.undefined,
    axisDefaults: js.Any = null,
    axisLabelClick: /* e */ SparklineAxisLabelClickEvent => Callback = null,
    categoryAxis: SparklineCategoryAxisItem | js.Array[SparklineCategoryAxisItem] = null,
    chartArea: SparklineChartArea = null,
    data: js.Any = null,
    dataBound: /* e */ SparklineEvent => Callback = null,
    dataSource: js.Any = null,
    drag: /* e */ SparklineDragEvent => Callback = null,
    dragEnd: /* e */ SparklineDragEndEvent => Callback = null,
    dragStart: /* e */ SparklineDragStartEvent => Callback = null,
    name: String = null,
    paneRender: /* e */ SparklinePaneRenderEvent => Callback = null,
    plotArea: SparklinePlotArea = null,
    plotAreaClick: /* e */ SparklinePlotAreaClickEvent => Callback = null,
    plotAreaHover: /* e */ SparklinePlotAreaHoverEvent => Callback = null,
    plotAreaLeave: /* e */ SparklinePlotAreaLeaveEvent => Callback = null,
    pointWidth: Int | Double = null,
    renderAs: String = null,
    series: js.Array[SparklineSeriesItem] = null,
    seriesClick: /* e */ SparklineSeriesClickEvent => Callback = null,
    seriesColors: js.Any = null,
    seriesDefaults: SparklineSeriesDefaults = null,
    seriesHover: /* e */ SparklineSeriesHoverEvent => Callback = null,
    seriesLeave: /* e */ SparklineSeriesLeaveEvent => Callback = null,
    seriesOver: /* e */ SparklineSeriesOverEvent => Callback = null,
    theme: String = null,
    tooltip: SparklineTooltip = null,
    transitions: js.UndefOr[Boolean] = js.undefined,
    `type`: String = null,
    valueAxis: SparklineValueAxisItem | js.Array[SparklineValueAxisItem] = null,
    zoom: /* e */ SparklineZoomEvent => Callback = null,
    zoomEnd: /* e */ SparklineZoomEndEvent => Callback = null,
    zoomStart: /* e */ SparklineZoomStartEvent => Callback = null
  ): SparklineOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoBind)) __obj.updateDynamic("autoBind")(autoBind.asInstanceOf[js.Any])
    if (axisDefaults != null) __obj.updateDynamic("axisDefaults")(axisDefaults.asInstanceOf[js.Any])
    if (axisLabelClick != null) __obj.updateDynamic("axisLabelClick")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.dataviz.ui.SparklineAxisLabelClickEvent) => axisLabelClick(t0).runNow()))
    if (categoryAxis != null) __obj.updateDynamic("categoryAxis")(categoryAxis.asInstanceOf[js.Any])
    if (chartArea != null) __obj.updateDynamic("chartArea")(chartArea.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (dataBound != null) __obj.updateDynamic("dataBound")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.dataviz.ui.SparklineEvent) => dataBound(t0).runNow()))
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource.asInstanceOf[js.Any])
    if (drag != null) __obj.updateDynamic("drag")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.dataviz.ui.SparklineDragEvent) => drag(t0).runNow()))
    if (dragEnd != null) __obj.updateDynamic("dragEnd")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.dataviz.ui.SparklineDragEndEvent) => dragEnd(t0).runNow()))
    if (dragStart != null) __obj.updateDynamic("dragStart")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.dataviz.ui.SparklineDragStartEvent) => dragStart(t0).runNow()))
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (paneRender != null) __obj.updateDynamic("paneRender")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.dataviz.ui.SparklinePaneRenderEvent) => paneRender(t0).runNow()))
    if (plotArea != null) __obj.updateDynamic("plotArea")(plotArea.asInstanceOf[js.Any])
    if (plotAreaClick != null) __obj.updateDynamic("plotAreaClick")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.dataviz.ui.SparklinePlotAreaClickEvent) => plotAreaClick(t0).runNow()))
    if (plotAreaHover != null) __obj.updateDynamic("plotAreaHover")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.dataviz.ui.SparklinePlotAreaHoverEvent) => plotAreaHover(t0).runNow()))
    if (plotAreaLeave != null) __obj.updateDynamic("plotAreaLeave")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.dataviz.ui.SparklinePlotAreaLeaveEvent) => plotAreaLeave(t0).runNow()))
    if (pointWidth != null) __obj.updateDynamic("pointWidth")(pointWidth.asInstanceOf[js.Any])
    if (renderAs != null) __obj.updateDynamic("renderAs")(renderAs.asInstanceOf[js.Any])
    if (series != null) __obj.updateDynamic("series")(series.asInstanceOf[js.Any])
    if (seriesClick != null) __obj.updateDynamic("seriesClick")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.dataviz.ui.SparklineSeriesClickEvent) => seriesClick(t0).runNow()))
    if (seriesColors != null) __obj.updateDynamic("seriesColors")(seriesColors.asInstanceOf[js.Any])
    if (seriesDefaults != null) __obj.updateDynamic("seriesDefaults")(seriesDefaults.asInstanceOf[js.Any])
    if (seriesHover != null) __obj.updateDynamic("seriesHover")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.dataviz.ui.SparklineSeriesHoverEvent) => seriesHover(t0).runNow()))
    if (seriesLeave != null) __obj.updateDynamic("seriesLeave")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.dataviz.ui.SparklineSeriesLeaveEvent) => seriesLeave(t0).runNow()))
    if (seriesOver != null) __obj.updateDynamic("seriesOver")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.dataviz.ui.SparklineSeriesOverEvent) => seriesOver(t0).runNow()))
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    if (!js.isUndefined(transitions)) __obj.updateDynamic("transitions")(transitions.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (valueAxis != null) __obj.updateDynamic("valueAxis")(valueAxis.asInstanceOf[js.Any])
    if (zoom != null) __obj.updateDynamic("zoom")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.dataviz.ui.SparklineZoomEvent) => zoom(t0).runNow()))
    if (zoomEnd != null) __obj.updateDynamic("zoomEnd")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.dataviz.ui.SparklineZoomEndEvent) => zoomEnd(t0).runNow()))
    if (zoomStart != null) __obj.updateDynamic("zoomStart")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.dataviz.ui.SparklineZoomStartEvent) => zoomStart(t0).runNow()))
    __obj.asInstanceOf[SparklineOptions]
  }
}

