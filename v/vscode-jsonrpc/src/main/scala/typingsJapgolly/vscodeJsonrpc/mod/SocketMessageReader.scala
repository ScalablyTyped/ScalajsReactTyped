package typingsJapgolly.vscodeJsonrpc.mod

import typingsJapgolly.node.netMod.Socket
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-jsonrpc", "SocketMessageReader")
@js.native
class SocketMessageReader protected ()
  extends typingsJapgolly.vscodeJsonrpc.messageReaderMod.SocketMessageReader {
  def this(socket: Socket) = this()
  def this(socket: Socket, encoding: String) = this()
}

