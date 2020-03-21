package typingsJapgolly.awsSdk.documentClientMod.DocumentClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateBackupInput extends js.Object {
  /**
    * Specified name for the backup.
    */
  var BackupName: typingsJapgolly.awsSdk.documentClientMod.DocumentClient.BackupName = js.native
  /**
    * The name of the table.
    */
  var TableName: typingsJapgolly.awsSdk.documentClientMod.DocumentClient.TableName = js.native
}

object CreateBackupInput {
  @scala.inline
  def apply(BackupName: BackupName, TableName: TableName): CreateBackupInput = {
    val __obj = js.Dynamic.literal(BackupName = BackupName.asInstanceOf[js.Any], TableName = TableName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CreateBackupInput]
  }
}

