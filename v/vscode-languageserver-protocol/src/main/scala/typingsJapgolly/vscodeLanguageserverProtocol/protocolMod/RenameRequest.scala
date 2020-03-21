package typingsJapgolly.vscodeLanguageserverProtocol.protocolMod

import typingsJapgolly.vscodeJsonrpc.mod.RequestType
import typingsJapgolly.vscodeLanguageserverTypes.mod.WorkspaceEdit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver-protocol/lib/protocol", "RenameRequest")
@js.native
object RenameRequest extends js.Object {
  val `type`: RequestType[RenameParams, WorkspaceEdit | Null, Unit, RenameRegistrationOptions] = js.native
}

