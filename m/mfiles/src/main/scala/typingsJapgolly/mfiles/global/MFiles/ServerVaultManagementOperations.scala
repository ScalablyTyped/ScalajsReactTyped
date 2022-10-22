package typingsJapgolly.mfiles.global.MFiles

import typingsJapgolly.mfiles.IAttachVaultOptions
import typingsJapgolly.mfiles.IBackupJob
import typingsJapgolly.mfiles.ICopyVaultJob
import typingsJapgolly.mfiles.ICopyVaultJobOutputInfo
import typingsJapgolly.mfiles.IImpersonation
import typingsJapgolly.mfiles.IOptimizeVaultJob
import typingsJapgolly.mfiles.IRestoreJob
import typingsJapgolly.mfiles.IServerVaultManagementOperations
import typingsJapgolly.mfiles.IVaultProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("MFiles.ServerVaultManagementOperations")
@js.native
open class ServerVaultManagementOperations ()
  extends StObject
     with IServerVaultManagementOperations {
  
  /* CompleteClass */
  override def AttachVault(VaultProperties: IVaultProperties, UpdateAttachmentGUID: Boolean): IVaultProperties = js.native
  
  /* CompleteClass */
  override def AttachVaultWithOptions(VaultProperties: IVaultProperties, Options: IAttachVaultOptions): IVaultProperties = js.native
  
  /* CompleteClass */
  override def BackupVault(BackupJob: IBackupJob): Unit = js.native
  
  /* CompleteClass */
  override def BringVaultOnline(VaultGUID: String): Unit = js.native
  
  /* CompleteClass */
  override def CopyVault(CopyVaultJob: ICopyVaultJob): ICopyVaultJobOutputInfo = js.native
  
  /* CompleteClass */
  override def CreateNewVault(VaultProperties: IVaultProperties): String = js.native
  
  /* CompleteClass */
  override def DestroyVault(VaultGUID: String): Unit = js.native
  
  /* CompleteClass */
  override def DetachVault(VaultGUID: String): Unit = js.native
  
  /* CompleteClass */
  override def GetBackupFileContents(BackupFileFull: String, BackupFileDifferential: String, Impersonation: IImpersonation): IVaultProperties = js.native
  
  /* CompleteClass */
  override def GetVaultProperties(VaultGUID: String): IVaultProperties = js.native
  
  /* CompleteClass */
  override def OptimizeVault(OptimizeVaultJob: IOptimizeVaultJob): Unit = js.native
  
  /* CompleteClass */
  override def RestoreVault(RestoreJob: IRestoreJob): Unit = js.native
  
  /* CompleteClass */
  override def TakeVaultOffline(VaultGUID: String, DisconnectUsers: Boolean): Unit = js.native
}
