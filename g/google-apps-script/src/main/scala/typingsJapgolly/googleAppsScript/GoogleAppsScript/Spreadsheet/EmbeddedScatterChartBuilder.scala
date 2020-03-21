package typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Charts.ChartHiddenDimensionStrategy
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Charts.ChartMergeStrategy
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Charts.ChartType
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Charts.PointStyle
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Charts.Position
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Builder for scatter charts. For more details, see the Gviz
  * documentation.
  */
trait EmbeddedScatterChartBuilder extends js.Object {
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
  def setBackgroundColor(cssValue: String): EmbeddedScatterChartBuilder
  def setChartType(`type`: ChartType): EmbeddedChartBuilder
  def setColors(cssValues: js.Array[String]): EmbeddedScatterChartBuilder
  def setHiddenDimensionStrategy(strategy: ChartHiddenDimensionStrategy): EmbeddedChartBuilder
  def setLegendPosition(position: Position): EmbeddedScatterChartBuilder
  def setLegendTextStyle(textStyle: typingsJapgolly.googleAppsScript.GoogleAppsScript.Charts.TextStyle): EmbeddedScatterChartBuilder
  def setMergeStrategy(mergeStrategy: ChartMergeStrategy): EmbeddedChartBuilder
  def setNumHeaders(headers: Integer): EmbeddedChartBuilder
  def setOption(option: String, value: js.Any): EmbeddedChartBuilder
  def setPointStyle(style: PointStyle): EmbeddedScatterChartBuilder
  def setPosition(anchorRowPos: Integer, anchorColPos: Integer, offsetX: Integer, offsetY: Integer): EmbeddedChartBuilder
  def setTitle(chartTitle: String): EmbeddedScatterChartBuilder
  def setTitleTextStyle(textStyle: typingsJapgolly.googleAppsScript.GoogleAppsScript.Charts.TextStyle): EmbeddedScatterChartBuilder
  def setTransposeRowsAndColumns(transpose: Boolean): EmbeddedChartBuilder
  def setXAxisLogScale(): EmbeddedScatterChartBuilder
  def setXAxisRange(start: Double, end: Double): EmbeddedScatterChartBuilder
  def setXAxisTextStyle(textStyle: typingsJapgolly.googleAppsScript.GoogleAppsScript.Charts.TextStyle): EmbeddedScatterChartBuilder
  def setXAxisTitle(title: String): EmbeddedScatterChartBuilder
  def setXAxisTitleTextStyle(textStyle: typingsJapgolly.googleAppsScript.GoogleAppsScript.Charts.TextStyle): EmbeddedScatterChartBuilder
  def setYAxisLogScale(): EmbeddedScatterChartBuilder
  def setYAxisRange(start: Double, end: Double): EmbeddedScatterChartBuilder
  def setYAxisTextStyle(textStyle: typingsJapgolly.googleAppsScript.GoogleAppsScript.Charts.TextStyle): EmbeddedScatterChartBuilder
  def setYAxisTitle(title: String): EmbeddedScatterChartBuilder
  def setYAxisTitleTextStyle(textStyle: typingsJapgolly.googleAppsScript.GoogleAppsScript.Charts.TextStyle): EmbeddedScatterChartBuilder
}

object EmbeddedScatterChartBuilder {
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
    setBackgroundColor: String => CallbackTo[EmbeddedScatterChartBuilder],
    setChartType: ChartType => CallbackTo[EmbeddedChartBuilder],
    setColors: js.Array[String] => CallbackTo[EmbeddedScatterChartBuilder],
    setHiddenDimensionStrategy: ChartHiddenDimensionStrategy => CallbackTo[EmbeddedChartBuilder],
    setLegendPosition: Position => CallbackTo[EmbeddedScatterChartBuilder],
    setLegendTextStyle: typingsJapgolly.googleAppsScript.GoogleAppsScript.Charts.TextStyle => CallbackTo[EmbeddedScatterChartBuilder],
    setMergeStrategy: ChartMergeStrategy => CallbackTo[EmbeddedChartBuilder],
    setNumHeaders: Integer => CallbackTo[EmbeddedChartBuilder],
    setOption: (String, js.Any) => CallbackTo[EmbeddedChartBuilder],
    setPointStyle: PointStyle => CallbackTo[EmbeddedScatterChartBuilder],
    setPosition: (Integer, Integer, Integer, Integer) => CallbackTo[EmbeddedChartBuilder],
    setTitle: String => CallbackTo[EmbeddedScatterChartBuilder],
    setTitleTextStyle: typingsJapgolly.googleAppsScript.GoogleAppsScript.Charts.TextStyle => CallbackTo[EmbeddedScatterChartBuilder],
    setTransposeRowsAndColumns: Boolean => CallbackTo[EmbeddedChartBuilder],
    setXAxisLogScale: CallbackTo[EmbeddedScatterChartBuilder],
    setXAxisRange: (Double, Double) => CallbackTo[EmbeddedScatterChartBuilder],
    setXAxisTextStyle: typingsJapgolly.googleAppsScript.GoogleAppsScript.Charts.TextStyle => CallbackTo[EmbeddedScatterChartBuilder],
    setXAxisTitle: String => CallbackTo[EmbeddedScatterChartBuilder],
    setXAxisTitleTextStyle: typingsJapgolly.googleAppsScript.GoogleAppsScript.Charts.TextStyle => CallbackTo[EmbeddedScatterChartBuilder],
    setYAxisLogScale: CallbackTo[EmbeddedScatterChartBuilder],
    setYAxisRange: (Double, Double) => CallbackTo[EmbeddedScatterChartBuilder],
    setYAxisTextStyle: typingsJapgolly.googleAppsScript.GoogleAppsScript.Charts.TextStyle => CallbackTo[EmbeddedScatterChartBuilder],
    setYAxisTitle: String => CallbackTo[EmbeddedScatterChartBuilder],
    setYAxisTitleTextStyle: typingsJapgolly.googleAppsScript.GoogleAppsScript.Charts.TextStyle => CallbackTo[EmbeddedScatterChartBuilder]
  ): EmbeddedScatterChartBuilder = {
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
    __obj.updateDynamic("setBackgroundColor")(js.Any.fromFunction1((t0: java.lang.String) => setBackgroundColor(t0).runNow()))
    __obj.updateDynamic("setChartType")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.Charts.ChartType) => setChartType(t0).runNow()))
    __obj.updateDynamic("setColors")(js.Any.fromFunction1((t0: js.Array[java.lang.String]) => setColors(t0).runNow()))
    __obj.updateDynamic("setHiddenDimensionStrategy")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.Charts.ChartHiddenDimensionStrategy) => setHiddenDimensionStrategy(t0).runNow()))
    __obj.updateDynamic("setLegendPosition")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.Charts.Position) => setLegendPosition(t0).runNow()))
    __obj.updateDynamic("setLegendTextStyle")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.Charts.TextStyle) => setLegendTextStyle(t0).runNow()))
    __obj.updateDynamic("setMergeStrategy")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.Charts.ChartMergeStrategy) => setMergeStrategy(t0).runNow()))
    __obj.updateDynamic("setNumHeaders")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.Integer) => setNumHeaders(t0).runNow()))
    __obj.updateDynamic("setOption")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Any) => setOption(t0, t1).runNow()))
    __obj.updateDynamic("setPointStyle")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.Charts.PointStyle) => setPointStyle(t0).runNow()))
    __obj.updateDynamic("setPosition")(js.Any.fromFunction4((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.Integer, t1: typingsJapgolly.googleAppsScript.GoogleAppsScript.Integer, t2: typingsJapgolly.googleAppsScript.GoogleAppsScript.Integer, t3: typingsJapgolly.googleAppsScript.GoogleAppsScript.Integer) => setPosition(t0, t1, t2, t3).runNow()))
    __obj.updateDynamic("setTitle")(js.Any.fromFunction1((t0: java.lang.String) => setTitle(t0).runNow()))
    __obj.updateDynamic("setTitleTextStyle")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.Charts.TextStyle) => setTitleTextStyle(t0).runNow()))
    __obj.updateDynamic("setTransposeRowsAndColumns")(js.Any.fromFunction1((t0: scala.Boolean) => setTransposeRowsAndColumns(t0).runNow()))
    __obj.updateDynamic("setXAxisLogScale")(setXAxisLogScale.toJsFn)
    __obj.updateDynamic("setXAxisRange")(js.Any.fromFunction2((t0: scala.Double, t1: scala.Double) => setXAxisRange(t0, t1).runNow()))
    __obj.updateDynamic("setXAxisTextStyle")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.Charts.TextStyle) => setXAxisTextStyle(t0).runNow()))
    __obj.updateDynamic("setXAxisTitle")(js.Any.fromFunction1((t0: java.lang.String) => setXAxisTitle(t0).runNow()))
    __obj.updateDynamic("setXAxisTitleTextStyle")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.Charts.TextStyle) => setXAxisTitleTextStyle(t0).runNow()))
    __obj.updateDynamic("setYAxisLogScale")(setYAxisLogScale.toJsFn)
    __obj.updateDynamic("setYAxisRange")(js.Any.fromFunction2((t0: scala.Double, t1: scala.Double) => setYAxisRange(t0, t1).runNow()))
    __obj.updateDynamic("setYAxisTextStyle")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.Charts.TextStyle) => setYAxisTextStyle(t0).runNow()))
    __obj.updateDynamic("setYAxisTitle")(js.Any.fromFunction1((t0: java.lang.String) => setYAxisTitle(t0).runNow()))
    __obj.updateDynamic("setYAxisTitleTextStyle")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.Charts.TextStyle) => setYAxisTitleTextStyle(t0).runNow()))
    __obj.asInstanceOf[EmbeddedScatterChartBuilder]
  }
}

