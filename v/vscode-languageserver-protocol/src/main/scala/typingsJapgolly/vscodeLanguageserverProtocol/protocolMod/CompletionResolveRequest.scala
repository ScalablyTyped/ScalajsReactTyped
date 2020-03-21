package typingsJapgolly.vscodeLanguageserverProtocol.protocolMod

import typingsJapgolly.vscodeJsonrpc.mod.RequestType
import typingsJapgolly.vscodeLanguageserverTypes.mod.CompletionItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver-protocol/lib/protocol", "CompletionResolveRequest")
@js.native
object CompletionResolveRequest extends js.Object {
  val `type`: RequestType[CompletionItem, CompletionItem, Unit, Unit] = js.native
}

