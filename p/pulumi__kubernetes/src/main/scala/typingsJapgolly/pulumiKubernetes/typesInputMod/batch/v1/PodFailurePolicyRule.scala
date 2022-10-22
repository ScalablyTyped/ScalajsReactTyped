package typingsJapgolly.pulumiKubernetes.typesInputMod.batch.v1

import typingsJapgolly.pulumiPulumi.outputMod.Input
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
  var action: Input[String]
  
  /**
    * Represents the requirement on the container exit codes.
    */
  var onExitCodes: js.UndefOr[Input[PodFailurePolicyOnExitCodesRequirement]] = js.undefined
  
  /**
    * Represents the requirement on the pod conditions. The requirement is represented as a list of pod condition patterns. The requirement is satisfied if at least one pattern matches an actual pod condition. At most 20 elements are allowed.
    */
  var onPodConditions: Input[js.Array[Input[PodFailurePolicyOnPodConditionsPattern]]]
}
object PodFailurePolicyRule {
  
  inline def apply(
    action: Input[String],
    onPodConditions: Input[js.Array[Input[PodFailurePolicyOnPodConditionsPattern]]]
  ): PodFailurePolicyRule = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], onPodConditions = onPodConditions.asInstanceOf[js.Any])
    __obj.asInstanceOf[PodFailurePolicyRule]
  }
  
  extension [Self <: PodFailurePolicyRule](x: Self) {
    
    inline def setAction(value: Input[String]): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setOnExitCodes(value: Input[PodFailurePolicyOnExitCodesRequirement]): Self = StObject.set(x, "onExitCodes", value.asInstanceOf[js.Any])
    
    inline def setOnExitCodesUndefined: Self = StObject.set(x, "onExitCodes", js.undefined)
    
    inline def setOnPodConditions(value: Input[js.Array[Input[PodFailurePolicyOnPodConditionsPattern]]]): Self = StObject.set(x, "onPodConditions", value.asInstanceOf[js.Any])
    
    inline def setOnPodConditionsVarargs(value: Input[PodFailurePolicyOnPodConditionsPattern]*): Self = StObject.set(x, "onPodConditions", js.Array(value*))
  }
}
