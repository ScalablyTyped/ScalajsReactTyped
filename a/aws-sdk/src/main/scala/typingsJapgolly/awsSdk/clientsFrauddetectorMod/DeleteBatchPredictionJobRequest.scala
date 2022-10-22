package typingsJapgolly.awsSdk.clientsFrauddetectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteBatchPredictionJobRequest extends StObject {
  
  /**
    * The ID of the batch prediction job to delete.
    */
  var jobId: identifier
}
object DeleteBatchPredictionJobRequest {
  
  inline def apply(jobId: identifier): DeleteBatchPredictionJobRequest = {
    val __obj = js.Dynamic.literal(jobId = jobId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteBatchPredictionJobRequest]
  }
  
  extension [Self <: DeleteBatchPredictionJobRequest](x: Self) {
    
    inline def setJobId(value: identifier): Self = StObject.set(x, "jobId", value.asInstanceOf[js.Any])
  }
}
