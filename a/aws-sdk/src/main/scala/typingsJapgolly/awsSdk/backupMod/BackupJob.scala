package typingsJapgolly.awsSdk.backupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BackupJob extends js.Object {
  /**
    * Uniquely identifies a request to AWS Backup to back up a resource.
    */
  var BackupJobId: js.UndefOr[String] = js.native
  /**
    * The size, in bytes, of a backup.
    */
  var BackupSizeInBytes: js.UndefOr[Long_] = js.native
  /**
    * An Amazon Resource Name (ARN) that uniquely identifies a backup vault; for example, arn:aws:backup:us-east-1:123456789012:vault:aBackupVault.
    */
  var BackupVaultArn: js.UndefOr[ARN] = js.native
  /**
    * The name of a logical container where backups are stored. Backup vaults are identified by names that are unique to the account used to create them and the AWS Region where they are created. They consist of lowercase letters, numbers, and hyphens.
    */
  var BackupVaultName: js.UndefOr[typingsJapgolly.awsSdk.backupMod.BackupVaultName] = js.native
  /**
    * The size in bytes transferred to a backup vault at the time that the job status was queried.
    */
  var BytesTransferred: js.UndefOr[Long_] = js.native
  /**
    * The date and time a job to create a backup job is completed, in Unix format and Coordinated Universal Time (UTC). The value of CompletionDate is accurate to milliseconds. For example, the value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
    */
  var CompletionDate: js.UndefOr[js.Date] = js.native
  /**
    * Contains identifying information about the creation of a backup job, including the BackupPlanArn, BackupPlanId, BackupPlanVersion, and BackupRuleId of the backup plan used to create it.
    */
  var CreatedBy: js.UndefOr[RecoveryPointCreator] = js.native
  /**
    * The date and time a backup job is created, in Unix format and Coordinated Universal Time (UTC). The value of CreationDate is accurate to milliseconds. For example, the value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
    */
  var CreationDate: js.UndefOr[js.Date] = js.native
  /**
    * The date and time a job to back up resources is expected to be completed, in Unix format and Coordinated Universal Time (UTC). The value of ExpectedCompletionDate is accurate to milliseconds. For example, the value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
    */
  var ExpectedCompletionDate: js.UndefOr[js.Date] = js.native
  /**
    * Specifies the IAM role ARN used to create the target recovery point; for example, arn:aws:iam::123456789012:role/S3Access.
    */
  var IamRoleArn: js.UndefOr[IAMRoleArn] = js.native
  /**
    * Contains an estimated percentage complete of a job at the time the job status was queried.
    */
  var PercentDone: js.UndefOr[String] = js.native
  /**
    * An ARN that uniquely identifies a recovery point; for example, arn:aws:backup:us-east-1:123456789012:recovery-point:1EB3B5E7-9EB0-435A-A80B-108B488B0D45.
    */
  var RecoveryPointArn: js.UndefOr[ARN] = js.native
  /**
    * An ARN that uniquely identifies a resource. The format of the ARN depends on the resource type.
    */
  var ResourceArn: js.UndefOr[ARN] = js.native
  /**
    * The type of AWS resource to be backed-up; for example, an Amazon Elastic Block Store (Amazon EBS) volume or an Amazon Relational Database Service (Amazon RDS) database.
    */
  var ResourceType: js.UndefOr[typingsJapgolly.awsSdk.backupMod.ResourceType] = js.native
  /**
    * Specifies the time in Unix format and Coordinated Universal Time (UTC) when a backup job must be started before it is canceled. The value is calculated by adding the start window to the scheduled time. So if the scheduled time were 6:00 PM and the start window is 2 hours, the StartBy time would be 8:00 PM on the date specified. The value of StartBy is accurate to milliseconds. For example, the value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
    */
  var StartBy: js.UndefOr[js.Date] = js.native
  /**
    * The current state of a resource recovery point.
    */
  var State: js.UndefOr[BackupJobState] = js.native
  /**
    * A detailed message explaining the status of the job to back up a resource.
    */
  var StatusMessage: js.UndefOr[String] = js.native
}

object BackupJob {
  @scala.inline
  def apply(
    BackupJobId: String = null,
    BackupSizeInBytes: Int | Double = null,
    BackupVaultArn: ARN = null,
    BackupVaultName: BackupVaultName = null,
    BytesTransferred: Int | Double = null,
    CompletionDate: js.Date = null,
    CreatedBy: RecoveryPointCreator = null,
    CreationDate: js.Date = null,
    ExpectedCompletionDate: js.Date = null,
    IamRoleArn: IAMRoleArn = null,
    PercentDone: String = null,
    RecoveryPointArn: ARN = null,
    ResourceArn: ARN = null,
    ResourceType: ResourceType = null,
    StartBy: js.Date = null,
    State: BackupJobState = null,
    StatusMessage: String = null
  ): BackupJob = {
    val __obj = js.Dynamic.literal()
    if (BackupJobId != null) __obj.updateDynamic("BackupJobId")(BackupJobId.asInstanceOf[js.Any])
    if (BackupSizeInBytes != null) __obj.updateDynamic("BackupSizeInBytes")(BackupSizeInBytes.asInstanceOf[js.Any])
    if (BackupVaultArn != null) __obj.updateDynamic("BackupVaultArn")(BackupVaultArn.asInstanceOf[js.Any])
    if (BackupVaultName != null) __obj.updateDynamic("BackupVaultName")(BackupVaultName.asInstanceOf[js.Any])
    if (BytesTransferred != null) __obj.updateDynamic("BytesTransferred")(BytesTransferred.asInstanceOf[js.Any])
    if (CompletionDate != null) __obj.updateDynamic("CompletionDate")(CompletionDate.asInstanceOf[js.Any])
    if (CreatedBy != null) __obj.updateDynamic("CreatedBy")(CreatedBy.asInstanceOf[js.Any])
    if (CreationDate != null) __obj.updateDynamic("CreationDate")(CreationDate.asInstanceOf[js.Any])
    if (ExpectedCompletionDate != null) __obj.updateDynamic("ExpectedCompletionDate")(ExpectedCompletionDate.asInstanceOf[js.Any])
    if (IamRoleArn != null) __obj.updateDynamic("IamRoleArn")(IamRoleArn.asInstanceOf[js.Any])
    if (PercentDone != null) __obj.updateDynamic("PercentDone")(PercentDone.asInstanceOf[js.Any])
    if (RecoveryPointArn != null) __obj.updateDynamic("RecoveryPointArn")(RecoveryPointArn.asInstanceOf[js.Any])
    if (ResourceArn != null) __obj.updateDynamic("ResourceArn")(ResourceArn.asInstanceOf[js.Any])
    if (ResourceType != null) __obj.updateDynamic("ResourceType")(ResourceType.asInstanceOf[js.Any])
    if (StartBy != null) __obj.updateDynamic("StartBy")(StartBy.asInstanceOf[js.Any])
    if (State != null) __obj.updateDynamic("State")(State.asInstanceOf[js.Any])
    if (StatusMessage != null) __obj.updateDynamic("StatusMessage")(StatusMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackupJob]
  }
}

