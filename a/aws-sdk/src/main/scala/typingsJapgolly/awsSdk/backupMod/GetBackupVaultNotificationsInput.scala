package typingsJapgolly.awsSdk.backupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetBackupVaultNotificationsInput extends js.Object {
  /**
    * The name of a logical container where backups are stored. Backup vaults are identified by names that are unique to the account used to create them and the AWS Region where they are created. They consist of lowercase letters, numbers, and hyphens.
    */
  var BackupVaultName: typingsJapgolly.awsSdk.backupMod.BackupVaultName = js.native
}

object GetBackupVaultNotificationsInput {
  @scala.inline
  def apply(BackupVaultName: BackupVaultName): GetBackupVaultNotificationsInput = {
    val __obj = js.Dynamic.literal(BackupVaultName = BackupVaultName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetBackupVaultNotificationsInput]
  }
}

