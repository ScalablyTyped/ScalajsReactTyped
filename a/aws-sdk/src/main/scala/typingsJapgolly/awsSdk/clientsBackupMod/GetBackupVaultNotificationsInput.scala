package typingsJapgolly.awsSdk.clientsBackupMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetBackupVaultNotificationsInput extends StObject {
  
  /**
    * The name of a logical container where backups are stored. Backup vaults are identified by names that are unique to the account used to create them and the Amazon Web Services Region where they are created. They consist of lowercase letters, numbers, and hyphens.
    */
  var BackupVaultName: typingsJapgolly.awsSdk.clientsBackupMod.BackupVaultName
}
object GetBackupVaultNotificationsInput {
  
  inline def apply(BackupVaultName: BackupVaultName): GetBackupVaultNotificationsInput = {
    val __obj = js.Dynamic.literal(BackupVaultName = BackupVaultName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBackupVaultNotificationsInput]
  }
  
  extension [Self <: GetBackupVaultNotificationsInput](x: Self) {
    
    inline def setBackupVaultName(value: BackupVaultName): Self = StObject.set(x, "BackupVaultName", value.asInstanceOf[js.Any])
  }
}
