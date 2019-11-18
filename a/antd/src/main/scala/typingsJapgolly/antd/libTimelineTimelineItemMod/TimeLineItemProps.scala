package typingsJapgolly.antd.libTimelineTimelineItemMod

import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimeLineItemProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var color: js.UndefOr[String] = js.undefined
  var dot: js.UndefOr[Node] = js.undefined
  var pending: js.UndefOr[Boolean] = js.undefined
  var position: js.UndefOr[String] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object TimeLineItemProps {
  @scala.inline
  def apply(
    className: String = null,
    color: String = null,
    dot: VdomNode = null,
    pending: js.UndefOr[Boolean] = js.undefined,
    position: String = null,
    prefixCls: String = null,
    style: CSSProperties = null
  ): TimeLineItemProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (dot != null) __obj.updateDynamic("dot")(dot.rawNode.asInstanceOf[js.Any])
    if (!js.isUndefined(pending)) __obj.updateDynamic("pending")(pending.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimeLineItemProps]
  }
}

