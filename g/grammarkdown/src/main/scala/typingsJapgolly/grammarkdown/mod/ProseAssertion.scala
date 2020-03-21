package typingsJapgolly.grammarkdown.mod

import typingsJapgolly.grammarkdown.nodesMod.ProseFragment
import typingsJapgolly.grammarkdown.tokensMod.SyntaxKind.CloseBracketToken
import typingsJapgolly.grammarkdown.tokensMod.SyntaxKind.OpenBracketGreaterThanToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown", "ProseAssertion")
@js.native
class ProseAssertion protected ()
  extends typingsJapgolly.grammarkdown.nodesMod.ProseAssertion {
  def this(openBracketToken: typingsJapgolly.grammarkdown.nodesMod.Token[OpenBracketGreaterThanToken]) = this()
  def this(
    openBracketToken: typingsJapgolly.grammarkdown.nodesMod.Token[OpenBracketGreaterThanToken],
    fragments: js.Array[ProseFragment]
  ) = this()
  def this(
    openBracketToken: typingsJapgolly.grammarkdown.nodesMod.Token[OpenBracketGreaterThanToken],
    fragments: js.UndefOr[scala.Nothing],
    closeBracketToken: typingsJapgolly.grammarkdown.nodesMod.Token[CloseBracketToken]
  ) = this()
  def this(
    openBracketToken: typingsJapgolly.grammarkdown.nodesMod.Token[OpenBracketGreaterThanToken],
    fragments: js.Array[ProseFragment],
    closeBracketToken: typingsJapgolly.grammarkdown.nodesMod.Token[CloseBracketToken]
  ) = this()
}

