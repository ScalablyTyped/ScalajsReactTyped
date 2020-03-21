package typingsJapgolly.vscodeLanguageclient.mod

import typingsJapgolly.vscodeLanguageserverProtocol.protocolMod.CodeActionParams
import typingsJapgolly.vscodeLanguageserverProtocol.protocolMod.CodeActionRegistrationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageclient", "CodeActionRequest")
@js.native
object CodeActionRequest extends js.Object {
  val `type`: typingsJapgolly.vscodeJsonrpc.mod.RequestType[
    CodeActionParams, 
    (js.Array[
      typingsJapgolly.vscodeLanguageserverTypes.mod.Command | typingsJapgolly.vscodeLanguageserverTypes.mod.CodeAction
    ]) | Null, 
    Unit, 
    CodeActionRegistrationOptions
  ] = js.native
}

