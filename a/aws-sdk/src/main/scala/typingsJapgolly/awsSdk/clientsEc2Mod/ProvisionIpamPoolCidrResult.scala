package typingsJapgolly.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProvisionIpamPoolCidrResult extends StObject {
  
  /**
    * Information about the provisioned CIDR.
    */
  var IpamPoolCidr: js.UndefOr[typingsJapgolly.awsSdk.clientsEc2Mod.IpamPoolCidr] = js.undefined
}
object ProvisionIpamPoolCidrResult {
  
  inline def apply(): ProvisionIpamPoolCidrResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProvisionIpamPoolCidrResult]
  }
  
  extension [Self <: ProvisionIpamPoolCidrResult](x: Self) {
    
    inline def setIpamPoolCidr(value: IpamPoolCidr): Self = StObject.set(x, "IpamPoolCidr", value.asInstanceOf[js.Any])
    
    inline def setIpamPoolCidrUndefined: Self = StObject.set(x, "IpamPoolCidr", js.undefined)
  }
}
