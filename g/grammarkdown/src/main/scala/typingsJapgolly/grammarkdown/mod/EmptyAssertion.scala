package typingsJapgolly.grammarkdown.mod

import typingsJapgolly.grammarkdown.tokensMod.SyntaxKind.CloseBracketToken
import typingsJapgolly.grammarkdown.tokensMod.SyntaxKind.EmptyKeyword
import typingsJapgolly.grammarkdown.tokensMod.SyntaxKind.OpenBracketToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown", "EmptyAssertion")
@js.native
class EmptyAssertion protected ()
  extends typingsJapgolly.grammarkdown.nodesMod.EmptyAssertion {
  def this(
    openBracketToken: typingsJapgolly.grammarkdown.nodesMod.Token[OpenBracketToken],
    emptyKeyword: typingsJapgolly.grammarkdown.nodesMod.Token[EmptyKeyword]
  ) = this()
  def this(
    openBracketToken: typingsJapgolly.grammarkdown.nodesMod.Token[OpenBracketToken],
    emptyKeyword: typingsJapgolly.grammarkdown.nodesMod.Token[EmptyKeyword],
    closeBracketToken: typingsJapgolly.grammarkdown.nodesMod.Token[CloseBracketToken]
  ) = this()
}

