package typingsJapgolly.awsSdk.clientsRoute53resolverMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetFirewallRuleGroupAssociationResponse extends StObject {
  
  /**
    * The association that you requested. 
    */
  var FirewallRuleGroupAssociation: js.UndefOr[typingsJapgolly.awsSdk.clientsRoute53resolverMod.FirewallRuleGroupAssociation] = js.undefined
}
object GetFirewallRuleGroupAssociationResponse {
  
  inline def apply(): GetFirewallRuleGroupAssociationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetFirewallRuleGroupAssociationResponse]
  }
  
  extension [Self <: GetFirewallRuleGroupAssociationResponse](x: Self) {
    
    inline def setFirewallRuleGroupAssociation(value: FirewallRuleGroupAssociation): Self = StObject.set(x, "FirewallRuleGroupAssociation", value.asInstanceOf[js.Any])
    
    inline def setFirewallRuleGroupAssociationUndefined: Self = StObject.set(x, "FirewallRuleGroupAssociation", js.undefined)
  }
}
