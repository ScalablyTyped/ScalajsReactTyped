package typingsJapgolly.awsSdk.clientsRoute53resolverMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListResolverEndpointIpAddressesRequest extends StObject {
  
  /**
    * The maximum number of IP addresses that you want to return in the response to a ListResolverEndpointIpAddresses request. If you don't specify a value for MaxResults, Resolver returns up to 100 IP addresses. 
    */
  var MaxResults: js.UndefOr[typingsJapgolly.awsSdk.clientsRoute53resolverMod.MaxResults] = js.undefined
  
  /**
    * For the first ListResolverEndpointIpAddresses request, omit this value. If the specified Resolver endpoint has more than MaxResults IP addresses, you can submit another ListResolverEndpointIpAddresses request to get the next group of IP addresses. In the next request, specify the value of NextToken from the previous response. 
    */
  var NextToken: js.UndefOr[typingsJapgolly.awsSdk.clientsRoute53resolverMod.NextToken] = js.undefined
  
  /**
    * The ID of the Resolver endpoint that you want to get IP addresses for.
    */
  var ResolverEndpointId: ResourceId
}
object ListResolverEndpointIpAddressesRequest {
  
  inline def apply(ResolverEndpointId: ResourceId): ListResolverEndpointIpAddressesRequest = {
    val __obj = js.Dynamic.literal(ResolverEndpointId = ResolverEndpointId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListResolverEndpointIpAddressesRequest]
  }
  
  extension [Self <: ListResolverEndpointIpAddressesRequest](x: Self) {
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setResolverEndpointId(value: ResourceId): Self = StObject.set(x, "ResolverEndpointId", value.asInstanceOf[js.Any])
  }
}
