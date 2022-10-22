package typingsJapgolly.awsSdk.clientsComprehendmedicalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListSNOMEDCTInferenceJobsRequest extends StObject {
  
  var Filter: js.UndefOr[ComprehendMedicalAsyncJobFilter] = js.undefined
  
  /**
    *  The maximum number of results to return in each page. The default is 100. 
    */
  var MaxResults: js.UndefOr[MaxResultsInteger] = js.undefined
  
  /**
    *  Identifies the next page of InferSNOMEDCT results to return. 
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object ListSNOMEDCTInferenceJobsRequest {
  
  inline def apply(): ListSNOMEDCTInferenceJobsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSNOMEDCTInferenceJobsRequest]
  }
  
  extension [Self <: ListSNOMEDCTInferenceJobsRequest](x: Self) {
    
    inline def setFilter(value: ComprehendMedicalAsyncJobFilter): Self = StObject.set(x, "Filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "Filter", js.undefined)
    
    inline def setMaxResults(value: MaxResultsInteger): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
