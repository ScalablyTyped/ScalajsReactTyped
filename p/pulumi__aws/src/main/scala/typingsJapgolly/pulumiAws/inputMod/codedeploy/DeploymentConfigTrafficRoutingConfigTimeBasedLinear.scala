package typingsJapgolly.pulumiAws.inputMod.codedeploy

import typingsJapgolly.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeploymentConfigTrafficRoutingConfigTimeBasedLinear extends js.Object {
  var interval: js.UndefOr[Input[Double]] = js.native
  var percentage: js.UndefOr[Input[Double]] = js.native
}

object DeploymentConfigTrafficRoutingConfigTimeBasedLinear {
  @scala.inline
  def apply(interval: Input[Double] = null, percentage: Input[Double] = null): DeploymentConfigTrafficRoutingConfigTimeBasedLinear = {
    val __obj = js.Dynamic.literal()
    if (interval != null) __obj.updateDynamic("interval")(interval.asInstanceOf[js.Any])
    if (percentage != null) __obj.updateDynamic("percentage")(percentage.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeploymentConfigTrafficRoutingConfigTimeBasedLinear]
  }
}

