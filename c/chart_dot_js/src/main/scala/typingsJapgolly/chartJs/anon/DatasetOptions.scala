package typingsJapgolly.chartJs.anon

import typingsJapgolly.chartJs.chartJsStrings.category
import typingsJapgolly.chartJs.chartJsStrings.linear
import typingsJapgolly.chartJs.chartJsStrings.logarithmic
import typingsJapgolly.chartJs.chartJsStrings.time
import typingsJapgolly.chartJs.chartJsStrings.timeseries
import typingsJapgolly.chartJs.mod.CartesianParsedData
import typingsJapgolly.chartJs.mod.FillerControllerDatasetOptions
import typingsJapgolly.chartJs.mod.LineControllerChartOptions
import typingsJapgolly.chartJs.mod.LineControllerDatasetOptions
import typingsJapgolly.chartJs.mod.ScatterDataPoint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DatasetOptions extends StObject {
  
  var chartOptions: LineControllerChartOptions
  
  var datasetOptions: LineControllerDatasetOptions & FillerControllerDatasetOptions
  
  var defaultDataPoint: ScatterDataPoint | Double | Null
  
  var parsedDataType: CartesianParsedData
  
  var scales: linear | logarithmic | category | time | timeseries
}
object DatasetOptions {
  
  inline def apply(
    chartOptions: LineControllerChartOptions,
    datasetOptions: LineControllerDatasetOptions & FillerControllerDatasetOptions,
    parsedDataType: CartesianParsedData,
    scales: linear | logarithmic | category | time | timeseries
  ): DatasetOptions = {
    val __obj = js.Dynamic.literal(chartOptions = chartOptions.asInstanceOf[js.Any], datasetOptions = datasetOptions.asInstanceOf[js.Any], parsedDataType = parsedDataType.asInstanceOf[js.Any], scales = scales.asInstanceOf[js.Any], defaultDataPoint = null)
    __obj.asInstanceOf[DatasetOptions]
  }
  
  extension [Self <: DatasetOptions](x: Self) {
    
    inline def setChartOptions(value: LineControllerChartOptions): Self = StObject.set(x, "chartOptions", value.asInstanceOf[js.Any])
    
    inline def setDatasetOptions(value: LineControllerDatasetOptions & FillerControllerDatasetOptions): Self = StObject.set(x, "datasetOptions", value.asInstanceOf[js.Any])
    
    inline def setDefaultDataPoint(value: ScatterDataPoint | Double): Self = StObject.set(x, "defaultDataPoint", value.asInstanceOf[js.Any])
    
    inline def setDefaultDataPointNull: Self = StObject.set(x, "defaultDataPoint", null)
    
    inline def setParsedDataType(value: CartesianParsedData): Self = StObject.set(x, "parsedDataType", value.asInstanceOf[js.Any])
    
    inline def setScales(value: linear | logarithmic | category | time | timeseries): Self = StObject.set(x, "scales", value.asInstanceOf[js.Any])
  }
}
