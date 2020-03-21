package typingsJapgolly.eslint.mod.AST

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.eslint.eslintStrings.Boolean
  - typingsJapgolly.eslint.eslintStrings.Null
  - typingsJapgolly.eslint.eslintStrings.Identifier
  - typingsJapgolly.eslint.eslintStrings.Keyword
  - typingsJapgolly.eslint.eslintStrings.Punctuator
  - typingsJapgolly.eslint.eslintStrings.JSXIdentifier
  - typingsJapgolly.eslint.eslintStrings.JSXText
  - typingsJapgolly.eslint.eslintStrings.Numeric
  - typingsJapgolly.eslint.eslintStrings.String
  - typingsJapgolly.eslint.eslintStrings.RegularExpression
*/
trait TokenType extends js.Object

object TokenType {
  @scala.inline
  def Boolean: typingsJapgolly.eslint.eslintStrings.Boolean = this.cast("Boolean")
  @scala.inline
  def Identifier: typingsJapgolly.eslint.eslintStrings.Identifier = this.cast("Identifier")
  @scala.inline
  def JSXIdentifier: typingsJapgolly.eslint.eslintStrings.JSXIdentifier = this.cast("JSXIdentifier")
  @scala.inline
  def JSXText: typingsJapgolly.eslint.eslintStrings.JSXText = this.cast("JSXText")
  @scala.inline
  def Keyword: typingsJapgolly.eslint.eslintStrings.Keyword = this.cast("Keyword")
  @scala.inline
  def Null: typingsJapgolly.eslint.eslintStrings.Null = this.cast("Null")
  @scala.inline
  def Numeric: typingsJapgolly.eslint.eslintStrings.Numeric = this.cast("Numeric")
  @scala.inline
  def Punctuator: typingsJapgolly.eslint.eslintStrings.Punctuator = this.cast("Punctuator")
  @scala.inline
  def RegularExpression: typingsJapgolly.eslint.eslintStrings.RegularExpression = this.cast("RegularExpression")
  @scala.inline
  def String: typingsJapgolly.eslint.eslintStrings.String = this.cast("String")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

