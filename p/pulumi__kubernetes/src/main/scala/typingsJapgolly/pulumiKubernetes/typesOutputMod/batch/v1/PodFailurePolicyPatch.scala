package typingsJapgolly.pulumiKubernetes.typesOutputMod.batch.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * PodFailurePolicy describes how failed pods influence the backoffLimit.
  */
trait PodFailurePolicyPatch extends StObject {
  
  /**
    * A list of pod failure policy rules. The rules are evaluated in order. Once a rule matches a Pod failure, the remaining of the rules are ignored. When no rule matches the Pod failure, the default handling applies - the counter of pod failures is incremented and it is checked against the backoffLimit. At most 20 elements are allowed.
    */
  var rules: js.Array[PodFailurePolicyRulePatch]
}
object PodFailurePolicyPatch {
  
  inline def apply(rules: js.Array[PodFailurePolicyRulePatch]): PodFailurePolicyPatch = {
    val __obj = js.Dynamic.literal(rules = rules.asInstanceOf[js.Any])
    __obj.asInstanceOf[PodFailurePolicyPatch]
  }
  
  extension [Self <: PodFailurePolicyPatch](x: Self) {
    
    inline def setRules(value: js.Array[PodFailurePolicyRulePatch]): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
    
    inline def setRulesVarargs(value: PodFailurePolicyRulePatch*): Self = StObject.set(x, "rules", js.Array(value*))
  }
}
