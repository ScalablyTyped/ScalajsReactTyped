package typingsJapgolly.awsSdk.elasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteSnapshotResult extends js.Object {
  var Snapshot: js.UndefOr[typingsJapgolly.awsSdk.elasticacheMod.Snapshot] = js.native
}

object DeleteSnapshotResult {
  @scala.inline
  def apply(Snapshot: Snapshot = null): DeleteSnapshotResult = {
    val __obj = js.Dynamic.literal()
    if (Snapshot != null) __obj.updateDynamic("Snapshot")(Snapshot.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteSnapshotResult]
  }
}

