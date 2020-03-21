package typingsJapgolly.vscodeLanguageclient.clientMod

import typingsJapgolly.node.NodeJS.WritableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageclient/lib/client", "StreamMessageWriter")
@js.native
class StreamMessageWriter protected ()
  extends typingsJapgolly.vscodeLanguageserverProtocol.mod.StreamMessageWriter {
  def this(writable: WritableStream) = this()
  def this(writable: WritableStream, encoding: String) = this()
}

