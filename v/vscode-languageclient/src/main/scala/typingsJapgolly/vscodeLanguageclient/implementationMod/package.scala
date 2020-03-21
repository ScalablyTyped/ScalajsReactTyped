package typingsJapgolly.vscodeLanguageclient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object implementationMod {
  type ProvideImplementationSignature = js.Function3[
    /* document */ typingsJapgolly.vscode.mod.TextDocument, 
    /* position */ typingsJapgolly.vscode.mod.Position, 
    /* token */ typingsJapgolly.vscodeJsonrpc.cancellationMod.CancellationToken, 
    typingsJapgolly.vscode.mod.ProviderResult[
      typingsJapgolly.vscode.mod.Definition | js.Array[typingsJapgolly.vscode.mod.DefinitionLink]
    ]
  ]
}
