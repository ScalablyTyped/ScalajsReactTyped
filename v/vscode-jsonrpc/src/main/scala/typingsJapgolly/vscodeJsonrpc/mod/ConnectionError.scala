package typingsJapgolly.vscodeJsonrpc.mod

import typingsJapgolly.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-jsonrpc", "ConnectionError")
@js.native
class ConnectionError protected () extends Error {
  def this(code: ConnectionErrors, message: String) = this()
  val code: ConnectionErrors = js.native
  /* CompleteClass */
  override var message: String = js.native
  /* CompleteClass */
  override var name: String = js.native
}

