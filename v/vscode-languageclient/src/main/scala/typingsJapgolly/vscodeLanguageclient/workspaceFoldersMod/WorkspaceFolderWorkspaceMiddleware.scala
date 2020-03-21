package typingsJapgolly.vscodeLanguageclient.workspaceFoldersMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.vscode.mod.WorkspaceFoldersChangeEvent
import typingsJapgolly.vscodeJsonrpc.cancellationMod.CancellationToken
import typingsJapgolly.vscodeJsonrpc.mod.HandlerResult
import typingsJapgolly.vscodeLanguageclient.clientMod.NextSignature
import typingsJapgolly.vscodeLanguageserverProtocol.protocolWorkspaceFoldersMod.WorkspaceFolder
import typingsJapgolly.vscodeLanguageserverProtocol.protocolWorkspaceFoldersMod.WorkspaceFoldersRequest.HandlerSignature
import typingsJapgolly.vscodeLanguageserverProtocol.protocolWorkspaceFoldersMod.WorkspaceFoldersRequest.MiddlewareSignature
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkspaceFolderWorkspaceMiddleware extends js.Object {
  var didChangeWorkspaceFolders: js.UndefOr[NextSignature[WorkspaceFoldersChangeEvent, Unit]] = js.undefined
  var workspaceFolders: js.UndefOr[MiddlewareSignature] = js.undefined
}

object WorkspaceFolderWorkspaceMiddleware {
  @scala.inline
  def apply(
    didChangeWorkspaceFolders: NextSignature[WorkspaceFoldersChangeEvent, Unit] = null,
    workspaceFolders: (/* token */ CancellationToken, /* next */ HandlerSignature) => CallbackTo[HandlerResult[js.Array[WorkspaceFolder] | Null, Unit]] = null
  ): WorkspaceFolderWorkspaceMiddleware = {
    val __obj = js.Dynamic.literal()
    if (didChangeWorkspaceFolders != null) __obj.updateDynamic("didChangeWorkspaceFolders")(didChangeWorkspaceFolders.asInstanceOf[js.Any])
    if (workspaceFolders != null) __obj.updateDynamic("workspaceFolders")(js.Any.fromFunction2((t0: /* token */ typingsJapgolly.vscodeJsonrpc.cancellationMod.CancellationToken, t1: /* next */ typingsJapgolly.vscodeLanguageserverProtocol.protocolWorkspaceFoldersMod.WorkspaceFoldersRequest.HandlerSignature) => workspaceFolders(t0, t1).runNow()))
    __obj.asInstanceOf[WorkspaceFolderWorkspaceMiddleware]
  }
}

