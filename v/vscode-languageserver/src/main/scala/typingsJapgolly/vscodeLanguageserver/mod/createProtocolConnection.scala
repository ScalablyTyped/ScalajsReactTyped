package typingsJapgolly.vscodeLanguageserver.mod

import typingsJapgolly.vscodeJsonrpc.mod.Logger
import typingsJapgolly.vscodeLanguageserverProtocol.mod.ProtocolConnection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver", "createProtocolConnection")
@js.native
object createProtocolConnection extends js.Object {
  def apply(
    reader: typingsJapgolly.vscodeJsonrpc.messageReaderMod.MessageReader,
    writer: typingsJapgolly.vscodeJsonrpc.messageWriterMod.MessageWriter,
    logger: Logger
  ): ProtocolConnection = js.native
  def apply(
    reader: typingsJapgolly.vscodeJsonrpc.messageReaderMod.MessageReader,
    writer: typingsJapgolly.vscodeJsonrpc.messageWriterMod.MessageWriter,
    logger: Logger,
    strategy: typingsJapgolly.vscodeJsonrpc.mod.ConnectionStrategy
  ): ProtocolConnection = js.native
}

