package typingsJapgolly.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeClientVpnAuthorizationRulesResult extends StObject {
  
  /**
    * Information about the authorization rules.
    */
  var AuthorizationRules: js.UndefOr[AuthorizationRuleSet] = js.undefined
  
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[typingsJapgolly.awsSdk.clientsEc2Mod.NextToken] = js.undefined
}
object DescribeClientVpnAuthorizationRulesResult {
  
  inline def apply(): DescribeClientVpnAuthorizationRulesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeClientVpnAuthorizationRulesResult]
  }
  
  extension [Self <: DescribeClientVpnAuthorizationRulesResult](x: Self) {
    
    inline def setAuthorizationRules(value: AuthorizationRuleSet): Self = StObject.set(x, "AuthorizationRules", value.asInstanceOf[js.Any])
    
    inline def setAuthorizationRulesUndefined: Self = StObject.set(x, "AuthorizationRules", js.undefined)
    
    inline def setAuthorizationRulesVarargs(value: AuthorizationRule*): Self = StObject.set(x, "AuthorizationRules", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
