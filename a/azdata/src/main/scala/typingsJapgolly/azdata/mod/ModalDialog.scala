package typingsJapgolly.azdata.mod

import typingsJapgolly.vscode.Thenable
import typingsJapgolly.vscode.mod.Disposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModalDialog extends js.Object {
  /**
  		 * The caption of the Close button.
  		 */
  var closeTitle: String = js.native
  /**
  		 * Contents of the dialog body.
  		 */
  var html: String = js.native
  /**
  		 * The caption of the OK button.
  		 */
  var okTitle: String = js.native
  /**
  		 * Title of the webview.
  		 */
  var title: String = js.native
  /**
  		 * Closes the dialog.
  		 */
  def close(): Unit = js.native
  /**
  		 * Raised when dialog closed.
  		 */
  def onClosed(listener: js.Function1[/* e */ js.Any, _]): Disposable = js.native
  def onClosed(listener: js.Function1[/* e */ js.Any, _], thisArgs: js.Any): Disposable = js.native
  def onClosed(listener: js.Function1[/* e */ js.Any, _], thisArgs: js.Any, disposables: js.Array[Disposable]): Disposable = js.native
  /**
  		 * Raised when the webview posts a message.
  		 */
  def onMessage(listener: js.Function1[/* e */ js.Any, _]): Disposable = js.native
  def onMessage(listener: js.Function1[/* e */ js.Any, _], thisArgs: js.Any): Disposable = js.native
  def onMessage(listener: js.Function1[/* e */ js.Any, _], thisArgs: js.Any, disposables: js.Array[Disposable]): Disposable = js.native
  /**
  		 * Opens the dialog.
  		 */
  def open(): Unit = js.native
  /**
  		 * Post a message to the dialog.
  		 *
  		 * @param message Body of the message.
  		 */
  def postMessage(message: js.Any): Thenable[_] = js.native
}

