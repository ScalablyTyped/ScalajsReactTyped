package typingsJapgolly.grammarkdown.mod

import typingsJapgolly.grammarkdown.distTokensMod.SyntaxKind.QuestionToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("grammarkdown", "Terminal")
@js.native
open class Terminal protected ()
  extends typingsJapgolly.grammarkdown.distNodesMod.Terminal {
  def this(literal: typingsJapgolly.grammarkdown.distNodesMod.TerminalLiteral) = this()
  def this(literal: typingsJapgolly.grammarkdown.distNodesMod.UnicodeCharacterLiteral) = this()
  def this(
    literal: typingsJapgolly.grammarkdown.distNodesMod.TerminalLiteral,
    questionToken: typingsJapgolly.grammarkdown.distNodesMod.Token[QuestionToken]
  ) = this()
  def this(
    literal: typingsJapgolly.grammarkdown.distNodesMod.UnicodeCharacterLiteral,
    questionToken: typingsJapgolly.grammarkdown.distNodesMod.Token[QuestionToken]
  ) = this()
}
