package typingsJapgolly.mfiles

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IVaultAutomaticMetadataOperations extends js.Object {
  def GetAutomaticMetadataForObject(ObjVer: IObjVer): IAutomaticMetadataResult
  def GetAutomaticMetadataForTemporaryFile(UploadSessionID: Double): IAutomaticMetadataResult
  def GetAutomaticMetadataForTemporaryFiles(IIDs: IIDs): IAutomaticMetadataResult
}

object IVaultAutomaticMetadataOperations {
  @scala.inline
  def apply(
    GetAutomaticMetadataForObject: IObjVer => CallbackTo[IAutomaticMetadataResult],
    GetAutomaticMetadataForTemporaryFile: Double => CallbackTo[IAutomaticMetadataResult],
    GetAutomaticMetadataForTemporaryFiles: IIDs => CallbackTo[IAutomaticMetadataResult]
  ): IVaultAutomaticMetadataOperations = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("GetAutomaticMetadataForObject")(js.Any.fromFunction1((t0: typingsJapgolly.mfiles.IObjVer) => GetAutomaticMetadataForObject(t0).runNow()))
    __obj.updateDynamic("GetAutomaticMetadataForTemporaryFile")(js.Any.fromFunction1((t0: scala.Double) => GetAutomaticMetadataForTemporaryFile(t0).runNow()))
    __obj.updateDynamic("GetAutomaticMetadataForTemporaryFiles")(js.Any.fromFunction1((t0: typingsJapgolly.mfiles.IIDs) => GetAutomaticMetadataForTemporaryFiles(t0).runNow()))
    __obj.asInstanceOf[IVaultAutomaticMetadataOperations]
  }
}

