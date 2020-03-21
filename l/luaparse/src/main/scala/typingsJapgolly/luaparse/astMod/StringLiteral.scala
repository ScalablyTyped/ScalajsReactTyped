package typingsJapgolly.luaparse.astMod

import typingsJapgolly.luaparse.AnonEnd
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StringLiteral
  extends Expression
     with Base[typingsJapgolly.luaparse.luaparseStrings.StringLiteral] {
  var raw: String
  var value: String
}

object StringLiteral {
  @scala.inline
  def apply(
    raw: String,
    `type`: typingsJapgolly.luaparse.luaparseStrings.StringLiteral,
    value: String,
    loc: AnonEnd = null
  ): StringLiteral = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[StringLiteral]
  }
}

