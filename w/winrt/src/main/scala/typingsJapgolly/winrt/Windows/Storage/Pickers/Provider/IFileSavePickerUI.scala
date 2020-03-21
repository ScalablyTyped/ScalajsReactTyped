package typingsJapgolly.winrt.Windows.Storage.Pickers.Provider

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrt.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFileSavePickerUI extends js.Object {
  var allowedFileTypes: IVectorView[String]
  var fileName: String
  var onfilenamechanged: js.Any
  var ontargetfilerequested: js.Any
  var settingsIdentifier: String
  var title: String
  def trySetFileName(value: String): SetFileNameResult
}

object IFileSavePickerUI {
  @scala.inline
  def apply(
    allowedFileTypes: IVectorView[String],
    fileName: String,
    onfilenamechanged: js.Any,
    ontargetfilerequested: js.Any,
    settingsIdentifier: String,
    title: String,
    trySetFileName: String => CallbackTo[SetFileNameResult]
  ): IFileSavePickerUI = {
    val __obj = js.Dynamic.literal(allowedFileTypes = allowedFileTypes.asInstanceOf[js.Any], fileName = fileName.asInstanceOf[js.Any], onfilenamechanged = onfilenamechanged.asInstanceOf[js.Any], ontargetfilerequested = ontargetfilerequested.asInstanceOf[js.Any], settingsIdentifier = settingsIdentifier.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("trySetFileName")(js.Any.fromFunction1((t0: java.lang.String) => trySetFileName(t0).runNow()))
    __obj.asInstanceOf[IFileSavePickerUI]
  }
}

