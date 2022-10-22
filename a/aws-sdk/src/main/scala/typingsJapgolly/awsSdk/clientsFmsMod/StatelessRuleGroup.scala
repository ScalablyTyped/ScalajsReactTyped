package typingsJapgolly.awsSdk.clientsFmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StatelessRuleGroup extends StObject {
  
  /**
    * The priority of the rule group. Network Firewall evaluates the stateless rule groups in a firewall policy starting from the lowest priority setting. 
    */
  var Priority: js.UndefOr[StatelessRuleGroupPriority] = js.undefined
  
  /**
    * The resource ID of the rule group.
    */
  var ResourceId: js.UndefOr[typingsJapgolly.awsSdk.clientsFmsMod.ResourceId] = js.undefined
  
  /**
    * The name of the rule group.
    */
  var RuleGroupName: js.UndefOr[NetworkFirewallResourceName] = js.undefined
}
object StatelessRuleGroup {
  
  inline def apply(): StatelessRuleGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StatelessRuleGroup]
  }
  
  extension [Self <: StatelessRuleGroup](x: Self) {
    
    inline def setPriority(value: StatelessRuleGroupPriority): Self = StObject.set(x, "Priority", value.asInstanceOf[js.Any])
    
    inline def setPriorityUndefined: Self = StObject.set(x, "Priority", js.undefined)
    
    inline def setResourceId(value: ResourceId): Self = StObject.set(x, "ResourceId", value.asInstanceOf[js.Any])
    
    inline def setResourceIdUndefined: Self = StObject.set(x, "ResourceId", js.undefined)
    
    inline def setRuleGroupName(value: NetworkFirewallResourceName): Self = StObject.set(x, "RuleGroupName", value.asInstanceOf[js.Any])
    
    inline def setRuleGroupNameUndefined: Self = StObject.set(x, "RuleGroupName", js.undefined)
  }
}
