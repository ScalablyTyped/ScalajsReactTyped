package typingsJapgolly.awsSdk.clientsDirectconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeDirectConnectGatewayAssociationProposalsResult extends StObject {
  
  /**
    * Describes the Direct Connect gateway association proposals.
    */
  var directConnectGatewayAssociationProposals: js.UndefOr[DirectConnectGatewayAssociationProposalList] = js.undefined
  
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
}
object DescribeDirectConnectGatewayAssociationProposalsResult {
  
  inline def apply(): DescribeDirectConnectGatewayAssociationProposalsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeDirectConnectGatewayAssociationProposalsResult]
  }
  
  extension [Self <: DescribeDirectConnectGatewayAssociationProposalsResult](x: Self) {
    
    inline def setDirectConnectGatewayAssociationProposals(value: DirectConnectGatewayAssociationProposalList): Self = StObject.set(x, "directConnectGatewayAssociationProposals", value.asInstanceOf[js.Any])
    
    inline def setDirectConnectGatewayAssociationProposalsUndefined: Self = StObject.set(x, "directConnectGatewayAssociationProposals", js.undefined)
    
    inline def setDirectConnectGatewayAssociationProposalsVarargs(value: DirectConnectGatewayAssociationProposal*): Self = StObject.set(x, "directConnectGatewayAssociationProposals", js.Array(value*))
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
