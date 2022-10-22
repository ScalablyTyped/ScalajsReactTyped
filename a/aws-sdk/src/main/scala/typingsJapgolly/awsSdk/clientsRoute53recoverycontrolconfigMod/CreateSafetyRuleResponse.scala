package typingsJapgolly.awsSdk.clientsRoute53recoverycontrolconfigMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateSafetyRuleResponse extends StObject {
  
  /**
    * The assertion rule created.
    */
  var AssertionRule: js.UndefOr[typingsJapgolly.awsSdk.clientsRoute53recoverycontrolconfigMod.AssertionRule] = js.undefined
  
  /**
    * The gating rule created.
    */
  var GatingRule: js.UndefOr[typingsJapgolly.awsSdk.clientsRoute53recoverycontrolconfigMod.GatingRule] = js.undefined
}
object CreateSafetyRuleResponse {
  
  inline def apply(): CreateSafetyRuleResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateSafetyRuleResponse]
  }
  
  extension [Self <: CreateSafetyRuleResponse](x: Self) {
    
    inline def setAssertionRule(value: AssertionRule): Self = StObject.set(x, "AssertionRule", value.asInstanceOf[js.Any])
    
    inline def setAssertionRuleUndefined: Self = StObject.set(x, "AssertionRule", js.undefined)
    
    inline def setGatingRule(value: GatingRule): Self = StObject.set(x, "GatingRule", value.asInstanceOf[js.Any])
    
    inline def setGatingRuleUndefined: Self = StObject.set(x, "GatingRule", js.undefined)
  }
}
