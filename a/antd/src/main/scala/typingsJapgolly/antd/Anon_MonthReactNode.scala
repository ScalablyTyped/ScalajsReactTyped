package typingsJapgolly.antd

import typingsJapgolly.react.reactMod._Global_.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_MonthReactNode extends js.Object {
  var monthReactNode: Element | Null
  var yearReactNode: Element
}

object Anon_MonthReactNode {
  @scala.inline
  def apply(yearReactNode: Element, monthReactNode: Element = null): Anon_MonthReactNode = {
    val __obj = js.Dynamic.literal(yearReactNode = yearReactNode.asInstanceOf[js.Any])
    if (monthReactNode != null) __obj.updateDynamic("monthReactNode")(monthReactNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_MonthReactNode]
  }
}

