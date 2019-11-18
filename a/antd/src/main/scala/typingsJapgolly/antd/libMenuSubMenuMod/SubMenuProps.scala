package typingsJapgolly.antd.libMenuSubMenuMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubMenuProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var onTitleClick: js.UndefOr[js.Function1[/* e */ TitleEventEntity, Unit]] = js.undefined
  var onTitleMouseEnter: js.UndefOr[js.Function1[/* e */ TitleEventEntity, Unit]] = js.undefined
  var onTitleMouseLeave: js.UndefOr[js.Function1[/* e */ TitleEventEntity, Unit]] = js.undefined
  var popupClassName: js.UndefOr[String] = js.undefined
  var popupOffset: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
  var rootPrefixCls: js.UndefOr[String] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var title: js.UndefOr[Node] = js.undefined
}

object SubMenuProps {
  @scala.inline
  def apply(
    className: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    onTitleClick: /* e */ TitleEventEntity => Callback = null,
    onTitleMouseEnter: /* e */ TitleEventEntity => Callback = null,
    onTitleMouseLeave: /* e */ TitleEventEntity => Callback = null,
    popupClassName: String = null,
    popupOffset: js.Tuple2[Double, Double] = null,
    rootPrefixCls: String = null,
    style: CSSProperties = null,
    title: VdomNode = null
  ): SubMenuProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (onTitleClick != null) __obj.updateDynamic("onTitleClick")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.antd.libMenuSubMenuMod.TitleEventEntity) => onTitleClick(t0).runNow()))
    if (onTitleMouseEnter != null) __obj.updateDynamic("onTitleMouseEnter")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.antd.libMenuSubMenuMod.TitleEventEntity) => onTitleMouseEnter(t0).runNow()))
    if (onTitleMouseLeave != null) __obj.updateDynamic("onTitleMouseLeave")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.antd.libMenuSubMenuMod.TitleEventEntity) => onTitleMouseLeave(t0).runNow()))
    if (popupClassName != null) __obj.updateDynamic("popupClassName")(popupClassName.asInstanceOf[js.Any])
    if (popupOffset != null) __obj.updateDynamic("popupOffset")(popupOffset.asInstanceOf[js.Any])
    if (rootPrefixCls != null) __obj.updateDynamic("rootPrefixCls")(rootPrefixCls.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.rawNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubMenuProps]
  }
}

