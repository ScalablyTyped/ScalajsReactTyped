package typingsJapgolly.chartJs.anon

import typingsJapgolly.chartJs.chartJsStrings.category
import typingsJapgolly.chartJs.chartJsStrings.linear
import typingsJapgolly.chartJs.chartJsStrings.logarithmic
import typingsJapgolly.chartJs.chartJsStrings.time
import typingsJapgolly.chartJs.chartJsStrings.timeseries
import typingsJapgolly.chartJs.mod.BubbleControllerDatasetOptions
import typingsJapgolly.chartJs.mod.BubbleDataPoint
import typingsJapgolly.chartJs.mod.BubbleParsedData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MetaExtensions extends StObject {
  
  var chartOptions: Any
  
  var datasetOptions: BubbleControllerDatasetOptions
  
  var defaultDataPoint: BubbleDataPoint
  
  var parsedDataType: BubbleParsedData
  
  var scales: linear | logarithmic | category | time | timeseries
}
object MetaExtensions {
  
  inline def apply(
    chartOptions: Any,
    datasetOptions: BubbleControllerDatasetOptions,
    defaultDataPoint: BubbleDataPoint,
    parsedDataType: BubbleParsedData,
    scales: linear | logarithmic | category | time | timeseries
  ): MetaExtensions = {
    val __obj = js.Dynamic.literal(chartOptions = chartOptions.asInstanceOf[js.Any], datasetOptions = datasetOptions.asInstanceOf[js.Any], defaultDataPoint = defaultDataPoint.asInstanceOf[js.Any], parsedDataType = parsedDataType.asInstanceOf[js.Any], scales = scales.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetaExtensions]
  }
  
  extension [Self <: MetaExtensions](x: Self) {
    
    inline def setChartOptions(value: Any): Self = StObject.set(x, "chartOptions", value.asInstanceOf[js.Any])
    
    inline def setDatasetOptions(value: BubbleControllerDatasetOptions): Self = StObject.set(x, "datasetOptions", value.asInstanceOf[js.Any])
    
    inline def setDefaultDataPoint(value: BubbleDataPoint): Self = StObject.set(x, "defaultDataPoint", value.asInstanceOf[js.Any])
    
    inline def setParsedDataType(value: BubbleParsedData): Self = StObject.set(x, "parsedDataType", value.asInstanceOf[js.Any])
    
    inline def setScales(value: linear | logarithmic | category | time | timeseries): Self = StObject.set(x, "scales", value.asInstanceOf[js.Any])
  }
}
