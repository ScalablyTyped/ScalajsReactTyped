package typingsJapgolly.pulumiAws.inputMod.ec2

import typingsJapgolly.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LaunchTemplateElasticInferenceAccelerator extends js.Object {
  /**
    * Accelerator type.
    */
  var `type`: Input[String] = js.native
}

object LaunchTemplateElasticInferenceAccelerator {
  @scala.inline
  def apply(`type`: Input[String]): LaunchTemplateElasticInferenceAccelerator = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LaunchTemplateElasticInferenceAccelerator]
  }
}

