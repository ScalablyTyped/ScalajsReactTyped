package typingsJapgolly.awsSdk.clientsWafMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WafOverrideAction extends StObject {
  
  /**
    *  COUNT overrides the action specified by the individual rule within a RuleGroup . If set to NONE, the rule's action will take place.
    */
  var Type: WafOverrideActionType
}
object WafOverrideAction {
  
  inline def apply(Type: WafOverrideActionType): WafOverrideAction = {
    val __obj = js.Dynamic.literal(Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[WafOverrideAction]
  }
  
  extension [Self <: WafOverrideAction](x: Self) {
    
    inline def setType(value: WafOverrideActionType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
