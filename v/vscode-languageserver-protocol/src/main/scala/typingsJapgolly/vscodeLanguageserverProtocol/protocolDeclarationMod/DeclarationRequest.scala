package typingsJapgolly.vscodeLanguageserverProtocol.protocolDeclarationMod

import typingsJapgolly.vscodeJsonrpc.mod.RequestHandler
import typingsJapgolly.vscodeJsonrpc.mod.RequestType
import typingsJapgolly.vscodeLanguageserverProtocol.protocolMod.TextDocumentPositionParams
import typingsJapgolly.vscodeLanguageserverProtocol.protocolMod.TextDocumentRegistrationOptions
import typingsJapgolly.vscodeLanguageserverTypes.mod.Declaration
import typingsJapgolly.vscodeLanguageserverTypes.mod.DeclarationLink
import typingsJapgolly.vscodeLanguageserverTypes.mod.Location
import typingsJapgolly.vscodeLanguageserverTypes.mod.LocationLink
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver-protocol/lib/protocol.declaration", "DeclarationRequest")
@js.native
object DeclarationRequest extends js.Object {
  val `type`: RequestType[
    TextDocumentPositionParams, 
    Location | (js.Array[Location | LocationLink]) | Null, 
    Unit, 
    TextDocumentRegistrationOptions
  ] = js.native
  type HandlerSignature = RequestHandler[TextDocumentPositionParams, Declaration | js.Array[DeclarationLink] | Null, Unit]
}

