package typingsJapgolly.awsSdk.clientsRoute53Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTrafficPolicyVersionsRequest extends StObject {
  
  /**
    * Specify the value of Id of the traffic policy for which you want to list all versions.
    */
  var Id: TrafficPolicyId
  
  /**
    * The maximum number of traffic policy versions that you want Amazon Route 53 to include in the response body for this request. If the specified traffic policy has more than MaxItems versions, the value of IsTruncated in the response is true, and the value of the TrafficPolicyVersionMarker element is the ID of the first version that Route 53 will return if you submit another request.
    */
  var MaxItems: js.UndefOr[PageMaxItems] = js.undefined
  
  /**
    * For your first request to ListTrafficPolicyVersions, don't include the TrafficPolicyVersionMarker parameter. If you have more traffic policy versions than the value of MaxItems, ListTrafficPolicyVersions returns only the first group of MaxItems versions. To get more traffic policy versions, submit another ListTrafficPolicyVersions request. For the value of TrafficPolicyVersionMarker, specify the value of TrafficPolicyVersionMarker in the previous response.
    */
  var TrafficPolicyVersionMarker: js.UndefOr[typingsJapgolly.awsSdk.clientsRoute53Mod.TrafficPolicyVersionMarker] = js.undefined
}
object ListTrafficPolicyVersionsRequest {
  
  inline def apply(Id: TrafficPolicyId): ListTrafficPolicyVersionsRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTrafficPolicyVersionsRequest]
  }
  
  extension [Self <: ListTrafficPolicyVersionsRequest](x: Self) {
    
    inline def setId(value: TrafficPolicyId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setMaxItems(value: PageMaxItems): Self = StObject.set(x, "MaxItems", value.asInstanceOf[js.Any])
    
    inline def setMaxItemsUndefined: Self = StObject.set(x, "MaxItems", js.undefined)
    
    inline def setTrafficPolicyVersionMarker(value: TrafficPolicyVersionMarker): Self = StObject.set(x, "TrafficPolicyVersionMarker", value.asInstanceOf[js.Any])
    
    inline def setTrafficPolicyVersionMarkerUndefined: Self = StObject.set(x, "TrafficPolicyVersionMarker", js.undefined)
  }
}
