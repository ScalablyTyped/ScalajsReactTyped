package typingsJapgolly.winrt.Windows.Storage.Provider

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrt.Windows.Storage.IStorageFile
import typingsJapgolly.winrt.Windows.Storage.StorageFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileUpdateRequest
  extends StObject
     with IFileUpdateRequest
object FileUpdateRequest {
  
  inline def apply(
    contentId: String,
    file: StorageFile,
    getDeferral: CallbackTo[FileUpdateRequestDeferral],
    status: FileUpdateStatus,
    updateLocalFile: IStorageFile => Callback
  ): FileUpdateRequest = {
    val __obj = js.Dynamic.literal(contentId = contentId.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any], getDeferral = getDeferral.toJsFn, status = status.asInstanceOf[js.Any], updateLocalFile = js.Any.fromFunction1((t0: IStorageFile) => updateLocalFile(t0).runNow()))
    __obj.asInstanceOf[FileUpdateRequest]
  }
}
