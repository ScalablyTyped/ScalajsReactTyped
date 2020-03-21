package typingsJapgolly.grammarkdown.mod

import typingsJapgolly.grammarkdown.tokensMod.SyntaxKind.CloseBracketToken
import typingsJapgolly.grammarkdown.tokensMod.SyntaxKind.OpenBracketToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown", "Constraints")
@js.native
class Constraints protected ()
  extends typingsJapgolly.grammarkdown.nodesMod.Constraints {
  def this(openBracketToken: typingsJapgolly.grammarkdown.nodesMod.Token[OpenBracketToken]) = this()
  def this(
    openBracketToken: typingsJapgolly.grammarkdown.nodesMod.Token[OpenBracketToken],
    elements: js.Array[typingsJapgolly.grammarkdown.nodesMod.Argument]
  ) = this()
  def this(
    openBracketToken: typingsJapgolly.grammarkdown.nodesMod.Token[OpenBracketToken],
    elements: js.UndefOr[scala.Nothing],
    closeBracketToken: typingsJapgolly.grammarkdown.nodesMod.Token[CloseBracketToken]
  ) = this()
  def this(
    openBracketToken: typingsJapgolly.grammarkdown.nodesMod.Token[OpenBracketToken],
    elements: js.Array[typingsJapgolly.grammarkdown.nodesMod.Argument],
    closeBracketToken: typingsJapgolly.grammarkdown.nodesMod.Token[CloseBracketToken]
  ) = this()
}

