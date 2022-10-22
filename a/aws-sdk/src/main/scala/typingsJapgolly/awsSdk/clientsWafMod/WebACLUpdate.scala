package typingsJapgolly.awsSdk.clientsWafMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebACLUpdate extends StObject {
  
  /**
    * Specifies whether to insert a Rule into or delete a Rule from a WebACL.
    */
  var Action: ChangeAction
  
  /**
    * The ActivatedRule object in an UpdateWebACL request specifies a Rule that you want to insert or delete, the priority of the Rule in the WebACL, and the action that you want AWS WAF to take when a web request matches the Rule (ALLOW, BLOCK, or COUNT).
    */
  var ActivatedRule: typingsJapgolly.awsSdk.clientsWafMod.ActivatedRule
}
object WebACLUpdate {
  
  inline def apply(Action: ChangeAction, ActivatedRule: ActivatedRule): WebACLUpdate = {
    val __obj = js.Dynamic.literal(Action = Action.asInstanceOf[js.Any], ActivatedRule = ActivatedRule.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebACLUpdate]
  }
  
  extension [Self <: WebACLUpdate](x: Self) {
    
    inline def setAction(value: ChangeAction): Self = StObject.set(x, "Action", value.asInstanceOf[js.Any])
    
    inline def setActivatedRule(value: ActivatedRule): Self = StObject.set(x, "ActivatedRule", value.asInstanceOf[js.Any])
  }
}
