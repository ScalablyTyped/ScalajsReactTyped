package typingsJapgolly.vscodeJsonrpc.messagesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-jsonrpc/lib/messages", "RequestType0")
@js.native
class RequestType0[R, E, RO] protected () extends AbstractMessageType {
  def this(method: String) = this()
  @JSName("_")
  val _underscore: js.UndefOr[js.Tuple4[R, E, RO, _EM]] = js.native
}

