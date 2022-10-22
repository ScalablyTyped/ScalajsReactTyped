package typingsJapgolly.awsSdk.clientsChimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListSipRulesResponse extends StObject {
  
  /**
    * The token to use to retrieve the next page of results.
    */
  var NextToken: js.UndefOr[NextTokenString] = js.undefined
  
  /**
    * List of SIP rules and rule details.
    */
  var SipRules: js.UndefOr[SipRuleList] = js.undefined
}
object ListSipRulesResponse {
  
  inline def apply(): ListSipRulesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSipRulesResponse]
  }
  
  extension [Self <: ListSipRulesResponse](x: Self) {
    
    inline def setNextToken(value: NextTokenString): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setSipRules(value: SipRuleList): Self = StObject.set(x, "SipRules", value.asInstanceOf[js.Any])
    
    inline def setSipRulesUndefined: Self = StObject.set(x, "SipRules", js.undefined)
    
    inline def setSipRulesVarargs(value: SipRule*): Self = StObject.set(x, "SipRules", js.Array(value*))
  }
}
