package typingsJapgolly.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResetSnapshotAttributeRequest extends js.Object {
  /**
    * The attribute to reset. Currently, only the attribute for permission to create volumes can be reset.
    */
  var Attribute: SnapshotAttributeName = js.native
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * The ID of the snapshot.
    */
  var SnapshotId: typingsJapgolly.awsSdk.ec2Mod.SnapshotId = js.native
}

object ResetSnapshotAttributeRequest {
  @scala.inline
  def apply(
    Attribute: SnapshotAttributeName,
    SnapshotId: SnapshotId,
    DryRun: js.UndefOr[scala.Boolean] = js.undefined
  ): ResetSnapshotAttributeRequest = {
    val __obj = js.Dynamic.literal(Attribute = Attribute.asInstanceOf[js.Any], SnapshotId = SnapshotId.asInstanceOf[js.Any])
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResetSnapshotAttributeRequest]
  }
}

