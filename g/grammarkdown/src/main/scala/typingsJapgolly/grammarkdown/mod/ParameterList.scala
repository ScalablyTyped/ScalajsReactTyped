package typingsJapgolly.grammarkdown.mod

import typingsJapgolly.grammarkdown.tokensMod.SyntaxKind.CloseBracketToken
import typingsJapgolly.grammarkdown.tokensMod.SyntaxKind.CloseParenToken
import typingsJapgolly.grammarkdown.tokensMod.SyntaxKind.OpenBracketToken
import typingsJapgolly.grammarkdown.tokensMod.SyntaxKind.OpenParenToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown", "ParameterList")
@js.native
class ParameterList protected ()
  extends typingsJapgolly.grammarkdown.nodesMod.ParameterList {
  def this(openParenToken: typingsJapgolly.grammarkdown.nodesMod.Token[OpenParenToken | OpenBracketToken]) = this()
  def this(
    openParenToken: typingsJapgolly.grammarkdown.nodesMod.Token[OpenParenToken | OpenBracketToken],
    elements: js.Array[typingsJapgolly.grammarkdown.nodesMod.Parameter]
  ) = this()
  def this(
    openParenToken: typingsJapgolly.grammarkdown.nodesMod.Token[OpenParenToken | OpenBracketToken],
    elements: js.UndefOr[scala.Nothing],
    closeParenToken: typingsJapgolly.grammarkdown.nodesMod.Token[CloseParenToken | CloseBracketToken]
  ) = this()
  def this(
    openParenToken: typingsJapgolly.grammarkdown.nodesMod.Token[OpenParenToken | OpenBracketToken],
    elements: js.Array[typingsJapgolly.grammarkdown.nodesMod.Parameter],
    closeParenToken: typingsJapgolly.grammarkdown.nodesMod.Token[CloseParenToken | CloseBracketToken]
  ) = this()
}

