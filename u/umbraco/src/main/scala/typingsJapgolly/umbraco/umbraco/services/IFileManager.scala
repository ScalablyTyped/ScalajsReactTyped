package typingsJapgolly.umbraco.umbraco.services

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @ngdoc service
  * @name umbraco.services.fileManager
  * @function
  *
  * @description
  * Used by editors to manage any files that require uploading with the posted data, normally called by property editors
  * that need to attach files.
  * When a route changes successfully, we ensure that the collection is cleared.
  */
trait IFileManager extends StObject {
  
  /**
    * @ngdoc function
    * @name umbraco.services.fileManager#clearFiles
    * @methodOf umbraco.services.fileManager
    * @function
    *
    * @description
    *  Removes all files from the manager
    */
  def clearFiles(): Unit
  
  /**
    * @ngdoc function
    * @name umbraco.services.fileManager#getFiles
    * @methodOf umbraco.services.fileManager
    * @function
    *
    * @description
    *  Returns all of the files attached to the file manager
    */
  def getFiles(): js.Array[IFile]
  
  /**
    * @ngdoc function
    * @name umbraco.services.fileManager#addFiles
    * @methodOf umbraco.services.fileManager
    * @function
    *
    * @description
    *  Attaches files to the current manager for the current editor for a particular property, if an empty array is set
    *   for the files collection that effectively clears the files for the specified editor.
    */
  def setFiles(propertyAlias: String, files: js.Array[IFile]): Unit
}
object IFileManager {
  
  inline def apply(
    clearFiles: Callback,
    getFiles: CallbackTo[js.Array[IFile]],
    setFiles: (String, js.Array[IFile]) => Callback
  ): IFileManager = {
    val __obj = js.Dynamic.literal(clearFiles = clearFiles.toJsFn, getFiles = getFiles.toJsFn, setFiles = js.Any.fromFunction2((t0: String, t1: js.Array[IFile]) => (setFiles(t0, t1)).runNow()))
    __obj.asInstanceOf[IFileManager]
  }
  
  extension [Self <: IFileManager](x: Self) {
    
    inline def setClearFiles(value: Callback): Self = StObject.set(x, "clearFiles", value.toJsFn)
    
    inline def setGetFiles(value: CallbackTo[js.Array[IFile]]): Self = StObject.set(x, "getFiles", value.toJsFn)
    
    inline def setSetFiles(value: (String, js.Array[IFile]) => Callback): Self = StObject.set(x, "setFiles", js.Any.fromFunction2((t0: String, t1: js.Array[IFile]) => (value(t0, t1)).runNow()))
  }
}
