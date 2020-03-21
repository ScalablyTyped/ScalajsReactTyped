package typingsJapgolly.awsSdk.storagegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateSnapshotOutput extends js.Object {
  /**
    * The snapshot ID that is used to refer to the snapshot in future operations such as describing snapshots (Amazon Elastic Compute Cloud API DescribeSnapshots) or creating a volume from a snapshot (CreateStorediSCSIVolume).
    */
  var SnapshotId: js.UndefOr[typingsJapgolly.awsSdk.storagegatewayMod.SnapshotId] = js.native
  /**
    * The Amazon Resource Name (ARN) of the volume of which the snapshot was taken.
    */
  var VolumeARN: js.UndefOr[typingsJapgolly.awsSdk.storagegatewayMod.VolumeARN] = js.native
}

object CreateSnapshotOutput {
  @scala.inline
  def apply(SnapshotId: SnapshotId = null, VolumeARN: VolumeARN = null): CreateSnapshotOutput = {
    val __obj = js.Dynamic.literal()
    if (SnapshotId != null) __obj.updateDynamic("SnapshotId")(SnapshotId.asInstanceOf[js.Any])
    if (VolumeARN != null) __obj.updateDynamic("VolumeARN")(VolumeARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateSnapshotOutput]
  }
}

