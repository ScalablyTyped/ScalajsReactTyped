package typingsJapgolly.pulumiAws.inputMod.emr

import typingsJapgolly.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClusterCoreInstanceGroupEbsConfig extends js.Object {
  var iops: js.UndefOr[Input[Double]] = js.native
  var size: Input[Double] = js.native
  var `type`: Input[String] = js.native
  var volumesPerInstance: js.UndefOr[Input[Double]] = js.native
}

object ClusterCoreInstanceGroupEbsConfig {
  @scala.inline
  def apply(
    size: Input[Double],
    `type`: Input[String],
    iops: Input[Double] = null,
    volumesPerInstance: Input[Double] = null
  ): ClusterCoreInstanceGroupEbsConfig = {
    val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (iops != null) __obj.updateDynamic("iops")(iops.asInstanceOf[js.Any])
    if (volumesPerInstance != null) __obj.updateDynamic("volumesPerInstance")(volumesPerInstance.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterCoreInstanceGroupEbsConfig]
  }
}

