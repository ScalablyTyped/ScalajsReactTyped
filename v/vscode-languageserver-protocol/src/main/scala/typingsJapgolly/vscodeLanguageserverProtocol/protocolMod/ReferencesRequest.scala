package typingsJapgolly.vscodeLanguageserverProtocol.protocolMod

import typingsJapgolly.vscodeJsonrpc.mod.RequestType
import typingsJapgolly.vscodeLanguageserverTypes.mod.Location
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver-protocol/lib/protocol", "ReferencesRequest")
@js.native
object ReferencesRequest extends js.Object {
  val `type`: RequestType[ReferenceParams, js.Array[Location] | Null, Unit, TextDocumentRegistrationOptions] = js.native
}

