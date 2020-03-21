package typingsJapgolly.rmcCascader.cascaderTypesMod

import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICascaderDataItem extends js.Object {
  var children: js.UndefOr[js.Array[ICascaderDataItem]] = js.undefined
  var label: Node
  var value: CascaderOneValue
}

object ICascaderDataItem {
  @scala.inline
  def apply(value: CascaderOneValue, children: js.Array[ICascaderDataItem] = null, label: VdomNode = null): ICascaderDataItem = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.rawNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICascaderDataItem]
  }
}

