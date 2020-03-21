package typingsJapgolly.grammarkdown.mod

import typingsJapgolly.grammarkdown.tokensMod.SyntaxKind.QuestionToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown", "Nonterminal")
@js.native
class Nonterminal protected ()
  extends typingsJapgolly.grammarkdown.nodesMod.Nonterminal {
  def this(name: typingsJapgolly.grammarkdown.nodesMod.Identifier) = this()
  def this(
    name: typingsJapgolly.grammarkdown.nodesMod.Identifier,
    argumentList: typingsJapgolly.grammarkdown.nodesMod.ArgumentList
  ) = this()
  def this(
    name: typingsJapgolly.grammarkdown.nodesMod.Identifier,
    argumentList: js.UndefOr[scala.Nothing],
    questionToken: typingsJapgolly.grammarkdown.nodesMod.Token[QuestionToken]
  ) = this()
  def this(
    name: typingsJapgolly.grammarkdown.nodesMod.Identifier,
    argumentList: typingsJapgolly.grammarkdown.nodesMod.ArgumentList,
    questionToken: typingsJapgolly.grammarkdown.nodesMod.Token[QuestionToken]
  ) = this()
}

