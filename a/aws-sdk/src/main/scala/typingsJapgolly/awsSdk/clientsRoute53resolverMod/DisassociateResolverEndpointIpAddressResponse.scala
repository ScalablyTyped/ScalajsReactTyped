package typingsJapgolly.awsSdk.clientsRoute53resolverMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisassociateResolverEndpointIpAddressResponse extends StObject {
  
  /**
    * The response to an DisassociateResolverEndpointIpAddress request.
    */
  var ResolverEndpoint: js.UndefOr[typingsJapgolly.awsSdk.clientsRoute53resolverMod.ResolverEndpoint] = js.undefined
}
object DisassociateResolverEndpointIpAddressResponse {
  
  inline def apply(): DisassociateResolverEndpointIpAddressResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisassociateResolverEndpointIpAddressResponse]
  }
  
  extension [Self <: DisassociateResolverEndpointIpAddressResponse](x: Self) {
    
    inline def setResolverEndpoint(value: ResolverEndpoint): Self = StObject.set(x, "ResolverEndpoint", value.asInstanceOf[js.Any])
    
    inline def setResolverEndpointUndefined: Self = StObject.set(x, "ResolverEndpoint", js.undefined)
  }
}
