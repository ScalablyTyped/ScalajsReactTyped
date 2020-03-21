package typingsJapgolly.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteSnapshotCopyGrantMessage extends js.Object {
  /**
    * The name of the snapshot copy grant to delete.
    */
  var SnapshotCopyGrantName: String = js.native
}

object DeleteSnapshotCopyGrantMessage {
  @scala.inline
  def apply(SnapshotCopyGrantName: String): DeleteSnapshotCopyGrantMessage = {
    val __obj = js.Dynamic.literal(SnapshotCopyGrantName = SnapshotCopyGrantName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteSnapshotCopyGrantMessage]
  }
}

