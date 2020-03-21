package typingsJapgolly.vscodeLanguageserverProtocol.protocolMod

import typingsJapgolly.vscodeJsonrpc.mod.RequestType
import typingsJapgolly.vscodeLanguageserverTypes.mod.CompletionItem
import typingsJapgolly.vscodeLanguageserverTypes.mod.CompletionList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver-protocol/lib/protocol", "CompletionRequest")
@js.native
object CompletionRequest extends js.Object {
  val `type`: RequestType[
    CompletionParams, 
    CompletionList | js.Array[CompletionItem] | Null, 
    Unit, 
    CompletionRegistrationOptions
  ] = js.native
}

