package typingsJapgolly.awsSdk.migrationhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NotifyMigrationTaskStateRequest extends js.Object {
  /**
    * Optional boolean flag to indicate whether any effect should take place. Used to test if the caller has permission to make the call.
    */
  var DryRun: js.UndefOr[typingsJapgolly.awsSdk.migrationhubMod.DryRun] = js.native
  /**
    * Unique identifier that references the migration task. Do not store personal data in this field. 
    */
  var MigrationTaskName: typingsJapgolly.awsSdk.migrationhubMod.MigrationTaskName = js.native
  /**
    * Number of seconds after the UpdateDateTime within which the Migration Hub can expect an update. If Migration Hub does not receive an update within the specified interval, then the migration task will be considered stale.
    */
  var NextUpdateSeconds: typingsJapgolly.awsSdk.migrationhubMod.NextUpdateSeconds = js.native
  /**
    * The name of the ProgressUpdateStream. 
    */
  var ProgressUpdateStream: typingsJapgolly.awsSdk.migrationhubMod.ProgressUpdateStream = js.native
  /**
    * Information about the task's progress and status.
    */
  var Task: typingsJapgolly.awsSdk.migrationhubMod.Task = js.native
  /**
    * The timestamp when the task was gathered.
    */
  var UpdateDateTime: js.Date = js.native
}

object NotifyMigrationTaskStateRequest {
  @scala.inline
  def apply(
    MigrationTaskName: MigrationTaskName,
    NextUpdateSeconds: NextUpdateSeconds,
    ProgressUpdateStream: ProgressUpdateStream,
    Task: Task,
    UpdateDateTime: js.Date,
    DryRun: js.UndefOr[Boolean] = js.undefined
  ): NotifyMigrationTaskStateRequest = {
    val __obj = js.Dynamic.literal(MigrationTaskName = MigrationTaskName.asInstanceOf[js.Any], NextUpdateSeconds = NextUpdateSeconds.asInstanceOf[js.Any], ProgressUpdateStream = ProgressUpdateStream.asInstanceOf[js.Any], Task = Task.asInstanceOf[js.Any], UpdateDateTime = UpdateDateTime.asInstanceOf[js.Any])
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotifyMigrationTaskStateRequest]
  }
}

