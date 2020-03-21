package typingsJapgolly.vscodeLanguageserverProtocol.protocolMod

import typingsJapgolly.vscodeJsonrpc.mod.RequestType
import typingsJapgolly.vscodeLanguageserverProtocol.protocolColorProviderMod.DocumentColorParams
import typingsJapgolly.vscodeLanguageserverTypes.mod.ColorInformation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver-protocol/lib/protocol", "DocumentColorRequest")
@js.native
object DocumentColorRequest extends js.Object {
  val `type`: RequestType[DocumentColorParams, js.Array[ColorInformation], Unit, TextDocumentRegistrationOptions] = js.native
}

