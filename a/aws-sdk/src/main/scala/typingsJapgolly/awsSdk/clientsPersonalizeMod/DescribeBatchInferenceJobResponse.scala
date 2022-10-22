package typingsJapgolly.awsSdk.clientsPersonalizeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeBatchInferenceJobResponse extends StObject {
  
  /**
    * Information on the specified batch inference job.
    */
  var batchInferenceJob: js.UndefOr[BatchInferenceJob] = js.undefined
}
object DescribeBatchInferenceJobResponse {
  
  inline def apply(): DescribeBatchInferenceJobResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeBatchInferenceJobResponse]
  }
  
  extension [Self <: DescribeBatchInferenceJobResponse](x: Self) {
    
    inline def setBatchInferenceJob(value: BatchInferenceJob): Self = StObject.set(x, "batchInferenceJob", value.asInstanceOf[js.Any])
    
    inline def setBatchInferenceJobUndefined: Self = StObject.set(x, "batchInferenceJob", js.undefined)
  }
}
