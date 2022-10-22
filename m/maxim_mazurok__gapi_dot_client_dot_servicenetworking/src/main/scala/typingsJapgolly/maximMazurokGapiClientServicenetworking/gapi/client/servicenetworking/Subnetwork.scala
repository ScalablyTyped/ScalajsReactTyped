package typingsJapgolly.maximMazurokGapiClientServicenetworking.gapi.client.servicenetworking

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Subnetwork extends StObject {
  
  /** Subnetwork CIDR range in `10.x.x.x/y` format. */
  var ipCidrRange: js.UndefOr[String] = js.undefined
  
  /** Subnetwork name. See https://cloud.google.com/compute/docs/vpc/ */
  var name: js.UndefOr[String] = js.undefined
  
  /** In the Shared VPC host project, the VPC network that's peered with the consumer network. For example: `projects/1234321/global/networks/host-network` */
  var network: js.UndefOr[String] = js.undefined
  
  /** This is a discovered subnet that is not within the current consumer allocated ranges. */
  var outsideAllocation: js.UndefOr[Boolean] = js.undefined
  
  /** GCP region where the subnetwork is located. */
  var region: js.UndefOr[String] = js.undefined
  
  /** List of secondary IP ranges in this subnetwork. */
  var secondaryIpRanges: js.UndefOr[js.Array[SecondaryIpRange]] = js.undefined
}
object Subnetwork {
  
  inline def apply(): Subnetwork = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Subnetwork]
  }
  
  extension [Self <: Subnetwork](x: Self) {
    
    inline def setIpCidrRange(value: String): Self = StObject.set(x, "ipCidrRange", value.asInstanceOf[js.Any])
    
    inline def setIpCidrRangeUndefined: Self = StObject.set(x, "ipCidrRange", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNetwork(value: String): Self = StObject.set(x, "network", value.asInstanceOf[js.Any])
    
    inline def setNetworkUndefined: Self = StObject.set(x, "network", js.undefined)
    
    inline def setOutsideAllocation(value: Boolean): Self = StObject.set(x, "outsideAllocation", value.asInstanceOf[js.Any])
    
    inline def setOutsideAllocationUndefined: Self = StObject.set(x, "outsideAllocation", js.undefined)
    
    inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    
    inline def setSecondaryIpRanges(value: js.Array[SecondaryIpRange]): Self = StObject.set(x, "secondaryIpRanges", value.asInstanceOf[js.Any])
    
    inline def setSecondaryIpRangesUndefined: Self = StObject.set(x, "secondaryIpRanges", js.undefined)
    
    inline def setSecondaryIpRangesVarargs(value: SecondaryIpRange*): Self = StObject.set(x, "secondaryIpRanges", js.Array(value*))
  }
}
