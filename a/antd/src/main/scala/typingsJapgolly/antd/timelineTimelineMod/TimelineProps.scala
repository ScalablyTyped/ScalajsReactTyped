package typingsJapgolly.antd.timelineTimelineMod

import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.antd.antdStrings.alternate
import typingsJapgolly.antd.antdStrings.left
import typingsJapgolly.antd.antdStrings.right
import typingsJapgolly.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimelineProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var mode: js.UndefOr[left | alternate | right] = js.undefined
  /** 指定最后一个幽灵节点是否存在或内容 */
  var pending: js.UndefOr[Node] = js.undefined
  var pendingDot: js.UndefOr[Node] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
  var reverse: js.UndefOr[Boolean] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object TimelineProps {
  @scala.inline
  def apply(
    className: String = null,
    mode: left | alternate | right = null,
    pending: VdomNode = null,
    pendingDot: VdomNode = null,
    prefixCls: String = null,
    reverse: js.UndefOr[Boolean] = js.undefined,
    style: CSSProperties = null
  ): TimelineProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (pending != null) __obj.updateDynamic("pending")(pending.rawNode.asInstanceOf[js.Any])
    if (pendingDot != null) __obj.updateDynamic("pendingDot")(pendingDot.rawNode.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (!js.isUndefined(reverse)) __obj.updateDynamic("reverse")(reverse.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimelineProps]
  }
}

