package typingsJapgolly.luaparse.astMod

import typingsJapgolly.luaparse.AnonEnd
import typingsJapgolly.luaparse.luaparseStrings.Numbersign
import typingsJapgolly.luaparse.luaparseStrings.Tilde
import typingsJapgolly.luaparse.luaparseStrings.`-_`
import typingsJapgolly.luaparse.luaparseStrings.not
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnaryExpression
  extends Expression
     with Base[typingsJapgolly.luaparse.luaparseStrings.UnaryExpression] {
  var argument: Expression
  var operator: not | `-_` | Tilde | Numbersign
}

object UnaryExpression {
  @scala.inline
  def apply(
    argument: Expression,
    operator: not | `-_` | Tilde | Numbersign,
    `type`: typingsJapgolly.luaparse.luaparseStrings.UnaryExpression,
    loc: AnonEnd = null
  ): UnaryExpression = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnaryExpression]
  }
}

