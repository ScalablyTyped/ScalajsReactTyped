package typingsJapgolly.awsSdk.clientsLookoutequipmentMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListInferenceExecutionsResponse extends StObject {
  
  /**
    * Provides an array of information about the individual inference executions returned from the ListInferenceExecutions operation, including model used, inference scheduler, data configuration, and so on. 
    */
  var InferenceExecutionSummaries: js.UndefOr[typingsJapgolly.awsSdk.clientsLookoutequipmentMod.InferenceExecutionSummaries] = js.undefined
  
  /**
    *  An opaque pagination token indicating where to continue the listing of inference executions. 
    */
  var NextToken: js.UndefOr[typingsJapgolly.awsSdk.clientsLookoutequipmentMod.NextToken] = js.undefined
}
object ListInferenceExecutionsResponse {
  
  inline def apply(): ListInferenceExecutionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListInferenceExecutionsResponse]
  }
  
  extension [Self <: ListInferenceExecutionsResponse](x: Self) {
    
    inline def setInferenceExecutionSummaries(value: InferenceExecutionSummaries): Self = StObject.set(x, "InferenceExecutionSummaries", value.asInstanceOf[js.Any])
    
    inline def setInferenceExecutionSummariesUndefined: Self = StObject.set(x, "InferenceExecutionSummaries", js.undefined)
    
    inline def setInferenceExecutionSummariesVarargs(value: InferenceExecutionSummary*): Self = StObject.set(x, "InferenceExecutionSummaries", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
