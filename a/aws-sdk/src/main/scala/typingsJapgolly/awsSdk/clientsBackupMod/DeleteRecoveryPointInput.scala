package typingsJapgolly.awsSdk.clientsBackupMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteRecoveryPointInput extends StObject {
  
  /**
    * The name of a logical container where backups are stored. Backup vaults are identified by names that are unique to the account used to create them and the Amazon Web Services Region where they are created. They consist of lowercase letters, numbers, and hyphens.
    */
  var BackupVaultName: typingsJapgolly.awsSdk.clientsBackupMod.BackupVaultName
  
  /**
    * An Amazon Resource Name (ARN) that uniquely identifies a recovery point; for example, arn:aws:backup:us-east-1:123456789012:recovery-point:1EB3B5E7-9EB0-435A-A80B-108B488B0D45.
    */
  var RecoveryPointArn: ARN
}
object DeleteRecoveryPointInput {
  
  inline def apply(BackupVaultName: BackupVaultName, RecoveryPointArn: ARN): DeleteRecoveryPointInput = {
    val __obj = js.Dynamic.literal(BackupVaultName = BackupVaultName.asInstanceOf[js.Any], RecoveryPointArn = RecoveryPointArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteRecoveryPointInput]
  }
  
  extension [Self <: DeleteRecoveryPointInput](x: Self) {
    
    inline def setBackupVaultName(value: BackupVaultName): Self = StObject.set(x, "BackupVaultName", value.asInstanceOf[js.Any])
    
    inline def setRecoveryPointArn(value: ARN): Self = StObject.set(x, "RecoveryPointArn", value.asInstanceOf[js.Any])
  }
}
