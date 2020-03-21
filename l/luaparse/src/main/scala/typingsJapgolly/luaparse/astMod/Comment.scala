package typingsJapgolly.luaparse.astMod

import typingsJapgolly.luaparse.AnonEnd
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Comment
  extends Base[typingsJapgolly.luaparse.luaparseStrings.Comment]
     with _Node {
  var raw: String
  var value: String
}

object Comment {
  @scala.inline
  def apply(
    raw: String,
    `type`: typingsJapgolly.luaparse.luaparseStrings.Comment,
    value: String,
    loc: AnonEnd = null
  ): Comment = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[Comment]
  }
}

