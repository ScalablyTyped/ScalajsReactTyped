package typingsJapgolly.grammarkdown.mod

import typingsJapgolly.grammarkdown.nodesMod.AssertionKind
import typingsJapgolly.grammarkdown.tokensMod.SyntaxKind.CloseBracketToken
import typingsJapgolly.grammarkdown.tokensMod.SyntaxKind.OpenBracketGreaterThanToken
import typingsJapgolly.grammarkdown.tokensMod.SyntaxKind.OpenBracketToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown", "AssertionBase")
@js.native
abstract class AssertionBase[TKind /* <: AssertionKind */, TBracket /* <: OpenBracketToken | OpenBracketGreaterThanToken */] protected ()
  extends typingsJapgolly.grammarkdown.nodesMod.AssertionBase[TKind, TBracket] {
  def this(kind: TKind, openBracketToken: typingsJapgolly.grammarkdown.nodesMod.Token[TBracket]) = this()
  def this(
    kind: TKind,
    openBracketToken: typingsJapgolly.grammarkdown.nodesMod.Token[TBracket],
    closeBracketToken: typingsJapgolly.grammarkdown.nodesMod.Token[CloseBracketToken]
  ) = this()
}

