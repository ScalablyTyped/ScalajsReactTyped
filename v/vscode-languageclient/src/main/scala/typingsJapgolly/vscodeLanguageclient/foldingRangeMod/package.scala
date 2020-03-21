package typingsJapgolly.vscodeLanguageclient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object foldingRangeMod {
  type ProvideFoldingRangeSignature = js.Function3[
    /* document */ typingsJapgolly.vscode.mod.TextDocument, 
    /* context */ typingsJapgolly.vscode.mod.FoldingContext, 
    /* token */ typingsJapgolly.vscodeJsonrpc.cancellationMod.CancellationToken, 
    typingsJapgolly.vscode.mod.ProviderResult[js.Array[typingsJapgolly.vscode.mod.FoldingRange]]
  ]
}
