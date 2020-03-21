package typingsJapgolly.mfiles

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IServerVaultManagementOperations extends js.Object {
  def AttachVault(VaultProperties: IVaultProperties, UpdateAttachmentGUID: Boolean): IVaultProperties
  def AttachVaultWithOptions(VaultProperties: IVaultProperties, Options: IAttachVaultOptions): IVaultProperties
  def BackupVault(BackupJob: IBackupJob): Unit
  def BringVaultOnline(VaultGUID: String): Unit
  def CopyVault(CopyVaultJob: ICopyVaultJob): ICopyVaultJobOutputInfo
  def CreateNewVault(VaultProperties: IVaultProperties): String
  def DestroyVault(VaultGUID: String): Unit
  def DetachVault(VaultGUID: String): Unit
  def GetBackupFileContents(BackupFileFull: String, BackupFileDifferential: String, Impersonation: IImpersonation): IVaultProperties
  def GetVaultProperties(VaultGUID: String): IVaultProperties
  def OptimizeVault(OptimizeVaultJob: IOptimizeVaultJob): Unit
  def RestoreVault(RestoreJob: IRestoreJob): Unit
  def TakeVaultOffline(VaultGUID: String, DisconnectUsers: Boolean): Unit
}

object IServerVaultManagementOperations {
  @scala.inline
  def apply(
    AttachVault: (IVaultProperties, Boolean) => CallbackTo[IVaultProperties],
    AttachVaultWithOptions: (IVaultProperties, IAttachVaultOptions) => CallbackTo[IVaultProperties],
    BackupVault: IBackupJob => Callback,
    BringVaultOnline: String => Callback,
    CopyVault: ICopyVaultJob => CallbackTo[ICopyVaultJobOutputInfo],
    CreateNewVault: IVaultProperties => CallbackTo[String],
    DestroyVault: String => Callback,
    DetachVault: String => Callback,
    GetBackupFileContents: (String, String, IImpersonation) => CallbackTo[IVaultProperties],
    GetVaultProperties: String => CallbackTo[IVaultProperties],
    OptimizeVault: IOptimizeVaultJob => Callback,
    RestoreVault: IRestoreJob => Callback,
    TakeVaultOffline: (String, Boolean) => Callback
  ): IServerVaultManagementOperations = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("AttachVault")(js.Any.fromFunction2((t0: typingsJapgolly.mfiles.IVaultProperties, t1: scala.Boolean) => AttachVault(t0, t1).runNow()))
    __obj.updateDynamic("AttachVaultWithOptions")(js.Any.fromFunction2((t0: typingsJapgolly.mfiles.IVaultProperties, t1: typingsJapgolly.mfiles.IAttachVaultOptions) => AttachVaultWithOptions(t0, t1).runNow()))
    __obj.updateDynamic("BackupVault")(js.Any.fromFunction1((t0: typingsJapgolly.mfiles.IBackupJob) => BackupVault(t0).runNow()))
    __obj.updateDynamic("BringVaultOnline")(js.Any.fromFunction1((t0: java.lang.String) => BringVaultOnline(t0).runNow()))
    __obj.updateDynamic("CopyVault")(js.Any.fromFunction1((t0: typingsJapgolly.mfiles.ICopyVaultJob) => CopyVault(t0).runNow()))
    __obj.updateDynamic("CreateNewVault")(js.Any.fromFunction1((t0: typingsJapgolly.mfiles.IVaultProperties) => CreateNewVault(t0).runNow()))
    __obj.updateDynamic("DestroyVault")(js.Any.fromFunction1((t0: java.lang.String) => DestroyVault(t0).runNow()))
    __obj.updateDynamic("DetachVault")(js.Any.fromFunction1((t0: java.lang.String) => DetachVault(t0).runNow()))
    __obj.updateDynamic("GetBackupFileContents")(js.Any.fromFunction3((t0: java.lang.String, t1: java.lang.String, t2: typingsJapgolly.mfiles.IImpersonation) => GetBackupFileContents(t0, t1, t2).runNow()))
    __obj.updateDynamic("GetVaultProperties")(js.Any.fromFunction1((t0: java.lang.String) => GetVaultProperties(t0).runNow()))
    __obj.updateDynamic("OptimizeVault")(js.Any.fromFunction1((t0: typingsJapgolly.mfiles.IOptimizeVaultJob) => OptimizeVault(t0).runNow()))
    __obj.updateDynamic("RestoreVault")(js.Any.fromFunction1((t0: typingsJapgolly.mfiles.IRestoreJob) => RestoreVault(t0).runNow()))
    __obj.updateDynamic("TakeVaultOffline")(js.Any.fromFunction2((t0: java.lang.String, t1: scala.Boolean) => TakeVaultOffline(t0, t1).runNow()))
    __obj.asInstanceOf[IServerVaultManagementOperations]
  }
}

