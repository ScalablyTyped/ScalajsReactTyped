package typingsJapgolly.pulumiKubernetes.typesInputMod.batch.v1

import typingsJapgolly.pulumiPulumi.outputMod.Input
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
  var rules: js.UndefOr[Input[js.Array[Input[PodFailurePolicyRulePatch]]]] = js.undefined
}
object PodFailurePolicyPatch {
  
  inline def apply(): PodFailurePolicyPatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PodFailurePolicyPatch]
  }
  
  extension [Self <: PodFailurePolicyPatch](x: Self) {
    
    inline def setRules(value: Input[js.Array[Input[PodFailurePolicyRulePatch]]]): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
    
    inline def setRulesUndefined: Self = StObject.set(x, "rules", js.undefined)
    
    inline def setRulesVarargs(value: Input[PodFailurePolicyRulePatch]*): Self = StObject.set(x, "rules", js.Array(value*))
  }
}
