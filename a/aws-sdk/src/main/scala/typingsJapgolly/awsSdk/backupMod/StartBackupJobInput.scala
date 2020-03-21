package typingsJapgolly.awsSdk.backupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartBackupJobInput extends js.Object {
  /**
    * The name of a logical container where backups are stored. Backup vaults are identified by names that are unique to the account used to create them and the AWS Region where they are created. They consist of lowercase letters, numbers, and hyphens.
    */
  var BackupVaultName: typingsJapgolly.awsSdk.backupMod.BackupVaultName = js.native
  /**
    * The amount of time AWS Backup attempts a backup before canceling the job and returning an error.
    */
  var CompleteWindowMinutes: js.UndefOr[WindowMinutes] = js.native
  /**
    * Specifies the IAM role ARN used to create the target recovery point; for example, arn:aws:iam::123456789012:role/S3Access.
    */
  var IamRoleArn: IAMRoleArn = js.native
  /**
    * A customer chosen string that can be used to distinguish between calls to StartBackupJob.
    */
  var IdempotencyToken: js.UndefOr[String] = js.native
  /**
    * The lifecycle defines when a protected resource is transitioned to cold storage and when it expires. AWS Backup will transition and expire backups automatically according to the lifecycle that you define.  Backups transitioned to cold storage must be stored in cold storage for a minimum of 90 days. Therefore, the “expire after days” setting must be 90 days greater than the “transition to cold after days” setting. The “transition to cold after days” setting cannot be changed after a backup has been transitioned to cold. 
    */
  var Lifecycle: js.UndefOr[typingsJapgolly.awsSdk.backupMod.Lifecycle] = js.native
  /**
    * To help organize your resources, you can assign your own metadata to the resources that you create. Each tag is a key-value pair.
    */
  var RecoveryPointTags: js.UndefOr[Tags] = js.native
  /**
    * An Amazon Resource Name (ARN) that uniquely identifies a resource. The format of the ARN depends on the resource type.
    */
  var ResourceArn: ARN = js.native
  /**
    * The amount of time in minutes before beginning a backup.
    */
  var StartWindowMinutes: js.UndefOr[WindowMinutes] = js.native
}

object StartBackupJobInput {
  @scala.inline
  def apply(
    BackupVaultName: BackupVaultName,
    IamRoleArn: IAMRoleArn,
    ResourceArn: ARN,
    CompleteWindowMinutes: Int | Double = null,
    IdempotencyToken: String = null,
    Lifecycle: Lifecycle = null,
    RecoveryPointTags: Tags = null,
    StartWindowMinutes: Int | Double = null
  ): StartBackupJobInput = {
    val __obj = js.Dynamic.literal(BackupVaultName = BackupVaultName.asInstanceOf[js.Any], IamRoleArn = IamRoleArn.asInstanceOf[js.Any], ResourceArn = ResourceArn.asInstanceOf[js.Any])
    if (CompleteWindowMinutes != null) __obj.updateDynamic("CompleteWindowMinutes")(CompleteWindowMinutes.asInstanceOf[js.Any])
    if (IdempotencyToken != null) __obj.updateDynamic("IdempotencyToken")(IdempotencyToken.asInstanceOf[js.Any])
    if (Lifecycle != null) __obj.updateDynamic("Lifecycle")(Lifecycle.asInstanceOf[js.Any])
    if (RecoveryPointTags != null) __obj.updateDynamic("RecoveryPointTags")(RecoveryPointTags.asInstanceOf[js.Any])
    if (StartWindowMinutes != null) __obj.updateDynamic("StartWindowMinutes")(StartWindowMinutes.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartBackupJobInput]
  }
}

