package typingsJapgolly.awsSdk.cloudhsmv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteBackupRequest extends js.Object {
  /**
    * The ID of the backup to be deleted. To find the ID of a backup, use the DescribeBackups operation.
    */
  var BackupId: typingsJapgolly.awsSdk.cloudhsmv2Mod.BackupId = js.native
}

object DeleteBackupRequest {
  @scala.inline
  def apply(BackupId: BackupId): DeleteBackupRequest = {
    val __obj = js.Dynamic.literal(BackupId = BackupId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteBackupRequest]
  }
}

