package typingsJapgolly.rcDashMenu.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.rcDashMenu.Anon_DomEventKey
import typingsJapgolly.rcDashMenu.Anon_Hover
import typingsJapgolly.rcDashMenu.esInterfaceMod.MenuInfo
import typingsJapgolly.rcDashMenu.esInterfaceMod.MenuMode
import typingsJapgolly.rcDashMenu.esInterfaceMod.RenderIconType
import typingsJapgolly.rcDashMenu.esInterfaceMod.SelectInfo
import typingsJapgolly.rcDashMenu.esMenuItemMod.MenuItemProps
import typingsJapgolly.react.reactMod.CSSProperties
import typingsJapgolly.react.reactMod.Key
import typingsJapgolly.react.reactMod.ReactInstance
import typingsJapgolly.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object MenuItem {
  def apply(
    active: js.UndefOr[Boolean] = js.undefined,
    attribute: Record[String, String] = null,
    className: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    eventKey: Key = null,
    inlineIndent: Int | Double = null,
    isSelected: js.UndefOr[Boolean] = js.undefined,
    itemIcon: RenderIconType = null,
    level: Int | Double = null,
    manualRef: /* node */ ReactInstance => Callback = null,
    mode: MenuMode = null,
    multiple: js.UndefOr[Boolean] = js.undefined,
    onClick: /* info */ MenuInfo => Callback = null,
    onDeselect: /* info */ SelectInfo => Callback = null,
    onDestroy: /* key */ Key => Callback = null,
    onItemHover: /* info */ Anon_Hover => Callback = null,
    onMouseEnter: /* info */ Anon_DomEventKey => Callback = null,
    onMouseLeave: /* info */ Anon_DomEventKey => Callback = null,
    onSelect: /* info */ SelectInfo => Callback = null,
    parentMenu: ReactInstance = null,
    role: String = null,
    rootPrefixCls: String = null,
    selectedKeys: js.Array[String] = null,
    style: CSSProperties = null,
    title: String = null,
    key: js.UndefOr[japgolly.scalajs.react.Key] = js.undefined,
    overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[MenuItemProps, typingsJapgolly.rcDashMenu.esMenuItemMod.MenuItem, Unit, MenuItemProps] = {
    val __obj = js.Dynamic.literal()
  
      if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    if (attribute != null) __obj.updateDynamic("attribute")(attribute.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (eventKey != null) __obj.updateDynamic("eventKey")(eventKey.asInstanceOf[js.Any])
    if (inlineIndent != null) __obj.updateDynamic("inlineIndent")(inlineIndent.asInstanceOf[js.Any])
    if (!js.isUndefined(isSelected)) __obj.updateDynamic("isSelected")(isSelected.asInstanceOf[js.Any])
    if (itemIcon != null) __obj.updateDynamic("itemIcon")(itemIcon.asInstanceOf[js.Any])
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    if (manualRef != null) __obj.updateDynamic("manualRef")(js.Any.fromFunction1((t0: /* node */ typingsJapgolly.react.reactMod.ReactInstance) => manualRef(t0).runNow()))
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (!js.isUndefined(multiple)) __obj.updateDynamic("multiple")(multiple.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1((t0: /* info */ typingsJapgolly.rcDashMenu.esInterfaceMod.MenuInfo) => onClick(t0).runNow()))
    if (onDeselect != null) __obj.updateDynamic("onDeselect")(js.Any.fromFunction1((t0: /* info */ typingsJapgolly.rcDashMenu.esInterfaceMod.SelectInfo) => onDeselect(t0).runNow()))
    if (onDestroy != null) __obj.updateDynamic("onDestroy")(js.Any.fromFunction1((t0: /* key */ typingsJapgolly.react.reactMod.Key) => onDestroy(t0).runNow()))
    if (onItemHover != null) __obj.updateDynamic("onItemHover")(js.Any.fromFunction1((t0: /* info */ typingsJapgolly.rcDashMenu.Anon_Hover) => onItemHover(t0).runNow()))
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(js.Any.fromFunction1((t0: /* info */ typingsJapgolly.rcDashMenu.Anon_DomEventKey) => onMouseEnter(t0).runNow()))
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(js.Any.fromFunction1((t0: /* info */ typingsJapgolly.rcDashMenu.Anon_DomEventKey) => onMouseLeave(t0).runNow()))
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction1((t0: /* info */ typingsJapgolly.rcDashMenu.esInterfaceMod.SelectInfo) => onSelect(t0).runNow()))
    if (parentMenu != null) __obj.updateDynamic("parentMenu")(parentMenu.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    if (rootPrefixCls != null) __obj.updateDynamic("rootPrefixCls")(rootPrefixCls.asInstanceOf[js.Any])
    if (selectedKeys != null) __obj.updateDynamic("selectedKeys")(selectedKeys.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.rcDashMenu.esMenuItemMod.MenuItemProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.rcDashMenu.esMenuItemMod.MenuItem](js.constructorOf[typingsJapgolly.rcDashMenu.esMenuItemMod.MenuItem])
    f(__obj.asInstanceOf[typingsJapgolly.rcDashMenu.esMenuItemMod.MenuItemProps])(children: _*)
  }
}

