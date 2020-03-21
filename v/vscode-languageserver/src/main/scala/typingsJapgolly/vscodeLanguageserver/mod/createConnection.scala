package typingsJapgolly.vscodeLanguageserver.mod

import typingsJapgolly.node.NodeJS.ReadableStream
import typingsJapgolly.node.NodeJS.WritableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver", "createConnection")
@js.native
object createConnection extends js.Object {
  def apply(): IConnection = js.native
  def apply(inputStream: ReadableStream, outputStream: WritableStream): IConnection = js.native
  def apply(
    inputStream: ReadableStream,
    outputStream: WritableStream,
    strategy: typingsJapgolly.vscodeJsonrpc.mod.ConnectionStrategy
  ): IConnection = js.native
  def apply(
    reader: typingsJapgolly.vscodeJsonrpc.messageReaderMod.MessageReader,
    writer: typingsJapgolly.vscodeJsonrpc.messageWriterMod.MessageWriter
  ): IConnection = js.native
  def apply(
    reader: typingsJapgolly.vscodeJsonrpc.messageReaderMod.MessageReader,
    writer: typingsJapgolly.vscodeJsonrpc.messageWriterMod.MessageWriter,
    strategy: typingsJapgolly.vscodeJsonrpc.mod.ConnectionStrategy
  ): IConnection = js.native
  def apply(strategy: typingsJapgolly.vscodeJsonrpc.mod.ConnectionStrategy): IConnection = js.native
  def apply[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace](factories: Features[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace]): Connection[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace] = js.native
  def apply[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace](
    factories: Features[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace],
    inputStream: ReadableStream,
    outputStream: WritableStream
  ): Connection[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace] = js.native
  def apply[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace](
    factories: Features[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace],
    inputStream: ReadableStream,
    outputStream: WritableStream,
    strategy: typingsJapgolly.vscodeJsonrpc.mod.ConnectionStrategy
  ): Connection[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace] = js.native
  def apply[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace](
    factories: Features[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace],
    reader: typingsJapgolly.vscodeJsonrpc.messageReaderMod.MessageReader,
    writer: typingsJapgolly.vscodeJsonrpc.messageWriterMod.MessageWriter
  ): Connection[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace] = js.native
  def apply[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace](
    factories: Features[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace],
    reader: typingsJapgolly.vscodeJsonrpc.messageReaderMod.MessageReader,
    writer: typingsJapgolly.vscodeJsonrpc.messageWriterMod.MessageWriter,
    strategy: typingsJapgolly.vscodeJsonrpc.mod.ConnectionStrategy
  ): Connection[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace] = js.native
  def apply[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace](
    factories: Features[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace],
    strategy: typingsJapgolly.vscodeJsonrpc.mod.ConnectionStrategy
  ): Connection[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace] = js.native
}

