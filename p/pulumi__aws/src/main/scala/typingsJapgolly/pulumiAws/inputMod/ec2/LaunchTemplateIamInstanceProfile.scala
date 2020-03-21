package typingsJapgolly.pulumiAws.inputMod.ec2

import typingsJapgolly.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LaunchTemplateIamInstanceProfile extends js.Object {
  /**
    * Amazon Resource Name (ARN) of the launch template.
    */
  var arn: js.UndefOr[Input[String]] = js.native
  /**
    * The name of the launch template. If you leave this blank, this provider will auto-generate a unique name.
    */
  var name: js.UndefOr[Input[String]] = js.native
}

object LaunchTemplateIamInstanceProfile {
  @scala.inline
  def apply(arn: Input[String] = null, name: Input[String] = null): LaunchTemplateIamInstanceProfile = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[LaunchTemplateIamInstanceProfile]
  }
}

