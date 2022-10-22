package typingsJapgolly.awsSdk.clientsNetworkfirewallMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StatelessRuleGroupReference extends StObject {
  
  /**
    * An integer setting that indicates the order in which to run the stateless rule groups in a single FirewallPolicy. Network Firewall applies each stateless rule group to a packet starting with the group that has the lowest priority setting. You must ensure that the priority settings are unique within each policy.
    */
  var Priority: typingsJapgolly.awsSdk.clientsNetworkfirewallMod.Priority
  
  /**
    * The Amazon Resource Name (ARN) of the stateless rule group.
    */
  var ResourceArn: typingsJapgolly.awsSdk.clientsNetworkfirewallMod.ResourceArn
}
object StatelessRuleGroupReference {
  
  inline def apply(Priority: Priority, ResourceArn: ResourceArn): StatelessRuleGroupReference = {
    val __obj = js.Dynamic.literal(Priority = Priority.asInstanceOf[js.Any], ResourceArn = ResourceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatelessRuleGroupReference]
  }
  
  extension [Self <: StatelessRuleGroupReference](x: Self) {
    
    inline def setPriority(value: Priority): Self = StObject.set(x, "Priority", value.asInstanceOf[js.Any])
    
    inline def setResourceArn(value: ResourceArn): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
  }
}
