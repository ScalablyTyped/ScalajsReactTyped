package typingsJapgolly.grammarkdown.nodesMod

import typingsJapgolly.grammarkdown.tokensMod.SyntaxKind.QuestionToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown/dist/nodes", "UnicodeCharacterLiteral")
@js.native
class UnicodeCharacterLiteral ()
  extends OptionalSymbolBase[typingsJapgolly.grammarkdown.tokensMod.SyntaxKind.UnicodeCharacterLiteral]
     with TextContent {
  def this(text: String) = this()
  def this(text: js.UndefOr[scala.Nothing], questionToken: Token[QuestionToken]) = this()
  def this(text: String, questionToken: Token[QuestionToken]) = this()
}

