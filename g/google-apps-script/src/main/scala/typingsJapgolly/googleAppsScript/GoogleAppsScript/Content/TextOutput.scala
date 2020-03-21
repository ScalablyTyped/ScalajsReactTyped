package typingsJapgolly.googleAppsScript.GoogleAppsScript.Content

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A TextOutput object that can be served from a script.
  *
  * Due to security considerations, scripts cannot directly return text content to a browser.
  * Instead, the browser is redirected to googleusercontent.com, which will display it without any
  * further sanitization or manipulation.
  *
  * You can return text content like this:
  *
  *     function doGet() {
  *       return ContentService.createTextOutput("hello world!");
  *     }
  *
  * ContentService
  */
trait TextOutput extends js.Object {
  def append(addedContent: String): TextOutput
  def clear(): TextOutput
  def downloadAsFile(filename: String): TextOutput
  def getContent(): String
  def getFileName(): String
  def getMimeType(): MimeType
  def setContent(content: String): TextOutput
  def setMimeType(mimeType: MimeType): TextOutput
}

object TextOutput {
  @scala.inline
  def apply(
    append: String => CallbackTo[TextOutput],
    clear: CallbackTo[TextOutput],
    downloadAsFile: String => CallbackTo[TextOutput],
    getContent: CallbackTo[String],
    getFileName: CallbackTo[String],
    getMimeType: CallbackTo[MimeType],
    setContent: String => CallbackTo[TextOutput],
    setMimeType: MimeType => CallbackTo[TextOutput]
  ): TextOutput = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("append")(js.Any.fromFunction1((t0: java.lang.String) => append(t0).runNow()))
    __obj.updateDynamic("clear")(clear.toJsFn)
    __obj.updateDynamic("downloadAsFile")(js.Any.fromFunction1((t0: java.lang.String) => downloadAsFile(t0).runNow()))
    __obj.updateDynamic("getContent")(getContent.toJsFn)
    __obj.updateDynamic("getFileName")(getFileName.toJsFn)
    __obj.updateDynamic("getMimeType")(getMimeType.toJsFn)
    __obj.updateDynamic("setContent")(js.Any.fromFunction1((t0: java.lang.String) => setContent(t0).runNow()))
    __obj.updateDynamic("setMimeType")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.Content.MimeType) => setMimeType(t0).runNow()))
    __obj.asInstanceOf[TextOutput]
  }
}

