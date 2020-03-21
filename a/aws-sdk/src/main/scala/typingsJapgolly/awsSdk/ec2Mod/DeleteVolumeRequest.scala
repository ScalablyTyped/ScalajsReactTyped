package typingsJapgolly.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteVolumeRequest extends js.Object {
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * The ID of the volume.
    */
  var VolumeId: typingsJapgolly.awsSdk.ec2Mod.VolumeId = js.native
}

object DeleteVolumeRequest {
  @scala.inline
  def apply(VolumeId: VolumeId, DryRun: js.UndefOr[scala.Boolean] = js.undefined): DeleteVolumeRequest = {
    val __obj = js.Dynamic.literal(VolumeId = VolumeId.asInstanceOf[js.Any])
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteVolumeRequest]
  }
}

