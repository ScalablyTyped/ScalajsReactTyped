package typingsJapgolly.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetTransitGatewayPolicyTableAssociationsRequest extends StObject {
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The filters associated with the transit gateway policy table.
    */
  var Filters: js.UndefOr[FilterList] = js.undefined
  
  /**
    * The maximum number of results to return with a single call. To retrieve the remaining results, make another call with the returned nextToken value.
    */
  var MaxResults: js.UndefOr[TransitGatewayMaxResults] = js.undefined
  
  /**
    * The token for the next page of results.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the transit gateway policy table.
    */
  var TransitGatewayPolicyTableId: typingsJapgolly.awsSdk.clientsEc2Mod.TransitGatewayPolicyTableId
}
object GetTransitGatewayPolicyTableAssociationsRequest {
  
  inline def apply(TransitGatewayPolicyTableId: TransitGatewayPolicyTableId): GetTransitGatewayPolicyTableAssociationsRequest = {
    val __obj = js.Dynamic.literal(TransitGatewayPolicyTableId = TransitGatewayPolicyTableId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTransitGatewayPolicyTableAssociationsRequest]
  }
  
  extension [Self <: GetTransitGatewayPolicyTableAssociationsRequest](x: Self) {
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setFilters(value: FilterList): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "Filters", js.undefined)
    
    inline def setFiltersVarargs(value: Filter*): Self = StObject.set(x, "Filters", js.Array(value*))
    
    inline def setMaxResults(value: TransitGatewayMaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setTransitGatewayPolicyTableId(value: TransitGatewayPolicyTableId): Self = StObject.set(x, "TransitGatewayPolicyTableId", value.asInstanceOf[js.Any])
  }
}
