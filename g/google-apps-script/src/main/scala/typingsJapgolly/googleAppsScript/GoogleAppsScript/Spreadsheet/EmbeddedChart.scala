package typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Base.Blob
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Charts.ChartHiddenDimensionStrategy
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Charts.ChartMergeStrategy
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Charts.ChartOptions
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a chart that has been embedded into a spreadsheet.
  *
  * This example shows how to modify an existing chart:
  *
  *     var sheet = SpreadsheetApp.getActiveSheet();
  *     var range = sheet.getRange("A2:B8")
  *     var chart = sheet.getCharts()[0];
  *     chart = chart.modify()
  *         .addRange(range)
  *         .setOption('title', 'Updated!')
  *         .setOption('animation.duration', 500)
  *         .setPosition(2,2,0,0)
  *         .build();
  *     sheet.updateChart(chart);
  *
  * This example shows how to create a new chart:
  *
  *     function newChart(range, sheet) {
  *       var sheet = SpreadsheetApp.getActiveSheet();
  *       var chartBuilder = sheet.newChart();
  *       chartBuilder.addRange(range)
  *           .setChartType(Charts.ChartType.LINE)
  *           .setOption('title', 'My Line Chart!');
  *       sheet.insertChart(chartBuilder.build());
  *     }
  */
trait EmbeddedChart extends js.Object {
  def getAs(contentType: String): Blob
  def getBlob(): Blob
  def getChartId(): Integer | Null
  def getContainerInfo(): ContainerInfo
  def getHiddenDimensionStrategy(): ChartHiddenDimensionStrategy
  def getMergeStrategy(): ChartMergeStrategy
  def getNumHeaders(): Integer
  def getOptions(): ChartOptions
  def getRanges(): js.Array[Range]
  def getTransposeRowsAndColumns(): Boolean
  def modify(): EmbeddedChartBuilder
}

object EmbeddedChart {
  @scala.inline
  def apply(
    getAs: String => CallbackTo[Blob],
    getBlob: CallbackTo[Blob],
    getChartId: CallbackTo[Integer | Null],
    getContainerInfo: CallbackTo[ContainerInfo],
    getHiddenDimensionStrategy: CallbackTo[ChartHiddenDimensionStrategy],
    getMergeStrategy: CallbackTo[ChartMergeStrategy],
    getNumHeaders: CallbackTo[Integer],
    getOptions: CallbackTo[ChartOptions],
    getRanges: CallbackTo[js.Array[Range]],
    getTransposeRowsAndColumns: CallbackTo[Boolean],
    modify: CallbackTo[EmbeddedChartBuilder]
  ): EmbeddedChart = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getAs")(js.Any.fromFunction1((t0: java.lang.String) => getAs(t0).runNow()))
    __obj.updateDynamic("getBlob")(getBlob.toJsFn)
    __obj.updateDynamic("getChartId")(getChartId.toJsFn)
    __obj.updateDynamic("getContainerInfo")(getContainerInfo.toJsFn)
    __obj.updateDynamic("getHiddenDimensionStrategy")(getHiddenDimensionStrategy.toJsFn)
    __obj.updateDynamic("getMergeStrategy")(getMergeStrategy.toJsFn)
    __obj.updateDynamic("getNumHeaders")(getNumHeaders.toJsFn)
    __obj.updateDynamic("getOptions")(getOptions.toJsFn)
    __obj.updateDynamic("getRanges")(getRanges.toJsFn)
    __obj.updateDynamic("getTransposeRowsAndColumns")(getTransposeRowsAndColumns.toJsFn)
    __obj.updateDynamic("modify")(modify.toJsFn)
    __obj.asInstanceOf[EmbeddedChart]
  }
}

