package typingsJapgolly.awsSdk.clientsEcrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LifecyclePolicyRuleAction extends StObject {
  
  /**
    * The type of action to be taken.
    */
  var `type`: js.UndefOr[ImageActionType] = js.undefined
}
object LifecyclePolicyRuleAction {
  
  inline def apply(): LifecyclePolicyRuleAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LifecyclePolicyRuleAction]
  }
  
  extension [Self <: LifecyclePolicyRuleAction](x: Self) {
    
    inline def setType(value: ImageActionType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
