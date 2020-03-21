package typingsJapgolly.awsSdk.backupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteBackupVaultNotificationsInput extends js.Object {
  /**
    * The name of a logical container where backups are stored. Backup vaults are identified by names that are unique to the account used to create them and the Region where they are created. They consist of lowercase letters, numbers, and hyphens.
    */
  var BackupVaultName: typingsJapgolly.awsSdk.backupMod.BackupVaultName = js.native
}

object DeleteBackupVaultNotificationsInput {
  @scala.inline
  def apply(BackupVaultName: BackupVaultName): DeleteBackupVaultNotificationsInput = {
    val __obj = js.Dynamic.literal(BackupVaultName = BackupVaultName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteBackupVaultNotificationsInput]
  }
}

