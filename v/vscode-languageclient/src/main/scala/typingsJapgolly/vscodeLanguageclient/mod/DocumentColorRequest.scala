package typingsJapgolly.vscodeLanguageclient.mod

import typingsJapgolly.vscodeLanguageserverProtocol.protocolColorProviderMod.DocumentColorParams
import typingsJapgolly.vscodeLanguageserverProtocol.protocolMod.TextDocumentRegistrationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageclient", "DocumentColorRequest")
@js.native
object DocumentColorRequest extends js.Object {
  val `type`: typingsJapgolly.vscodeJsonrpc.mod.RequestType[
    DocumentColorParams, 
    js.Array[typingsJapgolly.vscodeLanguageserverTypes.mod.ColorInformation], 
    Unit, 
    TextDocumentRegistrationOptions
  ] = js.native
}

