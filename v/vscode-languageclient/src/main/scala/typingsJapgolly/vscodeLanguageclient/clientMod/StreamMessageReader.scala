package typingsJapgolly.vscodeLanguageclient.clientMod

import typingsJapgolly.node.NodeJS.ReadableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageclient/lib/client", "StreamMessageReader")
@js.native
class StreamMessageReader protected ()
  extends typingsJapgolly.vscodeLanguageserverProtocol.mod.StreamMessageReader {
  def this(readable: ReadableStream) = this()
  def this(readable: ReadableStream, encoding: String) = this()
}

