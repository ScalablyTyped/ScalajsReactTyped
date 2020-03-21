package typingsJapgolly.awsSdk.directoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteSnapshotRequest extends js.Object {
  /**
    * The identifier of the directory snapshot to be deleted.
    */
  var SnapshotId: typingsJapgolly.awsSdk.directoryserviceMod.SnapshotId = js.native
}

object DeleteSnapshotRequest {
  @scala.inline
  def apply(SnapshotId: SnapshotId): DeleteSnapshotRequest = {
    val __obj = js.Dynamic.literal(SnapshotId = SnapshotId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteSnapshotRequest]
  }
}

