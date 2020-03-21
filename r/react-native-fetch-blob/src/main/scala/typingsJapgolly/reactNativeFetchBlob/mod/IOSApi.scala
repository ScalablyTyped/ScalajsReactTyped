package typingsJapgolly.reactNativeFetchBlob.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOSApi extends js.Object {
  /**
    * Show options menu for interact with the file.
    * @param path This is a required field, the path to the document. The path should NOT contains any scheme prefix.
    */
  def openDocument(path: String): Unit
  /**
    * Open a file in {@link https://developer.apple.com/reference/uikit/uidocumentinteractioncontroller UIDocumentInteractionController},
    * this is the default document viewer of iOS, supports several kinds of files. On Android, there's an similar method {@link android.actionViewIntent}.
    * @param path This is a required field, the path to the document. The path should NOT contains any scheme prefix.
    */
  def previewDocument(path: String): Unit
}

object IOSApi {
  @scala.inline
  def apply(openDocument: String => Callback, previewDocument: String => Callback): IOSApi = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("openDocument")(js.Any.fromFunction1((t0: java.lang.String) => openDocument(t0).runNow()))
    __obj.updateDynamic("previewDocument")(js.Any.fromFunction1((t0: java.lang.String) => previewDocument(t0).runNow()))
    __obj.asInstanceOf[IOSApi]
  }
}

