package typingsJapgolly.grammarkdown.mod

import typingsJapgolly.grammarkdown.tokensMod.SyntaxKind.CloseBracketToken
import typingsJapgolly.grammarkdown.tokensMod.SyntaxKind.CloseParenToken
import typingsJapgolly.grammarkdown.tokensMod.SyntaxKind.OpenBracketToken
import typingsJapgolly.grammarkdown.tokensMod.SyntaxKind.OpenParenToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown", "ArgumentList")
@js.native
class ArgumentList protected ()
  extends typingsJapgolly.grammarkdown.nodesMod.ArgumentList {
  def this(openParenToken: typingsJapgolly.grammarkdown.nodesMod.Token[OpenParenToken | OpenBracketToken]) = this()
  def this(
    openParenToken: typingsJapgolly.grammarkdown.nodesMod.Token[OpenParenToken | OpenBracketToken],
    elements: js.Array[typingsJapgolly.grammarkdown.nodesMod.Argument]
  ) = this()
  def this(
    openParenToken: typingsJapgolly.grammarkdown.nodesMod.Token[OpenParenToken | OpenBracketToken],
    elements: js.UndefOr[scala.Nothing],
    closeParenToken: typingsJapgolly.grammarkdown.nodesMod.Token[CloseParenToken | CloseBracketToken]
  ) = this()
  def this(
    openParenToken: typingsJapgolly.grammarkdown.nodesMod.Token[OpenParenToken | OpenBracketToken],
    elements: js.Array[typingsJapgolly.grammarkdown.nodesMod.Argument],
    closeParenToken: typingsJapgolly.grammarkdown.nodesMod.Token[CloseParenToken | CloseBracketToken]
  ) = this()
}

