package typingsJapgolly.vscode.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UriHandler extends js.Object {
  /**
  		 * Handle the provided system-wide [uri](#Uri).
  		 *
  		 * @see [window.registerUriHandler](#window.registerUriHandler).
  		 */
  def handleUri(uri: Uri): ProviderResult[Unit]
}

object UriHandler {
  @scala.inline
  def apply(handleUri: Uri => CallbackTo[ProviderResult[Unit]]): UriHandler = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("handleUri")(js.Any.fromFunction1((t0: typingsJapgolly.vscode.mod.Uri) => handleUri(t0).runNow()))
    __obj.asInstanceOf[UriHandler]
  }
}

