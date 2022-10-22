package typingsJapgolly.winrt.Windows.Storage.Provider

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrt.Windows.Storage.IStorageFile
import typingsJapgolly.winrt.Windows.Storage.StorageFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IFileUpdateRequest extends StObject {
  
  var contentId: String
  
  var file: StorageFile
  
  def getDeferral(): FileUpdateRequestDeferral
  
  var status: FileUpdateStatus
  
  def updateLocalFile(value: IStorageFile): Unit
}
object IFileUpdateRequest {
  
  inline def apply(
    contentId: String,
    file: StorageFile,
    getDeferral: CallbackTo[FileUpdateRequestDeferral],
    status: FileUpdateStatus,
    updateLocalFile: IStorageFile => Callback
  ): IFileUpdateRequest = {
    val __obj = js.Dynamic.literal(contentId = contentId.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any], getDeferral = getDeferral.toJsFn, status = status.asInstanceOf[js.Any], updateLocalFile = js.Any.fromFunction1((t0: IStorageFile) => updateLocalFile(t0).runNow()))
    __obj.asInstanceOf[IFileUpdateRequest]
  }
  
  extension [Self <: IFileUpdateRequest](x: Self) {
    
    inline def setContentId(value: String): Self = StObject.set(x, "contentId", value.asInstanceOf[js.Any])
    
    inline def setFile(value: StorageFile): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    
    inline def setGetDeferral(value: CallbackTo[FileUpdateRequestDeferral]): Self = StObject.set(x, "getDeferral", value.toJsFn)
    
    inline def setStatus(value: FileUpdateStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setUpdateLocalFile(value: IStorageFile => Callback): Self = StObject.set(x, "updateLocalFile", js.Any.fromFunction1((t0: IStorageFile) => value(t0).runNow()))
  }
}
