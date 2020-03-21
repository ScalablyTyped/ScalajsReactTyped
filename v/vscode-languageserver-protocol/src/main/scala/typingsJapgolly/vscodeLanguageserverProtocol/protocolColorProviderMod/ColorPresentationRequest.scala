package typingsJapgolly.vscodeLanguageserverProtocol.protocolColorProviderMod

import typingsJapgolly.vscodeJsonrpc.mod.RequestType
import typingsJapgolly.vscodeLanguageserverProtocol.protocolMod.TextDocumentRegistrationOptions
import typingsJapgolly.vscodeLanguageserverTypes.mod.ColorPresentation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver-protocol/lib/protocol.colorProvider", "ColorPresentationRequest")
@js.native
object ColorPresentationRequest extends js.Object {
  val `type`: RequestType[
    ColorPresentationParams, 
    js.Array[ColorPresentation], 
    Unit, 
    TextDocumentRegistrationOptions
  ] = js.native
}

