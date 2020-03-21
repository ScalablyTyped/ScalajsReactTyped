package typingsJapgolly.vscodeLanguageserver.mod

import typingsJapgolly.vscodeLanguageserverProtocol.protocolMod.CompletionParams
import typingsJapgolly.vscodeLanguageserverProtocol.protocolMod.CompletionRegistrationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver", "CompletionRequest")
@js.native
object CompletionRequest extends js.Object {
  val `type`: typingsJapgolly.vscodeJsonrpc.mod.RequestType[
    CompletionParams, 
    typingsJapgolly.vscodeLanguageserverTypes.mod.CompletionList | js.Array[typingsJapgolly.vscodeLanguageserverTypes.mod.CompletionItem] | Null, 
    Unit, 
    CompletionRegistrationOptions
  ] = js.native
}

