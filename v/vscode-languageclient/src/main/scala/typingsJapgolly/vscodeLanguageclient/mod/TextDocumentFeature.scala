package typingsJapgolly.vscodeLanguageclient.mod

import typingsJapgolly.vscodeLanguageserverProtocol.protocolMod.TextDocumentRegistrationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageclient", "TextDocumentFeature")
@js.native
abstract class TextDocumentFeature[T /* <: TextDocumentRegistrationOptions */] protected ()
  extends typingsJapgolly.vscodeLanguageclient.clientMod.TextDocumentFeature[T] {
  def this(
    _client: typingsJapgolly.vscodeLanguageclient.clientMod.BaseLanguageClient,
    _message: typingsJapgolly.vscodeJsonrpc.messagesMod.MessageType
  ) = this()
}

