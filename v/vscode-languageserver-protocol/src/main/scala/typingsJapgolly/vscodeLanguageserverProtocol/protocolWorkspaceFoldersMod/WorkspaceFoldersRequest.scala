package typingsJapgolly.vscodeLanguageserverProtocol.protocolWorkspaceFoldersMod

import typingsJapgolly.vscodeJsonrpc.cancellationMod.CancellationToken
import typingsJapgolly.vscodeJsonrpc.mod.HandlerResult
import typingsJapgolly.vscodeJsonrpc.mod.RequestHandler0
import typingsJapgolly.vscodeJsonrpc.mod.RequestType0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver-protocol/lib/protocol.workspaceFolders", "WorkspaceFoldersRequest")
@js.native
object WorkspaceFoldersRequest extends js.Object {
  val `type`: RequestType0[js.Array[WorkspaceFolder] | Null, Unit, Unit] = js.native
  type HandlerSignature = RequestHandler0[js.Array[WorkspaceFolder] | Null, Unit]
  type MiddlewareSignature = js.Function2[
    /* token */ CancellationToken, 
    /* next */ HandlerSignature, 
    HandlerResult[js.Array[WorkspaceFolder] | Null, Unit]
  ]
}

