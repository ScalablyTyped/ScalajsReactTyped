package typingsJapgolly.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateDBSnapshotResult extends js.Object {
  var DBSnapshot: js.UndefOr[typingsJapgolly.awsSdk.rdsMod.DBSnapshot] = js.native
}

object CreateDBSnapshotResult {
  @scala.inline
  def apply(DBSnapshot: DBSnapshot = null): CreateDBSnapshotResult = {
    val __obj = js.Dynamic.literal()
    if (DBSnapshot != null) __obj.updateDynamic("DBSnapshot")(DBSnapshot.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDBSnapshotResult]
  }
}

