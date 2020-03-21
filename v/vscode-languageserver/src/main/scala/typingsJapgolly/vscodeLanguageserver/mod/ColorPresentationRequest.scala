package typingsJapgolly.vscodeLanguageserver.mod

import typingsJapgolly.vscodeLanguageserverProtocol.protocolColorProviderMod.ColorPresentationParams
import typingsJapgolly.vscodeLanguageserverProtocol.protocolMod.TextDocumentRegistrationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver", "ColorPresentationRequest")
@js.native
object ColorPresentationRequest extends js.Object {
  val `type`: typingsJapgolly.vscodeJsonrpc.mod.RequestType[
    ColorPresentationParams, 
    js.Array[typingsJapgolly.vscodeLanguageserverTypes.mod.ColorPresentation], 
    Unit, 
    TextDocumentRegistrationOptions
  ] = js.native
}

