package typingsJapgolly.vscodeJsonrpc.mod

import typingsJapgolly.node.NodeJS.ReadableStream
import typingsJapgolly.node.NodeJS.WritableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-jsonrpc", "createMessageConnection")
@js.native
object createMessageConnection extends js.Object {
  def apply(inputStream: ReadableStream, outputStream: WritableStream): MessageConnection = js.native
  def apply(inputStream: ReadableStream, outputStream: WritableStream, logger: Logger): MessageConnection = js.native
  def apply(
    inputStream: ReadableStream,
    outputStream: WritableStream,
    logger: Logger,
    strategy: ConnectionStrategy
  ): MessageConnection = js.native
  def apply(
    reader: typingsJapgolly.vscodeJsonrpc.messageReaderMod.MessageReader,
    writer: typingsJapgolly.vscodeJsonrpc.messageWriterMod.MessageWriter
  ): MessageConnection = js.native
  def apply(
    reader: typingsJapgolly.vscodeJsonrpc.messageReaderMod.MessageReader,
    writer: typingsJapgolly.vscodeJsonrpc.messageWriterMod.MessageWriter,
    logger: Logger
  ): MessageConnection = js.native
  def apply(
    reader: typingsJapgolly.vscodeJsonrpc.messageReaderMod.MessageReader,
    writer: typingsJapgolly.vscodeJsonrpc.messageWriterMod.MessageWriter,
    logger: Logger,
    strategy: ConnectionStrategy
  ): MessageConnection = js.native
}

