package typingsJapgolly.luaparse.astMod

import typingsJapgolly.luaparse.AnonEnd
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CallStatement
  extends _Statement
     with Base[typingsJapgolly.luaparse.luaparseStrings.CallStatement] {
  var expression: CallExpression | StringCallExpression | TableCallExpression
}

object CallStatement {
  @scala.inline
  def apply(
    expression: CallExpression | StringCallExpression | TableCallExpression,
    `type`: typingsJapgolly.luaparse.luaparseStrings.CallStatement,
    loc: AnonEnd = null
  ): CallStatement = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[CallStatement]
  }
}

