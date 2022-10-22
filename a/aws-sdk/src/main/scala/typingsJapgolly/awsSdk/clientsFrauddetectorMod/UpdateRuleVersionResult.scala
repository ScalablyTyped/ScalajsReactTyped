package typingsJapgolly.awsSdk.clientsFrauddetectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateRuleVersionResult extends StObject {
  
  /**
    * The new rule version that was created.
    */
  var rule: js.UndefOr[Rule] = js.undefined
}
object UpdateRuleVersionResult {
  
  inline def apply(): UpdateRuleVersionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateRuleVersionResult]
  }
  
  extension [Self <: UpdateRuleVersionResult](x: Self) {
    
    inline def setRule(value: Rule): Self = StObject.set(x, "rule", value.asInstanceOf[js.Any])
    
    inline def setRuleUndefined: Self = StObject.set(x, "rule", js.undefined)
  }
}
