package typingsJapgolly.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateClusterSnapshotResult extends js.Object {
  var Snapshot: js.UndefOr[typingsJapgolly.awsSdk.redshiftMod.Snapshot] = js.native
}

object CreateClusterSnapshotResult {
  @scala.inline
  def apply(Snapshot: Snapshot = null): CreateClusterSnapshotResult = {
    val __obj = js.Dynamic.literal()
    if (Snapshot != null) __obj.updateDynamic("Snapshot")(Snapshot.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateClusterSnapshotResult]
  }
}

