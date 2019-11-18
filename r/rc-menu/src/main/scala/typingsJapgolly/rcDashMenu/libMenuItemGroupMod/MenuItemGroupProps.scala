package typingsJapgolly.rcDashMenu.libMenuItemGroupMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Element
import typingsJapgolly.rcDashMenu.libInterfaceMod.MenuClickEventHandler
import typingsJapgolly.rcDashMenu.libInterfaceMod.MenuInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MenuItemGroupProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var index: js.UndefOr[Double] = js.undefined
  var onClick: js.UndefOr[MenuClickEventHandler] = js.undefined
  var renderMenuItem: js.UndefOr[js.Function3[/* item */ Element, /* index */ Double, /* key */ String, Element]] = js.undefined
  var rootPrefixCls: js.UndefOr[String] = js.undefined
  var subMenuKey: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[String] = js.undefined
}

object MenuItemGroupProps {
  @scala.inline
  def apply(
    className: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    index: Int | Double = null,
    onClick: /* info */ MenuInfo => Callback = null,
    renderMenuItem: (/* item */ Element, /* index */ Double, /* key */ String) => CallbackTo[Element] = null,
    rootPrefixCls: String = null,
    subMenuKey: String = null,
    title: String = null
  ): MenuItemGroupProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1((t0: /* info */ typingsJapgolly.rcDashMenu.libInterfaceMod.MenuInfo) => onClick(t0).runNow()))
    if (renderMenuItem != null) __obj.updateDynamic("renderMenuItem")(js.Any.fromFunction3((t0: /* item */ japgolly.scalajs.react.raw.React.Element, t1: /* index */ scala.Double, t2: /* key */ java.lang.String) => renderMenuItem(t0, t1, t2).runNow()))
    if (rootPrefixCls != null) __obj.updateDynamic("rootPrefixCls")(rootPrefixCls.asInstanceOf[js.Any])
    if (subMenuKey != null) __obj.updateDynamic("subMenuKey")(subMenuKey.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[MenuItemGroupProps]
  }
}

