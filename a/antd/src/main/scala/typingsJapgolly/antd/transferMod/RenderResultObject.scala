package typingsJapgolly.antd.transferMod

import japgolly.scalajs.react.raw.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenderResultObject extends js.Object {
  var label: Element
  var value: String
}

object RenderResultObject {
  @scala.inline
  def apply(label: VdomElement, value: String): RenderResultObject = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.rawElement.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenderResultObject]
  }
}

