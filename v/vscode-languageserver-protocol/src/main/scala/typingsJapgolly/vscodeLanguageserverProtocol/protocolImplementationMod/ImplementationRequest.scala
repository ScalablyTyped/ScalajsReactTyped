package typingsJapgolly.vscodeLanguageserverProtocol.protocolImplementationMod

import typingsJapgolly.vscodeJsonrpc.mod.RequestHandler
import typingsJapgolly.vscodeJsonrpc.mod.RequestType
import typingsJapgolly.vscodeLanguageserverProtocol.protocolMod.TextDocumentPositionParams
import typingsJapgolly.vscodeLanguageserverProtocol.protocolMod.TextDocumentRegistrationOptions
import typingsJapgolly.vscodeLanguageserverTypes.mod.Definition
import typingsJapgolly.vscodeLanguageserverTypes.mod.DefinitionLink
import typingsJapgolly.vscodeLanguageserverTypes.mod.Location
import typingsJapgolly.vscodeLanguageserverTypes.mod.LocationLink
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver-protocol/lib/protocol.implementation", "ImplementationRequest")
@js.native
object ImplementationRequest extends js.Object {
  val `type`: RequestType[
    TextDocumentPositionParams, 
    Location | (js.Array[Location | LocationLink]) | Null, 
    Unit, 
    TextDocumentRegistrationOptions
  ] = js.native
  type HandlerSignature = RequestHandler[TextDocumentPositionParams, Definition | js.Array[DefinitionLink] | Null, Unit]
}

