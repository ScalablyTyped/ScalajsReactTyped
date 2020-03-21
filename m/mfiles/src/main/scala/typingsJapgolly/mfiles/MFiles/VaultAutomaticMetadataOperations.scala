package typingsJapgolly.mfiles.MFiles

import org.scalablytyped.runtime.Instantiable0
import typingsJapgolly.mfiles.IAutomaticMetadataResult
import typingsJapgolly.mfiles.IIDs
import typingsJapgolly.mfiles.IObjVer
import typingsJapgolly.mfiles.IVaultAutomaticMetadataOperations
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MFiles.VaultAutomaticMetadataOperations")
@js.native
class VaultAutomaticMetadataOperations () extends IVaultAutomaticMetadataOperations {
  /* CompleteClass */
  override def GetAutomaticMetadataForObject(ObjVer: IObjVer): IAutomaticMetadataResult = js.native
  /* CompleteClass */
  override def GetAutomaticMetadataForTemporaryFile(UploadSessionID: Double): IAutomaticMetadataResult = js.native
  /* CompleteClass */
  override def GetAutomaticMetadataForTemporaryFiles(IIDs: IIDs): IAutomaticMetadataResult = js.native
}

@JSGlobal("MFiles.VaultAutomaticMetadataOperations")
@js.native
object VaultAutomaticMetadataOperations extends Instantiable0[IVaultAutomaticMetadataOperations]

