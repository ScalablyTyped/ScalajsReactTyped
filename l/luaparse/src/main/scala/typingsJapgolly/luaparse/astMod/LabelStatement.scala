package typingsJapgolly.luaparse.astMod

import typingsJapgolly.luaparse.AnonEnd
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LabelStatement
  extends _Statement
     with Base[typingsJapgolly.luaparse.luaparseStrings.LabelStatement] {
  var label: Identifier
}

object LabelStatement {
  @scala.inline
  def apply(
    label: Identifier,
    `type`: typingsJapgolly.luaparse.luaparseStrings.LabelStatement,
    loc: AnonEnd = null
  ): LabelStatement = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[LabelStatement]
  }
}

