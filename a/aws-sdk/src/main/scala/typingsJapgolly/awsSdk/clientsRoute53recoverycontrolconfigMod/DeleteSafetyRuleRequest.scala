package typingsJapgolly.awsSdk.clientsRoute53recoverycontrolconfigMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteSafetyRuleRequest extends StObject {
  
  /**
    * The ARN of the safety rule.
    */
  var SafetyRuleArn: string
}
object DeleteSafetyRuleRequest {
  
  inline def apply(SafetyRuleArn: string): DeleteSafetyRuleRequest = {
    val __obj = js.Dynamic.literal(SafetyRuleArn = SafetyRuleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteSafetyRuleRequest]
  }
  
  extension [Self <: DeleteSafetyRuleRequest](x: Self) {
    
    inline def setSafetyRuleArn(value: string): Self = StObject.set(x, "SafetyRuleArn", value.asInstanceOf[js.Any])
  }
}
