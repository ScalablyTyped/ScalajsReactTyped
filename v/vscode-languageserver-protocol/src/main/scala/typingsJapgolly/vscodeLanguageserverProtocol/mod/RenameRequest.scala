package typingsJapgolly.vscodeLanguageserverProtocol.mod

import typingsJapgolly.vscodeLanguageserverProtocol.protocolMod.RenameParams
import typingsJapgolly.vscodeLanguageserverProtocol.protocolMod.RenameRegistrationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver-protocol", "RenameRequest")
@js.native
object RenameRequest extends js.Object {
  val `type`: typingsJapgolly.vscodeJsonrpc.mod.RequestType[
    RenameParams, 
    typingsJapgolly.vscodeLanguageserverTypes.mod.WorkspaceEdit | Null, 
    Unit, 
    RenameRegistrationOptions
  ] = js.native
}

