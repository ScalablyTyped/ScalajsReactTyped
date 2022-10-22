package typingsJapgolly.kendoUi.kendo.dataviz.ui

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StockChartOptions extends StObject {
  
  var autoBind: js.UndefOr[Boolean] = js.undefined
  
  var axisDefaults: js.UndefOr[Any] = js.undefined
  
  var axisLabelClick: js.UndefOr[js.Function1[/* e */ StockChartAxisLabelClickEvent, Unit]] = js.undefined
  
  var categoryAxis: js.UndefOr[StockChartCategoryAxisItem | js.Array[StockChartCategoryAxisItem]] = js.undefined
  
  var chartArea: js.UndefOr[StockChartChartArea] = js.undefined
  
  var dataBound: js.UndefOr[js.Function1[/* e */ StockChartEvent, Unit]] = js.undefined
  
  var dataSource: js.UndefOr[Any] = js.undefined
  
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
  
  var seriesColors: js.UndefOr[Any] = js.undefined
  
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
  
  inline def apply(): StockChartOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StockChartOptions]
  }
  
  extension [Self <: StockChartOptions](x: Self) {
    
    inline def setAutoBind(value: Boolean): Self = StObject.set(x, "autoBind", value.asInstanceOf[js.Any])
    
    inline def setAutoBindUndefined: Self = StObject.set(x, "autoBind", js.undefined)
    
    inline def setAxisDefaults(value: Any): Self = StObject.set(x, "axisDefaults", value.asInstanceOf[js.Any])
    
    inline def setAxisDefaultsUndefined: Self = StObject.set(x, "axisDefaults", js.undefined)
    
    inline def setAxisLabelClick(value: /* e */ StockChartAxisLabelClickEvent => Callback): Self = StObject.set(x, "axisLabelClick", js.Any.fromFunction1((t0: /* e */ StockChartAxisLabelClickEvent) => value(t0).runNow()))
    
    inline def setAxisLabelClickUndefined: Self = StObject.set(x, "axisLabelClick", js.undefined)
    
    inline def setCategoryAxis(value: StockChartCategoryAxisItem | js.Array[StockChartCategoryAxisItem]): Self = StObject.set(x, "categoryAxis", value.asInstanceOf[js.Any])
    
    inline def setCategoryAxisUndefined: Self = StObject.set(x, "categoryAxis", js.undefined)
    
    inline def setCategoryAxisVarargs(value: StockChartCategoryAxisItem*): Self = StObject.set(x, "categoryAxis", js.Array(value*))
    
    inline def setChartArea(value: StockChartChartArea): Self = StObject.set(x, "chartArea", value.asInstanceOf[js.Any])
    
    inline def setChartAreaUndefined: Self = StObject.set(x, "chartArea", js.undefined)
    
    inline def setDataBound(value: /* e */ StockChartEvent => Callback): Self = StObject.set(x, "dataBound", js.Any.fromFunction1((t0: /* e */ StockChartEvent) => value(t0).runNow()))
    
    inline def setDataBoundUndefined: Self = StObject.set(x, "dataBound", js.undefined)
    
    inline def setDataSource(value: Any): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
    
    inline def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
    
    inline def setDateField(value: String): Self = StObject.set(x, "dateField", value.asInstanceOf[js.Any])
    
    inline def setDateFieldUndefined: Self = StObject.set(x, "dateField", js.undefined)
    
    inline def setDrag(value: /* e */ StockChartDragEvent => Callback): Self = StObject.set(x, "drag", js.Any.fromFunction1((t0: /* e */ StockChartDragEvent) => value(t0).runNow()))
    
    inline def setDragEnd(value: /* e */ StockChartDragEndEvent => Callback): Self = StObject.set(x, "dragEnd", js.Any.fromFunction1((t0: /* e */ StockChartDragEndEvent) => value(t0).runNow()))
    
    inline def setDragEndUndefined: Self = StObject.set(x, "dragEnd", js.undefined)
    
    inline def setDragStart(value: /* e */ StockChartDragStartEvent => Callback): Self = StObject.set(x, "dragStart", js.Any.fromFunction1((t0: /* e */ StockChartDragStartEvent) => value(t0).runNow()))
    
    inline def setDragStartUndefined: Self = StObject.set(x, "dragStart", js.undefined)
    
    inline def setDragUndefined: Self = StObject.set(x, "drag", js.undefined)
    
    inline def setLegend(value: StockChartLegend): Self = StObject.set(x, "legend", value.asInstanceOf[js.Any])
    
    inline def setLegendItemClick(value: /* e */ StockChartLegendItemClickEvent => Callback): Self = StObject.set(x, "legendItemClick", js.Any.fromFunction1((t0: /* e */ StockChartLegendItemClickEvent) => value(t0).runNow()))
    
    inline def setLegendItemClickUndefined: Self = StObject.set(x, "legendItemClick", js.undefined)
    
    inline def setLegendItemHover(value: /* e */ StockChartLegendItemHoverEvent => Callback): Self = StObject.set(x, "legendItemHover", js.Any.fromFunction1((t0: /* e */ StockChartLegendItemHoverEvent) => value(t0).runNow()))
    
    inline def setLegendItemHoverUndefined: Self = StObject.set(x, "legendItemHover", js.undefined)
    
    inline def setLegendItemLeave(value: /* e */ StockChartLegendItemLeaveEvent => Callback): Self = StObject.set(x, "legendItemLeave", js.Any.fromFunction1((t0: /* e */ StockChartLegendItemLeaveEvent) => value(t0).runNow()))
    
    inline def setLegendItemLeaveUndefined: Self = StObject.set(x, "legendItemLeave", js.undefined)
    
    inline def setLegendUndefined: Self = StObject.set(x, "legend", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNavigator(value: StockChartNavigator): Self = StObject.set(x, "navigator", value.asInstanceOf[js.Any])
    
    inline def setNavigatorUndefined: Self = StObject.set(x, "navigator", js.undefined)
    
    inline def setNoteClick(value: /* e */ StockChartNoteClickEvent => Callback): Self = StObject.set(x, "noteClick", js.Any.fromFunction1((t0: /* e */ StockChartNoteClickEvent) => value(t0).runNow()))
    
    inline def setNoteClickUndefined: Self = StObject.set(x, "noteClick", js.undefined)
    
    inline def setNoteHover(value: /* e */ StockChartNoteHoverEvent => Callback): Self = StObject.set(x, "noteHover", js.Any.fromFunction1((t0: /* e */ StockChartNoteHoverEvent) => value(t0).runNow()))
    
    inline def setNoteHoverUndefined: Self = StObject.set(x, "noteHover", js.undefined)
    
    inline def setNoteLeave(value: /* e */ StockChartNoteLeaveEvent => Callback): Self = StObject.set(x, "noteLeave", js.Any.fromFunction1((t0: /* e */ StockChartNoteLeaveEvent) => value(t0).runNow()))
    
    inline def setNoteLeaveUndefined: Self = StObject.set(x, "noteLeave", js.undefined)
    
    inline def setPaneRender(value: /* e */ StockChartPaneRenderEvent => Callback): Self = StObject.set(x, "paneRender", js.Any.fromFunction1((t0: /* e */ StockChartPaneRenderEvent) => value(t0).runNow()))
    
    inline def setPaneRenderUndefined: Self = StObject.set(x, "paneRender", js.undefined)
    
    inline def setPanes(value: js.Array[StockChartPane]): Self = StObject.set(x, "panes", value.asInstanceOf[js.Any])
    
    inline def setPanesUndefined: Self = StObject.set(x, "panes", js.undefined)
    
    inline def setPanesVarargs(value: StockChartPane*): Self = StObject.set(x, "panes", js.Array(value*))
    
    inline def setPdf(value: StockChartPdf): Self = StObject.set(x, "pdf", value.asInstanceOf[js.Any])
    
    inline def setPdfUndefined: Self = StObject.set(x, "pdf", js.undefined)
    
    inline def setPersistSeriesVisibility(value: Boolean): Self = StObject.set(x, "persistSeriesVisibility", value.asInstanceOf[js.Any])
    
    inline def setPersistSeriesVisibilityUndefined: Self = StObject.set(x, "persistSeriesVisibility", js.undefined)
    
    inline def setPlotArea(value: StockChartPlotArea): Self = StObject.set(x, "plotArea", value.asInstanceOf[js.Any])
    
    inline def setPlotAreaClick(value: /* e */ StockChartPlotAreaClickEvent => Callback): Self = StObject.set(x, "plotAreaClick", js.Any.fromFunction1((t0: /* e */ StockChartPlotAreaClickEvent) => value(t0).runNow()))
    
    inline def setPlotAreaClickUndefined: Self = StObject.set(x, "plotAreaClick", js.undefined)
    
    inline def setPlotAreaHover(value: /* e */ StockChartPlotAreaHoverEvent => Callback): Self = StObject.set(x, "plotAreaHover", js.Any.fromFunction1((t0: /* e */ StockChartPlotAreaHoverEvent) => value(t0).runNow()))
    
    inline def setPlotAreaHoverUndefined: Self = StObject.set(x, "plotAreaHover", js.undefined)
    
    inline def setPlotAreaLeave(value: /* e */ StockChartPlotAreaLeaveEvent => Callback): Self = StObject.set(x, "plotAreaLeave", js.Any.fromFunction1((t0: /* e */ StockChartPlotAreaLeaveEvent) => value(t0).runNow()))
    
    inline def setPlotAreaLeaveUndefined: Self = StObject.set(x, "plotAreaLeave", js.undefined)
    
    inline def setPlotAreaUndefined: Self = StObject.set(x, "plotArea", js.undefined)
    
    inline def setRender(value: /* e */ StockChartRenderEvent => Callback): Self = StObject.set(x, "render", js.Any.fromFunction1((t0: /* e */ StockChartRenderEvent) => value(t0).runNow()))
    
    inline def setRenderAs(value: String): Self = StObject.set(x, "renderAs", value.asInstanceOf[js.Any])
    
    inline def setRenderAsUndefined: Self = StObject.set(x, "renderAs", js.undefined)
    
    inline def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
    
    inline def setSelect(value: /* e */ StockChartSelectEvent => Callback): Self = StObject.set(x, "select", js.Any.fromFunction1((t0: /* e */ StockChartSelectEvent) => value(t0).runNow()))
    
    inline def setSelectEnd(value: /* e */ StockChartSelectEndEvent => Callback): Self = StObject.set(x, "selectEnd", js.Any.fromFunction1((t0: /* e */ StockChartSelectEndEvent) => value(t0).runNow()))
    
    inline def setSelectEndUndefined: Self = StObject.set(x, "selectEnd", js.undefined)
    
    inline def setSelectStart(value: /* e */ StockChartSelectStartEvent => Callback): Self = StObject.set(x, "selectStart", js.Any.fromFunction1((t0: /* e */ StockChartSelectStartEvent) => value(t0).runNow()))
    
    inline def setSelectStartUndefined: Self = StObject.set(x, "selectStart", js.undefined)
    
    inline def setSelectUndefined: Self = StObject.set(x, "select", js.undefined)
    
    inline def setSeries(value: js.Array[StockChartSeriesItem]): Self = StObject.set(x, "series", value.asInstanceOf[js.Any])
    
    inline def setSeriesClick(value: /* e */ StockChartSeriesClickEvent => Callback): Self = StObject.set(x, "seriesClick", js.Any.fromFunction1((t0: /* e */ StockChartSeriesClickEvent) => value(t0).runNow()))
    
    inline def setSeriesClickUndefined: Self = StObject.set(x, "seriesClick", js.undefined)
    
    inline def setSeriesColors(value: Any): Self = StObject.set(x, "seriesColors", value.asInstanceOf[js.Any])
    
    inline def setSeriesColorsUndefined: Self = StObject.set(x, "seriesColors", js.undefined)
    
    inline def setSeriesDefaults(value: StockChartSeriesDefaults): Self = StObject.set(x, "seriesDefaults", value.asInstanceOf[js.Any])
    
    inline def setSeriesDefaultsUndefined: Self = StObject.set(x, "seriesDefaults", js.undefined)
    
    inline def setSeriesHover(value: /* e */ StockChartSeriesHoverEvent => Callback): Self = StObject.set(x, "seriesHover", js.Any.fromFunction1((t0: /* e */ StockChartSeriesHoverEvent) => value(t0).runNow()))
    
    inline def setSeriesHoverUndefined: Self = StObject.set(x, "seriesHover", js.undefined)
    
    inline def setSeriesLeave(value: /* e */ StockChartSeriesLeaveEvent => Callback): Self = StObject.set(x, "seriesLeave", js.Any.fromFunction1((t0: /* e */ StockChartSeriesLeaveEvent) => value(t0).runNow()))
    
    inline def setSeriesLeaveUndefined: Self = StObject.set(x, "seriesLeave", js.undefined)
    
    inline def setSeriesOver(value: /* e */ StockChartSeriesOverEvent => Callback): Self = StObject.set(x, "seriesOver", js.Any.fromFunction1((t0: /* e */ StockChartSeriesOverEvent) => value(t0).runNow()))
    
    inline def setSeriesOverUndefined: Self = StObject.set(x, "seriesOver", js.undefined)
    
    inline def setSeriesUndefined: Self = StObject.set(x, "series", js.undefined)
    
    inline def setSeriesVarargs(value: StockChartSeriesItem*): Self = StObject.set(x, "series", js.Array(value*))
    
    inline def setTheme(value: String): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    
    inline def setTitle(value: StockChartTitle): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setTooltip(value: StockChartTooltip): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
    
    inline def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
    
    inline def setTransitions(value: Boolean): Self = StObject.set(x, "transitions", value.asInstanceOf[js.Any])
    
    inline def setTransitionsUndefined: Self = StObject.set(x, "transitions", js.undefined)
    
    inline def setValueAxis(value: StockChartValueAxisItem | js.Array[StockChartValueAxisItem]): Self = StObject.set(x, "valueAxis", value.asInstanceOf[js.Any])
    
    inline def setValueAxisUndefined: Self = StObject.set(x, "valueAxis", js.undefined)
    
    inline def setValueAxisVarargs(value: StockChartValueAxisItem*): Self = StObject.set(x, "valueAxis", js.Array(value*))
    
    inline def setZoom(value: /* e */ StockChartZoomEvent => Callback): Self = StObject.set(x, "zoom", js.Any.fromFunction1((t0: /* e */ StockChartZoomEvent) => value(t0).runNow()))
    
    inline def setZoomEnd(value: /* e */ StockChartZoomEndEvent => Callback): Self = StObject.set(x, "zoomEnd", js.Any.fromFunction1((t0: /* e */ StockChartZoomEndEvent) => value(t0).runNow()))
    
    inline def setZoomEndUndefined: Self = StObject.set(x, "zoomEnd", js.undefined)
    
    inline def setZoomStart(value: /* e */ StockChartZoomStartEvent => Callback): Self = StObject.set(x, "zoomStart", js.Any.fromFunction1((t0: /* e */ StockChartZoomStartEvent) => value(t0).runNow()))
    
    inline def setZoomStartUndefined: Self = StObject.set(x, "zoomStart", js.undefined)
    
    inline def setZoomUndefined: Self = StObject.set(x, "zoom", js.undefined)
  }
}
