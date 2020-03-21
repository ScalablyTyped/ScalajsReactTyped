package typingsJapgolly.luaparse.astMod

import typingsJapgolly.luaparse.AnonEnd
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ElseifClause
  extends Base[typingsJapgolly.luaparse.luaparseStrings.ElseifClause]
     with _Node {
  var body: js.Array[Statement]
  var condition: Expression
}

object ElseifClause {
  @scala.inline
  def apply(
    body: js.Array[Statement],
    condition: Expression,
    `type`: typingsJapgolly.luaparse.luaparseStrings.ElseifClause,
    loc: AnonEnd = null
  ): ElseifClause = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], condition = condition.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElseifClause]
  }
}

