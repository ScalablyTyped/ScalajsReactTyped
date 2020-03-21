package typingsJapgolly.mfiles

import japgolly.scalajs.react.Callback
import typingsJapgolly.mfiles.MFiles.MFScheduledJobType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IScheduledJob extends js.Object {
  val BackupVaultJob: IBackupJob
  var Enabled: Boolean
  val ExportContentJob: IExportContentJob
  var ID: Double
  val ImportContentJob: IImportContentJob
  var JobName: String
  var JobType: MFScheduledJobType
  val OptimizeVaultJob: IOptimizeVaultJob
  var Temporary: Boolean
  var Triggers: IScheduledJobTriggers
  def SetBackupVaultJob(BackupVaultJob: IBackupJob): Unit
  def SetExportContentJob(ExportContentJob: IExportContentJob): Unit
  def SetImportContentJob(ImportContentJob: IImportContentJob): Unit
  def SetOptimizeVaultJob(OptimizeVaultJob: IOptimizeVaultJob): Unit
}

object IScheduledJob {
  @scala.inline
  def apply(
    BackupVaultJob: IBackupJob,
    Enabled: Boolean,
    ExportContentJob: IExportContentJob,
    ID: Double,
    ImportContentJob: IImportContentJob,
    JobName: String,
    JobType: MFScheduledJobType,
    OptimizeVaultJob: IOptimizeVaultJob,
    SetBackupVaultJob: IBackupJob => Callback,
    SetExportContentJob: IExportContentJob => Callback,
    SetImportContentJob: IImportContentJob => Callback,
    SetOptimizeVaultJob: IOptimizeVaultJob => Callback,
    Temporary: Boolean,
    Triggers: IScheduledJobTriggers
  ): IScheduledJob = {
    val __obj = js.Dynamic.literal(BackupVaultJob = BackupVaultJob.asInstanceOf[js.Any], Enabled = Enabled.asInstanceOf[js.Any], ExportContentJob = ExportContentJob.asInstanceOf[js.Any], ID = ID.asInstanceOf[js.Any], ImportContentJob = ImportContentJob.asInstanceOf[js.Any], JobName = JobName.asInstanceOf[js.Any], JobType = JobType.asInstanceOf[js.Any], OptimizeVaultJob = OptimizeVaultJob.asInstanceOf[js.Any], Temporary = Temporary.asInstanceOf[js.Any], Triggers = Triggers.asInstanceOf[js.Any])
    __obj.updateDynamic("SetBackupVaultJob")(js.Any.fromFunction1((t0: typingsJapgolly.mfiles.IBackupJob) => SetBackupVaultJob(t0).runNow()))
    __obj.updateDynamic("SetExportContentJob")(js.Any.fromFunction1((t0: typingsJapgolly.mfiles.IExportContentJob) => SetExportContentJob(t0).runNow()))
    __obj.updateDynamic("SetImportContentJob")(js.Any.fromFunction1((t0: typingsJapgolly.mfiles.IImportContentJob) => SetImportContentJob(t0).runNow()))
    __obj.updateDynamic("SetOptimizeVaultJob")(js.Any.fromFunction1((t0: typingsJapgolly.mfiles.IOptimizeVaultJob) => SetOptimizeVaultJob(t0).runNow()))
    __obj.asInstanceOf[IScheduledJob]
  }
}

