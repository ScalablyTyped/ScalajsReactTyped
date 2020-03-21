package typingsJapgolly.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StopDBInstanceMessage extends js.Object {
  /**
    *  The user-supplied instance identifier. 
    */
  var DBInstanceIdentifier: String = js.native
  /**
    *  The user-supplied instance identifier of the DB Snapshot created immediately before the DB instance is stopped. 
    */
  var DBSnapshotIdentifier: js.UndefOr[String] = js.native
}

object StopDBInstanceMessage {
  @scala.inline
  def apply(DBInstanceIdentifier: String, DBSnapshotIdentifier: String = null): StopDBInstanceMessage = {
    val __obj = js.Dynamic.literal(DBInstanceIdentifier = DBInstanceIdentifier.asInstanceOf[js.Any])
    if (DBSnapshotIdentifier != null) __obj.updateDynamic("DBSnapshotIdentifier")(DBSnapshotIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopDBInstanceMessage]
  }
}

