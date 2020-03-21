package typingsJapgolly.luaparse.astMod

import typingsJapgolly.luaparse.AnonEnd
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StringCallExpression
  extends Expression
     with Base[typingsJapgolly.luaparse.luaparseStrings.StringCallExpression] {
  var argument: Expression
  var base: Expression
}

object StringCallExpression {
  @scala.inline
  def apply(
    argument: Expression,
    base: Expression,
    `type`: typingsJapgolly.luaparse.luaparseStrings.StringCallExpression,
    loc: AnonEnd = null
  ): StringCallExpression = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], base = base.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[StringCallExpression]
  }
}

