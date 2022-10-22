package typingsJapgolly.awsSdk.clientsNetworkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetTransitGatewayPeeringResponse extends StObject {
  
  /**
    * Returns information about a transit gateway peering. 
    */
  var TransitGatewayPeering: js.UndefOr[typingsJapgolly.awsSdk.clientsNetworkmanagerMod.TransitGatewayPeering] = js.undefined
}
object GetTransitGatewayPeeringResponse {
  
  inline def apply(): GetTransitGatewayPeeringResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetTransitGatewayPeeringResponse]
  }
  
  extension [Self <: GetTransitGatewayPeeringResponse](x: Self) {
    
    inline def setTransitGatewayPeering(value: TransitGatewayPeering): Self = StObject.set(x, "TransitGatewayPeering", value.asInstanceOf[js.Any])
    
    inline def setTransitGatewayPeeringUndefined: Self = StObject.set(x, "TransitGatewayPeering", js.undefined)
  }
}
