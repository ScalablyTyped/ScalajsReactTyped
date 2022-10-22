package typingsJapgolly.mfiles

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.mfiles.MFiles.MFBackupType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IBackupJob extends StObject {
  
  var BackupType: MFBackupType
  
  def Clone(): IBackupJob
  
  var FileSizeLimitInMB: Double
  
  var Impersonation: IImpersonation
  
  var OverwriteExistingFiles: Boolean
  
  var TargetFile: String
  
  var VaultGUID: String
}
object IBackupJob {
  
  inline def apply(
    BackupType: MFBackupType,
    Clone: CallbackTo[IBackupJob],
    FileSizeLimitInMB: Double,
    Impersonation: IImpersonation,
    OverwriteExistingFiles: Boolean,
    TargetFile: String,
    VaultGUID: String
  ): IBackupJob = {
    val __obj = js.Dynamic.literal(BackupType = BackupType.asInstanceOf[js.Any], Clone = Clone.toJsFn, FileSizeLimitInMB = FileSizeLimitInMB.asInstanceOf[js.Any], Impersonation = Impersonation.asInstanceOf[js.Any], OverwriteExistingFiles = OverwriteExistingFiles.asInstanceOf[js.Any], TargetFile = TargetFile.asInstanceOf[js.Any], VaultGUID = VaultGUID.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBackupJob]
  }
  
  extension [Self <: IBackupJob](x: Self) {
    
    inline def setBackupType(value: MFBackupType): Self = StObject.set(x, "BackupType", value.asInstanceOf[js.Any])
    
    inline def setClone(value: CallbackTo[IBackupJob]): Self = StObject.set(x, "Clone", value.toJsFn)
    
    inline def setFileSizeLimitInMB(value: Double): Self = StObject.set(x, "FileSizeLimitInMB", value.asInstanceOf[js.Any])
    
    inline def setImpersonation(value: IImpersonation): Self = StObject.set(x, "Impersonation", value.asInstanceOf[js.Any])
    
    inline def setOverwriteExistingFiles(value: Boolean): Self = StObject.set(x, "OverwriteExistingFiles", value.asInstanceOf[js.Any])
    
    inline def setTargetFile(value: String): Self = StObject.set(x, "TargetFile", value.asInstanceOf[js.Any])
    
    inline def setVaultGUID(value: String): Self = StObject.set(x, "VaultGUID", value.asInstanceOf[js.Any])
  }
}
