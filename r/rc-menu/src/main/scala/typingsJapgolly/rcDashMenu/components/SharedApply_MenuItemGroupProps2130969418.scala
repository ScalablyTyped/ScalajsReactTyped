package typingsJapgolly.rcDashMenu.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Element
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.rcDashMenu.esInterfaceMod.MenuInfo
import typingsJapgolly.rcDashMenu.esMenuItemGroupMod.MenuItemGroupProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

abstract class SharedApply_MenuItemGroupProps2130969418[ComponentRef] () {
  def __component: js.Any
  def apply(
    className: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    index: Int | Double = null,
    onClick: /* info */ MenuInfo => Callback = null,
    renderMenuItem: (/* item */ Element, /* index */ Double, /* key */ String) => CallbackTo[Element] = null,
    rootPrefixCls: String = null,
    subMenuKey: String = null,
    title: String = null,
    key: js.UndefOr[Key] = js.undefined,
    overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[MenuItemGroupProps, ComponentRef, Unit, MenuItemGroupProps] = {
    val __obj = js.Dynamic.literal()
  
      if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1((t0: /* info */ typingsJapgolly.rcDashMenu.esInterfaceMod.MenuInfo) => onClick(t0).runNow()))
    if (renderMenuItem != null) __obj.updateDynamic("renderMenuItem")(js.Any.fromFunction3((t0: /* item */ japgolly.scalajs.react.raw.React.Element, t1: /* index */ scala.Double, t2: /* key */ java.lang.String) => renderMenuItem(t0, t1, t2).runNow()))
    if (rootPrefixCls != null) __obj.updateDynamic("rootPrefixCls")(rootPrefixCls.asInstanceOf[js.Any])
    if (subMenuKey != null) __obj.updateDynamic("subMenuKey")(subMenuKey.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.rcDashMenu.esMenuItemGroupMod.MenuItemGroupProps, 
  japgolly.scalajs.react.Children.Varargs, 
  ComponentRef](__component)
    f(__obj.asInstanceOf[typingsJapgolly.rcDashMenu.esMenuItemGroupMod.MenuItemGroupProps])(children: _*)
  }
}

