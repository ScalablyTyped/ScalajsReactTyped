package typingsJapgolly.awsSdk.backupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeBackupVaultOutput extends js.Object {
  /**
    * An Amazon Resource Name (ARN) that uniquely identifies a backup vault; for example, arn:aws:backup:us-east-1:123456789012:vault:aBackupVault.
    */
  var BackupVaultArn: js.UndefOr[ARN] = js.native
  /**
    * The name of a logical container where backups are stored. Backup vaults are identified by names that are unique to the account used to create them and the Region where they are created. They consist of lowercase letters, numbers, and hyphens.
    */
  var BackupVaultName: js.UndefOr[String] = js.native
  /**
    * The date and time that a backup vault is created, in Unix format and Coordinated Universal Time (UTC). The value of CreationDate is accurate to milliseconds. For example, the value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
    */
  var CreationDate: js.UndefOr[js.Date] = js.native
  /**
    * A unique string that identifies the request and allows failed requests to be retried without the risk of executing the operation twice.
    */
  var CreatorRequestId: js.UndefOr[String] = js.native
  /**
    * The server-side encryption key that is used to protect your backups; for example, arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab.
    */
  var EncryptionKeyArn: js.UndefOr[ARN] = js.native
  /**
    * The number of recovery points that are stored in a backup vault.
    */
  var NumberOfRecoveryPoints: js.UndefOr[long] = js.native
}

object DescribeBackupVaultOutput {
  @scala.inline
  def apply(
    BackupVaultArn: ARN = null,
    BackupVaultName: String = null,
    CreationDate: js.Date = null,
    CreatorRequestId: String = null,
    EncryptionKeyArn: ARN = null,
    NumberOfRecoveryPoints: Int | Double = null
  ): DescribeBackupVaultOutput = {
    val __obj = js.Dynamic.literal()
    if (BackupVaultArn != null) __obj.updateDynamic("BackupVaultArn")(BackupVaultArn.asInstanceOf[js.Any])
    if (BackupVaultName != null) __obj.updateDynamic("BackupVaultName")(BackupVaultName.asInstanceOf[js.Any])
    if (CreationDate != null) __obj.updateDynamic("CreationDate")(CreationDate.asInstanceOf[js.Any])
    if (CreatorRequestId != null) __obj.updateDynamic("CreatorRequestId")(CreatorRequestId.asInstanceOf[js.Any])
    if (EncryptionKeyArn != null) __obj.updateDynamic("EncryptionKeyArn")(EncryptionKeyArn.asInstanceOf[js.Any])
    if (NumberOfRecoveryPoints != null) __obj.updateDynamic("NumberOfRecoveryPoints")(NumberOfRecoveryPoints.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeBackupVaultOutput]
  }
}

