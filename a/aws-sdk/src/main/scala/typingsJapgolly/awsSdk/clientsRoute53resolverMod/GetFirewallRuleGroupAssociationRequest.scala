package typingsJapgolly.awsSdk.clientsRoute53resolverMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetFirewallRuleGroupAssociationRequest extends StObject {
  
  /**
    * The identifier of the FirewallRuleGroupAssociation. 
    */
  var FirewallRuleGroupAssociationId: ResourceId
}
object GetFirewallRuleGroupAssociationRequest {
  
  inline def apply(FirewallRuleGroupAssociationId: ResourceId): GetFirewallRuleGroupAssociationRequest = {
    val __obj = js.Dynamic.literal(FirewallRuleGroupAssociationId = FirewallRuleGroupAssociationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetFirewallRuleGroupAssociationRequest]
  }
  
  extension [Self <: GetFirewallRuleGroupAssociationRequest](x: Self) {
    
    inline def setFirewallRuleGroupAssociationId(value: ResourceId): Self = StObject.set(x, "FirewallRuleGroupAssociationId", value.asInstanceOf[js.Any])
  }
}
