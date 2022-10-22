package typingsJapgolly.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RouterNatSubnetworkToNat extends StObject {
  
  /** URL for the subnetwork resource that will use NAT. */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * A list of the secondary ranges of the Subnetwork that are allowed to use NAT. This can be populated only if "LIST_OF_SECONDARY_IP_RANGES" is one of the values in
    * source_ip_ranges_to_nat.
    */
  var secondaryIpRangeNames: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Specify the options for NAT ranges in the Subnetwork. All options of a single value are valid except NAT_IP_RANGE_OPTION_UNSPECIFIED. The only valid option with multiple values is:
    * ["PRIMARY_IP_RANGE", "LIST_OF_SECONDARY_IP_RANGES"] Default: [ALL_IP_RANGES]
    */
  var sourceIpRangesToNat: js.UndefOr[js.Array[String]] = js.undefined
}
object RouterNatSubnetworkToNat {
  
  inline def apply(): RouterNatSubnetworkToNat = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RouterNatSubnetworkToNat]
  }
  
  extension [Self <: RouterNatSubnetworkToNat](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setSecondaryIpRangeNames(value: js.Array[String]): Self = StObject.set(x, "secondaryIpRangeNames", value.asInstanceOf[js.Any])
    
    inline def setSecondaryIpRangeNamesUndefined: Self = StObject.set(x, "secondaryIpRangeNames", js.undefined)
    
    inline def setSecondaryIpRangeNamesVarargs(value: String*): Self = StObject.set(x, "secondaryIpRangeNames", js.Array(value*))
    
    inline def setSourceIpRangesToNat(value: js.Array[String]): Self = StObject.set(x, "sourceIpRangesToNat", value.asInstanceOf[js.Any])
    
    inline def setSourceIpRangesToNatUndefined: Self = StObject.set(x, "sourceIpRangesToNat", js.undefined)
    
    inline def setSourceIpRangesToNatVarargs(value: String*): Self = StObject.set(x, "sourceIpRangesToNat", js.Array(value*))
  }
}
