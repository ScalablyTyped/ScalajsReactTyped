package typingsJapgolly.mfiles.global.MFiles

import typingsJapgolly.mfiles.IArchiveOldVersionsJob
import typingsJapgolly.mfiles.IEventHandlers
import typingsJapgolly.mfiles.IExportContentJob
import typingsJapgolly.mfiles.IImportContentJob
import typingsJapgolly.mfiles.IVaultManagementOperations
import typingsJapgolly.mfiles.IVaultProperties
import typingsJapgolly.mfiles.IVerifyVaultJob
import typingsJapgolly.mfiles.IVerifyVaultJobOutput
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("MFiles.VaultManagementOperations")
@js.native
open class VaultManagementOperations ()
  extends StObject
     with IVaultManagementOperations {
  
  /* CompleteClass */
  override def ArchiveOldVersions(ArchiveOldVersionsJob: IArchiveOldVersionsJob): Unit = js.native
  
  /* CompleteClass */
  override def ExportContent(ExportContentJob: IExportContentJob): Unit = js.native
  
  /* CompleteClass */
  override def GetEventHandlers(): IEventHandlers = js.native
  
  /* CompleteClass */
  override def GetVaultProperties(): IVaultProperties = js.native
  
  /* CompleteClass */
  override def ImportContent(ImportContentJob: IImportContentJob): Unit = js.native
  
  /* CompleteClass */
  override def ImportContentAsync(ImportContentJob: IImportContentJob): Double = js.native
  
  /* CompleteClass */
  override def IsAsyncJobRunning(JobID: Double): Boolean = js.native
  
  /* CompleteClass */
  override def PreviewImportContent(ImportContentJob: IImportContentJob, SummaryFile: String): Unit = js.native
  
  /* CompleteClass */
  override def RebuildFullTextSearchIndex(Metadata: Boolean, FileContents: Boolean): Unit = js.native
  
  /* CompleteClass */
  override def SetEventHandlers(EventHandlers: IEventHandlers): Unit = js.native
  
  /* CompleteClass */
  override def UpdateVaultProperties(VaultProperties: IVaultProperties, RegistrationDataOnly: Boolean): Unit = js.native
  
  /* CompleteClass */
  override def VerifyVault(VerifyVaultJob: IVerifyVaultJob): IVerifyVaultJobOutput = js.native
  
  /* CompleteClass */
  override def WaitAsyncJob(JobID: Double): Unit = js.native
}
