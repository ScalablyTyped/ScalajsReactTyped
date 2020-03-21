package typingsJapgolly.luaparse.astMod

import typingsJapgolly.luaparse.AnonEnd
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BooleanLiteral
  extends Expression
     with Base[typingsJapgolly.luaparse.luaparseStrings.BooleanLiteral] {
  var raw: String
  var value: Boolean
}

object BooleanLiteral {
  @scala.inline
  def apply(
    raw: String,
    `type`: typingsJapgolly.luaparse.luaparseStrings.BooleanLiteral,
    value: Boolean,
    loc: AnonEnd = null
  ): BooleanLiteral = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[BooleanLiteral]
  }
}

