package typingsJapgolly.kendoUi.kendo.dataviz.ui

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StockChartOptions extends js.Object {
  var autoBind: js.UndefOr[Boolean] = js.undefined
  var axisDefaults: js.UndefOr[js.Any] = js.undefined
  var axisLabelClick: js.UndefOr[js.Function1[/* e */ StockChartAxisLabelClickEvent, Unit]] = js.undefined
  var categoryAxis: js.UndefOr[StockChartCategoryAxisItem | js.Array[StockChartCategoryAxisItem]] = js.undefined
  var chartArea: js.UndefOr[StockChartChartArea] = js.undefined
  var dataBound: js.UndefOr[js.Function1[/* e */ StockChartEvent, Unit]] = js.undefined
  var dataSource: js.UndefOr[js.Any] = js.undefined
  var dateField: js.UndefOr[String] = js.undefined
  var drag: js.UndefOr[js.Function1[/* e */ StockChartDragEvent, Unit]] = js.undefined
  var dragEnd: js.UndefOr[js.Function1[/* e */ StockChartDragEndEvent, Unit]] = js.undefined
  var dragStart: js.UndefOr[js.Function1[/* e */ StockChartDragStartEvent, Unit]] = js.undefined
  var legend: js.UndefOr[StockChartLegend] = js.undefined
  var legendItemClick: js.UndefOr[js.Function1[/* e */ StockChartLegendItemClickEvent, Unit]] = js.undefined
  var legendItemHover: js.UndefOr[js.Function1[/* e */ StockChartLegendItemHoverEvent, Unit]] = js.undefined
  var legendItemLeave: js.UndefOr[js.Function1[/* e */ StockChartLegendItemLeaveEvent, Unit]] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var navigator: js.UndefOr[StockChartNavigator] = js.undefined
  var noteClick: js.UndefOr[js.Function1[/* e */ StockChartNoteClickEvent, Unit]] = js.undefined
  var noteHover: js.UndefOr[js.Function1[/* e */ StockChartNoteHoverEvent, Unit]] = js.undefined
  var noteLeave: js.UndefOr[js.Function1[/* e */ StockChartNoteLeaveEvent, Unit]] = js.undefined
  var paneRender: js.UndefOr[js.Function1[/* e */ StockChartPaneRenderEvent, Unit]] = js.undefined
  var panes: js.UndefOr[js.Array[StockChartPane]] = js.undefined
  var pdf: js.UndefOr[StockChartPdf] = js.undefined
  var persistSeriesVisibility: js.UndefOr[Boolean] = js.undefined
  var plotArea: js.UndefOr[StockChartPlotArea] = js.undefined
  var plotAreaClick: js.UndefOr[js.Function1[/* e */ StockChartPlotAreaClickEvent, Unit]] = js.undefined
  var plotAreaHover: js.UndefOr[js.Function1[/* e */ StockChartPlotAreaHoverEvent, Unit]] = js.undefined
  var plotAreaLeave: js.UndefOr[js.Function1[/* e */ StockChartPlotAreaLeaveEvent, Unit]] = js.undefined
  var render: js.UndefOr[js.Function1[/* e */ StockChartRenderEvent, Unit]] = js.undefined
  var renderAs: js.UndefOr[String] = js.undefined
  var select: js.UndefOr[js.Function1[/* e */ StockChartSelectEvent, Unit]] = js.undefined
  var selectEnd: js.UndefOr[js.Function1[/* e */ StockChartSelectEndEvent, Unit]] = js.undefined
  var selectStart: js.UndefOr[js.Function1[/* e */ StockChartSelectStartEvent, Unit]] = js.undefined
  var series: js.UndefOr[js.Array[StockChartSeriesItem]] = js.undefined
  var seriesClick: js.UndefOr[js.Function1[/* e */ StockChartSeriesClickEvent, Unit]] = js.undefined
  var seriesColors: js.UndefOr[js.Any] = js.undefined
  var seriesDefaults: js.UndefOr[StockChartSeriesDefaults] = js.undefined
  var seriesHover: js.UndefOr[js.Function1[/* e */ StockChartSeriesHoverEvent, Unit]] = js.undefined
  var seriesLeave: js.UndefOr[js.Function1[/* e */ StockChartSeriesLeaveEvent, Unit]] = js.undefined
  var seriesOver: js.UndefOr[js.Function1[/* e */ StockChartSeriesOverEvent, Unit]] = js.undefined
  var theme: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[StockChartTitle] = js.undefined
  var tooltip: js.UndefOr[StockChartTooltip] = js.undefined
  var transitions: js.UndefOr[Boolean] = js.undefined
  var valueAxis: js.UndefOr[StockChartValueAxisItem | js.Array[StockChartValueAxisItem]] = js.undefined
  var zoom: js.UndefOr[js.Function1[/* e */ StockChartZoomEvent, Unit]] = js.undefined
  var zoomEnd: js.UndefOr[js.Function1[/* e */ StockChartZoomEndEvent, Unit]] = js.undefined
  var zoomStart: js.UndefOr[js.Function1[/* e */ StockChartZoomStartEvent, Unit]] = js.undefined
}

object StockChartOptions {
  @scala.inline
  def apply(
    autoBind: js.UndefOr[Boolean] = js.undefined,
    axisDefaults: js.Any = null,
    axisLabelClick: /* e */ StockChartAxisLabelClickEvent => Callback = null,
    categoryAxis: StockChartCategoryAxisItem | js.Array[StockChartCategoryAxisItem] = null,
    chartArea: StockChartChartArea = null,
    dataBound: /* e */ StockChartEvent => Callback = null,
    dataSource: js.Any = null,
    dateField: String = null,
    drag: /* e */ StockChartDragEvent => Callback = null,
    dragEnd: /* e */ StockChartDragEndEvent => Callback = null,
    dragStart: /* e */ StockChartDragStartEvent => Callback = null,
    legend: StockChartLegend = null,
    legendItemClick: /* e */ StockChartLegendItemClickEvent => Callback = null,
    legendItemHover: /* e */ StockChartLegendItemHoverEvent => Callback = null,
    legendItemLeave: /* e */ StockChartLegendItemLeaveEvent => Callback = null,
    name: String = null,
    navigator: StockChartNavigator = null,
    noteClick: /* e */ StockChartNoteClickEvent => Callback = null,
    noteHover: /* e */ StockChartNoteHoverEvent => Callback = null,
    noteLeave: /* e */ StockChartNoteLeaveEvent => Callback = null,
    paneRender: /* e */ StockChartPaneRenderEvent => Callback = null,
    panes: js.Array[StockChartPane] = null,
    pdf: StockChartPdf = null,
    persistSeriesVisibility: js.UndefOr[Boolean] = js.undefined,
    plotArea: StockChartPlotArea = null,
    plotAreaClick: /* e */ StockChartPlotAreaClickEvent => Callback = null,
    plotAreaHover: /* e */ StockChartPlotAreaHoverEvent => Callback = null,
    plotAreaLeave: /* e */ StockChartPlotAreaLeaveEvent => Callback = null,
    render: /* e */ StockChartRenderEvent => Callback = null,
    renderAs: String = null,
    select: /* e */ StockChartSelectEvent => Callback = null,
    selectEnd: /* e */ StockChartSelectEndEvent => Callback = null,
    selectStart: /* e */ StockChartSelectStartEvent => Callback = null,
    series: js.Array[StockChartSeriesItem] = null,
    seriesClick: /* e */ StockChartSeriesClickEvent => Callback = null,
    seriesColors: js.Any = null,
    seriesDefaults: StockChartSeriesDefaults = null,
    seriesHover: /* e */ StockChartSeriesHoverEvent => Callback = null,
    seriesLeave: /* e */ StockChartSeriesLeaveEvent => Callback = null,
    seriesOver: /* e */ StockChartSeriesOverEvent => Callback = null,
    theme: String = null,
    title: StockChartTitle = null,
    tooltip: StockChartTooltip = null,
    transitions: js.UndefOr[Boolean] = js.undefined,
    valueAxis: StockChartValueAxisItem | js.Array[StockChartValueAxisItem] = null,
    zoom: /* e */ StockChartZoomEvent => Callback = null,
    zoomEnd: /* e */ StockChartZoomEndEvent => Callback = null,
    zoomStart: /* e */ StockChartZoomStartEvent => Callback = null
  ): StockChartOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoBind)) __obj.updateDynamic("autoBind")(autoBind.asInstanceOf[js.Any])
    if (axisDefaults != null) __obj.updateDynamic("axisDefaults")(axisDefaults.asInstanceOf[js.Any])
    if (axisLabelClick != null) __obj.updateDynamic("axisLabelClick")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.dataviz.ui.StockChartAxisLabelClickEvent) => axisLabelClick(t0).runNow()))
    if (categoryAxis != null) __obj.updateDynamic("categoryAxis")(categoryAxis.asInstanceOf[js.Any])
    if (chartArea != null) __obj.updateDynamic("chartArea")(chartArea.asInstanceOf[js.Any])
    if (dataBound != null) __obj.updateDynamic("dataBound")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.dataviz.ui.StockChartEvent) => dataBound(t0).runNow()))
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource.asInstanceOf[js.Any])
    if (dateField != null) __obj.updateDynamic("dateField")(dateField.asInstanceOf[js.Any])
    if (drag != null) __obj.updateDynamic("drag")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.dataviz.ui.StockChartDragEvent) => drag(t0).runNow()))
    if (dragEnd != null) __obj.updateDynamic("dragEnd")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.dataviz.ui.StockChartDragEndEvent) => dragEnd(t0).runNow()))
    if (dragStart != null) __obj.updateDynamic("dragStart")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.dataviz.ui.StockChartDragStartEvent) => dragStart(t0).runNow()))
    if (legend != null) __obj.updateDynamic("legend")(legend.asInstanceOf[js.Any])
    if (legendItemClick != null) __obj.updateDynamic("legendItemClick")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.dataviz.ui.StockChartLegendItemClickEvent) => legendItemClick(t0).runNow()))
    if (legendItemHover != null) __obj.updateDynamic("legendItemHover")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.dataviz.ui.StockChartLegendItemHoverEvent) => legendItemHover(t0).runNow()))
    if (legendItemLeave != null) __obj.updateDynamic("legendItemLeave")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.dataviz.ui.StockChartLegendItemLeaveEvent) => legendItemLeave(t0).runNow()))
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (navigator != null) __obj.updateDynamic("navigator")(navigator.asInstanceOf[js.Any])
    if (noteClick != null) __obj.updateDynamic("noteClick")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.dataviz.ui.StockChartNoteClickEvent) => noteClick(t0).runNow()))
    if (noteHover != null) __obj.updateDynamic("noteHover")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.dataviz.ui.StockChartNoteHoverEvent) => noteHover(t0).runNow()))
    if (noteLeave != null) __obj.updateDynamic("noteLeave")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.dataviz.ui.StockChartNoteLeaveEvent) => noteLeave(t0).runNow()))
    if (paneRender != null) __obj.updateDynamic("paneRender")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.dataviz.ui.StockChartPaneRenderEvent) => paneRender(t0).runNow()))
    if (panes != null) __obj.updateDynamic("panes")(panes.asInstanceOf[js.Any])
    if (pdf != null) __obj.updateDynamic("pdf")(pdf.asInstanceOf[js.Any])
    if (!js.isUndefined(persistSeriesVisibility)) __obj.updateDynamic("persistSeriesVisibility")(persistSeriesVisibility.asInstanceOf[js.Any])
    if (plotArea != null) __obj.updateDynamic("plotArea")(plotArea.asInstanceOf[js.Any])
    if (plotAreaClick != null) __obj.updateDynamic("plotAreaClick")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.dataviz.ui.StockChartPlotAreaClickEvent) => plotAreaClick(t0).runNow()))
    if (plotAreaHover != null) __obj.updateDynamic("plotAreaHover")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.dataviz.ui.StockChartPlotAreaHoverEvent) => plotAreaHover(t0).runNow()))
    if (plotAreaLeave != null) __obj.updateDynamic("plotAreaLeave")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.dataviz.ui.StockChartPlotAreaLeaveEvent) => plotAreaLeave(t0).runNow()))
    if (render != null) __obj.updateDynamic("render")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.dataviz.ui.StockChartRenderEvent) => render(t0).runNow()))
    if (renderAs != null) __obj.updateDynamic("renderAs")(renderAs.asInstanceOf[js.Any])
    if (select != null) __obj.updateDynamic("select")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.dataviz.ui.StockChartSelectEvent) => select(t0).runNow()))
    if (selectEnd != null) __obj.updateDynamic("selectEnd")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.dataviz.ui.StockChartSelectEndEvent) => selectEnd(t0).runNow()))
    if (selectStart != null) __obj.updateDynamic("selectStart")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.dataviz.ui.StockChartSelectStartEvent) => selectStart(t0).runNow()))
    if (series != null) __obj.updateDynamic("series")(series.asInstanceOf[js.Any])
    if (seriesClick != null) __obj.updateDynamic("seriesClick")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.dataviz.ui.StockChartSeriesClickEvent) => seriesClick(t0).runNow()))
    if (seriesColors != null) __obj.updateDynamic("seriesColors")(seriesColors.asInstanceOf[js.Any])
    if (seriesDefaults != null) __obj.updateDynamic("seriesDefaults")(seriesDefaults.asInstanceOf[js.Any])
    if (seriesHover != null) __obj.updateDynamic("seriesHover")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.dataviz.ui.StockChartSeriesHoverEvent) => seriesHover(t0).runNow()))
    if (seriesLeave != null) __obj.updateDynamic("seriesLeave")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.dataviz.ui.StockChartSeriesLeaveEvent) => seriesLeave(t0).runNow()))
    if (seriesOver != null) __obj.updateDynamic("seriesOver")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.dataviz.ui.StockChartSeriesOverEvent) => seriesOver(t0).runNow()))
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    if (!js.isUndefined(transitions)) __obj.updateDynamic("transitions")(transitions.asInstanceOf[js.Any])
    if (valueAxis != null) __obj.updateDynamic("valueAxis")(valueAxis.asInstanceOf[js.Any])
    if (zoom != null) __obj.updateDynamic("zoom")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.dataviz.ui.StockChartZoomEvent) => zoom(t0).runNow()))
    if (zoomEnd != null) __obj.updateDynamic("zoomEnd")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.dataviz.ui.StockChartZoomEndEvent) => zoomEnd(t0).runNow()))
    if (zoomStart != null) __obj.updateDynamic("zoomStart")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.dataviz.ui.StockChartZoomStartEvent) => zoomStart(t0).runNow()))
    __obj.asInstanceOf[StockChartOptions]
  }
}

