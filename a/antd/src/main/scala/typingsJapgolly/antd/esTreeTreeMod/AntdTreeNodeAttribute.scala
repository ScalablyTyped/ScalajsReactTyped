package typingsJapgolly.antd.esTreeTreeMod

import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AntdTreeNodeAttribute extends js.Object {
  var checked: Boolean
  var children: Node
  var className: String
  var disableCheckbox: Boolean
  var disabled: Boolean
  var dragOver: Boolean
  var dragOverGapBottom: Boolean
  var dragOverGapTop: Boolean
  var eventKey: String
  var expanded: Boolean
  var halfChecked: Boolean
  var isLeaf: Boolean
  var pos: String
  var prefixCls: String
  var selectable: Boolean
  var selected: Boolean
  var title: Node
}

object AntdTreeNodeAttribute {
  @scala.inline
  def apply(
    checked: Boolean,
    className: String,
    disableCheckbox: Boolean,
    disabled: Boolean,
    dragOver: Boolean,
    dragOverGapBottom: Boolean,
    dragOverGapTop: Boolean,
    eventKey: String,
    expanded: Boolean,
    halfChecked: Boolean,
    isLeaf: Boolean,
    pos: String,
    prefixCls: String,
    selectable: Boolean,
    selected: Boolean,
    children: VdomNode = null,
    title: VdomNode = null
  ): AntdTreeNodeAttribute = {
    val __obj = js.Dynamic.literal(checked = checked.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], disableCheckbox = disableCheckbox.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], dragOver = dragOver.asInstanceOf[js.Any], dragOverGapBottom = dragOverGapBottom.asInstanceOf[js.Any], dragOverGapTop = dragOverGapTop.asInstanceOf[js.Any], eventKey = eventKey.asInstanceOf[js.Any], expanded = expanded.asInstanceOf[js.Any], halfChecked = halfChecked.asInstanceOf[js.Any], isLeaf = isLeaf.asInstanceOf[js.Any], pos = pos.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any], selectable = selectable.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.rawNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[AntdTreeNodeAttribute]
  }
}

