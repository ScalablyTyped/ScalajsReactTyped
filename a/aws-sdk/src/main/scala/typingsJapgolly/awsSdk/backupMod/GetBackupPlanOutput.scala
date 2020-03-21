package typingsJapgolly.awsSdk.backupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetBackupPlanOutput extends js.Object {
  /**
    * Specifies the body of a backup plan. Includes a BackupPlanName and one or more sets of Rules.
    */
  var BackupPlan: js.UndefOr[typingsJapgolly.awsSdk.backupMod.BackupPlan] = js.native
  /**
    * An Amazon Resource Name (ARN) that uniquely identifies a backup plan; for example, arn:aws:backup:us-east-1:123456789012:plan:8F81F553-3A74-4A3F-B93D-B3360DC80C50.
    */
  var BackupPlanArn: js.UndefOr[ARN] = js.native
  /**
    * Uniquely identifies a backup plan.
    */
  var BackupPlanId: js.UndefOr[String] = js.native
  /**
    * The date and time that a backup plan is created, in Unix format and Coordinated Universal Time (UTC). The value of CreationDate is accurate to milliseconds. For example, the value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
    */
  var CreationDate: js.UndefOr[js.Date] = js.native
  /**
    * A unique string that identifies the request and allows failed requests to be retried without the risk of executing the operation twice.
    */
  var CreatorRequestId: js.UndefOr[String] = js.native
  /**
    * The date and time that a backup plan is deleted, in Unix format and Coordinated Universal Time (UTC). The value of CreationDate is accurate to milliseconds. For example, the value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
    */
  var DeletionDate: js.UndefOr[js.Date] = js.native
  /**
    * The last time a job to back up resources was executed with this backup plan. A date and time, in Unix format and Coordinated Universal Time (UTC). The value of LastExecutionDate is accurate to milliseconds. For example, the value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
    */
  var LastExecutionDate: js.UndefOr[js.Date] = js.native
  /**
    * Unique, randomly generated, Unicode, UTF-8 encoded strings that are at most 1,024 bytes long. Version IDs cannot be edited.
    */
  var VersionId: js.UndefOr[String] = js.native
}

object GetBackupPlanOutput {
  @scala.inline
  def apply(
    BackupPlan: BackupPlan = null,
    BackupPlanArn: ARN = null,
    BackupPlanId: String = null,
    CreationDate: js.Date = null,
    CreatorRequestId: String = null,
    DeletionDate: js.Date = null,
    LastExecutionDate: js.Date = null,
    VersionId: String = null
  ): GetBackupPlanOutput = {
    val __obj = js.Dynamic.literal()
    if (BackupPlan != null) __obj.updateDynamic("BackupPlan")(BackupPlan.asInstanceOf[js.Any])
    if (BackupPlanArn != null) __obj.updateDynamic("BackupPlanArn")(BackupPlanArn.asInstanceOf[js.Any])
    if (BackupPlanId != null) __obj.updateDynamic("BackupPlanId")(BackupPlanId.asInstanceOf[js.Any])
    if (CreationDate != null) __obj.updateDynamic("CreationDate")(CreationDate.asInstanceOf[js.Any])
    if (CreatorRequestId != null) __obj.updateDynamic("CreatorRequestId")(CreatorRequestId.asInstanceOf[js.Any])
    if (DeletionDate != null) __obj.updateDynamic("DeletionDate")(DeletionDate.asInstanceOf[js.Any])
    if (LastExecutionDate != null) __obj.updateDynamic("LastExecutionDate")(LastExecutionDate.asInstanceOf[js.Any])
    if (VersionId != null) __obj.updateDynamic("VersionId")(VersionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBackupPlanOutput]
  }
}

