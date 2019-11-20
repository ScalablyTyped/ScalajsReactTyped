package typingsJapgolly.antd.libTableInterfaceMod

import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnFilterItem extends js.Object {
  var children: js.UndefOr[js.Array[ColumnFilterItem]] = js.undefined
  var text: Node
  var value: String
}

object ColumnFilterItem {
  @scala.inline
  def apply(value: String, children: js.Array[ColumnFilterItem] = null, text: VdomNode = null): ColumnFilterItem = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.rawNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnFilterItem]
  }
}

