package typingsJapgolly.rcNotification.noticeMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.raw.HTMLDivElement
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.MouseEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NoticeProps extends js.Object {
  var children: js.UndefOr[Node] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var closable: js.UndefOr[Boolean] = js.undefined
  var closeIcon: js.UndefOr[Node] = js.undefined
  var duration: js.UndefOr[Double | Null] = js.undefined
  /** @private Only for internal usage. We don't promise that we will refactor this */
  var holder: js.UndefOr[HTMLDivElement] = js.undefined
  var onClick: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.undefined
  var onClose: js.UndefOr[js.Function0[Unit]] = js.undefined
  var prefixCls: String
  var style: js.UndefOr[CSSProperties] = js.undefined
  var update: js.UndefOr[Boolean] = js.undefined
}

object NoticeProps {
  @scala.inline
  def apply(
    prefixCls: String,
    children: VdomNode = null,
    className: String = null,
    closable: js.UndefOr[Boolean] = js.undefined,
    closeIcon: VdomNode = null,
    duration: Int | Double = null,
    holder: HTMLDivElement = null,
    onClick: ReactMouseEventFrom[HTMLDivElement] => Callback = null,
    onClose: js.UndefOr[Callback] = js.undefined,
    style: CSSProperties = null,
    update: js.UndefOr[Boolean] = js.undefined
  ): NoticeProps = {
    val __obj = js.Dynamic.literal(prefixCls = prefixCls.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(closable)) __obj.updateDynamic("closable")(closable.asInstanceOf[js.Any])
    if (closeIcon != null) __obj.updateDynamic("closeIcon")(closeIcon.rawNode.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (holder != null) __obj.updateDynamic("holder")(holder.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLDivElement]) => onClick(t0).runNow()))
    onClose.foreach(p => __obj.updateDynamic("onClose")(p.toJsFn))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(update)) __obj.updateDynamic("update")(update.asInstanceOf[js.Any])
    __obj.asInstanceOf[NoticeProps]
  }
}

