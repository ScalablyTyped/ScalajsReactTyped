package typingsJapgolly.winrt.Windows.Storage.Provider

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrt.Windows.Storage.IStorageFile
import typingsJapgolly.winrt.Windows.Storage.StorageFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFileUpdateRequest extends js.Object {
  var contentId: String
  var file: StorageFile
  var status: FileUpdateStatus
  def getDeferral(): FileUpdateRequestDeferral
  def updateLocalFile(value: IStorageFile): Unit
}

object IFileUpdateRequest {
  @scala.inline
  def apply(
    contentId: String,
    file: StorageFile,
    getDeferral: CallbackTo[FileUpdateRequestDeferral],
    status: FileUpdateStatus,
    updateLocalFile: IStorageFile => Callback
  ): IFileUpdateRequest = {
    val __obj = js.Dynamic.literal(contentId = contentId.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("getDeferral")(getDeferral.toJsFn)
    __obj.updateDynamic("updateLocalFile")(js.Any.fromFunction1((t0: typingsJapgolly.winrt.Windows.Storage.IStorageFile) => updateLocalFile(t0).runNow()))
    __obj.asInstanceOf[IFileUpdateRequest]
  }
}

