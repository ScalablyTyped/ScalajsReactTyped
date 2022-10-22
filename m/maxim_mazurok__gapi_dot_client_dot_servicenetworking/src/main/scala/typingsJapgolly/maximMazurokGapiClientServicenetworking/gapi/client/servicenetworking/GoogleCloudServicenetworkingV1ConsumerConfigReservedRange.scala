package typingsJapgolly.maximMazurokGapiClientServicenetworking.gapi.client.servicenetworking

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudServicenetworkingV1ConsumerConfigReservedRange extends StObject {
  
  /**
    * The starting address of the reserved range. The address must be a valid IPv4 address in the x.x.x.x format. This value combined with the IP prefix length is the CIDR range for the
    * reserved range.
    */
  var address: js.UndefOr[String] = js.undefined
  
  /** The prefix length of the reserved range. */
  var ipPrefixLength: js.UndefOr[Double] = js.undefined
  
  /** The name of the reserved range. */
  var name: js.UndefOr[String] = js.undefined
}
object GoogleCloudServicenetworkingV1ConsumerConfigReservedRange {
  
  inline def apply(): GoogleCloudServicenetworkingV1ConsumerConfigReservedRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudServicenetworkingV1ConsumerConfigReservedRange]
  }
  
  extension [Self <: GoogleCloudServicenetworkingV1ConsumerConfigReservedRange](x: Self) {
    
    inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
    
    inline def setIpPrefixLength(value: Double): Self = StObject.set(x, "ipPrefixLength", value.asInstanceOf[js.Any])
    
    inline def setIpPrefixLengthUndefined: Self = StObject.set(x, "ipPrefixLength", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
