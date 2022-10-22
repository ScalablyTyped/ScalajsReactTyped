package typingsJapgolly.awsSdk.clientsNetworkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetTransitGatewayRegistrationsRequest extends StObject {
  
  /**
    * The ID of the global network.
    */
  var GlobalNetworkId: typingsJapgolly.awsSdk.clientsNetworkmanagerMod.GlobalNetworkId
  
  /**
    * The maximum number of results to return.
    */
  var MaxResults: js.UndefOr[typingsJapgolly.awsSdk.clientsNetworkmanagerMod.MaxResults] = js.undefined
  
  /**
    * The token for the next page of results.
    */
  var NextToken: js.UndefOr[typingsJapgolly.awsSdk.clientsNetworkmanagerMod.NextToken] = js.undefined
  
  /**
    * The Amazon Resource Names (ARNs) of one or more transit gateways. The maximum is 10.
    */
  var TransitGatewayArns: js.UndefOr[TransitGatewayArnList] = js.undefined
}
object GetTransitGatewayRegistrationsRequest {
  
  inline def apply(GlobalNetworkId: GlobalNetworkId): GetTransitGatewayRegistrationsRequest = {
    val __obj = js.Dynamic.literal(GlobalNetworkId = GlobalNetworkId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTransitGatewayRegistrationsRequest]
  }
  
  extension [Self <: GetTransitGatewayRegistrationsRequest](x: Self) {
    
    inline def setGlobalNetworkId(value: GlobalNetworkId): Self = StObject.set(x, "GlobalNetworkId", value.asInstanceOf[js.Any])
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setTransitGatewayArns(value: TransitGatewayArnList): Self = StObject.set(x, "TransitGatewayArns", value.asInstanceOf[js.Any])
    
    inline def setTransitGatewayArnsUndefined: Self = StObject.set(x, "TransitGatewayArns", js.undefined)
    
    inline def setTransitGatewayArnsVarargs(value: TransitGatewayArn*): Self = StObject.set(x, "TransitGatewayArns", js.Array(value*))
  }
}
