package typingsJapgolly.vscodeLanguageclient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object declarationMod {
  type ProvideDeclarationSignature = js.Function3[
    /* document */ typingsJapgolly.vscode.mod.TextDocument, 
    /* position */ typingsJapgolly.vscode.mod.Position, 
    /* token */ typingsJapgolly.vscodeJsonrpc.cancellationMod.CancellationToken, 
    typingsJapgolly.vscode.mod.ProviderResult[typingsJapgolly.vscode.mod.Declaration]
  ]
}
