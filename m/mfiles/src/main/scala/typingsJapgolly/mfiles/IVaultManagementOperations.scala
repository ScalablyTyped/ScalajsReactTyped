package typingsJapgolly.mfiles

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IVaultManagementOperations extends StObject {
  
  def ArchiveOldVersions(ArchiveOldVersionsJob: IArchiveOldVersionsJob): Unit
  
  def ExportContent(ExportContentJob: IExportContentJob): Unit
  
  def GetEventHandlers(): IEventHandlers
  
  def GetVaultProperties(): IVaultProperties
  
  def ImportContent(ImportContentJob: IImportContentJob): Unit
  
  def ImportContentAsync(ImportContentJob: IImportContentJob): Double
  
  def IsAsyncJobRunning(JobID: Double): Boolean
  
  def PreviewImportContent(ImportContentJob: IImportContentJob, SummaryFile: String): Unit
  
  def RebuildFullTextSearchIndex(Metadata: Boolean, FileContents: Boolean): Unit
  
  def SetEventHandlers(EventHandlers: IEventHandlers): Unit
  
  def UpdateVaultProperties(VaultProperties: IVaultProperties, RegistrationDataOnly: Boolean): Unit
  
  def VerifyVault(VerifyVaultJob: IVerifyVaultJob): IVerifyVaultJobOutput
  
  def WaitAsyncJob(JobID: Double): Unit
}
object IVaultManagementOperations {
  
  inline def apply(
    ArchiveOldVersions: IArchiveOldVersionsJob => Callback,
    ExportContent: IExportContentJob => Callback,
    GetEventHandlers: CallbackTo[IEventHandlers],
    GetVaultProperties: CallbackTo[IVaultProperties],
    ImportContent: IImportContentJob => Callback,
    ImportContentAsync: IImportContentJob => Double,
    IsAsyncJobRunning: Double => Boolean,
    PreviewImportContent: (IImportContentJob, String) => Callback,
    RebuildFullTextSearchIndex: (Boolean, Boolean) => Callback,
    SetEventHandlers: IEventHandlers => Callback,
    UpdateVaultProperties: (IVaultProperties, Boolean) => Callback,
    VerifyVault: IVerifyVaultJob => IVerifyVaultJobOutput,
    WaitAsyncJob: Double => Callback
  ): IVaultManagementOperations = {
    val __obj = js.Dynamic.literal(ArchiveOldVersions = js.Any.fromFunction1((t0: IArchiveOldVersionsJob) => ArchiveOldVersions(t0).runNow()), ExportContent = js.Any.fromFunction1((t0: IExportContentJob) => ExportContent(t0).runNow()), GetEventHandlers = GetEventHandlers.toJsFn, GetVaultProperties = GetVaultProperties.toJsFn, ImportContent = js.Any.fromFunction1((t0: IImportContentJob) => ImportContent(t0).runNow()), ImportContentAsync = js.Any.fromFunction1(ImportContentAsync), IsAsyncJobRunning = js.Any.fromFunction1(IsAsyncJobRunning), PreviewImportContent = js.Any.fromFunction2((t0: IImportContentJob, t1: String) => (PreviewImportContent(t0, t1)).runNow()), RebuildFullTextSearchIndex = js.Any.fromFunction2((t0: Boolean, t1: Boolean) => (RebuildFullTextSearchIndex(t0, t1)).runNow()), SetEventHandlers = js.Any.fromFunction1((t0: IEventHandlers) => SetEventHandlers(t0).runNow()), UpdateVaultProperties = js.Any.fromFunction2((t0: IVaultProperties, t1: Boolean) => (UpdateVaultProperties(t0, t1)).runNow()), VerifyVault = js.Any.fromFunction1(VerifyVault), WaitAsyncJob = js.Any.fromFunction1((t0: Double) => WaitAsyncJob(t0).runNow()))
    __obj.asInstanceOf[IVaultManagementOperations]
  }
  
  extension [Self <: IVaultManagementOperations](x: Self) {
    
    inline def setArchiveOldVersions(value: IArchiveOldVersionsJob => Callback): Self = StObject.set(x, "ArchiveOldVersions", js.Any.fromFunction1((t0: IArchiveOldVersionsJob) => value(t0).runNow()))
    
    inline def setExportContent(value: IExportContentJob => Callback): Self = StObject.set(x, "ExportContent", js.Any.fromFunction1((t0: IExportContentJob) => value(t0).runNow()))
    
    inline def setGetEventHandlers(value: CallbackTo[IEventHandlers]): Self = StObject.set(x, "GetEventHandlers", value.toJsFn)
    
    inline def setGetVaultProperties(value: CallbackTo[IVaultProperties]): Self = StObject.set(x, "GetVaultProperties", value.toJsFn)
    
    inline def setImportContent(value: IImportContentJob => Callback): Self = StObject.set(x, "ImportContent", js.Any.fromFunction1((t0: IImportContentJob) => value(t0).runNow()))
    
    inline def setImportContentAsync(value: IImportContentJob => Double): Self = StObject.set(x, "ImportContentAsync", js.Any.fromFunction1(value))
    
    inline def setIsAsyncJobRunning(value: Double => Boolean): Self = StObject.set(x, "IsAsyncJobRunning", js.Any.fromFunction1(value))
    
    inline def setPreviewImportContent(value: (IImportContentJob, String) => Callback): Self = StObject.set(x, "PreviewImportContent", js.Any.fromFunction2((t0: IImportContentJob, t1: String) => (value(t0, t1)).runNow()))
    
    inline def setRebuildFullTextSearchIndex(value: (Boolean, Boolean) => Callback): Self = StObject.set(x, "RebuildFullTextSearchIndex", js.Any.fromFunction2((t0: Boolean, t1: Boolean) => (value(t0, t1)).runNow()))
    
    inline def setSetEventHandlers(value: IEventHandlers => Callback): Self = StObject.set(x, "SetEventHandlers", js.Any.fromFunction1((t0: IEventHandlers) => value(t0).runNow()))
    
    inline def setUpdateVaultProperties(value: (IVaultProperties, Boolean) => Callback): Self = StObject.set(x, "UpdateVaultProperties", js.Any.fromFunction2((t0: IVaultProperties, t1: Boolean) => (value(t0, t1)).runNow()))
    
    inline def setVerifyVault(value: IVerifyVaultJob => IVerifyVaultJobOutput): Self = StObject.set(x, "VerifyVault", js.Any.fromFunction1(value))
    
    inline def setWaitAsyncJob(value: Double => Callback): Self = StObject.set(x, "WaitAsyncJob", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
  }
}
