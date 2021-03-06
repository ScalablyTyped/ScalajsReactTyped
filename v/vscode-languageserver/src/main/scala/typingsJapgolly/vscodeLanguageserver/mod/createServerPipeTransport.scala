package typingsJapgolly.vscodeLanguageserver.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver", "createServerPipeTransport")
@js.native
object createServerPipeTransport extends js.Object {
  def apply(pipeName: String): js.Tuple2[
    typingsJapgolly.vscodeJsonrpc.messageReaderMod.MessageReader, 
    typingsJapgolly.vscodeJsonrpc.messageWriterMod.MessageWriter
  ] = js.native
  def apply(pipeName: String, encoding: String): js.Tuple2[
    typingsJapgolly.vscodeJsonrpc.messageReaderMod.MessageReader, 
    typingsJapgolly.vscodeJsonrpc.messageWriterMod.MessageWriter
  ] = js.native
}

