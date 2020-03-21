package typingsJapgolly.luaparse.astMod

import typingsJapgolly.luaparse.AnonEnd
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IfStatement
  extends _Statement
     with Base[typingsJapgolly.luaparse.luaparseStrings.IfStatement] {
  var clauses: js.Array[IfClause | ElseifClause | ElseClause]
}

object IfStatement {
  @scala.inline
  def apply(
    clauses: js.Array[IfClause | ElseifClause | ElseClause],
    `type`: typingsJapgolly.luaparse.luaparseStrings.IfStatement,
    loc: AnonEnd = null
  ): IfStatement = {
    val __obj = js.Dynamic.literal(clauses = clauses.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[IfStatement]
  }
}

