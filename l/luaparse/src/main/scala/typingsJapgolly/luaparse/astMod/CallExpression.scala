package typingsJapgolly.luaparse.astMod

import typingsJapgolly.luaparse.AnonEnd
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CallExpression
  extends Expression
     with Base[typingsJapgolly.luaparse.luaparseStrings.CallExpression] {
  var arguments: js.Array[Expression]
  var base: Expression
}

object CallExpression {
  @scala.inline
  def apply(
    arguments: js.Array[Expression],
    base: Expression,
    `type`: typingsJapgolly.luaparse.luaparseStrings.CallExpression,
    loc: AnonEnd = null
  ): CallExpression = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], base = base.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[CallExpression]
  }
}

