package typingsJapgolly.awsSdk.clientsIamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListPoliciesResponse extends StObject {
  
  /**
    * A flag that indicates whether there are more items to return. If your results were truncated, you can make a subsequent pagination request using the Marker request parameter to retrieve more items. Note that IAM might return fewer than the MaxItems number of results even when there are more results available. We recommend that you check IsTruncated after every call to ensure that you receive all your results.
    */
  var IsTruncated: js.UndefOr[booleanType] = js.undefined
  
  /**
    * When IsTruncated is true, this element is present and contains the value to use for the Marker parameter in a subsequent pagination request.
    */
  var Marker: js.UndefOr[responseMarkerType] = js.undefined
  
  /**
    * A list of policies.
    */
  var Policies: js.UndefOr[policyListType] = js.undefined
}
object ListPoliciesResponse {
  
  inline def apply(): ListPoliciesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPoliciesResponse]
  }
  
  extension [Self <: ListPoliciesResponse](x: Self) {
    
    inline def setIsTruncated(value: booleanType): Self = StObject.set(x, "IsTruncated", value.asInstanceOf[js.Any])
    
    inline def setIsTruncatedUndefined: Self = StObject.set(x, "IsTruncated", js.undefined)
    
    inline def setMarker(value: responseMarkerType): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    inline def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
    
    inline def setPolicies(value: policyListType): Self = StObject.set(x, "Policies", value.asInstanceOf[js.Any])
    
    inline def setPoliciesUndefined: Self = StObject.set(x, "Policies", js.undefined)
    
    inline def setPoliciesVarargs(value: Policy*): Self = StObject.set(x, "Policies", js.Array(value*))
  }
}
