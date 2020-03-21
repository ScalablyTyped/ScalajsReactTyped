package typingsJapgolly.pulumiKubernetes.inputMod.extensions.v1beta1

import typingsJapgolly.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * RuntimeClassStrategyOptions define the strategy that will dictate the allowable
  * RuntimeClasses for a pod.
  */
trait RuntimeClassStrategyOptions extends js.Object {
  /**
    * allowedRuntimeClassNames is a whitelist of RuntimeClass names that may be specified on a
    * pod. A value of "*" means that any RuntimeClass name is allowed, and must be the only item
    * in the list. An empty list requires the RuntimeClassName field to be unset.
    */
  var allowedRuntimeClassNames: Input[js.Array[Input[String]]]
  /**
    * defaultRuntimeClassName is the default RuntimeClassName to set on the pod. The default MUST
    * be allowed by the allowedRuntimeClassNames list. A value of nil does not mutate the Pod.
    */
  var defaultRuntimeClassName: js.UndefOr[Input[String]] = js.undefined
}

object RuntimeClassStrategyOptions {
  @scala.inline
  def apply(
    allowedRuntimeClassNames: Input[js.Array[Input[String]]],
    defaultRuntimeClassName: Input[String] = null
  ): RuntimeClassStrategyOptions = {
    val __obj = js.Dynamic.literal(allowedRuntimeClassNames = allowedRuntimeClassNames.asInstanceOf[js.Any])
    if (defaultRuntimeClassName != null) __obj.updateDynamic("defaultRuntimeClassName")(defaultRuntimeClassName.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuntimeClassStrategyOptions]
  }
}

