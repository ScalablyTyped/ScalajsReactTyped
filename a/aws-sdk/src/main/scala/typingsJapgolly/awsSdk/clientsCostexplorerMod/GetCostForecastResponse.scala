package typingsJapgolly.awsSdk.clientsCostexplorerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetCostForecastResponse extends StObject {
  
  /**
    * The forecasts for your query, in order. For DAILY forecasts, this is a list of days. For MONTHLY forecasts, this is a list of months.
    */
  var ForecastResultsByTime: js.UndefOr[typingsJapgolly.awsSdk.clientsCostexplorerMod.ForecastResultsByTime] = js.undefined
  
  /**
    * How much you are forecasted to spend over the forecast period, in USD.
    */
  var Total: js.UndefOr[MetricValue] = js.undefined
}
object GetCostForecastResponse {
  
  inline def apply(): GetCostForecastResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetCostForecastResponse]
  }
  
  extension [Self <: GetCostForecastResponse](x: Self) {
    
    inline def setForecastResultsByTime(value: ForecastResultsByTime): Self = StObject.set(x, "ForecastResultsByTime", value.asInstanceOf[js.Any])
    
    inline def setForecastResultsByTimeUndefined: Self = StObject.set(x, "ForecastResultsByTime", js.undefined)
    
    inline def setForecastResultsByTimeVarargs(value: ForecastResult*): Self = StObject.set(x, "ForecastResultsByTime", js.Array(value*))
    
    inline def setTotal(value: MetricValue): Self = StObject.set(x, "Total", value.asInstanceOf[js.Any])
    
    inline def setTotalUndefined: Self = StObject.set(x, "Total", js.undefined)
  }
}
