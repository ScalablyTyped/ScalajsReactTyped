package typingsJapgolly.vscodeJsonrpc.mod

import typingsJapgolly.node.NodeJS.ReadableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-jsonrpc", "StreamMessageReader")
@js.native
class StreamMessageReader protected ()
  extends typingsJapgolly.vscodeJsonrpc.messageReaderMod.StreamMessageReader {
  def this(readable: ReadableStream) = this()
  def this(readable: ReadableStream, encoding: String) = this()
}

