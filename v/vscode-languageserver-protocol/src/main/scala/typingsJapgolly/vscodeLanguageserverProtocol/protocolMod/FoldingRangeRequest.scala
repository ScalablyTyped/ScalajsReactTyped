package typingsJapgolly.vscodeLanguageserverProtocol.protocolMod

import typingsJapgolly.vscodeJsonrpc.mod.RequestType
import typingsJapgolly.vscodeLanguageserverProtocol.protocolFoldingRangeMod.FoldingRange
import typingsJapgolly.vscodeLanguageserverProtocol.protocolFoldingRangeMod.FoldingRangeParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver-protocol/lib/protocol", "FoldingRangeRequest")
@js.native
object FoldingRangeRequest extends js.Object {
  val `type`: RequestType[FoldingRangeParams, js.Array[FoldingRange] | Null, js.Any, js.Any] = js.native
}

