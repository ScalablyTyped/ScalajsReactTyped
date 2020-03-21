package typingsJapgolly.luaparse.astMod

import typingsJapgolly.luaparse.AnonEnd
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Identifier
  extends Expression
     with Base[typingsJapgolly.luaparse.luaparseStrings.Identifier] {
  var name: String
}

object Identifier {
  @scala.inline
  def apply(name: String, `type`: typingsJapgolly.luaparse.luaparseStrings.Identifier, loc: AnonEnd = null): Identifier = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[Identifier]
  }
}

