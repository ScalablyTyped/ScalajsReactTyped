package typingsJapgolly.vscodeLanguageclient.clientMod

import typingsJapgolly.vscodeLanguageserverProtocol.protocolFoldingRangeMod.FoldingRangeParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageclient/lib/client", "FoldingRangeRequest")
@js.native
object FoldingRangeRequest extends js.Object {
  val `type`: typingsJapgolly.vscodeJsonrpc.mod.RequestType[
    FoldingRangeParams, 
    (js.Array[
      typingsJapgolly.vscodeLanguageserverProtocol.protocolFoldingRangeMod.FoldingRange
    ]) | Null, 
    js.Any, 
    js.Any
  ] = js.native
}

