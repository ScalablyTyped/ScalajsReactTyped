package typingsJapgolly.rcDashMenu.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.rcDashMenu.Anon_Item
import typingsJapgolly.rcDashMenu.esInterfaceMod.BuiltinPlacements
import typingsJapgolly.rcDashMenu.esInterfaceMod.MenuInfo
import typingsJapgolly.rcDashMenu.esInterfaceMod.MenuMode
import typingsJapgolly.rcDashMenu.esInterfaceMod.MotionType
import typingsJapgolly.rcDashMenu.esInterfaceMod.OpenAnimation
import typingsJapgolly.rcDashMenu.esInterfaceMod.RenderIconType
import typingsJapgolly.rcDashMenu.esInterfaceMod.SelectInfo
import typingsJapgolly.rcDashMenu.esInterfaceMod.TriggerSubMenuAction
import typingsJapgolly.rcDashMenu.esMenuMod.MenuProps
import typingsJapgolly.react.reactMod.CSSProperties
import typingsJapgolly.react.reactMod.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

abstract class SharedApply_MenuProps_858679698[ComponentRef] () {
  def __component: js.Any
  def apply(
    activeKey: String = null,
    builtinPlacements: BuiltinPlacements = null,
    className: String = null,
    defaultActiveFirst: js.UndefOr[Boolean] = js.undefined,
    defaultOpenKeys: js.Array[String] = null,
    defaultSelectedKeys: js.Array[String] = null,
    expandIcon: RenderIconType = null,
    forceSubMenuRender: js.UndefOr[Boolean] = js.undefined,
    getPopupContainer: /* node */ HTMLElement => CallbackTo[HTMLElement] = null,
    itemIcon: RenderIconType = null,
    level: Int | Double = null,
    mode: MenuMode = null,
    motion: MotionType = null,
    multiple: js.UndefOr[Boolean] = js.undefined,
    onClick: /* info */ MenuInfo => Callback = null,
    onDeselect: /* info */ SelectInfo => Callback = null,
    onDestroy: /* key */ Key => Callback = null,
    onOpenChange: /* keys */ js.Array[Key] | Anon_Item => Callback = null,
    onSelect: /* info */ SelectInfo => Callback = null,
    openAnimation: OpenAnimation = null,
    openKeys: js.Array[String] = null,
    openTransitionName: String = null,
    overflowedIndicator: VdomNode = null,
    prefixCls: String = null,
    selectable: js.UndefOr[Boolean] = js.undefined,
    selectedKeys: js.Array[String] = null,
    style: CSSProperties = null,
    subMenuCloseDelay: Int | Double = null,
    subMenuOpenDelay: Int | Double = null,
    triggerSubMenuAction: TriggerSubMenuAction = null,
    key: js.UndefOr[japgolly.scalajs.react.Key] = js.undefined,
    overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[MenuProps, ComponentRef, Unit, MenuProps] = {
    val __obj = js.Dynamic.literal()
  
      if (activeKey != null) __obj.updateDynamic("activeKey")(activeKey.asInstanceOf[js.Any])
    if (builtinPlacements != null) __obj.updateDynamic("builtinPlacements")(builtinPlacements.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultActiveFirst)) __obj.updateDynamic("defaultActiveFirst")(defaultActiveFirst.asInstanceOf[js.Any])
    if (defaultOpenKeys != null) __obj.updateDynamic("defaultOpenKeys")(defaultOpenKeys.asInstanceOf[js.Any])
    if (defaultSelectedKeys != null) __obj.updateDynamic("defaultSelectedKeys")(defaultSelectedKeys.asInstanceOf[js.Any])
    if (expandIcon != null) __obj.updateDynamic("expandIcon")(expandIcon.asInstanceOf[js.Any])
    if (!js.isUndefined(forceSubMenuRender)) __obj.updateDynamic("forceSubMenuRender")(forceSubMenuRender.asInstanceOf[js.Any])
    if (getPopupContainer != null) __obj.updateDynamic("getPopupContainer")(js.Any.fromFunction1((t0: /* node */ org.scalajs.dom.raw.HTMLElement) => getPopupContainer(t0).runNow()))
    if (itemIcon != null) __obj.updateDynamic("itemIcon")(itemIcon.asInstanceOf[js.Any])
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (motion != null) __obj.updateDynamic("motion")(motion.asInstanceOf[js.Any])
    if (!js.isUndefined(multiple)) __obj.updateDynamic("multiple")(multiple.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1((t0: /* info */ typingsJapgolly.rcDashMenu.esInterfaceMod.MenuInfo) => onClick(t0).runNow()))
    if (onDeselect != null) __obj.updateDynamic("onDeselect")(js.Any.fromFunction1((t0: /* info */ typingsJapgolly.rcDashMenu.esInterfaceMod.SelectInfo) => onDeselect(t0).runNow()))
    if (onDestroy != null) __obj.updateDynamic("onDestroy")(js.Any.fromFunction1((t0: /* key */ typingsJapgolly.react.reactMod.Key) => onDestroy(t0).runNow()))
    if (onOpenChange != null) __obj.updateDynamic("onOpenChange")(js.Any.fromFunction1((t0: /* keys */ js.Array[typingsJapgolly.react.reactMod.Key] | typingsJapgolly.rcDashMenu.Anon_Item) => onOpenChange(t0).runNow()))
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction1((t0: /* info */ typingsJapgolly.rcDashMenu.esInterfaceMod.SelectInfo) => onSelect(t0).runNow()))
    if (openAnimation != null) __obj.updateDynamic("openAnimation")(openAnimation.asInstanceOf[js.Any])
    if (openKeys != null) __obj.updateDynamic("openKeys")(openKeys.asInstanceOf[js.Any])
    if (openTransitionName != null) __obj.updateDynamic("openTransitionName")(openTransitionName.asInstanceOf[js.Any])
    if (overflowedIndicator != null) __obj.updateDynamic("overflowedIndicator")(overflowedIndicator.rawNode.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (!js.isUndefined(selectable)) __obj.updateDynamic("selectable")(selectable.asInstanceOf[js.Any])
    if (selectedKeys != null) __obj.updateDynamic("selectedKeys")(selectedKeys.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (subMenuCloseDelay != null) __obj.updateDynamic("subMenuCloseDelay")(subMenuCloseDelay.asInstanceOf[js.Any])
    if (subMenuOpenDelay != null) __obj.updateDynamic("subMenuOpenDelay")(subMenuOpenDelay.asInstanceOf[js.Any])
    if (triggerSubMenuAction != null) __obj.updateDynamic("triggerSubMenuAction")(triggerSubMenuAction.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.rcDashMenu.esMenuMod.MenuProps, 
  japgolly.scalajs.react.Children.Varargs, 
  ComponentRef](__component)
    f(__obj.asInstanceOf[typingsJapgolly.rcDashMenu.esMenuMod.MenuProps])(children: _*)
  }
}

