package typingsJapgolly.antd.esEmptyMod

import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EmptyProps extends js.Object {
  var children: js.UndefOr[Node] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var description: js.UndefOr[Node] = js.undefined
  var image: js.UndefOr[Node] = js.undefined
  /**
    * @since 3.16.0
    */
  var imageStyle: js.UndefOr[CSSProperties] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object EmptyProps {
  @scala.inline
  def apply(
    children: VdomNode = null,
    className: String = null,
    description: VdomNode = null,
    image: VdomNode = null,
    imageStyle: CSSProperties = null,
    prefixCls: String = null,
    style: CSSProperties = null
  ): EmptyProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.rawNode.asInstanceOf[js.Any])
    if (image != null) __obj.updateDynamic("image")(image.rawNode.asInstanceOf[js.Any])
    if (imageStyle != null) __obj.updateDynamic("imageStyle")(imageStyle.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmptyProps]
  }
}

