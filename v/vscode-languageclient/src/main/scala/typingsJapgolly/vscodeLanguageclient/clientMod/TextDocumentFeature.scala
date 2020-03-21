package typingsJapgolly.vscodeLanguageclient.clientMod

import typingsJapgolly.std.Map
import typingsJapgolly.vscodeLanguageserverProtocol.protocolMod.TextDocumentRegistrationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageclient/lib/client", "TextDocumentFeature")
@js.native
abstract class TextDocumentFeature[T /* <: TextDocumentRegistrationOptions */] protected () extends DynamicFeature[T] {
  def this(_client: BaseLanguageClient, _message: typingsJapgolly.vscodeJsonrpc.messagesMod.MessageType) = this()
  var _client: BaseLanguageClient = js.native
  var _message: js.Any = js.native
  var _providers: Map[String, typingsJapgolly.vscode.mod.Disposable] = js.native
  @JSName("messages")
  val messages_TextDocumentFeature: typingsJapgolly.vscodeJsonrpc.messagesMod.MessageType = js.native
  /* protected */ def registerLanguageProvider(options: T): typingsJapgolly.vscode.mod.Disposable = js.native
}

