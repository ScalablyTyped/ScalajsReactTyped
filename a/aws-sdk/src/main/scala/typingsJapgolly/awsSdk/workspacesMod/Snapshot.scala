package typingsJapgolly.awsSdk.workspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Snapshot extends js.Object {
  /**
    * The time when the snapshot was created.
    */
  var SnapshotTime: js.UndefOr[js.Date] = js.native
}

object Snapshot {
  @scala.inline
  def apply(SnapshotTime: js.Date = null): Snapshot = {
    val __obj = js.Dynamic.literal()
    if (SnapshotTime != null) __obj.updateDynamic("SnapshotTime")(SnapshotTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[Snapshot]
  }
}

