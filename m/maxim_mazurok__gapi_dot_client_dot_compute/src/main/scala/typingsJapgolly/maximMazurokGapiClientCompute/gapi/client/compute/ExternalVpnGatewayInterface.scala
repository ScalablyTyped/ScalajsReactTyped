package typingsJapgolly.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExternalVpnGatewayInterface extends StObject {
  
  /**
    * The numeric ID of this interface. The allowed input values for this id for different redundancy types of external VPN gateway: - SINGLE_IP_INTERNALLY_REDUNDANT - 0 -
    * TWO_IPS_REDUNDANCY - 0, 1 - FOUR_IPS_REDUNDANCY - 0, 1, 2, 3
    */
  var id: js.UndefOr[Double] = js.undefined
  
  /**
    * IP address of the interface in the external VPN gateway. Only IPv4 is supported. This IP address can be either from your on-premise gateway or another Cloud provider's VPN gateway,
    * it cannot be an IP address from Google Compute Engine.
    */
  var ipAddress: js.UndefOr[String] = js.undefined
}
object ExternalVpnGatewayInterface {
  
  inline def apply(): ExternalVpnGatewayInterface = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExternalVpnGatewayInterface]
  }
  
  extension [Self <: ExternalVpnGatewayInterface](x: Self) {
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setIpAddress(value: String): Self = StObject.set(x, "ipAddress", value.asInstanceOf[js.Any])
    
    inline def setIpAddressUndefined: Self = StObject.set(x, "ipAddress", js.undefined)
  }
}
