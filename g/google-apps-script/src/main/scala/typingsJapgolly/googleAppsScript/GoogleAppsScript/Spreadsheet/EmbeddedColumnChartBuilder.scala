package typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Charts.ChartHiddenDimensionStrategy
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Charts.ChartMergeStrategy
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Charts.ChartType
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Charts.Position
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Builder for column charts. For more details, see the Gviz
  * documentation.
  */
trait EmbeddedColumnChartBuilder extends StObject {
  
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
  
  def reverseCategories(): EmbeddedColumnChartBuilder
  
  def setBackgroundColor(cssValue: String): EmbeddedColumnChartBuilder
  
  def setChartType(`type`: ChartType): EmbeddedChartBuilder
  
  def setColors(cssValues: js.Array[String]): EmbeddedColumnChartBuilder
  
  def setHiddenDimensionStrategy(strategy: ChartHiddenDimensionStrategy): EmbeddedChartBuilder
  
  def setLegendPosition(position: Position): EmbeddedColumnChartBuilder
  
  def setLegendTextStyle(textStyle: typingsJapgolly.googleAppsScript.GoogleAppsScript.Charts.TextStyle): EmbeddedColumnChartBuilder
  
  def setMergeStrategy(mergeStrategy: ChartMergeStrategy): EmbeddedChartBuilder
  
  def setNumHeaders(headers: Integer): EmbeddedChartBuilder
  
  def setOption(option: String, value: Any): EmbeddedChartBuilder
  
  def setPosition(anchorRowPos: Integer, anchorColPos: Integer, offsetX: Integer, offsetY: Integer): EmbeddedChartBuilder
  
  def setRange(start: Double, end: Double): EmbeddedColumnChartBuilder
  
  def setStacked(): EmbeddedColumnChartBuilder
  
  def setTitle(chartTitle: String): EmbeddedColumnChartBuilder
  
  def setTitleTextStyle(textStyle: typingsJapgolly.googleAppsScript.GoogleAppsScript.Charts.TextStyle): EmbeddedColumnChartBuilder
  
  def setTransposeRowsAndColumns(transpose: Boolean): EmbeddedChartBuilder
  
  def setXAxisTextStyle(textStyle: typingsJapgolly.googleAppsScript.GoogleAppsScript.Charts.TextStyle): EmbeddedColumnChartBuilder
  
  def setXAxisTitle(title: String): EmbeddedColumnChartBuilder
  
  def setXAxisTitleTextStyle(textStyle: typingsJapgolly.googleAppsScript.GoogleAppsScript.Charts.TextStyle): EmbeddedColumnChartBuilder
  
  def setYAxisTextStyle(textStyle: typingsJapgolly.googleAppsScript.GoogleAppsScript.Charts.TextStyle): EmbeddedColumnChartBuilder
  
  def setYAxisTitle(title: String): EmbeddedColumnChartBuilder
  
  def setYAxisTitleTextStyle(textStyle: typingsJapgolly.googleAppsScript.GoogleAppsScript.Charts.TextStyle): EmbeddedColumnChartBuilder
  
  def useLogScale(): EmbeddedColumnChartBuilder
}
object EmbeddedColumnChartBuilder {
  
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
    reverseCategories: CallbackTo[EmbeddedColumnChartBuilder],
    setBackgroundColor: String => EmbeddedColumnChartBuilder,
    setChartType: ChartType => EmbeddedChartBuilder,
    setColors: js.Array[String] => EmbeddedColumnChartBuilder,
    setHiddenDimensionStrategy: ChartHiddenDimensionStrategy => EmbeddedChartBuilder,
    setLegendPosition: Position => EmbeddedColumnChartBuilder,
    setLegendTextStyle: typingsJapgolly.googleAppsScript.GoogleAppsScript.Charts.TextStyle => EmbeddedColumnChartBuilder,
    setMergeStrategy: ChartMergeStrategy => EmbeddedChartBuilder,
    setNumHeaders: Integer => EmbeddedChartBuilder,
    setOption: (String, Any) => EmbeddedChartBuilder,
    setPosition: (Integer, Integer, Integer, Integer) => EmbeddedChartBuilder,
    setRange: (Double, Double) => EmbeddedColumnChartBuilder,
    setStacked: CallbackTo[EmbeddedColumnChartBuilder],
    setTitle: String => EmbeddedColumnChartBuilder,
    setTitleTextStyle: typingsJapgolly.googleAppsScript.GoogleAppsScript.Charts.TextStyle => EmbeddedColumnChartBuilder,
    setTransposeRowsAndColumns: Boolean => EmbeddedChartBuilder,
    setXAxisTextStyle: typingsJapgolly.googleAppsScript.GoogleAppsScript.Charts.TextStyle => EmbeddedColumnChartBuilder,
    setXAxisTitle: String => EmbeddedColumnChartBuilder,
    setXAxisTitleTextStyle: typingsJapgolly.googleAppsScript.GoogleAppsScript.Charts.TextStyle => EmbeddedColumnChartBuilder,
    setYAxisTextStyle: typingsJapgolly.googleAppsScript.GoogleAppsScript.Charts.TextStyle => EmbeddedColumnChartBuilder,
    setYAxisTitle: String => EmbeddedColumnChartBuilder,
    setYAxisTitleTextStyle: typingsJapgolly.googleAppsScript.GoogleAppsScript.Charts.TextStyle => EmbeddedColumnChartBuilder,
    useLogScale: CallbackTo[EmbeddedColumnChartBuilder]
  ): EmbeddedColumnChartBuilder = {
    val __obj = js.Dynamic.literal(addRange = js.Any.fromFunction1(addRange), asAreaChart = asAreaChart.toJsFn, asBarChart = asBarChart.toJsFn, asColumnChart = asColumnChart.toJsFn, asComboChart = asComboChart.toJsFn, asHistogramChart = asHistogramChart.toJsFn, asLineChart = asLineChart.toJsFn, asPieChart = asPieChart.toJsFn, asScatterChart = asScatterChart.toJsFn, asTableChart = asTableChart.toJsFn, build = build.toJsFn, clearRanges = clearRanges.toJsFn, getChartType = getChartType.toJsFn, getContainer = getContainer.toJsFn, getRanges = getRanges.toJsFn, removeRange = js.Any.fromFunction1(removeRange), reverseCategories = reverseCategories.toJsFn, setBackgroundColor = js.Any.fromFunction1(setBackgroundColor), setChartType = js.Any.fromFunction1(setChartType), setColors = js.Any.fromFunction1(setColors), setHiddenDimensionStrategy = js.Any.fromFunction1(setHiddenDimensionStrategy), setLegendPosition = js.Any.fromFunction1(setLegendPosition), setLegendTextStyle = js.Any.fromFunction1(setLegendTextStyle), setMergeStrategy = js.Any.fromFunction1(setMergeStrategy), setNumHeaders = js.Any.fromFunction1(setNumHeaders), setOption = js.Any.fromFunction2(setOption), setPosition = js.Any.fromFunction4(setPosition), setRange = js.Any.fromFunction2(setRange), setStacked = setStacked.toJsFn, setTitle = js.Any.fromFunction1(setTitle), setTitleTextStyle = js.Any.fromFunction1(setTitleTextStyle), setTransposeRowsAndColumns = js.Any.fromFunction1(setTransposeRowsAndColumns), setXAxisTextStyle = js.Any.fromFunction1(setXAxisTextStyle), setXAxisTitle = js.Any.fromFunction1(setXAxisTitle), setXAxisTitleTextStyle = js.Any.fromFunction1(setXAxisTitleTextStyle), setYAxisTextStyle = js.Any.fromFunction1(setYAxisTextStyle), setYAxisTitle = js.Any.fromFunction1(setYAxisTitle), setYAxisTitleTextStyle = js.Any.fromFunction1(setYAxisTitleTextStyle), useLogScale = useLogScale.toJsFn)
    __obj.asInstanceOf[EmbeddedColumnChartBuilder]
  }
  
  extension [Self <: EmbeddedColumnChartBuilder](x: Self) {
    
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
    
    inline def setReverseCategories(value: CallbackTo[EmbeddedColumnChartBuilder]): Self = StObject.set(x, "reverseCategories", value.toJsFn)
    
    inline def setSetBackgroundColor(value: String => EmbeddedColumnChartBuilder): Self = StObject.set(x, "setBackgroundColor", js.Any.fromFunction1(value))
    
    inline def setSetChartType(value: ChartType => EmbeddedChartBuilder): Self = StObject.set(x, "setChartType", js.Any.fromFunction1(value))
    
    inline def setSetColors(value: js.Array[String] => EmbeddedColumnChartBuilder): Self = StObject.set(x, "setColors", js.Any.fromFunction1(value))
    
    inline def setSetHiddenDimensionStrategy(value: ChartHiddenDimensionStrategy => EmbeddedChartBuilder): Self = StObject.set(x, "setHiddenDimensionStrategy", js.Any.fromFunction1(value))
    
    inline def setSetLegendPosition(value: Position => EmbeddedColumnChartBuilder): Self = StObject.set(x, "setLegendPosition", js.Any.fromFunction1(value))
    
    inline def setSetLegendTextStyle(
      value: typingsJapgolly.googleAppsScript.GoogleAppsScript.Charts.TextStyle => EmbeddedColumnChartBuilder
    ): Self = StObject.set(x, "setLegendTextStyle", js.Any.fromFunction1(value))
    
    inline def setSetMergeStrategy(value: ChartMergeStrategy => EmbeddedChartBuilder): Self = StObject.set(x, "setMergeStrategy", js.Any.fromFunction1(value))
    
    inline def setSetNumHeaders(value: Integer => EmbeddedChartBuilder): Self = StObject.set(x, "setNumHeaders", js.Any.fromFunction1(value))
    
    inline def setSetOption(value: (String, Any) => EmbeddedChartBuilder): Self = StObject.set(x, "setOption", js.Any.fromFunction2(value))
    
    inline def setSetPosition(value: (Integer, Integer, Integer, Integer) => EmbeddedChartBuilder): Self = StObject.set(x, "setPosition", js.Any.fromFunction4(value))
    
    inline def setSetRange(value: (Double, Double) => EmbeddedColumnChartBuilder): Self = StObject.set(x, "setRange", js.Any.fromFunction2(value))
    
    inline def setSetStacked(value: CallbackTo[EmbeddedColumnChartBuilder]): Self = StObject.set(x, "setStacked", value.toJsFn)
    
    inline def setSetTitle(value: String => EmbeddedColumnChartBuilder): Self = StObject.set(x, "setTitle", js.Any.fromFunction1(value))
    
    inline def setSetTitleTextStyle(
      value: typingsJapgolly.googleAppsScript.GoogleAppsScript.Charts.TextStyle => EmbeddedColumnChartBuilder
    ): Self = StObject.set(x, "setTitleTextStyle", js.Any.fromFunction1(value))
    
    inline def setSetTransposeRowsAndColumns(value: Boolean => EmbeddedChartBuilder): Self = StObject.set(x, "setTransposeRowsAndColumns", js.Any.fromFunction1(value))
    
    inline def setSetXAxisTextStyle(
      value: typingsJapgolly.googleAppsScript.GoogleAppsScript.Charts.TextStyle => EmbeddedColumnChartBuilder
    ): Self = StObject.set(x, "setXAxisTextStyle", js.Any.fromFunction1(value))
    
    inline def setSetXAxisTitle(value: String => EmbeddedColumnChartBuilder): Self = StObject.set(x, "setXAxisTitle", js.Any.fromFunction1(value))
    
    inline def setSetXAxisTitleTextStyle(
      value: typingsJapgolly.googleAppsScript.GoogleAppsScript.Charts.TextStyle => EmbeddedColumnChartBuilder
    ): Self = StObject.set(x, "setXAxisTitleTextStyle", js.Any.fromFunction1(value))
    
    inline def setSetYAxisTextStyle(
      value: typingsJapgolly.googleAppsScript.GoogleAppsScript.Charts.TextStyle => EmbeddedColumnChartBuilder
    ): Self = StObject.set(x, "setYAxisTextStyle", js.Any.fromFunction1(value))
    
    inline def setSetYAxisTitle(value: String => EmbeddedColumnChartBuilder): Self = StObject.set(x, "setYAxisTitle", js.Any.fromFunction1(value))
    
    inline def setSetYAxisTitleTextStyle(
      value: typingsJapgolly.googleAppsScript.GoogleAppsScript.Charts.TextStyle => EmbeddedColumnChartBuilder
    ): Self = StObject.set(x, "setYAxisTitleTextStyle", js.Any.fromFunction1(value))
    
    inline def setUseLogScale(value: CallbackTo[EmbeddedColumnChartBuilder]): Self = StObject.set(x, "useLogScale", value.toJsFn)
  }
}
