package typingsJapgolly.rcTreeSelect.interfaceMod

import japgolly.scalajs.react.vdom.VdomNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TreeDataNode extends DataNode {
  @JSName("children")
  var children_TreeDataNode: js.UndefOr[js.Array[TreeDataNode]] = js.undefined
  @JSName("key")
  var key_TreeDataNode: Key
}

object TreeDataNode {
  @scala.inline
  def apply(
    key: Key,
    checkable: js.UndefOr[Boolean] = js.undefined,
    children: js.Array[TreeDataNode] = null,
    disableCheckbox: js.UndefOr[Boolean] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    label: VdomNode = null,
    title: VdomNode = null,
    value: RawValueType = null
  ): TreeDataNode = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    if (!js.isUndefined(checkable)) __obj.updateDynamic("checkable")(checkable.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(disableCheckbox)) __obj.updateDynamic("disableCheckbox")(disableCheckbox.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.rawNode.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.rawNode.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeDataNode]
  }
}

