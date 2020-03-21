package typingsJapgolly.winrt.Windows.Storage.Pickers.Provider

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrt.Windows.Foundation.Collections.IVectorView
import typingsJapgolly.winrt.Windows.Storage.IStorageFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFileOpenPickerUI extends js.Object {
  var allowedFileTypes: IVectorView[String]
  var onclosing: js.Any
  var onfileremoved: js.Any
  var selectionMode: FileSelectionMode
  var settingsIdentifier: String
  var title: String
  def addFile(id: String, file: IStorageFile): AddFileResult
  def canAddFile(file: IStorageFile): Boolean
  def containsFile(id: String): Boolean
  def removeFile(id: String): Unit
}

object IFileOpenPickerUI {
  @scala.inline
  def apply(
    addFile: (String, IStorageFile) => CallbackTo[AddFileResult],
    allowedFileTypes: IVectorView[String],
    canAddFile: IStorageFile => CallbackTo[Boolean],
    containsFile: String => CallbackTo[Boolean],
    onclosing: js.Any,
    onfileremoved: js.Any,
    removeFile: String => Callback,
    selectionMode: FileSelectionMode,
    settingsIdentifier: String,
    title: String
  ): IFileOpenPickerUI = {
    val __obj = js.Dynamic.literal(allowedFileTypes = allowedFileTypes.asInstanceOf[js.Any], onclosing = onclosing.asInstanceOf[js.Any], onfileremoved = onfileremoved.asInstanceOf[js.Any], selectionMode = selectionMode.asInstanceOf[js.Any], settingsIdentifier = settingsIdentifier.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("addFile")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.winrt.Windows.Storage.IStorageFile) => addFile(t0, t1).runNow()))
    __obj.updateDynamic("canAddFile")(js.Any.fromFunction1((t0: typingsJapgolly.winrt.Windows.Storage.IStorageFile) => canAddFile(t0).runNow()))
    __obj.updateDynamic("containsFile")(js.Any.fromFunction1((t0: java.lang.String) => containsFile(t0).runNow()))
    __obj.updateDynamic("removeFile")(js.Any.fromFunction1((t0: java.lang.String) => removeFile(t0).runNow()))
    __obj.asInstanceOf[IFileOpenPickerUI]
  }
}

