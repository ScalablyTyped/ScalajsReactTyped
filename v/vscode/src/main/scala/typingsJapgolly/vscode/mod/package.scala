package typingsJapgolly.vscode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type CharacterPair = js.Tuple2[java.lang.String, java.lang.String]
  type Declaration = typingsJapgolly.vscode.mod.Location | (js.Array[typingsJapgolly.vscode.mod.Location | typingsJapgolly.vscode.mod.LocationLink])
  type Definition = typingsJapgolly.vscode.mod.Location | js.Array[typingsJapgolly.vscode.mod.Location]
  type DefinitionLink = typingsJapgolly.vscode.mod.LocationLink
  type DocumentSelector = typingsJapgolly.vscode.mod.DocumentFilter | java.lang.String | (js.Array[typingsJapgolly.vscode.mod.DocumentFilter | java.lang.String])
  type Event[T] = js.Function3[
    /* listener */ js.Function1[/* e */ T, js.Any], 
    /* thisArgs */ js.UndefOr[js.Any], 
    /* disposables */ js.UndefOr[js.Array[typingsJapgolly.vscode.mod.Disposable]], 
    typingsJapgolly.vscode.mod.Disposable
  ]
  type GlobPattern = java.lang.String | typingsJapgolly.vscode.mod.RelativePattern
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.vscode.mod.MarkdownString
    - java.lang.String
    - typingsJapgolly.vscode.AnonLanguage
  */
  type MarkedString = typingsJapgolly.vscode.mod._MarkedString | java.lang.String
  type ProviderResult[T] = js.UndefOr[T | scala.Null | (typingsJapgolly.vscode.Thenable[js.UndefOr[T | scala.Null]])]
}
