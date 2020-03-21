package typingsJapgolly.kendoUi.kendo.dataviz.ui

import japgolly.scalajs.react.Callback
import typingsJapgolly.kendoUi.kendo.data.DataSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartOptions extends js.Object {
  var autoBind: js.UndefOr[Boolean] = js.undefined
  var axisDefaults: js.UndefOr[ChartAxisDefaults] = js.undefined
  var axisLabelClick: js.UndefOr[js.Function1[/* e */ ChartAxisLabelClickEvent, Unit]] = js.undefined
  var categoryAxis: js.UndefOr[ChartCategoryAxisItem | js.Array[ChartCategoryAxisItem]] = js.undefined
  var chartArea: js.UndefOr[ChartChartArea] = js.undefined
  var dataBound: js.UndefOr[js.Function1[/* e */ ChartDataBoundEvent, Unit]] = js.undefined
  var dataSource: js.UndefOr[js.Any | DataSource] = js.undefined
  var drag: js.UndefOr[js.Function1[/* e */ ChartDragEvent, Unit]] = js.undefined
  var dragEnd: js.UndefOr[js.Function1[/* e */ ChartDragEndEvent, Unit]] = js.undefined
  var dragStart: js.UndefOr[js.Function1[/* e */ ChartDragStartEvent, Unit]] = js.undefined
  var legend: js.UndefOr[ChartLegend] = js.undefined
  var legendItemClick: js.UndefOr[js.Function1[/* e */ ChartLegendItemClickEvent, Unit]] = js.undefined
  var legendItemHover: js.UndefOr[js.Function1[/* e */ ChartLegendItemHoverEvent, Unit]] = js.undefined
  var legendItemLeave: js.UndefOr[js.Function1[/* e */ ChartLegendItemLeaveEvent, Unit]] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var noteClick: js.UndefOr[js.Function1[/* e */ ChartNoteClickEvent, Unit]] = js.undefined
  var noteHover: js.UndefOr[js.Function1[/* e */ ChartNoteHoverEvent, Unit]] = js.undefined
  var noteLeave: js.UndefOr[js.Function1[/* e */ ChartNoteLeaveEvent, Unit]] = js.undefined
  var paneRender: js.UndefOr[js.Function1[/* e */ ChartPaneRenderEvent, Unit]] = js.undefined
  var panes: js.UndefOr[js.Array[ChartPane]] = js.undefined
  var pannable: js.UndefOr[Boolean | ChartPannable] = js.undefined
  var pdf: js.UndefOr[ChartPdf] = js.undefined
  var persistSeriesVisibility: js.UndefOr[Boolean] = js.undefined
  var plotArea: js.UndefOr[ChartPlotArea] = js.undefined
  var plotAreaClick: js.UndefOr[js.Function1[/* e */ ChartPlotAreaClickEvent, Unit]] = js.undefined
  var plotAreaHover: js.UndefOr[js.Function1[/* e */ ChartPlotAreaHoverEvent, Unit]] = js.undefined
  var plotAreaLeave: js.UndefOr[js.Function1[/* e */ ChartPlotAreaLeaveEvent, Unit]] = js.undefined
  var render: js.UndefOr[js.Function1[/* e */ ChartRenderEvent, Unit]] = js.undefined
  var renderAs: js.UndefOr[String] = js.undefined
  var select: js.UndefOr[js.Function1[/* e */ ChartSelectEvent, Unit]] = js.undefined
  var selectEnd: js.UndefOr[js.Function1[/* e */ ChartSelectEndEvent, Unit]] = js.undefined
  var selectStart: js.UndefOr[js.Function1[/* e */ ChartSelectStartEvent, Unit]] = js.undefined
  var series: js.UndefOr[js.Array[ChartSeriesItem]] = js.undefined
  var seriesClick: js.UndefOr[js.Function1[/* e */ ChartSeriesClickEvent, Unit]] = js.undefined
  var seriesColors: js.UndefOr[js.Any] = js.undefined
  var seriesDefaults: js.UndefOr[ChartSeriesDefaults] = js.undefined
  var seriesHover: js.UndefOr[js.Function1[/* e */ ChartSeriesHoverEvent, Unit]] = js.undefined
  var seriesLeave: js.UndefOr[js.Function1[/* e */ ChartSeriesLeaveEvent, Unit]] = js.undefined
  var seriesOver: js.UndefOr[js.Function1[/* e */ ChartSeriesOverEvent, Unit]] = js.undefined
  var theme: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[String | ChartTitle] = js.undefined
  var tooltip: js.UndefOr[ChartTooltip] = js.undefined
  var transitions: js.UndefOr[Boolean] = js.undefined
  var valueAxis: js.UndefOr[ChartValueAxisItem | js.Array[ChartValueAxisItem]] = js.undefined
  var xAxis: js.UndefOr[ChartXAxisItem | js.Array[ChartXAxisItem]] = js.undefined
  var yAxis: js.UndefOr[ChartYAxisItem | js.Array[ChartYAxisItem]] = js.undefined
  var zoom: js.UndefOr[js.Function1[/* e */ ChartZoomEvent, Unit]] = js.undefined
  var zoomEnd: js.UndefOr[js.Function1[/* e */ ChartZoomEndEvent, Unit]] = js.undefined
  var zoomStart: js.UndefOr[js.Function1[/* e */ ChartZoomStartEvent, Unit]] = js.undefined
  var zoomable: js.UndefOr[Boolean | ChartZoomable] = js.undefined
}

object ChartOptions {
  @scala.inline
  def apply(
    autoBind: js.UndefOr[Boolean] = js.undefined,
    axisDefaults: ChartAxisDefaults = null,
    axisLabelClick: /* e */ ChartAxisLabelClickEvent => Callback = null,
    categoryAxis: ChartCategoryAxisItem | js.Array[ChartCategoryAxisItem] = null,
    chartArea: ChartChartArea = null,
    dataBound: /* e */ ChartDataBoundEvent => Callback = null,
    dataSource: js.Any | DataSource = null,
    drag: /* e */ ChartDragEvent => Callback = null,
    dragEnd: /* e */ ChartDragEndEvent => Callback = null,
    dragStart: /* e */ ChartDragStartEvent => Callback = null,
    legend: ChartLegend = null,
    legendItemClick: /* e */ ChartLegendItemClickEvent => Callback = null,
    legendItemHover: /* e */ ChartLegendItemHoverEvent => Callback = null,
    legendItemLeave: /* e */ ChartLegendItemLeaveEvent => Callback = null,
    name: String = null,
    noteClick: /* e */ ChartNoteClickEvent => Callback = null,
    noteHover: /* e */ ChartNoteHoverEvent => Callback = null,
    noteLeave: /* e */ ChartNoteLeaveEvent => Callback = null,
    paneRender: /* e */ ChartPaneRenderEvent => Callback = null,
    panes: js.Array[ChartPane] = null,
    pannable: Boolean | ChartPannable = null,
    pdf: ChartPdf = null,
    persistSeriesVisibility: js.UndefOr[Boolean] = js.undefined,
    plotArea: ChartPlotArea = null,
    plotAreaClick: /* e */ ChartPlotAreaClickEvent => Callback = null,
    plotAreaHover: /* e */ ChartPlotAreaHoverEvent => Callback = null,
    plotAreaLeave: /* e */ ChartPlotAreaLeaveEvent => Callback = null,
    render: /* e */ ChartRenderEvent => Callback = null,
    renderAs: String = null,
    select: /* e */ ChartSelectEvent => Callback = null,
    selectEnd: /* e */ ChartSelectEndEvent => Callback = null,
    selectStart: /* e */ ChartSelectStartEvent => Callback = null,
    series: js.Array[ChartSeriesItem] = null,
    seriesClick: /* e */ ChartSeriesClickEvent => Callback = null,
    seriesColors: js.Any = null,
    seriesDefaults: ChartSeriesDefaults = null,
    seriesHover: /* e */ ChartSeriesHoverEvent => Callback = null,
    seriesLeave: /* e */ ChartSeriesLeaveEvent => Callback = null,
    seriesOver: /* e */ ChartSeriesOverEvent => Callback = null,
    theme: String = null,
    title: String | ChartTitle = null,
    tooltip: ChartTooltip = null,
    transitions: js.UndefOr[Boolean] = js.undefined,
    valueAxis: ChartValueAxisItem | js.Array[ChartValueAxisItem] = null,
    xAxis: ChartXAxisItem | js.Array[ChartXAxisItem] = null,
    yAxis: ChartYAxisItem | js.Array[ChartYAxisItem] = null,
    zoom: /* e */ ChartZoomEvent => Callback = null,
    zoomEnd: /* e */ ChartZoomEndEvent => Callback = null,
    zoomStart: /* e */ ChartZoomStartEvent => Callback = null,
    zoomable: Boolean | ChartZoomable = null
  ): ChartOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoBind)) __obj.updateDynamic("autoBind")(autoBind.asInstanceOf[js.Any])
    if (axisDefaults != null) __obj.updateDynamic("axisDefaults")(axisDefaults.asInstanceOf[js.Any])
    if (axisLabelClick != null) __obj.updateDynamic("axisLabelClick")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.dataviz.ui.ChartAxisLabelClickEvent) => axisLabelClick(t0).runNow()))
    if (categoryAxis != null) __obj.updateDynamic("categoryAxis")(categoryAxis.asInstanceOf[js.Any])
    if (chartArea != null) __obj.updateDynamic("chartArea")(chartArea.asInstanceOf[js.Any])
    if (dataBound != null) __obj.updateDynamic("dataBound")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.dataviz.ui.ChartDataBoundEvent) => dataBound(t0).runNow()))
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource.asInstanceOf[js.Any])
    if (drag != null) __obj.updateDynamic("drag")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.dataviz.ui.ChartDragEvent) => drag(t0).runNow()))
    if (dragEnd != null) __obj.updateDynamic("dragEnd")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.dataviz.ui.ChartDragEndEvent) => dragEnd(t0).runNow()))
    if (dragStart != null) __obj.updateDynamic("dragStart")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.dataviz.ui.ChartDragStartEvent) => dragStart(t0).runNow()))
    if (legend != null) __obj.updateDynamic("legend")(legend.asInstanceOf[js.Any])
    if (legendItemClick != null) __obj.updateDynamic("legendItemClick")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.dataviz.ui.ChartLegendItemClickEvent) => legendItemClick(t0).runNow()))
    if (legendItemHover != null) __obj.updateDynamic("legendItemHover")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.dataviz.ui.ChartLegendItemHoverEvent) => legendItemHover(t0).runNow()))
    if (legendItemLeave != null) __obj.updateDynamic("legendItemLeave")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.dataviz.ui.ChartLegendItemLeaveEvent) => legendItemLeave(t0).runNow()))
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (noteClick != null) __obj.updateDynamic("noteClick")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.dataviz.ui.ChartNoteClickEvent) => noteClick(t0).runNow()))
    if (noteHover != null) __obj.updateDynamic("noteHover")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.dataviz.ui.ChartNoteHoverEvent) => noteHover(t0).runNow()))
    if (noteLeave != null) __obj.updateDynamic("noteLeave")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.dataviz.ui.ChartNoteLeaveEvent) => noteLeave(t0).runNow()))
    if (paneRender != null) __obj.updateDynamic("paneRender")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.dataviz.ui.ChartPaneRenderEvent) => paneRender(t0).runNow()))
    if (panes != null) __obj.updateDynamic("panes")(panes.asInstanceOf[js.Any])
    if (pannable != null) __obj.updateDynamic("pannable")(pannable.asInstanceOf[js.Any])
    if (pdf != null) __obj.updateDynamic("pdf")(pdf.asInstanceOf[js.Any])
    if (!js.isUndefined(persistSeriesVisibility)) __obj.updateDynamic("persistSeriesVisibility")(persistSeriesVisibility.asInstanceOf[js.Any])
    if (plotArea != null) __obj.updateDynamic("plotArea")(plotArea.asInstanceOf[js.Any])
    if (plotAreaClick != null) __obj.updateDynamic("plotAreaClick")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.dataviz.ui.ChartPlotAreaClickEvent) => plotAreaClick(t0).runNow()))
    if (plotAreaHover != null) __obj.updateDynamic("plotAreaHover")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.dataviz.ui.ChartPlotAreaHoverEvent) => plotAreaHover(t0).runNow()))
    if (plotAreaLeave != null) __obj.updateDynamic("plotAreaLeave")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.dataviz.ui.ChartPlotAreaLeaveEvent) => plotAreaLeave(t0).runNow()))
    if (render != null) __obj.updateDynamic("render")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.dataviz.ui.ChartRenderEvent) => render(t0).runNow()))
    if (renderAs != null) __obj.updateDynamic("renderAs")(renderAs.asInstanceOf[js.Any])
    if (select != null) __obj.updateDynamic("select")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.dataviz.ui.ChartSelectEvent) => select(t0).runNow()))
    if (selectEnd != null) __obj.updateDynamic("selectEnd")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.dataviz.ui.ChartSelectEndEvent) => selectEnd(t0).runNow()))
    if (selectStart != null) __obj.updateDynamic("selectStart")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.dataviz.ui.ChartSelectStartEvent) => selectStart(t0).runNow()))
    if (series != null) __obj.updateDynamic("series")(series.asInstanceOf[js.Any])
    if (seriesClick != null) __obj.updateDynamic("seriesClick")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.dataviz.ui.ChartSeriesClickEvent) => seriesClick(t0).runNow()))
    if (seriesColors != null) __obj.updateDynamic("seriesColors")(seriesColors.asInstanceOf[js.Any])
    if (seriesDefaults != null) __obj.updateDynamic("seriesDefaults")(seriesDefaults.asInstanceOf[js.Any])
    if (seriesHover != null) __obj.updateDynamic("seriesHover")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.dataviz.ui.ChartSeriesHoverEvent) => seriesHover(t0).runNow()))
    if (seriesLeave != null) __obj.updateDynamic("seriesLeave")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.dataviz.ui.ChartSeriesLeaveEvent) => seriesLeave(t0).runNow()))
    if (seriesOver != null) __obj.updateDynamic("seriesOver")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.dataviz.ui.ChartSeriesOverEvent) => seriesOver(t0).runNow()))
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    if (!js.isUndefined(transitions)) __obj.updateDynamic("transitions")(transitions.asInstanceOf[js.Any])
    if (valueAxis != null) __obj.updateDynamic("valueAxis")(valueAxis.asInstanceOf[js.Any])
    if (xAxis != null) __obj.updateDynamic("xAxis")(xAxis.asInstanceOf[js.Any])
    if (yAxis != null) __obj.updateDynamic("yAxis")(yAxis.asInstanceOf[js.Any])
    if (zoom != null) __obj.updateDynamic("zoom")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.dataviz.ui.ChartZoomEvent) => zoom(t0).runNow()))
    if (zoomEnd != null) __obj.updateDynamic("zoomEnd")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.dataviz.ui.ChartZoomEndEvent) => zoomEnd(t0).runNow()))
    if (zoomStart != null) __obj.updateDynamic("zoomStart")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.dataviz.ui.ChartZoomStartEvent) => zoomStart(t0).runNow()))
    if (zoomable != null) __obj.updateDynamic("zoomable")(zoomable.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartOptions]
  }
}

