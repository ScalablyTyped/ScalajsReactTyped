package typingsJapgolly.mfiles

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IServerVaultManagementOperations extends StObject {
  
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
  
  inline def apply(
    AttachVault: (IVaultProperties, Boolean) => IVaultProperties,
    AttachVaultWithOptions: (IVaultProperties, IAttachVaultOptions) => IVaultProperties,
    BackupVault: IBackupJob => Callback,
    BringVaultOnline: String => Callback,
    CopyVault: ICopyVaultJob => ICopyVaultJobOutputInfo,
    CreateNewVault: IVaultProperties => String,
    DestroyVault: String => Callback,
    DetachVault: String => Callback,
    GetBackupFileContents: (String, String, IImpersonation) => IVaultProperties,
    GetVaultProperties: String => IVaultProperties,
    OptimizeVault: IOptimizeVaultJob => Callback,
    RestoreVault: IRestoreJob => Callback,
    TakeVaultOffline: (String, Boolean) => Callback
  ): IServerVaultManagementOperations = {
    val __obj = js.Dynamic.literal(AttachVault = js.Any.fromFunction2(AttachVault), AttachVaultWithOptions = js.Any.fromFunction2(AttachVaultWithOptions), BackupVault = js.Any.fromFunction1((t0: IBackupJob) => BackupVault(t0).runNow()), BringVaultOnline = js.Any.fromFunction1((t0: String) => BringVaultOnline(t0).runNow()), CopyVault = js.Any.fromFunction1(CopyVault), CreateNewVault = js.Any.fromFunction1(CreateNewVault), DestroyVault = js.Any.fromFunction1((t0: String) => DestroyVault(t0).runNow()), DetachVault = js.Any.fromFunction1((t0: String) => DetachVault(t0).runNow()), GetBackupFileContents = js.Any.fromFunction3(GetBackupFileContents), GetVaultProperties = js.Any.fromFunction1(GetVaultProperties), OptimizeVault = js.Any.fromFunction1((t0: IOptimizeVaultJob) => OptimizeVault(t0).runNow()), RestoreVault = js.Any.fromFunction1((t0: IRestoreJob) => RestoreVault(t0).runNow()), TakeVaultOffline = js.Any.fromFunction2((t0: String, t1: Boolean) => (TakeVaultOffline(t0, t1)).runNow()))
    __obj.asInstanceOf[IServerVaultManagementOperations]
  }
  
  extension [Self <: IServerVaultManagementOperations](x: Self) {
    
    inline def setAttachVault(value: (IVaultProperties, Boolean) => IVaultProperties): Self = StObject.set(x, "AttachVault", js.Any.fromFunction2(value))
    
    inline def setAttachVaultWithOptions(value: (IVaultProperties, IAttachVaultOptions) => IVaultProperties): Self = StObject.set(x, "AttachVaultWithOptions", js.Any.fromFunction2(value))
    
    inline def setBackupVault(value: IBackupJob => Callback): Self = StObject.set(x, "BackupVault", js.Any.fromFunction1((t0: IBackupJob) => value(t0).runNow()))
    
    inline def setBringVaultOnline(value: String => Callback): Self = StObject.set(x, "BringVaultOnline", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setCopyVault(value: ICopyVaultJob => ICopyVaultJobOutputInfo): Self = StObject.set(x, "CopyVault", js.Any.fromFunction1(value))
    
    inline def setCreateNewVault(value: IVaultProperties => String): Self = StObject.set(x, "CreateNewVault", js.Any.fromFunction1(value))
    
    inline def setDestroyVault(value: String => Callback): Self = StObject.set(x, "DestroyVault", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setDetachVault(value: String => Callback): Self = StObject.set(x, "DetachVault", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setGetBackupFileContents(value: (String, String, IImpersonation) => IVaultProperties): Self = StObject.set(x, "GetBackupFileContents", js.Any.fromFunction3(value))
    
    inline def setGetVaultProperties(value: String => IVaultProperties): Self = StObject.set(x, "GetVaultProperties", js.Any.fromFunction1(value))
    
    inline def setOptimizeVault(value: IOptimizeVaultJob => Callback): Self = StObject.set(x, "OptimizeVault", js.Any.fromFunction1((t0: IOptimizeVaultJob) => value(t0).runNow()))
    
    inline def setRestoreVault(value: IRestoreJob => Callback): Self = StObject.set(x, "RestoreVault", js.Any.fromFunction1((t0: IRestoreJob) => value(t0).runNow()))
    
    inline def setTakeVaultOffline(value: (String, Boolean) => Callback): Self = StObject.set(x, "TakeVaultOffline", js.Any.fromFunction2((t0: String, t1: Boolean) => (value(t0, t1)).runNow()))
  }
}
