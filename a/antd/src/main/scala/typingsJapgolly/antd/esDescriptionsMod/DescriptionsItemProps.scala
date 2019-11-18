package typingsJapgolly.antd.esDescriptionsMod

import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescriptionsItemProps extends js.Object {
  var children: Node
  var className: js.UndefOr[String] = js.undefined
  var label: js.UndefOr[Node] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
  var span: js.UndefOr[Double] = js.undefined
}

object DescriptionsItemProps {
  @scala.inline
  def apply(
    children: VdomNode,
    className: String = null,
    label: VdomNode = null,
    prefixCls: String = null,
    span: Int | Double = null
  ): DescriptionsItemProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.rawNode.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (span != null) __obj.updateDynamic("span")(span.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescriptionsItemProps]
  }
}

