package typingsJapgolly.luaparse.astMod

import typingsJapgolly.luaparse.AnonEnd
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReturnStatement
  extends _Statement
     with Base[typingsJapgolly.luaparse.luaparseStrings.ReturnStatement] {
  var arguments: js.Array[Expression]
}

object ReturnStatement {
  @scala.inline
  def apply(
    arguments: js.Array[Expression],
    `type`: typingsJapgolly.luaparse.luaparseStrings.ReturnStatement,
    loc: AnonEnd = null
  ): ReturnStatement = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnStatement]
  }
}

