package typingsJapgolly.awsSdk.clientsEventbridgeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListRulesResponse extends StObject {
  
  /**
    * Indicates whether there are additional results to retrieve. If there are no more results, the value is null.
    */
  var NextToken: js.UndefOr[typingsJapgolly.awsSdk.clientsEventbridgeMod.NextToken] = js.undefined
  
  /**
    * The rules that match the specified criteria.
    */
  var Rules: js.UndefOr[RuleResponseList] = js.undefined
}
object ListRulesResponse {
  
  inline def apply(): ListRulesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListRulesResponse]
  }
  
  extension [Self <: ListRulesResponse](x: Self) {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setRules(value: RuleResponseList): Self = StObject.set(x, "Rules", value.asInstanceOf[js.Any])
    
    inline def setRulesUndefined: Self = StObject.set(x, "Rules", js.undefined)
    
    inline def setRulesVarargs(value: Rule*): Self = StObject.set(x, "Rules", js.Array(value*))
  }
}
