package typingsJapgolly.awsSdk.migrationhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssociateCreatedArtifactRequest extends js.Object {
  /**
    * An ARN of the AWS resource related to the migration (e.g., AMI, EC2 instance, RDS instance, etc.) 
    */
  var CreatedArtifact: typingsJapgolly.awsSdk.migrationhubMod.CreatedArtifact = js.native
  /**
    * Optional boolean flag to indicate whether any effect should take place. Used to test if the caller has permission to make the call.
    */
  var DryRun: js.UndefOr[typingsJapgolly.awsSdk.migrationhubMod.DryRun] = js.native
  /**
    * Unique identifier that references the migration task. Do not store personal data in this field. 
    */
  var MigrationTaskName: typingsJapgolly.awsSdk.migrationhubMod.MigrationTaskName = js.native
  /**
    * The name of the ProgressUpdateStream. 
    */
  var ProgressUpdateStream: typingsJapgolly.awsSdk.migrationhubMod.ProgressUpdateStream = js.native
}

object AssociateCreatedArtifactRequest {
  @scala.inline
  def apply(
    CreatedArtifact: CreatedArtifact,
    MigrationTaskName: MigrationTaskName,
    ProgressUpdateStream: ProgressUpdateStream,
    DryRun: js.UndefOr[Boolean] = js.undefined
  ): AssociateCreatedArtifactRequest = {
    val __obj = js.Dynamic.literal(CreatedArtifact = CreatedArtifact.asInstanceOf[js.Any], MigrationTaskName = MigrationTaskName.asInstanceOf[js.Any], ProgressUpdateStream = ProgressUpdateStream.asInstanceOf[js.Any])
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociateCreatedArtifactRequest]
  }
}

