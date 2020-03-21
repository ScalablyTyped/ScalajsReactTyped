package typingsJapgolly.awsSdk.storagegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeSnapshotScheduleInput extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the volume. Use the ListVolumes operation to return a list of gateway volumes.
    */
  var VolumeARN: typingsJapgolly.awsSdk.storagegatewayMod.VolumeARN = js.native
}

object DescribeSnapshotScheduleInput {
  @scala.inline
  def apply(VolumeARN: VolumeARN): DescribeSnapshotScheduleInput = {
    val __obj = js.Dynamic.literal(VolumeARN = VolumeARN.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DescribeSnapshotScheduleInput]
  }
}

