package typingsJapgolly.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BundleInstanceRequest extends js.Object {
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * The ID of the instance to bundle. Type: String Default: None Required: Yes
    */
  var InstanceId: typingsJapgolly.awsSdk.ec2Mod.InstanceId = js.native
  /**
    * The bucket in which to store the AMI. You can specify a bucket that you already own or a new bucket that Amazon EC2 creates on your behalf. If you specify a bucket that belongs to someone else, Amazon EC2 returns an error.
    */
  var Storage: typingsJapgolly.awsSdk.ec2Mod.Storage = js.native
}

object BundleInstanceRequest {
  @scala.inline
  def apply(InstanceId: InstanceId, Storage: Storage, DryRun: js.UndefOr[scala.Boolean] = js.undefined): BundleInstanceRequest = {
    val __obj = js.Dynamic.literal(InstanceId = InstanceId.asInstanceOf[js.Any], Storage = Storage.asInstanceOf[js.Any])
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun.asInstanceOf[js.Any])
    __obj.asInstanceOf[BundleInstanceRequest]
  }
}

