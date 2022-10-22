package typingsJapgolly.awsSdk.clientsForecastserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeletePredictorBacktestExportJobRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the predictor backtest export job to delete.
    */
  var PredictorBacktestExportJobArn: Arn
}
object DeletePredictorBacktestExportJobRequest {
  
  inline def apply(PredictorBacktestExportJobArn: Arn): DeletePredictorBacktestExportJobRequest = {
    val __obj = js.Dynamic.literal(PredictorBacktestExportJobArn = PredictorBacktestExportJobArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeletePredictorBacktestExportJobRequest]
  }
  
  extension [Self <: DeletePredictorBacktestExportJobRequest](x: Self) {
    
    inline def setPredictorBacktestExportJobArn(value: Arn): Self = StObject.set(x, "PredictorBacktestExportJobArn", value.asInstanceOf[js.Any])
  }
}
