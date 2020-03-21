package typingsJapgolly.vscodeLanguageclient.workspaceFoldersMod

import typingsJapgolly.vscodeJsonrpc.messagesMod.MessageType
import typingsJapgolly.vscodeLanguageclient.clientMod.BaseLanguageClient
import typingsJapgolly.vscodeLanguageclient.clientMod.DynamicFeature
import typingsJapgolly.vscodeLanguageserverProtocol.protocolMod.InitializeParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageclient/lib/workspaceFolders", "WorkspaceFoldersFeature")
@js.native
class WorkspaceFoldersFeature protected ()
  extends DynamicFeature[js.UndefOr[scala.Nothing]] {
  def this(_client: BaseLanguageClient) = this()
  var _client: js.Any = js.native
  var _listeners: js.Any = js.native
  var asProtocol: js.Any = js.native
  @JSName("messages")
  val messages_WorkspaceFoldersFeature: MessageType = js.native
  @JSName("fillInitializeParams")
  def fillInitializeParams_MWorkspaceFoldersFeature(params: InitializeParams): Unit = js.native
}

