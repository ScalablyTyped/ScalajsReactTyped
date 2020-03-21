package typingsJapgolly.grammarkdown.mod

import typingsJapgolly.grammarkdown.tokensMod.SyntaxKind.CloseBracketToken
import typingsJapgolly.grammarkdown.tokensMod.SyntaxKind.OpenBracketToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown", "InvalidAssertion")
@js.native
class InvalidAssertion protected ()
  extends typingsJapgolly.grammarkdown.nodesMod.InvalidAssertion {
  def this(openBracketToken: typingsJapgolly.grammarkdown.nodesMod.Token[OpenBracketToken]) = this()
  def this(
    openBracketToken: typingsJapgolly.grammarkdown.nodesMod.Token[OpenBracketToken],
    closeBracketToken: typingsJapgolly.grammarkdown.nodesMod.Token[CloseBracketToken]
  ) = this()
}

