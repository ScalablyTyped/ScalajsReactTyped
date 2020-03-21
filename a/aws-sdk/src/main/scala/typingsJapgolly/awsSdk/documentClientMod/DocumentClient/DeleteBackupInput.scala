package typingsJapgolly.awsSdk.documentClientMod.DocumentClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteBackupInput extends js.Object {
  /**
    * The ARN associated with the backup.
    */
  var BackupArn: typingsJapgolly.awsSdk.documentClientMod.DocumentClient.BackupArn = js.native
}

object DeleteBackupInput {
  @scala.inline
  def apply(BackupArn: BackupArn): DeleteBackupInput = {
    val __obj = js.Dynamic.literal(BackupArn = BackupArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteBackupInput]
  }
}

