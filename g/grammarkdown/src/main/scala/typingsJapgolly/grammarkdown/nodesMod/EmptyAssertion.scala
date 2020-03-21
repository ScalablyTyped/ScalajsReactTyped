package typingsJapgolly.grammarkdown.nodesMod

import typingsJapgolly.grammarkdown.tokensMod.SyntaxKind.CloseBracketToken
import typingsJapgolly.grammarkdown.tokensMod.SyntaxKind.EmptyKeyword
import typingsJapgolly.grammarkdown.tokensMod.SyntaxKind.OpenBracketToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown/dist/nodes", "EmptyAssertion")
@js.native
class EmptyAssertion protected ()
  extends AssertionBase[typingsJapgolly.grammarkdown.tokensMod.SyntaxKind.EmptyAssertion, OpenBracketToken] {
  def this(openBracketToken: Token[OpenBracketToken], emptyKeyword: Token[EmptyKeyword]) = this()
  def this(
    openBracketToken: Token[OpenBracketToken],
    emptyKeyword: Token[EmptyKeyword],
    closeBracketToken: Token[CloseBracketToken]
  ) = this()
  val emptyKeyword: Token[EmptyKeyword] = js.native
}

