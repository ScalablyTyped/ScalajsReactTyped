package typingsJapgolly.antd.libAnchorAnchorLinkMod

import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnchorLinkProps extends js.Object {
  var children: js.UndefOr[Node] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var href: String
  var prefixCls: js.UndefOr[String] = js.undefined
  var target: js.UndefOr[String] = js.undefined
  var title: Node
}

object AnchorLinkProps {
  @scala.inline
  def apply(
    href: String,
    children: VdomNode = null,
    className: String = null,
    prefixCls: String = null,
    target: String = null,
    title: VdomNode = null
  ): AnchorLinkProps = {
    val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.rawNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnchorLinkProps]
  }
}

