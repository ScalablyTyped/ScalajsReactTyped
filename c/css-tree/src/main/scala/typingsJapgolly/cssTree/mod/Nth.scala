package typingsJapgolly.cssTree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Nth
  extends CssNodeCommon
     with CssNode {
  var nth: AnPlusB | Identifier
  var selector: SelectorList | Null
  @JSName("type")
  var type_Nth: typingsJapgolly.cssTree.cssTreeStrings.Nth
}

object Nth {
  @scala.inline
  def apply(
    nth: AnPlusB | Identifier,
    `type`: typingsJapgolly.cssTree.cssTreeStrings.Nth,
    loc: CssLocation = null,
    selector: SelectorList = null
  ): Nth = {
    val __obj = js.Dynamic.literal(nth = nth.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (selector != null) __obj.updateDynamic("selector")(selector.asInstanceOf[js.Any])
    __obj.asInstanceOf[Nth]
  }
}

