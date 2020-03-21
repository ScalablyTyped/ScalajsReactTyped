package typingsJapgolly.vscodeLanguageclient.clientMod

import typingsJapgolly.vscodeLanguageserverProtocol.protocolMod.ReferenceParams
import typingsJapgolly.vscodeLanguageserverProtocol.protocolMod.TextDocumentRegistrationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageclient/lib/client", "ReferencesRequest")
@js.native
object ReferencesRequest extends js.Object {
  val `type`: typingsJapgolly.vscodeJsonrpc.mod.RequestType[
    ReferenceParams, 
    js.Array[typingsJapgolly.vscodeLanguageserverTypes.mod.Location] | Null, 
    Unit, 
    TextDocumentRegistrationOptions
  ] = js.native
}

