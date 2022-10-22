package typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Base.Blob
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Charts.ChartHiddenDimensionStrategy
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Charts.ChartMergeStrategy
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Charts.ChartOptions
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
trait EmbeddedChart extends StObject {
  
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
  
  inline def apply(
    getAs: String => Blob,
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
    val __obj = js.Dynamic.literal(getAs = js.Any.fromFunction1(getAs), getBlob = getBlob.toJsFn, getChartId = getChartId.toJsFn, getContainerInfo = getContainerInfo.toJsFn, getHiddenDimensionStrategy = getHiddenDimensionStrategy.toJsFn, getMergeStrategy = getMergeStrategy.toJsFn, getNumHeaders = getNumHeaders.toJsFn, getOptions = getOptions.toJsFn, getRanges = getRanges.toJsFn, getTransposeRowsAndColumns = getTransposeRowsAndColumns.toJsFn, modify = modify.toJsFn)
    __obj.asInstanceOf[EmbeddedChart]
  }
  
  extension [Self <: EmbeddedChart](x: Self) {
    
    inline def setGetAs(value: String => Blob): Self = StObject.set(x, "getAs", js.Any.fromFunction1(value))
    
    inline def setGetBlob(value: CallbackTo[Blob]): Self = StObject.set(x, "getBlob", value.toJsFn)
    
    inline def setGetChartId(value: CallbackTo[Integer | Null]): Self = StObject.set(x, "getChartId", value.toJsFn)
    
    inline def setGetContainerInfo(value: CallbackTo[ContainerInfo]): Self = StObject.set(x, "getContainerInfo", value.toJsFn)
    
    inline def setGetHiddenDimensionStrategy(value: CallbackTo[ChartHiddenDimensionStrategy]): Self = StObject.set(x, "getHiddenDimensionStrategy", value.toJsFn)
    
    inline def setGetMergeStrategy(value: CallbackTo[ChartMergeStrategy]): Self = StObject.set(x, "getMergeStrategy", value.toJsFn)
    
    inline def setGetNumHeaders(value: CallbackTo[Integer]): Self = StObject.set(x, "getNumHeaders", value.toJsFn)
    
    inline def setGetOptions(value: CallbackTo[ChartOptions]): Self = StObject.set(x, "getOptions", value.toJsFn)
    
    inline def setGetRanges(value: CallbackTo[js.Array[Range]]): Self = StObject.set(x, "getRanges", value.toJsFn)
    
    inline def setGetTransposeRowsAndColumns(value: CallbackTo[Boolean]): Self = StObject.set(x, "getTransposeRowsAndColumns", value.toJsFn)
    
    inline def setModify(value: CallbackTo[EmbeddedChartBuilder]): Self = StObject.set(x, "modify", value.toJsFn)
  }
}
