package typingsJapgolly.vscodeLanguageclient.clientMod

import typingsJapgolly.vscodeLanguageserverProtocol.protocolMod.TextDocumentRegistrationOptions
import typingsJapgolly.vscodeLanguageserverProtocol.protocolMod.WillSaveTextDocumentParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageclient/lib/client", "WillSaveTextDocumentWaitUntilRequest")
@js.native
object WillSaveTextDocumentWaitUntilRequest extends js.Object {
  val `type`: typingsJapgolly.vscodeJsonrpc.mod.RequestType[
    WillSaveTextDocumentParams, 
    js.Array[typingsJapgolly.vscodeLanguageserverTypes.mod.TextEdit] | Null, 
    Unit, 
    TextDocumentRegistrationOptions
  ] = js.native
}

