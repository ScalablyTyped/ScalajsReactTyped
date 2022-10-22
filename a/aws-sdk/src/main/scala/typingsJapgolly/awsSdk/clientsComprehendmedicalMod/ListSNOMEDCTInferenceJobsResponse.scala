package typingsJapgolly.awsSdk.clientsComprehendmedicalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListSNOMEDCTInferenceJobsResponse extends StObject {
  
  /**
    *  A list containing the properties of each job that is returned. 
    */
  var ComprehendMedicalAsyncJobPropertiesList: js.UndefOr[
    typingsJapgolly.awsSdk.clientsComprehendmedicalMod.ComprehendMedicalAsyncJobPropertiesList
  ] = js.undefined
  
  /**
    *  Identifies the next page of results to return. 
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object ListSNOMEDCTInferenceJobsResponse {
  
  inline def apply(): ListSNOMEDCTInferenceJobsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSNOMEDCTInferenceJobsResponse]
  }
  
  extension [Self <: ListSNOMEDCTInferenceJobsResponse](x: Self) {
    
    inline def setComprehendMedicalAsyncJobPropertiesList(value: ComprehendMedicalAsyncJobPropertiesList): Self = StObject.set(x, "ComprehendMedicalAsyncJobPropertiesList", value.asInstanceOf[js.Any])
    
    inline def setComprehendMedicalAsyncJobPropertiesListUndefined: Self = StObject.set(x, "ComprehendMedicalAsyncJobPropertiesList", js.undefined)
    
    inline def setComprehendMedicalAsyncJobPropertiesListVarargs(value: ComprehendMedicalAsyncJobProperties*): Self = StObject.set(x, "ComprehendMedicalAsyncJobPropertiesList", js.Array(value*))
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
