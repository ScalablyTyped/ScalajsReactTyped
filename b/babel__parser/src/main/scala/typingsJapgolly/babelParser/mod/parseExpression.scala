package typingsJapgolly.babelParser.mod

import typingsJapgolly.babelTypes.mod.Expression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@babel/parser", "parseExpression")
@js.native
object parseExpression extends js.Object {
  def apply(input: String): Expression = js.native
  def apply(input: String, options: ParserOptions): Expression = js.native
}

