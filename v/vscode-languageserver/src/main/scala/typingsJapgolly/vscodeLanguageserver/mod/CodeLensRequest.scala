package typingsJapgolly.vscodeLanguageserver.mod

import typingsJapgolly.vscodeLanguageserverProtocol.protocolMod.CodeLensParams
import typingsJapgolly.vscodeLanguageserverProtocol.protocolMod.CodeLensRegistrationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver", "CodeLensRequest")
@js.native
object CodeLensRequest extends js.Object {
  val `type`: typingsJapgolly.vscodeJsonrpc.mod.RequestType[
    CodeLensParams, 
    js.Array[typingsJapgolly.vscodeLanguageserverTypes.mod.CodeLens] | Null, 
    Unit, 
    CodeLensRegistrationOptions
  ] = js.native
}

