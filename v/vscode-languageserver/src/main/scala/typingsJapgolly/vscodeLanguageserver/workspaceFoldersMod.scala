package typingsJapgolly.vscodeLanguageserver

import typingsJapgolly.vscodeJsonrpc.eventsMod.Disposable
import typingsJapgolly.vscodeJsonrpc.eventsMod.Event
import typingsJapgolly.vscodeLanguageserver.mod.Feature
import typingsJapgolly.vscodeLanguageserver.mod._RemoteWorkspace
import typingsJapgolly.vscodeLanguageserverProtocol.protocolWorkspaceFoldersMod.WorkspaceFolder
import typingsJapgolly.vscodeLanguageserverProtocol.protocolWorkspaceFoldersMod.WorkspaceFoldersChangeEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver/lib/workspaceFolders", JSImport.Namespace)
@js.native
object workspaceFoldersMod extends js.Object {
  @js.native
  trait WorkspaceFolders extends js.Object {
    @JSName("onDidChangeWorkspaceFolders")
    var onDidChangeWorkspaceFolders_Original: Event[WorkspaceFoldersChangeEvent] = js.native
    def getWorkspaceFolders(): Thenable[js.Array[WorkspaceFolder] | Null] = js.native
    def onDidChangeWorkspaceFolders(listener: js.Function1[/* e */ WorkspaceFoldersChangeEvent, _]): Disposable = js.native
    def onDidChangeWorkspaceFolders(listener: js.Function1[/* e */ WorkspaceFoldersChangeEvent, _], thisArgs: js.Any): Disposable = js.native
    def onDidChangeWorkspaceFolders(
      listener: js.Function1[/* e */ WorkspaceFoldersChangeEvent, _],
      thisArgs: js.Any,
      disposables: js.Array[Disposable]
    ): Disposable = js.native
  }
  
  val WorkspaceFoldersFeature: Feature[_RemoteWorkspace, WorkspaceFolders] = js.native
}

