package typingsJapgolly.rcDashMenu.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.rcDashMenu.Anon_Item
import typingsJapgolly.rcDashMenu.libInterfaceMod.BuiltinPlacements
import typingsJapgolly.rcDashMenu.libInterfaceMod.MenuInfo
import typingsJapgolly.rcDashMenu.libInterfaceMod.MenuMode
import typingsJapgolly.rcDashMenu.libInterfaceMod.MiniStore
import typingsJapgolly.rcDashMenu.libInterfaceMod.MotionType
import typingsJapgolly.rcDashMenu.libInterfaceMod.RenderIconType
import typingsJapgolly.rcDashMenu.libInterfaceMod.SelectInfo
import typingsJapgolly.rcDashMenu.libInterfaceMod.TriggerSubMenuAction
import typingsJapgolly.rcDashMenu.libSubPopupMenuMod.SubPopupMenuProps
import typingsJapgolly.rcDashMenu.libSubPopupMenuMod.default
import typingsJapgolly.react.reactMod.CSSProperties
import typingsJapgolly.react.reactMod.Key
import typingsJapgolly.react.reactMod.ReactInstance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object SubPopupMenu {
  def apply(
    activeKey: String = null,
    builtinPlacements: BuiltinPlacements = null,
    className: String = null,
    defaultActiveFirst: js.UndefOr[Boolean] = js.undefined,
    defaultOpenKeys: js.Array[String] = null,
    defaultSelectedKeys: js.Array[String] = null,
    eventKey: Key = null,
    expandIcon: RenderIconType = null,
    focusable: js.UndefOr[Boolean] = js.undefined,
    forceSubMenuRender: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    inlineIndent: Int | Double = null,
    itemIcon: RenderIconType = null,
    level: Int | Double = null,
    manualRef: /* node */ ReactInstance => Callback = null,
    mode: MenuMode = null,
    motion: MotionType = null,
    multiple: js.UndefOr[Boolean] = js.undefined,
    onClick: /* info */ MenuInfo => Callback = null,
    onDeselect: /* info */ SelectInfo => Callback = null,
    onDestroy: /* key */ Key => Callback = null,
    onOpenChange: /* keys */ js.Array[Key] | Anon_Item => Callback = null,
    onSelect: /* info */ SelectInfo => Callback = null,
    openKeys: js.Array[String] = null,
    overflowedIndicator: VdomNode = null,
    parentMenu: ReactInstance = null,
    prefixCls: String = null,
    role: String = null,
    selectedKeys: js.Array[String] = null,
    store: MiniStore = null,
    style: CSSProperties = null,
    subMenuCloseDelay: Int | Double = null,
    subMenuOpenDelay: Int | Double = null,
    theme: String = null,
    triggerSubMenuAction: TriggerSubMenuAction = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    key: js.UndefOr[japgolly.scalajs.react.Key] = js.undefined,
    overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[SubPopupMenuProps, default, Unit, SubPopupMenuProps] = {
    val __obj = js.Dynamic.literal()
  
      if (activeKey != null) __obj.updateDynamic("activeKey")(activeKey.asInstanceOf[js.Any])
    if (builtinPlacements != null) __obj.updateDynamic("builtinPlacements")(builtinPlacements.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultActiveFirst)) __obj.updateDynamic("defaultActiveFirst")(defaultActiveFirst.asInstanceOf[js.Any])
    if (defaultOpenKeys != null) __obj.updateDynamic("defaultOpenKeys")(defaultOpenKeys.asInstanceOf[js.Any])
    if (defaultSelectedKeys != null) __obj.updateDynamic("defaultSelectedKeys")(defaultSelectedKeys.asInstanceOf[js.Any])
    if (eventKey != null) __obj.updateDynamic("eventKey")(eventKey.asInstanceOf[js.Any])
    if (expandIcon != null) __obj.updateDynamic("expandIcon")(expandIcon.asInstanceOf[js.Any])
    if (!js.isUndefined(focusable)) __obj.updateDynamic("focusable")(focusable.asInstanceOf[js.Any])
    if (!js.isUndefined(forceSubMenuRender)) __obj.updateDynamic("forceSubMenuRender")(forceSubMenuRender.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (inlineIndent != null) __obj.updateDynamic("inlineIndent")(inlineIndent.asInstanceOf[js.Any])
    if (itemIcon != null) __obj.updateDynamic("itemIcon")(itemIcon.asInstanceOf[js.Any])
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    if (manualRef != null) __obj.updateDynamic("manualRef")(js.Any.fromFunction1((t0: /* node */ typingsJapgolly.react.reactMod.ReactInstance) => manualRef(t0).runNow()))
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (motion != null) __obj.updateDynamic("motion")(motion.asInstanceOf[js.Any])
    if (!js.isUndefined(multiple)) __obj.updateDynamic("multiple")(multiple.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1((t0: /* info */ typingsJapgolly.rcDashMenu.libInterfaceMod.MenuInfo) => onClick(t0).runNow()))
    if (onDeselect != null) __obj.updateDynamic("onDeselect")(js.Any.fromFunction1((t0: /* info */ typingsJapgolly.rcDashMenu.libInterfaceMod.SelectInfo) => onDeselect(t0).runNow()))
    if (onDestroy != null) __obj.updateDynamic("onDestroy")(js.Any.fromFunction1((t0: /* key */ typingsJapgolly.react.reactMod.Key) => onDestroy(t0).runNow()))
    if (onOpenChange != null) __obj.updateDynamic("onOpenChange")(js.Any.fromFunction1((t0: /* keys */ js.Array[typingsJapgolly.react.reactMod.Key] | typingsJapgolly.rcDashMenu.Anon_Item) => onOpenChange(t0).runNow()))
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction1((t0: /* info */ typingsJapgolly.rcDashMenu.libInterfaceMod.SelectInfo) => onSelect(t0).runNow()))
    if (openKeys != null) __obj.updateDynamic("openKeys")(openKeys.asInstanceOf[js.Any])
    if (overflowedIndicator != null) __obj.updateDynamic("overflowedIndicator")(overflowedIndicator.rawNode.asInstanceOf[js.Any])
    if (parentMenu != null) __obj.updateDynamic("parentMenu")(parentMenu.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    if (selectedKeys != null) __obj.updateDynamic("selectedKeys")(selectedKeys.asInstanceOf[js.Any])
    if (store != null) __obj.updateDynamic("store")(store.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (subMenuCloseDelay != null) __obj.updateDynamic("subMenuCloseDelay")(subMenuCloseDelay.asInstanceOf[js.Any])
    if (subMenuOpenDelay != null) __obj.updateDynamic("subMenuOpenDelay")(subMenuOpenDelay.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (triggerSubMenuAction != null) __obj.updateDynamic("triggerSubMenuAction")(triggerSubMenuAction.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.rcDashMenu.libSubPopupMenuMod.SubPopupMenuProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.rcDashMenu.libSubPopupMenuMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.rcDashMenu.libSubPopupMenuMod.SubPopupMenuProps])(children: _*)
  }
  @JSImport("rc-menu/lib/SubPopupMenu", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

