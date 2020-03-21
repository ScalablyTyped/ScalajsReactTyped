package typingsJapgolly.vscodeLanguageserver.mod

import typingsJapgolly.node.NodeJS.ReadableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver", "StreamMessageReader")
@js.native
class StreamMessageReader protected ()
  extends typingsJapgolly.vscodeLanguageserverProtocol.mod.StreamMessageReader {
  def this(readable: ReadableStream) = this()
  def this(readable: ReadableStream, encoding: String) = this()
}

