package typingsJapgolly.mfiles.MFiles

import org.scalablytyped.runtime.Instantiable0
import typingsJapgolly.mfiles.IBackupJob
import typingsJapgolly.mfiles.IExportContentJob
import typingsJapgolly.mfiles.IImportContentJob
import typingsJapgolly.mfiles.IOptimizeVaultJob
import typingsJapgolly.mfiles.IScheduledJob
import typingsJapgolly.mfiles.IScheduledJobTriggers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MFiles.ScheduledJob")
@js.native
class ScheduledJob () extends IScheduledJob {
  /* CompleteClass */
  override val BackupVaultJob: IBackupJob = js.native
  /* CompleteClass */
  override var Enabled: Boolean = js.native
  /* CompleteClass */
  override val ExportContentJob: IExportContentJob = js.native
  /* CompleteClass */
  override var ID: Double = js.native
  /* CompleteClass */
  override val ImportContentJob: IImportContentJob = js.native
  /* CompleteClass */
  override var JobName: String = js.native
  /* CompleteClass */
  override var JobType: MFScheduledJobType = js.native
  /* CompleteClass */
  override val OptimizeVaultJob: IOptimizeVaultJob = js.native
  /* CompleteClass */
  override var Temporary: Boolean = js.native
  /* CompleteClass */
  override var Triggers: IScheduledJobTriggers = js.native
  /* CompleteClass */
  override def SetBackupVaultJob(BackupVaultJob: IBackupJob): Unit = js.native
  /* CompleteClass */
  override def SetExportContentJob(ExportContentJob: IExportContentJob): Unit = js.native
  /* CompleteClass */
  override def SetImportContentJob(ImportContentJob: IImportContentJob): Unit = js.native
  /* CompleteClass */
  override def SetOptimizeVaultJob(OptimizeVaultJob: IOptimizeVaultJob): Unit = js.native
}

@JSGlobal("MFiles.ScheduledJob")
@js.native
object ScheduledJob extends Instantiable0[IScheduledJob]

