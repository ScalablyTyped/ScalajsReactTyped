package typingsJapgolly.awsSdk.clientsFmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetThirdPartyFirewallAssociationStatusRequest extends StObject {
  
  /**
    * The name of the third-party firewall vendor.
    */
  var ThirdPartyFirewall: typingsJapgolly.awsSdk.clientsFmsMod.ThirdPartyFirewall
}
object GetThirdPartyFirewallAssociationStatusRequest {
  
  inline def apply(ThirdPartyFirewall: ThirdPartyFirewall): GetThirdPartyFirewallAssociationStatusRequest = {
    val __obj = js.Dynamic.literal(ThirdPartyFirewall = ThirdPartyFirewall.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetThirdPartyFirewallAssociationStatusRequest]
  }
  
  extension [Self <: GetThirdPartyFirewallAssociationStatusRequest](x: Self) {
    
    inline def setThirdPartyFirewall(value: ThirdPartyFirewall): Self = StObject.set(x, "ThirdPartyFirewall", value.asInstanceOf[js.Any])
  }
}
