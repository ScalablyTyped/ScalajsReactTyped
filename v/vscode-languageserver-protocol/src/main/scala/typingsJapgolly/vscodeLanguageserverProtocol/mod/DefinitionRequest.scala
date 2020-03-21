package typingsJapgolly.vscodeLanguageserverProtocol.mod

import typingsJapgolly.vscodeLanguageserverProtocol.protocolMod.TextDocumentPositionParams
import typingsJapgolly.vscodeLanguageserverProtocol.protocolMod.TextDocumentRegistrationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver-protocol", "DefinitionRequest")
@js.native
object DefinitionRequest extends js.Object {
  val `type`: typingsJapgolly.vscodeJsonrpc.mod.RequestType[
    TextDocumentPositionParams, 
    typingsJapgolly.vscodeLanguageserverTypes.mod.Location | (js.Array[
      typingsJapgolly.vscodeLanguageserverTypes.mod.Location | typingsJapgolly.vscodeLanguageserverTypes.mod.LocationLink
    ]) | Null, 
    Unit, 
    TextDocumentRegistrationOptions
  ] = js.native
}

