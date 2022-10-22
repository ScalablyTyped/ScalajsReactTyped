package typingsJapgolly.awsSdk.clientsForecastserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetAccuracyMetricsRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the predictor to get metrics for.
    */
  var PredictorArn: Arn
}
object GetAccuracyMetricsRequest {
  
  inline def apply(PredictorArn: Arn): GetAccuracyMetricsRequest = {
    val __obj = js.Dynamic.literal(PredictorArn = PredictorArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAccuracyMetricsRequest]
  }
  
  extension [Self <: GetAccuracyMetricsRequest](x: Self) {
    
    inline def setPredictorArn(value: Arn): Self = StObject.set(x, "PredictorArn", value.asInstanceOf[js.Any])
  }
}
