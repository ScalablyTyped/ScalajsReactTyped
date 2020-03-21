package typingsJapgolly.luaparse.astMod

import typingsJapgolly.luaparse.AnonEnd
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NilLiteral
  extends Expression
     with Base[typingsJapgolly.luaparse.luaparseStrings.NilLiteral] {
  var raw: String
  var value: Null
}

object NilLiteral {
  @scala.inline
  def apply(
    raw: String,
    `type`: typingsJapgolly.luaparse.luaparseStrings.NilLiteral,
    value: Null,
    loc: AnonEnd = null
  ): NilLiteral = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[NilLiteral]
  }
}

