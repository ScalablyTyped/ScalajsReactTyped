package typingsJapgolly.luaparse.astMod

import typingsJapgolly.luaparse.AnonEnd
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableCallExpression
  extends Expression
     with Base[typingsJapgolly.luaparse.luaparseStrings.TableCallExpression] {
  var arguments: Expression
  var base: Expression
}

object TableCallExpression {
  @scala.inline
  def apply(
    arguments: Expression,
    base: Expression,
    `type`: typingsJapgolly.luaparse.luaparseStrings.TableCallExpression,
    loc: AnonEnd = null
  ): TableCallExpression = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], base = base.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableCallExpression]
  }
}

