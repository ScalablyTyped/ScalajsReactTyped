package typingsJapgolly.vscodeLanguageclient.clientMod

import typingsJapgolly.vscodeLanguageserverProtocol.AnonPlaceholder
import typingsJapgolly.vscodeLanguageserverProtocol.protocolMod.TextDocumentPositionParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageclient/lib/client", "PrepareRenameRequest")
@js.native
object PrepareRenameRequest extends js.Object {
  val `type`: typingsJapgolly.vscodeJsonrpc.mod.RequestType[
    TextDocumentPositionParams, 
    typingsJapgolly.vscodeLanguageserverTypes.mod.Range | AnonPlaceholder | Null, 
    Unit, 
    Unit
  ] = js.native
}

