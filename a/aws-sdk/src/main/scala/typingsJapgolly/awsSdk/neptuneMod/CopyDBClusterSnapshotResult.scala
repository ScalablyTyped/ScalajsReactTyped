package typingsJapgolly.awsSdk.neptuneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CopyDBClusterSnapshotResult extends js.Object {
  var DBClusterSnapshot: js.UndefOr[typingsJapgolly.awsSdk.neptuneMod.DBClusterSnapshot] = js.native
}

object CopyDBClusterSnapshotResult {
  @scala.inline
  def apply(DBClusterSnapshot: DBClusterSnapshot = null): CopyDBClusterSnapshotResult = {
    val __obj = js.Dynamic.literal()
    if (DBClusterSnapshot != null) __obj.updateDynamic("DBClusterSnapshot")(DBClusterSnapshot.asInstanceOf[js.Any])
    __obj.asInstanceOf[CopyDBClusterSnapshotResult]
  }
}

