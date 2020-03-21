package typingsJapgolly.mfiles.MFiles

import org.scalablytyped.runtime.Instantiable0
import typingsJapgolly.mfiles.IImpersonation
import typingsJapgolly.mfiles.IRestoreJob
import typingsJapgolly.mfiles.IVaultProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MFiles.RestoreJob")
@js.native
class RestoreJob () extends IRestoreJob {
  /* CompleteClass */
  override var BackupFileDifferential: String = js.native
  /* CompleteClass */
  override var BackupFileFull: String = js.native
  /* CompleteClass */
  override var Impersonation: IImpersonation = js.native
  /* CompleteClass */
  override var OverwriteExistingFiles: Boolean = js.native
  /* CompleteClass */
  override var VaultProperties: IVaultProperties = js.native
}

@JSGlobal("MFiles.RestoreJob")
@js.native
object RestoreJob extends Instantiable0[IRestoreJob]

