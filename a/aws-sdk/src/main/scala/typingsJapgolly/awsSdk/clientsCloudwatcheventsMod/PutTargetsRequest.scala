package typingsJapgolly.awsSdk.clientsCloudwatcheventsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutTargetsRequest extends StObject {
  
  /**
    * The name or ARN of the event bus associated with the rule. If you omit this, the default event bus is used.
    */
  var EventBusName: js.UndefOr[EventBusNameOrArn] = js.undefined
  
  /**
    * The name of the rule.
    */
  var Rule: RuleName
  
  /**
    * The targets to update or add to the rule.
    */
  var Targets: TargetList
}
object PutTargetsRequest {
  
  inline def apply(Rule: RuleName, Targets: TargetList): PutTargetsRequest = {
    val __obj = js.Dynamic.literal(Rule = Rule.asInstanceOf[js.Any], Targets = Targets.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutTargetsRequest]
  }
  
  extension [Self <: PutTargetsRequest](x: Self) {
    
    inline def setEventBusName(value: EventBusNameOrArn): Self = StObject.set(x, "EventBusName", value.asInstanceOf[js.Any])
    
    inline def setEventBusNameUndefined: Self = StObject.set(x, "EventBusName", js.undefined)
    
    inline def setRule(value: RuleName): Self = StObject.set(x, "Rule", value.asInstanceOf[js.Any])
    
    inline def setTargets(value: TargetList): Self = StObject.set(x, "Targets", value.asInstanceOf[js.Any])
    
    inline def setTargetsVarargs(value: Target*): Self = StObject.set(x, "Targets", js.Array(value*))
  }
}
