package typingsJapgolly.awsSdk.clientsRoute53resolverMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResolverRulePolicyResponse extends StObject {
  
  /**
    * The Resolver rule policy for the rule that you specified in a GetResolverRulePolicy request.
    */
  var ResolverRulePolicy: js.UndefOr[typingsJapgolly.awsSdk.clientsRoute53resolverMod.ResolverRulePolicy] = js.undefined
}
object GetResolverRulePolicyResponse {
  
  inline def apply(): GetResolverRulePolicyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetResolverRulePolicyResponse]
  }
  
  extension [Self <: GetResolverRulePolicyResponse](x: Self) {
    
    inline def setResolverRulePolicy(value: ResolverRulePolicy): Self = StObject.set(x, "ResolverRulePolicy", value.asInstanceOf[js.Any])
    
    inline def setResolverRulePolicyUndefined: Self = StObject.set(x, "ResolverRulePolicy", js.undefined)
  }
}
