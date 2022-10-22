package typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Charts.ChartHiddenDimensionStrategy
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Charts.ChartMergeStrategy
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Charts.ChartType
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Builder used to edit an EmbeddedChart. Changes made to the chart are not saved until
  * Sheet.updateChart(chart) is called on the rebuilt chart.
  *
  *     var sheet = SpreadsheetApp.getActiveSheet();
  *     var range = sheet.getRange("A1:B8");
  *     var chart = sheet.getCharts()[0];
  *     chart = chart.modify()
  *         .addRange(range)
  *         .setOption('title', 'Updated!')
  *         .setOption('animation.duration', 500)
  *         .setPosition(2,2,0,0)
  *         .build();
  *     sheet.updateChart(chart);
  */
trait EmbeddedChartBuilder extends StObject {
  
  def addRange(range: Range): EmbeddedChartBuilder
  
  def asAreaChart(): EmbeddedAreaChartBuilder
  
  def asBarChart(): EmbeddedBarChartBuilder
  
  def asColumnChart(): EmbeddedColumnChartBuilder
  
  def asComboChart(): EmbeddedComboChartBuilder
  
  def asHistogramChart(): EmbeddedHistogramChartBuilder
  
  def asLineChart(): EmbeddedLineChartBuilder
  
  def asPieChart(): EmbeddedPieChartBuilder
  
  def asScatterChart(): EmbeddedScatterChartBuilder
  
  def asTableChart(): EmbeddedTableChartBuilder
  
  def build(): EmbeddedChart
  
  def clearRanges(): EmbeddedChartBuilder
  
  def getChartType(): ChartType
  
  def getContainer(): ContainerInfo
  
  def getRanges(): js.Array[Range]
  
  def removeRange(range: Range): EmbeddedChartBuilder
  
  def setChartType(`type`: ChartType): EmbeddedChartBuilder
  
  def setHiddenDimensionStrategy(strategy: ChartHiddenDimensionStrategy): EmbeddedChartBuilder
  
  def setMergeStrategy(mergeStrategy: ChartMergeStrategy): EmbeddedChartBuilder
  
  def setNumHeaders(headers: Integer): EmbeddedChartBuilder
  
  def setOption(option: String, value: Any): EmbeddedChartBuilder
  
  def setPosition(anchorRowPos: Integer, anchorColPos: Integer, offsetX: Integer, offsetY: Integer): EmbeddedChartBuilder
  
  def setTransposeRowsAndColumns(transpose: Boolean): EmbeddedChartBuilder
}
object EmbeddedChartBuilder {
  
  inline def apply(
    addRange: Range => EmbeddedChartBuilder,
    asAreaChart: CallbackTo[EmbeddedAreaChartBuilder],
    asBarChart: CallbackTo[EmbeddedBarChartBuilder],
    asColumnChart: CallbackTo[EmbeddedColumnChartBuilder],
    asComboChart: CallbackTo[EmbeddedComboChartBuilder],
    asHistogramChart: CallbackTo[EmbeddedHistogramChartBuilder],
    asLineChart: CallbackTo[EmbeddedLineChartBuilder],
    asPieChart: CallbackTo[EmbeddedPieChartBuilder],
    asScatterChart: CallbackTo[EmbeddedScatterChartBuilder],
    asTableChart: CallbackTo[EmbeddedTableChartBuilder],
    build: CallbackTo[EmbeddedChart],
    clearRanges: CallbackTo[EmbeddedChartBuilder],
    getChartType: CallbackTo[ChartType],
    getContainer: CallbackTo[ContainerInfo],
    getRanges: CallbackTo[js.Array[Range]],
    removeRange: Range => EmbeddedChartBuilder,
    setChartType: ChartType => EmbeddedChartBuilder,
    setHiddenDimensionStrategy: ChartHiddenDimensionStrategy => EmbeddedChartBuilder,
    setMergeStrategy: ChartMergeStrategy => EmbeddedChartBuilder,
    setNumHeaders: Integer => EmbeddedChartBuilder,
    setOption: (String, Any) => EmbeddedChartBuilder,
    setPosition: (Integer, Integer, Integer, Integer) => EmbeddedChartBuilder,
    setTransposeRowsAndColumns: Boolean => EmbeddedChartBuilder
  ): EmbeddedChartBuilder = {
    val __obj = js.Dynamic.literal(addRange = js.Any.fromFunction1(addRange), asAreaChart = asAreaChart.toJsFn, asBarChart = asBarChart.toJsFn, asColumnChart = asColumnChart.toJsFn, asComboChart = asComboChart.toJsFn, asHistogramChart = asHistogramChart.toJsFn, asLineChart = asLineChart.toJsFn, asPieChart = asPieChart.toJsFn, asScatterChart = asScatterChart.toJsFn, asTableChart = asTableChart.toJsFn, build = build.toJsFn, clearRanges = clearRanges.toJsFn, getChartType = getChartType.toJsFn, getContainer = getContainer.toJsFn, getRanges = getRanges.toJsFn, removeRange = js.Any.fromFunction1(removeRange), setChartType = js.Any.fromFunction1(setChartType), setHiddenDimensionStrategy = js.Any.fromFunction1(setHiddenDimensionStrategy), setMergeStrategy = js.Any.fromFunction1(setMergeStrategy), setNumHeaders = js.Any.fromFunction1(setNumHeaders), setOption = js.Any.fromFunction2(setOption), setPosition = js.Any.fromFunction4(setPosition), setTransposeRowsAndColumns = js.Any.fromFunction1(setTransposeRowsAndColumns))
    __obj.asInstanceOf[EmbeddedChartBuilder]
  }
  
  extension [Self <: EmbeddedChartBuilder](x: Self) {
    
    inline def setAddRange(value: Range => EmbeddedChartBuilder): Self = StObject.set(x, "addRange", js.Any.fromFunction1(value))
    
    inline def setAsAreaChart(value: CallbackTo[EmbeddedAreaChartBuilder]): Self = StObject.set(x, "asAreaChart", value.toJsFn)
    
    inline def setAsBarChart(value: CallbackTo[EmbeddedBarChartBuilder]): Self = StObject.set(x, "asBarChart", value.toJsFn)
    
    inline def setAsColumnChart(value: CallbackTo[EmbeddedColumnChartBuilder]): Self = StObject.set(x, "asColumnChart", value.toJsFn)
    
    inline def setAsComboChart(value: CallbackTo[EmbeddedComboChartBuilder]): Self = StObject.set(x, "asComboChart", value.toJsFn)
    
    inline def setAsHistogramChart(value: CallbackTo[EmbeddedHistogramChartBuilder]): Self = StObject.set(x, "asHistogramChart", value.toJsFn)
    
    inline def setAsLineChart(value: CallbackTo[EmbeddedLineChartBuilder]): Self = StObject.set(x, "asLineChart", value.toJsFn)
    
    inline def setAsPieChart(value: CallbackTo[EmbeddedPieChartBuilder]): Self = StObject.set(x, "asPieChart", value.toJsFn)
    
    inline def setAsScatterChart(value: CallbackTo[EmbeddedScatterChartBuilder]): Self = StObject.set(x, "asScatterChart", value.toJsFn)
    
    inline def setAsTableChart(value: CallbackTo[EmbeddedTableChartBuilder]): Self = StObject.set(x, "asTableChart", value.toJsFn)
    
    inline def setBuild(value: CallbackTo[EmbeddedChart]): Self = StObject.set(x, "build", value.toJsFn)
    
    inline def setClearRanges(value: CallbackTo[EmbeddedChartBuilder]): Self = StObject.set(x, "clearRanges", value.toJsFn)
    
    inline def setGetChartType(value: CallbackTo[ChartType]): Self = StObject.set(x, "getChartType", value.toJsFn)
    
    inline def setGetContainer(value: CallbackTo[ContainerInfo]): Self = StObject.set(x, "getContainer", value.toJsFn)
    
    inline def setGetRanges(value: CallbackTo[js.Array[Range]]): Self = StObject.set(x, "getRanges", value.toJsFn)
    
    inline def setRemoveRange(value: Range => EmbeddedChartBuilder): Self = StObject.set(x, "removeRange", js.Any.fromFunction1(value))
    
    inline def setSetChartType(value: ChartType => EmbeddedChartBuilder): Self = StObject.set(x, "setChartType", js.Any.fromFunction1(value))
    
    inline def setSetHiddenDimensionStrategy(value: ChartHiddenDimensionStrategy => EmbeddedChartBuilder): Self = StObject.set(x, "setHiddenDimensionStrategy", js.Any.fromFunction1(value))
    
    inline def setSetMergeStrategy(value: ChartMergeStrategy => EmbeddedChartBuilder): Self = StObject.set(x, "setMergeStrategy", js.Any.fromFunction1(value))
    
    inline def setSetNumHeaders(value: Integer => EmbeddedChartBuilder): Self = StObject.set(x, "setNumHeaders", js.Any.fromFunction1(value))
    
    inline def setSetOption(value: (String, Any) => EmbeddedChartBuilder): Self = StObject.set(x, "setOption", js.Any.fromFunction2(value))
    
    inline def setSetPosition(value: (Integer, Integer, Integer, Integer) => EmbeddedChartBuilder): Self = StObject.set(x, "setPosition", js.Any.fromFunction4(value))
    
    inline def setSetTransposeRowsAndColumns(value: Boolean => EmbeddedChartBuilder): Self = StObject.set(x, "setTransposeRowsAndColumns", js.Any.fromFunction1(value))
  }
}
