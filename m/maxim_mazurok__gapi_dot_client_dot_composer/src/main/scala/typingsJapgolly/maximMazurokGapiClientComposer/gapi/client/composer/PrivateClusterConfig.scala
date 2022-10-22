package typingsJapgolly.maximMazurokGapiClientComposer.gapi.client.composer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PrivateClusterConfig extends StObject {
  
  /** Optional. If `true`, access to the public endpoint of the GKE cluster is denied. */
  var enablePrivateEndpoint: js.UndefOr[Boolean] = js.undefined
  
  /** Optional. The CIDR block from which IPv4 range for GKE master will be reserved. If left blank, the default value of '172.16.0.0/23' is used. */
  var masterIpv4CidrBlock: js.UndefOr[String] = js.undefined
  
  /**
    * Output only. The IP range in CIDR notation to use for the hosted master network. This range is used for assigning internal IP addresses to the GKE cluster master or set of masters
    * and to the internal load balancer virtual IP. This range must not overlap with any other ranges in use within the cluster's network.
    */
  var masterIpv4ReservedRange: js.UndefOr[String] = js.undefined
}
object PrivateClusterConfig {
  
  inline def apply(): PrivateClusterConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PrivateClusterConfig]
  }
  
  extension [Self <: PrivateClusterConfig](x: Self) {
    
    inline def setEnablePrivateEndpoint(value: Boolean): Self = StObject.set(x, "enablePrivateEndpoint", value.asInstanceOf[js.Any])
    
    inline def setEnablePrivateEndpointUndefined: Self = StObject.set(x, "enablePrivateEndpoint", js.undefined)
    
    inline def setMasterIpv4CidrBlock(value: String): Self = StObject.set(x, "masterIpv4CidrBlock", value.asInstanceOf[js.Any])
    
    inline def setMasterIpv4CidrBlockUndefined: Self = StObject.set(x, "masterIpv4CidrBlock", js.undefined)
    
    inline def setMasterIpv4ReservedRange(value: String): Self = StObject.set(x, "masterIpv4ReservedRange", value.asInstanceOf[js.Any])
    
    inline def setMasterIpv4ReservedRangeUndefined: Self = StObject.set(x, "masterIpv4ReservedRange", js.undefined)
  }
}
