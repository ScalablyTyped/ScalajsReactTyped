package typingsJapgolly.pulumiKubernetes.typesOutputMod.batch.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * PodFailurePolicyRule describes how a pod failure is handled when the requirements are met. One of OnExitCodes and onPodConditions, but not both, can be used in each rule.
  */
trait PodFailurePolicyRule extends StObject {
  
  /**
    * Specifies the action taken on a pod failure when the requirements are satisfied. Possible values are: - FailJob: indicates that the pod's job is marked as Failed and all
    *   running pods are terminated.
    * - Ignore: indicates that the counter towards the .backoffLimit is not
    *   incremented and a replacement pod is created.
    * - Count: indicates that the pod is handled in the default way - the
    *   counter towards the .backoffLimit is incremented.
    * Additional values are considered to be added in the future. Clients should react to an unknown action by skipping the rule.
    */
  var action: String
  
  /**
    * Represents the requirement on the container exit codes.
    */
  var onExitCodes: PodFailurePolicyOnExitCodesRequirement
  
  /**
    * Represents the requirement on the pod conditions. The requirement is represented as a list of pod condition patterns. The requirement is satisfied if at least one pattern matches an actual pod condition. At most 20 elements are allowed.
    */
  var onPodConditions: js.Array[PodFailurePolicyOnPodConditionsPattern]
}
object PodFailurePolicyRule {
  
  inline def apply(
    action: String,
    onExitCodes: PodFailurePolicyOnExitCodesRequirement,
    onPodConditions: js.Array[PodFailurePolicyOnPodConditionsPattern]
  ): PodFailurePolicyRule = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], onExitCodes = onExitCodes.asInstanceOf[js.Any], onPodConditions = onPodConditions.asInstanceOf[js.Any])
    __obj.asInstanceOf[PodFailurePolicyRule]
  }
  
  extension [Self <: PodFailurePolicyRule](x: Self) {
    
    inline def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setOnExitCodes(value: PodFailurePolicyOnExitCodesRequirement): Self = StObject.set(x, "onExitCodes", value.asInstanceOf[js.Any])
    
    inline def setOnPodConditions(value: js.Array[PodFailurePolicyOnPodConditionsPattern]): Self = StObject.set(x, "onPodConditions", value.asInstanceOf[js.Any])
    
    inline def setOnPodConditionsVarargs(value: PodFailurePolicyOnPodConditionsPattern*): Self = StObject.set(x, "onPodConditions", js.Array(value*))
  }
}
