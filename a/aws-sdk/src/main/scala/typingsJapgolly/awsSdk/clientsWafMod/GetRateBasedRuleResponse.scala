package typingsJapgolly.awsSdk.clientsWafMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetRateBasedRuleResponse extends StObject {
  
  /**
    * Information about the RateBasedRule that you specified in the GetRateBasedRule request.
    */
  var Rule: js.UndefOr[RateBasedRule] = js.undefined
}
object GetRateBasedRuleResponse {
  
  inline def apply(): GetRateBasedRuleResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetRateBasedRuleResponse]
  }
  
  extension [Self <: GetRateBasedRuleResponse](x: Self) {
    
    inline def setRule(value: RateBasedRule): Self = StObject.set(x, "Rule", value.asInstanceOf[js.Any])
    
    inline def setRuleUndefined: Self = StObject.set(x, "Rule", js.undefined)
  }
}
