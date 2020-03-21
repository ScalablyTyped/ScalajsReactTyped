package typingsJapgolly.luaparse.astMod

import typingsJapgolly.luaparse.AnonEnd
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableConstructorExpression
  extends Expression
     with Base[typingsJapgolly.luaparse.luaparseStrings.TableConstructorExpression] {
  var fields: js.Array[TableKey | TableKeyString | TableValue]
}

object TableConstructorExpression {
  @scala.inline
  def apply(
    fields: js.Array[TableKey | TableKeyString | TableValue],
    `type`: typingsJapgolly.luaparse.luaparseStrings.TableConstructorExpression,
    loc: AnonEnd = null
  ): TableConstructorExpression = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableConstructorExpression]
  }
}

