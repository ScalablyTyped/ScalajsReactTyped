package typingsJapgolly.regexpp.astMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegExpLiteral
  extends BranchNode
     with NodeBase {
  var flags: Flags
  @JSName("parent")
  var parent_RegExpLiteral: Null
  var pattern: Pattern
  @JSName("type")
  var type_RegExpLiteral: typingsJapgolly.regexpp.regexppStrings.RegExpLiteral
}

object RegExpLiteral {
  @scala.inline
  def apply(
    end: Double,
    flags: Flags,
    parent: Null,
    pattern: Pattern,
    raw: String,
    start: Double,
    `type`: typingsJapgolly.regexpp.regexppStrings.RegExpLiteral
  ): RegExpLiteral = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegExpLiteral]
  }
}

