package typingsJapgolly.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.ParenthesizedExpression")
@js.native
class ParenthesizedExpression protected () extends AST {
  def this(openParenTrailingComments: js.Array[Comment], expression: AST) = this()
  var expression: AST = js.native
  var openParenTrailingComments: js.Array[Comment] = js.native
  def structuralEquals(ast: ParenthesizedExpression, includingPosition: Boolean): Boolean = js.native
}

