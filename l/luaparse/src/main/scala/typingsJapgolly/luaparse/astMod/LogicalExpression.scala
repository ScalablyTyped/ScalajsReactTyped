package typingsJapgolly.luaparse.astMod

import typingsJapgolly.luaparse.AnonEnd
import typingsJapgolly.luaparse.luaparseStrings.and
import typingsJapgolly.luaparse.luaparseStrings.or
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LogicalExpression
  extends Expression
     with Base[typingsJapgolly.luaparse.luaparseStrings.LogicalExpression] {
  var left: Expression
  var operator: or | and
  var right: Expression
}

object LogicalExpression {
  @scala.inline
  def apply(
    left: Expression,
    operator: or | and,
    right: Expression,
    `type`: typingsJapgolly.luaparse.luaparseStrings.LogicalExpression,
    loc: AnonEnd = null
  ): LogicalExpression = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogicalExpression]
  }
}

