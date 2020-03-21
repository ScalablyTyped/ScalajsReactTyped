package typingsJapgolly.htmlParser.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.htmlParser.htmlParserStrings.Greaterthansign
  - typingsJapgolly.htmlParser.htmlParserStrings.SlashGreaterthansign
  - typingsJapgolly.htmlParser.htmlParserStrings.QuestionmarkGreaterthansign
*/
trait Token extends js.Object

object Token {
  @scala.inline
  def Greaterthansign: typingsJapgolly.htmlParser.htmlParserStrings.Greaterthansign = this.cast(">")
  @scala.inline
  def QuestionmarkGreaterthansign: typingsJapgolly.htmlParser.htmlParserStrings.QuestionmarkGreaterthansign = this.cast("?>")
  @scala.inline
  def SlashGreaterthansign: typingsJapgolly.htmlParser.htmlParserStrings.SlashGreaterthansign = this.cast("/>")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

