package typingsJapgolly.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubnetworksExpandIpCidrRangeRequest extends StObject {
  
  /**
    * The IP (in CIDR format or netmask) of internal addresses that are legal on this Subnetwork. This range should be disjoint from other subnetworks within this network. This range can
    * only be larger than (i.e. a superset of) the range previously defined before the update.
    */
  var ipCidrRange: js.UndefOr[String] = js.undefined
}
object SubnetworksExpandIpCidrRangeRequest {
  
  inline def apply(): SubnetworksExpandIpCidrRangeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubnetworksExpandIpCidrRangeRequest]
  }
  
  extension [Self <: SubnetworksExpandIpCidrRangeRequest](x: Self) {
    
    inline def setIpCidrRange(value: String): Self = StObject.set(x, "ipCidrRange", value.asInstanceOf[js.Any])
    
    inline def setIpCidrRangeUndefined: Self = StObject.set(x, "ipCidrRange", js.undefined)
  }
}
