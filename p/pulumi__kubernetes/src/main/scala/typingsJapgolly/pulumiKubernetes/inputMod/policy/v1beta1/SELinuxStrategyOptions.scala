package typingsJapgolly.pulumiKubernetes.inputMod.policy.v1beta1

import typingsJapgolly.pulumiKubernetes.inputMod.core.v1.SELinuxOptions
import typingsJapgolly.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * SELinuxStrategyOptions defines the strategy type and any options used to create the strategy.
  */
trait SELinuxStrategyOptions extends js.Object {
  /**
    * rule is the strategy that will dictate the allowable labels that may be set.
    */
  var rule: Input[String]
  /**
    * seLinuxOptions required to run as; required for MustRunAs More info:
    * https://kubernetes.io/docs/tasks/configure-pod-container/security-context/
    */
  var seLinuxOptions: js.UndefOr[Input[SELinuxOptions]] = js.undefined
}

object SELinuxStrategyOptions {
  @scala.inline
  def apply(rule: Input[String], seLinuxOptions: Input[SELinuxOptions] = null): SELinuxStrategyOptions = {
    val __obj = js.Dynamic.literal(rule = rule.asInstanceOf[js.Any])
    if (seLinuxOptions != null) __obj.updateDynamic("seLinuxOptions")(seLinuxOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[SELinuxStrategyOptions]
  }
}

