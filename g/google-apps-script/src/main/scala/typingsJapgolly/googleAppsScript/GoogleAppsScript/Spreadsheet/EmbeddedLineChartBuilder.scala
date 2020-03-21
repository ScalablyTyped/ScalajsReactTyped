package typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Charts.ChartHiddenDimensionStrategy
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Charts.ChartMergeStrategy
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Charts.ChartType
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Charts.CurveStyle
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Charts.PointStyle
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Charts.Position
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Builder for line charts. For more details, see the Gviz
  * documentation.
  */
trait EmbeddedLineChartBuilder extends js.Object {
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
  def reverseCategories(): EmbeddedLineChartBuilder
  def setBackgroundColor(cssValue: String): EmbeddedLineChartBuilder
  def setChartType(`type`: ChartType): EmbeddedChartBuilder
  def setColors(cssValues: js.Array[String]): EmbeddedLineChartBuilder
  def setCurveStyle(style: CurveStyle): EmbeddedLineChartBuilder
  def setHiddenDimensionStrategy(strategy: ChartHiddenDimensionStrategy): EmbeddedChartBuilder
  def setLegendPosition(position: Position): EmbeddedLineChartBuilder
  def setLegendTextStyle(textStyle: typingsJapgolly.googleAppsScript.GoogleAppsScript.Charts.TextStyle): EmbeddedLineChartBuilder
  def setMergeStrategy(mergeStrategy: ChartMergeStrategy): EmbeddedChartBuilder
  def setNumHeaders(headers: Integer): EmbeddedChartBuilder
  def setOption(option: String, value: js.Any): EmbeddedChartBuilder
  def setPointStyle(style: PointStyle): EmbeddedLineChartBuilder
  def setPosition(anchorRowPos: Integer, anchorColPos: Integer, offsetX: Integer, offsetY: Integer): EmbeddedChartBuilder
  def setRange(start: Double, end: Double): EmbeddedLineChartBuilder
  def setTitle(chartTitle: String): EmbeddedLineChartBuilder
  def setTitleTextStyle(textStyle: typingsJapgolly.googleAppsScript.GoogleAppsScript.Charts.TextStyle): EmbeddedLineChartBuilder
  def setTransposeRowsAndColumns(transpose: Boolean): EmbeddedChartBuilder
  def setXAxisTextStyle(textStyle: typingsJapgolly.googleAppsScript.GoogleAppsScript.Charts.TextStyle): EmbeddedLineChartBuilder
  def setXAxisTitle(title: String): EmbeddedLineChartBuilder
  def setXAxisTitleTextStyle(textStyle: typingsJapgolly.googleAppsScript.GoogleAppsScript.Charts.TextStyle): EmbeddedLineChartBuilder
  def setYAxisTextStyle(textStyle: typingsJapgolly.googleAppsScript.GoogleAppsScript.Charts.TextStyle): EmbeddedLineChartBuilder
  def setYAxisTitle(title: String): EmbeddedLineChartBuilder
  def setYAxisTitleTextStyle(textStyle: typingsJapgolly.googleAppsScript.GoogleAppsScript.Charts.TextStyle): EmbeddedLineChartBuilder
  def useLogScale(): EmbeddedLineChartBuilder
}

object EmbeddedLineChartBuilder {
  @scala.inline
  def apply(
    addRange: Range => CallbackTo[EmbeddedChartBuilder],
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
    removeRange: Range => CallbackTo[EmbeddedChartBuilder],
    reverseCategories: CallbackTo[EmbeddedLineChartBuilder],
    setBackgroundColor: String => CallbackTo[EmbeddedLineChartBuilder],
    setChartType: ChartType => CallbackTo[EmbeddedChartBuilder],
    setColors: js.Array[String] => CallbackTo[EmbeddedLineChartBuilder],
    setCurveStyle: CurveStyle => CallbackTo[EmbeddedLineChartBuilder],
    setHiddenDimensionStrategy: ChartHiddenDimensionStrategy => CallbackTo[EmbeddedChartBuilder],
    setLegendPosition: Position => CallbackTo[EmbeddedLineChartBuilder],
    setLegendTextStyle: typingsJapgolly.googleAppsScript.GoogleAppsScript.Charts.TextStyle => CallbackTo[EmbeddedLineChartBuilder],
    setMergeStrategy: ChartMergeStrategy => CallbackTo[EmbeddedChartBuilder],
    setNumHeaders: Integer => CallbackTo[EmbeddedChartBuilder],
    setOption: (String, js.Any) => CallbackTo[EmbeddedChartBuilder],
    setPointStyle: PointStyle => CallbackTo[EmbeddedLineChartBuilder],
    setPosition: (Integer, Integer, Integer, Integer) => CallbackTo[EmbeddedChartBuilder],
    setRange: (Double, Double) => CallbackTo[EmbeddedLineChartBuilder],
    setTitle: String => CallbackTo[EmbeddedLineChartBuilder],
    setTitleTextStyle: typingsJapgolly.googleAppsScript.GoogleAppsScript.Charts.TextStyle => CallbackTo[EmbeddedLineChartBuilder],
    setTransposeRowsAndColumns: Boolean => CallbackTo[EmbeddedChartBuilder],
    setXAxisTextStyle: typingsJapgolly.googleAppsScript.GoogleAppsScript.Charts.TextStyle => CallbackTo[EmbeddedLineChartBuilder],
    setXAxisTitle: String => CallbackTo[EmbeddedLineChartBuilder],
    setXAxisTitleTextStyle: typingsJapgolly.googleAppsScript.GoogleAppsScript.Charts.TextStyle => CallbackTo[EmbeddedLineChartBuilder],
    setYAxisTextStyle: typingsJapgolly.googleAppsScript.GoogleAppsScript.Charts.TextStyle => CallbackTo[EmbeddedLineChartBuilder],
    setYAxisTitle: String => CallbackTo[EmbeddedLineChartBuilder],
    setYAxisTitleTextStyle: typingsJapgolly.googleAppsScript.GoogleAppsScript.Charts.TextStyle => CallbackTo[EmbeddedLineChartBuilder],
    useLogScale: CallbackTo[EmbeddedLineChartBuilder]
  ): EmbeddedLineChartBuilder = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addRange")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet.Range) => addRange(t0).runNow()))
    __obj.updateDynamic("asAreaChart")(asAreaChart.toJsFn)
    __obj.updateDynamic("asBarChart")(asBarChart.toJsFn)
    __obj.updateDynamic("asColumnChart")(asColumnChart.toJsFn)
    __obj.updateDynamic("asComboChart")(asComboChart.toJsFn)
    __obj.updateDynamic("asHistogramChart")(asHistogramChart.toJsFn)
    __obj.updateDynamic("asLineChart")(asLineChart.toJsFn)
    __obj.updateDynamic("asPieChart")(asPieChart.toJsFn)
    __obj.updateDynamic("asScatterChart")(asScatterChart.toJsFn)
    __obj.updateDynamic("asTableChart")(asTableChart.toJsFn)
    __obj.updateDynamic("build")(build.toJsFn)
    __obj.updateDynamic("clearRanges")(clearRanges.toJsFn)
    __obj.updateDynamic("getChartType")(getChartType.toJsFn)
    __obj.updateDynamic("getContainer")(getContainer.toJsFn)
    __obj.updateDynamic("getRanges")(getRanges.toJsFn)
    __obj.updateDynamic("removeRange")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet.Range) => removeRange(t0).runNow()))
    __obj.updateDynamic("reverseCategories")(reverseCategories.toJsFn)
    __obj.updateDynamic("setBackgroundColor")(js.Any.fromFunction1((t0: java.lang.String) => setBackgroundColor(t0).runNow()))
    __obj.updateDynamic("setChartType")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.Charts.ChartType) => setChartType(t0).runNow()))
    __obj.updateDynamic("setColors")(js.Any.fromFunction1((t0: js.Array[java.lang.String]) => setColors(t0).runNow()))
    __obj.updateDynamic("setCurveStyle")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.Charts.CurveStyle) => setCurveStyle(t0).runNow()))
    __obj.updateDynamic("setHiddenDimensionStrategy")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.Charts.ChartHiddenDimensionStrategy) => setHiddenDimensionStrategy(t0).runNow()))
    __obj.updateDynamic("setLegendPosition")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.Charts.Position) => setLegendPosition(t0).runNow()))
    __obj.updateDynamic("setLegendTextStyle")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.Charts.TextStyle) => setLegendTextStyle(t0).runNow()))
    __obj.updateDynamic("setMergeStrategy")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.Charts.ChartMergeStrategy) => setMergeStrategy(t0).runNow()))
    __obj.updateDynamic("setNumHeaders")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.Integer) => setNumHeaders(t0).runNow()))
    __obj.updateDynamic("setOption")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Any) => setOption(t0, t1).runNow()))
    __obj.updateDynamic("setPointStyle")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.Charts.PointStyle) => setPointStyle(t0).runNow()))
    __obj.updateDynamic("setPosition")(js.Any.fromFunction4((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.Integer, t1: typingsJapgolly.googleAppsScript.GoogleAppsScript.Integer, t2: typingsJapgolly.googleAppsScript.GoogleAppsScript.Integer, t3: typingsJapgolly.googleAppsScript.GoogleAppsScript.Integer) => setPosition(t0, t1, t2, t3).runNow()))
    __obj.updateDynamic("setRange")(js.Any.fromFunction2((t0: scala.Double, t1: scala.Double) => setRange(t0, t1).runNow()))
    __obj.updateDynamic("setTitle")(js.Any.fromFunction1((t0: java.lang.String) => setTitle(t0).runNow()))
    __obj.updateDynamic("setTitleTextStyle")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.Charts.TextStyle) => setTitleTextStyle(t0).runNow()))
    __obj.updateDynamic("setTransposeRowsAndColumns")(js.Any.fromFunction1((t0: scala.Boolean) => setTransposeRowsAndColumns(t0).runNow()))
    __obj.updateDynamic("setXAxisTextStyle")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.Charts.TextStyle) => setXAxisTextStyle(t0).runNow()))
    __obj.updateDynamic("setXAxisTitle")(js.Any.fromFunction1((t0: java.lang.String) => setXAxisTitle(t0).runNow()))
    __obj.updateDynamic("setXAxisTitleTextStyle")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.Charts.TextStyle) => setXAxisTitleTextStyle(t0).runNow()))
    __obj.updateDynamic("setYAxisTextStyle")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.Charts.TextStyle) => setYAxisTextStyle(t0).runNow()))
    __obj.updateDynamic("setYAxisTitle")(js.Any.fromFunction1((t0: java.lang.String) => setYAxisTitle(t0).runNow()))
    __obj.updateDynamic("setYAxisTitleTextStyle")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.Charts.TextStyle) => setYAxisTitleTextStyle(t0).runNow()))
    __obj.updateDynamic("useLogScale")(useLogScale.toJsFn)
    __obj.asInstanceOf[EmbeddedLineChartBuilder]
  }
}

