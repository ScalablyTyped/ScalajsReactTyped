package typingsJapgolly.awsSdk.clientsAmpMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeRuleGroupsNamespaceResponse extends StObject {
  
  /**
    * The selected rule groups namespace.
    */
  var ruleGroupsNamespace: RuleGroupsNamespaceDescription
}
object DescribeRuleGroupsNamespaceResponse {
  
  inline def apply(ruleGroupsNamespace: RuleGroupsNamespaceDescription): DescribeRuleGroupsNamespaceResponse = {
    val __obj = js.Dynamic.literal(ruleGroupsNamespace = ruleGroupsNamespace.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeRuleGroupsNamespaceResponse]
  }
  
  extension [Self <: DescribeRuleGroupsNamespaceResponse](x: Self) {
    
    inline def setRuleGroupsNamespace(value: RuleGroupsNamespaceDescription): Self = StObject.set(x, "ruleGroupsNamespace", value.asInstanceOf[js.Any])
  }
}
