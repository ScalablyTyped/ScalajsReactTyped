package typingsJapgolly.vscodeLanguageserver.mod

import typingsJapgolly.vscodeLanguageserver.AnonWindow
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver", "ErrorMessageTracker")
@js.native
class ErrorMessageTracker () extends js.Object {
  var _messages: js.Any = js.native
  /**
    * Add a message to the tracker.
    *
    * @param message The message to add.
    */
  def add(message: String): Unit = js.native
  /**
    * Send all tracked messages to the connection's window.
    *
    * @param connection The connection established between client and server.
    */
  def sendErrors(connection: AnonWindow): Unit = js.native
}

