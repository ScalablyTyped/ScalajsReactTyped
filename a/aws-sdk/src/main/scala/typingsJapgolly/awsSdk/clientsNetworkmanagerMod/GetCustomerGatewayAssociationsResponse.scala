package typingsJapgolly.awsSdk.clientsNetworkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetCustomerGatewayAssociationsResponse extends StObject {
  
  /**
    * The customer gateway associations.
    */
  var CustomerGatewayAssociations: js.UndefOr[CustomerGatewayAssociationList] = js.undefined
  
  /**
    * The token for the next page of results.
    */
  var NextToken: js.UndefOr[typingsJapgolly.awsSdk.clientsNetworkmanagerMod.NextToken] = js.undefined
}
object GetCustomerGatewayAssociationsResponse {
  
  inline def apply(): GetCustomerGatewayAssociationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetCustomerGatewayAssociationsResponse]
  }
  
  extension [Self <: GetCustomerGatewayAssociationsResponse](x: Self) {
    
    inline def setCustomerGatewayAssociations(value: CustomerGatewayAssociationList): Self = StObject.set(x, "CustomerGatewayAssociations", value.asInstanceOf[js.Any])
    
    inline def setCustomerGatewayAssociationsUndefined: Self = StObject.set(x, "CustomerGatewayAssociations", js.undefined)
    
    inline def setCustomerGatewayAssociationsVarargs(value: CustomerGatewayAssociation*): Self = StObject.set(x, "CustomerGatewayAssociations", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
