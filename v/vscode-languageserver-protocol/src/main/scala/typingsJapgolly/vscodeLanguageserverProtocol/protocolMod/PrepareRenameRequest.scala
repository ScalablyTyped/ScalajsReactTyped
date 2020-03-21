package typingsJapgolly.vscodeLanguageserverProtocol.protocolMod

import typingsJapgolly.vscodeJsonrpc.mod.RequestType
import typingsJapgolly.vscodeLanguageserverProtocol.AnonPlaceholder
import typingsJapgolly.vscodeLanguageserverTypes.mod.Range
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver-protocol/lib/protocol", "PrepareRenameRequest")
@js.native
object PrepareRenameRequest extends js.Object {
  val `type`: RequestType[TextDocumentPositionParams, Range | AnonPlaceholder | Null, Unit, Unit] = js.native
}

