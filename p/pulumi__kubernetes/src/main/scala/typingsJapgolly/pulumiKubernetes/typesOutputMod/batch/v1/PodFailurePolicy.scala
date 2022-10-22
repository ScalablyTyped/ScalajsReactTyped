package typingsJapgolly.pulumiKubernetes.typesOutputMod.batch.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * PodFailurePolicy describes how failed pods influence the backoffLimit.
  */
trait PodFailurePolicy extends StObject {
  
  /**
    * A list of pod failure policy rules. The rules are evaluated in order. Once a rule matches a Pod failure, the remaining of the rules are ignored. When no rule matches the Pod failure, the default handling applies - the counter of pod failures is incremented and it is checked against the backoffLimit. At most 20 elements are allowed.
    */
  var rules: js.Array[PodFailurePolicyRule]
}
object PodFailurePolicy {
  
  inline def apply(rules: js.Array[PodFailurePolicyRule]): PodFailurePolicy = {
    val __obj = js.Dynamic.literal(rules = rules.asInstanceOf[js.Any])
    __obj.asInstanceOf[PodFailurePolicy]
  }
  
  extension [Self <: PodFailurePolicy](x: Self) {
    
    inline def setRules(value: js.Array[PodFailurePolicyRule]): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
    
    inline def setRulesVarargs(value: PodFailurePolicyRule*): Self = StObject.set(x, "rules", js.Array(value*))
  }
}
