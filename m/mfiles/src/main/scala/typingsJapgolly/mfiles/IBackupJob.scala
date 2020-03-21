package typingsJapgolly.mfiles

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.mfiles.MFiles.MFBackupType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBackupJob extends js.Object {
  var BackupType: MFBackupType
  var FileSizeLimitInMB: Double
  var Impersonation: IImpersonation
  var OverwriteExistingFiles: Boolean
  var TargetFile: String
  var VaultGUID: String
  def Clone(): IBackupJob
}

object IBackupJob {
  @scala.inline
  def apply(
    BackupType: MFBackupType,
    Clone: CallbackTo[IBackupJob],
    FileSizeLimitInMB: Double,
    Impersonation: IImpersonation,
    OverwriteExistingFiles: Boolean,
    TargetFile: String,
    VaultGUID: String
  ): IBackupJob = {
    val __obj = js.Dynamic.literal(BackupType = BackupType.asInstanceOf[js.Any], FileSizeLimitInMB = FileSizeLimitInMB.asInstanceOf[js.Any], Impersonation = Impersonation.asInstanceOf[js.Any], OverwriteExistingFiles = OverwriteExistingFiles.asInstanceOf[js.Any], TargetFile = TargetFile.asInstanceOf[js.Any], VaultGUID = VaultGUID.asInstanceOf[js.Any])
    __obj.updateDynamic("Clone")(Clone.toJsFn)
    __obj.asInstanceOf[IBackupJob]
  }
}

