package typingsJapgolly.luaparse.astMod

import typingsJapgolly.luaparse.AnonEnd
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableKeyString
  extends Base[typingsJapgolly.luaparse.luaparseStrings.TableKeyString]
     with _Node {
  var key: Identifier
  var value: Expression
}

object TableKeyString {
  @scala.inline
  def apply(
    key: Identifier,
    `type`: typingsJapgolly.luaparse.luaparseStrings.TableKeyString,
    value: Expression,
    loc: AnonEnd = null
  ): TableKeyString = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableKeyString]
  }
}

