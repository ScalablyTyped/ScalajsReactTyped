package typingsJapgolly.umbraco.umbraco.services

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
trait IFileManager extends js.Object {
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
  @scala.inline
  def apply(
    clearFiles: Callback,
    getFiles: CallbackTo[js.Array[IFile]],
    setFiles: (String, js.Array[IFile]) => Callback
  ): IFileManager = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("clearFiles")(clearFiles.toJsFn)
    __obj.updateDynamic("getFiles")(getFiles.toJsFn)
    __obj.updateDynamic("setFiles")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Array[typingsJapgolly.umbraco.umbraco.services.IFile]) => setFiles(t0, t1).runNow()))
    __obj.asInstanceOf[IFileManager]
  }
}

