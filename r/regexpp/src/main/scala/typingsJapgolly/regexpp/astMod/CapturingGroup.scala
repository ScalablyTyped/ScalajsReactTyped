package typingsJapgolly.regexpp.astMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CapturingGroup
  extends BranchNode
     with NodeBase
     with QuantifiableElement {
  var alternatives: js.Array[Alternative]
  var name: String | Null
  @JSName("parent")
  var parent_CapturingGroup: Alternative | Quantifier
  var references: js.Array[Backreference]
  @JSName("type")
  var type_CapturingGroup: typingsJapgolly.regexpp.regexppStrings.CapturingGroup
}

object CapturingGroup {
  @scala.inline
  def apply(
    alternatives: js.Array[Alternative],
    end: Double,
    parent: Alternative | Quantifier,
    raw: String,
    references: js.Array[Backreference],
    start: Double,
    `type`: typingsJapgolly.regexpp.regexppStrings.CapturingGroup,
    name: String = null
  ): CapturingGroup = {
    val __obj = js.Dynamic.literal(alternatives = alternatives.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], references = references.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CapturingGroup]
  }
}

