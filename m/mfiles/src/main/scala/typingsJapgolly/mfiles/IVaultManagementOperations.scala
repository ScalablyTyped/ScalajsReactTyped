package typingsJapgolly.mfiles

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IVaultManagementOperations extends js.Object {
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
  @scala.inline
  def apply(
    ArchiveOldVersions: IArchiveOldVersionsJob => Callback,
    ExportContent: IExportContentJob => Callback,
    GetEventHandlers: CallbackTo[IEventHandlers],
    GetVaultProperties: CallbackTo[IVaultProperties],
    ImportContent: IImportContentJob => Callback,
    ImportContentAsync: IImportContentJob => CallbackTo[Double],
    IsAsyncJobRunning: Double => CallbackTo[Boolean],
    PreviewImportContent: (IImportContentJob, String) => Callback,
    RebuildFullTextSearchIndex: (Boolean, Boolean) => Callback,
    SetEventHandlers: IEventHandlers => Callback,
    UpdateVaultProperties: (IVaultProperties, Boolean) => Callback,
    VerifyVault: IVerifyVaultJob => CallbackTo[IVerifyVaultJobOutput],
    WaitAsyncJob: Double => Callback
  ): IVaultManagementOperations = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ArchiveOldVersions")(js.Any.fromFunction1((t0: typingsJapgolly.mfiles.IArchiveOldVersionsJob) => ArchiveOldVersions(t0).runNow()))
    __obj.updateDynamic("ExportContent")(js.Any.fromFunction1((t0: typingsJapgolly.mfiles.IExportContentJob) => ExportContent(t0).runNow()))
    __obj.updateDynamic("GetEventHandlers")(GetEventHandlers.toJsFn)
    __obj.updateDynamic("GetVaultProperties")(GetVaultProperties.toJsFn)
    __obj.updateDynamic("ImportContent")(js.Any.fromFunction1((t0: typingsJapgolly.mfiles.IImportContentJob) => ImportContent(t0).runNow()))
    __obj.updateDynamic("ImportContentAsync")(js.Any.fromFunction1((t0: typingsJapgolly.mfiles.IImportContentJob) => ImportContentAsync(t0).runNow()))
    __obj.updateDynamic("IsAsyncJobRunning")(js.Any.fromFunction1((t0: scala.Double) => IsAsyncJobRunning(t0).runNow()))
    __obj.updateDynamic("PreviewImportContent")(js.Any.fromFunction2((t0: typingsJapgolly.mfiles.IImportContentJob, t1: java.lang.String) => PreviewImportContent(t0, t1).runNow()))
    __obj.updateDynamic("RebuildFullTextSearchIndex")(js.Any.fromFunction2((t0: scala.Boolean, t1: scala.Boolean) => RebuildFullTextSearchIndex(t0, t1).runNow()))
    __obj.updateDynamic("SetEventHandlers")(js.Any.fromFunction1((t0: typingsJapgolly.mfiles.IEventHandlers) => SetEventHandlers(t0).runNow()))
    __obj.updateDynamic("UpdateVaultProperties")(js.Any.fromFunction2((t0: typingsJapgolly.mfiles.IVaultProperties, t1: scala.Boolean) => UpdateVaultProperties(t0, t1).runNow()))
    __obj.updateDynamic("VerifyVault")(js.Any.fromFunction1((t0: typingsJapgolly.mfiles.IVerifyVaultJob) => VerifyVault(t0).runNow()))
    __obj.updateDynamic("WaitAsyncJob")(js.Any.fromFunction1((t0: scala.Double) => WaitAsyncJob(t0).runNow()))
    __obj.asInstanceOf[IVaultManagementOperations]
  }
}

