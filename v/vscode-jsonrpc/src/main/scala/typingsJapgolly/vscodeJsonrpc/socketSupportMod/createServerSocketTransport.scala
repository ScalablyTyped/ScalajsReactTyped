package typingsJapgolly.vscodeJsonrpc.socketSupportMod

import typingsJapgolly.vscodeJsonrpc.messageReaderMod.MessageReader
import typingsJapgolly.vscodeJsonrpc.messageWriterMod.MessageWriter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-jsonrpc/lib/socketSupport", "createServerSocketTransport")
@js.native
object createServerSocketTransport extends js.Object {
  def apply(port: Double): js.Tuple2[MessageReader, MessageWriter] = js.native
  def apply(port: Double, encoding: String): js.Tuple2[MessageReader, MessageWriter] = js.native
}

