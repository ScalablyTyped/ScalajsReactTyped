package typingsJapgolly.awsSdk.clientsNetworkfirewallMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StatefulRule extends StObject {
  
  /**
    * Defines what Network Firewall should do with the packets in a traffic flow when the flow matches the stateful rule criteria. For all actions, Network Firewall performs the specified action and discontinues stateful inspection of the traffic flow.  The actions for a stateful rule are defined as follows:     PASS - Permits the packets to go to the intended destination.    DROP - Blocks the packets from going to the intended destination and sends an alert log message, if alert logging is configured in the Firewall LoggingConfiguration.     ALERT - Permits the packets to go to the intended destination and sends an alert log message, if alert logging is configured in the Firewall LoggingConfiguration.  You can use this action to test a rule that you intend to use to drop traffic. You can enable the rule with ALERT action, verify in the logs that the rule is filtering as you want, then change the action to DROP.  
    */
  var Action: StatefulAction
  
  /**
    * The stateful inspection criteria for this rule, used to inspect traffic flows. 
    */
  var Header: typingsJapgolly.awsSdk.clientsNetworkfirewallMod.Header
  
  /**
    * Additional options for the rule. These are the Suricata RuleOptions settings.
    */
  var RuleOptions: typingsJapgolly.awsSdk.clientsNetworkfirewallMod.RuleOptions
}
object StatefulRule {
  
  inline def apply(Action: StatefulAction, Header: Header, RuleOptions: RuleOptions): StatefulRule = {
    val __obj = js.Dynamic.literal(Action = Action.asInstanceOf[js.Any], Header = Header.asInstanceOf[js.Any], RuleOptions = RuleOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatefulRule]
  }
  
  extension [Self <: StatefulRule](x: Self) {
    
    inline def setAction(value: StatefulAction): Self = StObject.set(x, "Action", value.asInstanceOf[js.Any])
    
    inline def setHeader(value: Header): Self = StObject.set(x, "Header", value.asInstanceOf[js.Any])
    
    inline def setRuleOptions(value: RuleOptions): Self = StObject.set(x, "RuleOptions", value.asInstanceOf[js.Any])
    
    inline def setRuleOptionsVarargs(value: RuleOption*): Self = StObject.set(x, "RuleOptions", js.Array(value*))
  }
}
