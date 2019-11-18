package typingsJapgolly.antd

import japgolly.scalajs.react.raw.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_MonthReactNode extends js.Object {
  var monthReactNode: Element | Null
  var yearReactNode: Element
}

object Anon_MonthReactNode {
  @scala.inline
  def apply(yearReactNode: VdomElement, monthReactNode: VdomElement = null): Anon_MonthReactNode = {
    val __obj = js.Dynamic.literal()
    if (yearReactNode != null) __obj.updateDynamic("yearReactNode")(yearReactNode.rawElement.asInstanceOf[js.Any])
    if (monthReactNode != null) __obj.updateDynamic("monthReactNode")(monthReactNode.rawElement.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_MonthReactNode]
  }
}

