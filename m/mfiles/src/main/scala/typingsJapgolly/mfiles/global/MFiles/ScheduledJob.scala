package typingsJapgolly.mfiles.global.MFiles

import typingsJapgolly.mfiles.IBackupJob
import typingsJapgolly.mfiles.IExportContentJob
import typingsJapgolly.mfiles.IImportContentJob
import typingsJapgolly.mfiles.IOptimizeVaultJob
import typingsJapgolly.mfiles.IScheduledJob
import typingsJapgolly.mfiles.IScheduledJobTriggers
import typingsJapgolly.mfiles.MFiles.MFScheduledJobType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("MFiles.ScheduledJob")
@js.native
open class ScheduledJob ()
  extends StObject
     with IScheduledJob {
  
  /* CompleteClass */
  override val BackupVaultJob: IBackupJob = js.native
  
  /* CompleteClass */
  var Enabled: Boolean = js.native
  
  /* CompleteClass */
  override val ExportContentJob: IExportContentJob = js.native
  
  /* CompleteClass */
  var ID: Double = js.native
  
  /* CompleteClass */
  override val ImportContentJob: IImportContentJob = js.native
  
  /* CompleteClass */
  var JobName: String = js.native
  
  /* CompleteClass */
  var JobType: MFScheduledJobType = js.native
  
  /* CompleteClass */
  override val OptimizeVaultJob: IOptimizeVaultJob = js.native
  
  /* CompleteClass */
  override def SetBackupVaultJob(BackupVaultJob: IBackupJob): Unit = js.native
  
  /* CompleteClass */
  override def SetExportContentJob(ExportContentJob: IExportContentJob): Unit = js.native
  
  /* CompleteClass */
  override def SetImportContentJob(ImportContentJob: IImportContentJob): Unit = js.native
  
  /* CompleteClass */
  override def SetOptimizeVaultJob(OptimizeVaultJob: IOptimizeVaultJob): Unit = js.native
  
  /* CompleteClass */
  var Temporary: Boolean = js.native
  
  /* CompleteClass */
  var Triggers: IScheduledJobTriggers = js.native
}
