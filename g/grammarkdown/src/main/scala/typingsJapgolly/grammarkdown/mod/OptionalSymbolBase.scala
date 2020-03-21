package typingsJapgolly.grammarkdown.mod

import typingsJapgolly.grammarkdown.nodesMod.OptionalSymbolKind
import typingsJapgolly.grammarkdown.tokensMod.SyntaxKind.QuestionToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown", "OptionalSymbolBase")
@js.native
abstract class OptionalSymbolBase[TKind /* <: OptionalSymbolKind */] protected ()
  extends typingsJapgolly.grammarkdown.nodesMod.OptionalSymbolBase[TKind] {
  def this(kind: TKind) = this()
  def this(kind: TKind, questionToken: typingsJapgolly.grammarkdown.nodesMod.Token[QuestionToken]) = this()
}

