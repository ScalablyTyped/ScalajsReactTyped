package typingsJapgolly.vscodeLanguageclient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object colorProviderMod {
  type ProvideColorPresentationSignature = js.Function3[
    /* color */ typingsJapgolly.vscode.mod.Color, 
    /* context */ typingsJapgolly.vscodeLanguageclient.AnonDocument, 
    /* token */ typingsJapgolly.vscodeJsonrpc.cancellationMod.CancellationToken, 
    typingsJapgolly.vscode.mod.ProviderResult[js.Array[typingsJapgolly.vscode.mod.ColorPresentation]]
  ]
  type ProvideDocumentColorsSignature = js.Function2[
    /* document */ typingsJapgolly.vscode.mod.TextDocument, 
    /* token */ typingsJapgolly.vscodeJsonrpc.cancellationMod.CancellationToken, 
    typingsJapgolly.vscode.mod.ProviderResult[js.Array[typingsJapgolly.vscode.mod.ColorInformation]]
  ]
}
