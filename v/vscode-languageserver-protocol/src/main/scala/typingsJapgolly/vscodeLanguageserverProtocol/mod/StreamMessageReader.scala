package typingsJapgolly.vscodeLanguageserverProtocol.mod

import typingsJapgolly.node.NodeJS.ReadableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver-protocol", "StreamMessageReader")
@js.native
class StreamMessageReader protected ()
  extends typingsJapgolly.vscodeJsonrpc.mod.StreamMessageReader {
  def this(readable: ReadableStream) = this()
  def this(readable: ReadableStream, encoding: String) = this()
}

