package typingsJapgolly.vscodeLanguageclient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageclient", "createServerSocketTransport")
@js.native
object createServerSocketTransport extends js.Object {
  def apply(port: Double): js.Tuple2[
    typingsJapgolly.vscodeJsonrpc.messageReaderMod.MessageReader, 
    typingsJapgolly.vscodeJsonrpc.messageWriterMod.MessageWriter
  ] = js.native
  def apply(port: Double, encoding: String): js.Tuple2[
    typingsJapgolly.vscodeJsonrpc.messageReaderMod.MessageReader, 
    typingsJapgolly.vscodeJsonrpc.messageWriterMod.MessageWriter
  ] = js.native
}

