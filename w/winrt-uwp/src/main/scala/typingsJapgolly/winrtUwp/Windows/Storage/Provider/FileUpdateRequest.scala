package typingsJapgolly.winrtUwp.Windows.Storage.Provider

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrtUwp.Windows.Storage.IStorageFile
import typingsJapgolly.winrtUwp.Windows.Storage.StorageFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides information about a requested file update so that the app can complete the request. */
trait FileUpdateRequest extends StObject {
  
  /** Gets the unique identifier used to associate the local version of a file with the corresponding remote version. */
  var contentId: String
  
  /** Gets a StorageFile object that represents the locally cached copy of the file to update. */
  var file: StorageFile
  
  /**
    * Gets an object used to complete an update asynchronously.
    * @return The object that the app uses to indicate, asynchronously, that it has finished responding to a FileUpdateRequested event and that the Request is complete.
    */
  def getDeferral(): FileUpdateRequestDeferral
  
  /** Gets or sets the status of the update. This property is set in response to a FileUpdateRequested event. */
  var status: FileUpdateStatus
  
  /**
    * Provide a new version of the local file to represent the remote file.
    * @param value The new version of the local file that will represent remote file.
    */
  def updateLocalFile(value: IStorageFile): Unit
  
  /** Gets or sets a message to the user indicating that user input is needed to complete the FileUpdateRequest . */
  var userInputNeededMessage: String
}
object FileUpdateRequest {
  
  inline def apply(
    contentId: String,
    file: StorageFile,
    getDeferral: CallbackTo[FileUpdateRequestDeferral],
    status: FileUpdateStatus,
    updateLocalFile: IStorageFile => Callback,
    userInputNeededMessage: String
  ): FileUpdateRequest = {
    val __obj = js.Dynamic.literal(contentId = contentId.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any], getDeferral = getDeferral.toJsFn, status = status.asInstanceOf[js.Any], updateLocalFile = js.Any.fromFunction1((t0: IStorageFile) => updateLocalFile(t0).runNow()), userInputNeededMessage = userInputNeededMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileUpdateRequest]
  }
  
  extension [Self <: FileUpdateRequest](x: Self) {
    
    inline def setContentId(value: String): Self = StObject.set(x, "contentId", value.asInstanceOf[js.Any])
    
    inline def setFile(value: StorageFile): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    
    inline def setGetDeferral(value: CallbackTo[FileUpdateRequestDeferral]): Self = StObject.set(x, "getDeferral", value.toJsFn)
    
    inline def setStatus(value: FileUpdateStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setUpdateLocalFile(value: IStorageFile => Callback): Self = StObject.set(x, "updateLocalFile", js.Any.fromFunction1((t0: IStorageFile) => value(t0).runNow()))
    
    inline def setUserInputNeededMessage(value: String): Self = StObject.set(x, "userInputNeededMessage", value.asInstanceOf[js.Any])
  }
}
