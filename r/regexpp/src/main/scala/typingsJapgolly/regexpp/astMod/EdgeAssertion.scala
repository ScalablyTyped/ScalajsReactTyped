package typingsJapgolly.regexpp.astMod

import typingsJapgolly.regexpp.regexppStrings.end
import typingsJapgolly.regexpp.regexppStrings.start
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EdgeAssertion
  extends BoundaryAssertion
     with NodeBase {
  var kind: start | end
  @JSName("parent")
  var parent_EdgeAssertion: Alternative | Quantifier
  @JSName("type")
  var type_EdgeAssertion: typingsJapgolly.regexpp.regexppStrings.Assertion
}

object EdgeAssertion {
  @scala.inline
  def apply(
    end: Double,
    kind: start | end,
    parent: Alternative | Quantifier,
    raw: String,
    start: Double,
    `type`: typingsJapgolly.regexpp.regexppStrings.Assertion
  ): EdgeAssertion = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EdgeAssertion]
  }
}

