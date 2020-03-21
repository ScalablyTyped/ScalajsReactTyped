package typingsJapgolly.awsSdk.opsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StopInstanceRequest extends js.Object {
  /**
    * Specifies whether to force an instance to stop. If the instance's root device type is ebs, or EBS-backed, adding the Force parameter to the StopInstances API call disassociates the AWS OpsWorks Stacks instance from EC2, and forces deletion of only the OpsWorks Stacks instance. You must also delete the formerly-associated instance in EC2 after troubleshooting and replacing the AWS OpsWorks Stacks instance with a new one.
    */
  var Force: js.UndefOr[Boolean] = js.native
  /**
    * The instance ID.
    */
  var InstanceId: String = js.native
}

object StopInstanceRequest {
  @scala.inline
  def apply(InstanceId: String, Force: js.UndefOr[scala.Boolean] = js.undefined): StopInstanceRequest = {
    val __obj = js.Dynamic.literal(InstanceId = InstanceId.asInstanceOf[js.Any])
    if (!js.isUndefined(Force)) __obj.updateDynamic("Force")(Force.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopInstanceRequest]
  }
}

