package typingsJapgolly.pulumiAws.inputMod.opsworks

import typingsJapgolly.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StaticWebLayerEbsVolume extends js.Object {
  var encrypted: js.UndefOr[Input[Boolean]] = js.native
  var iops: js.UndefOr[Input[Double]] = js.native
  var mountPoint: Input[String] = js.native
  var numberOfDisks: Input[Double] = js.native
  var raidLevel: js.UndefOr[Input[String]] = js.native
  var size: Input[Double] = js.native
  var `type`: js.UndefOr[Input[String]] = js.native
}

object StaticWebLayerEbsVolume {
  @scala.inline
  def apply(
    mountPoint: Input[String],
    numberOfDisks: Input[Double],
    size: Input[Double],
    encrypted: Input[Boolean] = null,
    iops: Input[Double] = null,
    raidLevel: Input[String] = null,
    `type`: Input[String] = null
  ): StaticWebLayerEbsVolume = {
    val __obj = js.Dynamic.literal(mountPoint = mountPoint.asInstanceOf[js.Any], numberOfDisks = numberOfDisks.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    if (encrypted != null) __obj.updateDynamic("encrypted")(encrypted.asInstanceOf[js.Any])
    if (iops != null) __obj.updateDynamic("iops")(iops.asInstanceOf[js.Any])
    if (raidLevel != null) __obj.updateDynamic("raidLevel")(raidLevel.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StaticWebLayerEbsVolume]
  }
}

