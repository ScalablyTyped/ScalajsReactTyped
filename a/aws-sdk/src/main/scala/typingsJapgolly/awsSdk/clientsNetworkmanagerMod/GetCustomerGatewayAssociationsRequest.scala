package typingsJapgolly.awsSdk.clientsNetworkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetCustomerGatewayAssociationsRequest extends StObject {
  
  /**
    * One or more customer gateway Amazon Resource Names (ARNs). The maximum is 10.
    */
  var CustomerGatewayArns: js.UndefOr[CustomerGatewayArnList] = js.undefined
  
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
}
object GetCustomerGatewayAssociationsRequest {
  
  inline def apply(GlobalNetworkId: GlobalNetworkId): GetCustomerGatewayAssociationsRequest = {
    val __obj = js.Dynamic.literal(GlobalNetworkId = GlobalNetworkId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCustomerGatewayAssociationsRequest]
  }
  
  extension [Self <: GetCustomerGatewayAssociationsRequest](x: Self) {
    
    inline def setCustomerGatewayArns(value: CustomerGatewayArnList): Self = StObject.set(x, "CustomerGatewayArns", value.asInstanceOf[js.Any])
    
    inline def setCustomerGatewayArnsUndefined: Self = StObject.set(x, "CustomerGatewayArns", js.undefined)
    
    inline def setCustomerGatewayArnsVarargs(value: CustomerGatewayArn*): Self = StObject.set(x, "CustomerGatewayArns", js.Array(value*))
    
    inline def setGlobalNetworkId(value: GlobalNetworkId): Self = StObject.set(x, "GlobalNetworkId", value.asInstanceOf[js.Any])
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
