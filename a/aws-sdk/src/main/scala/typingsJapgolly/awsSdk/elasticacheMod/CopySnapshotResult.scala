package typingsJapgolly.awsSdk.elasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CopySnapshotResult extends js.Object {
  var Snapshot: js.UndefOr[typingsJapgolly.awsSdk.elasticacheMod.Snapshot] = js.native
}

object CopySnapshotResult {
  @scala.inline
  def apply(Snapshot: Snapshot = null): CopySnapshotResult = {
    val __obj = js.Dynamic.literal()
    if (Snapshot != null) __obj.updateDynamic("Snapshot")(Snapshot.asInstanceOf[js.Any])
    __obj.asInstanceOf[CopySnapshotResult]
  }
}

