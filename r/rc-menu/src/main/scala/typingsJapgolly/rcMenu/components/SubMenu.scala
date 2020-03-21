package typingsJapgolly.rcMenu.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.rcMenu.AnonDomEvent
import typingsJapgolly.rcMenu.AnonHover
import typingsJapgolly.rcMenu.AnonKey
import typingsJapgolly.rcMenu.AnonOpen
import typingsJapgolly.rcMenu.ReactElementisRootMenuboo
import typingsJapgolly.rcMenu.interfaceMod.BuiltinPlacements
import typingsJapgolly.rcMenu.interfaceMod.MenuInfo
import typingsJapgolly.rcMenu.interfaceMod.MenuMode
import typingsJapgolly.rcMenu.interfaceMod.MiniStore
import typingsJapgolly.rcMenu.interfaceMod.RenderIconType
import typingsJapgolly.rcMenu.interfaceMod.SelectInfo
import typingsJapgolly.rcMenu.interfaceMod.TriggerSubMenuAction
import typingsJapgolly.rcMenu.rcMenuStrings.ltr
import typingsJapgolly.rcMenu.rcMenuStrings.rtl
import typingsJapgolly.rcMenu.subMenuMod.SubMenuProps
import typingsJapgolly.react.mod.Key
import typingsJapgolly.react.mod.ReactInstance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object SubMenu {
  def apply(
    active: js.UndefOr[Boolean] = js.undefined,
    builtinPlacements: BuiltinPlacements = null,
    className: String = null,
    direction: ltr | rtl = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    eventKey: String = null,
    expandIcon: RenderIconType = null,
    forceSubMenuRender: js.UndefOr[Boolean] = js.undefined,
    inlineIndent: Int | Double = null,
    isOpen: js.UndefOr[Boolean] = js.undefined,
    itemIcon: RenderIconType = null,
    level: Int | Double = null,
    manualRef: /* node */ ReactInstance => Callback = null,
    mode: MenuMode = null,
    motion: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MotionType */ js.Any = null,
    multiple: js.UndefOr[Boolean] = js.undefined,
    onClick: /* info */ MenuInfo => Callback = null,
    onDeselect: /* info */ SelectInfo => Callback = null,
    onDestroy: /* key */ Key => Callback = null,
    onItemHover: /* info */ AnonHover => Callback = null,
    onMouseEnter: /* info */ AnonKey => Callback = null,
    onMouseLeave: /* info */ AnonKey => Callback = null,
    onOpenChange: /* keys */ js.Array[Key] | AnonOpen => Callback = null,
    onSelect: /* info */ SelectInfo => Callback = null,
    onTitleClick: /* info */ AnonDomEvent => Callback = null,
    onTitleMouseEnter: /* info */ AnonKey => Callback = null,
    onTitleMouseLeave: /* info */ AnonKey => Callback = null,
    openKeys: js.Array[String] = null,
    parentMenu: ReactElementisRootMenuboo = null,
    popupClassName: String = null,
    popupOffset: js.Array[Double] = null,
    rootPrefixCls: String = null,
    selectedKeys: js.Array[String] = null,
    store: MiniStore = null,
    subMenuCloseDelay: Int | Double = null,
    subMenuOpenDelay: Int | Double = null,
    title: VdomNode = null,
    triggerSubMenuAction: TriggerSubMenuAction = null,
    key: js.UndefOr[japgolly.scalajs.react.Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[SubMenuProps, typingsJapgolly.rcMenu.subMenuMod.SubMenu, Unit, SubMenuProps] = {
    val __obj = js.Dynamic.literal()
  
      if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    if (builtinPlacements != null) __obj.updateDynamic("builtinPlacements")(builtinPlacements.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (eventKey != null) __obj.updateDynamic("eventKey")(eventKey.asInstanceOf[js.Any])
    if (expandIcon != null) __obj.updateDynamic("expandIcon")(expandIcon.asInstanceOf[js.Any])
    if (!js.isUndefined(forceSubMenuRender)) __obj.updateDynamic("forceSubMenuRender")(forceSubMenuRender.asInstanceOf[js.Any])
    if (inlineIndent != null) __obj.updateDynamic("inlineIndent")(inlineIndent.asInstanceOf[js.Any])
    if (!js.isUndefined(isOpen)) __obj.updateDynamic("isOpen")(isOpen.asInstanceOf[js.Any])
    if (itemIcon != null) __obj.updateDynamic("itemIcon")(itemIcon.asInstanceOf[js.Any])
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    if (manualRef != null) __obj.updateDynamic("manualRef")(js.Any.fromFunction1((t0: /* node */ typingsJapgolly.react.mod.ReactInstance) => manualRef(t0).runNow()))
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (motion != null) __obj.updateDynamic("motion")(motion.asInstanceOf[js.Any])
    if (!js.isUndefined(multiple)) __obj.updateDynamic("multiple")(multiple.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1((t0: /* info */ typingsJapgolly.rcMenu.interfaceMod.MenuInfo) => onClick(t0).runNow()))
    if (onDeselect != null) __obj.updateDynamic("onDeselect")(js.Any.fromFunction1((t0: /* info */ typingsJapgolly.rcMenu.interfaceMod.SelectInfo) => onDeselect(t0).runNow()))
    if (onDestroy != null) __obj.updateDynamic("onDestroy")(js.Any.fromFunction1((t0: /* key */ typingsJapgolly.react.mod.Key) => onDestroy(t0).runNow()))
    if (onItemHover != null) __obj.updateDynamic("onItemHover")(js.Any.fromFunction1((t0: /* info */ typingsJapgolly.rcMenu.AnonHover) => onItemHover(t0).runNow()))
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(js.Any.fromFunction1((t0: /* info */ typingsJapgolly.rcMenu.AnonKey) => onMouseEnter(t0).runNow()))
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(js.Any.fromFunction1((t0: /* info */ typingsJapgolly.rcMenu.AnonKey) => onMouseLeave(t0).runNow()))
    if (onOpenChange != null) __obj.updateDynamic("onOpenChange")(js.Any.fromFunction1((t0: /* keys */ js.Array[typingsJapgolly.react.mod.Key] | typingsJapgolly.rcMenu.AnonOpen) => onOpenChange(t0).runNow()))
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction1((t0: /* info */ typingsJapgolly.rcMenu.interfaceMod.SelectInfo) => onSelect(t0).runNow()))
    if (onTitleClick != null) __obj.updateDynamic("onTitleClick")(js.Any.fromFunction1((t0: /* info */ typingsJapgolly.rcMenu.AnonDomEvent) => onTitleClick(t0).runNow()))
    if (onTitleMouseEnter != null) __obj.updateDynamic("onTitleMouseEnter")(js.Any.fromFunction1((t0: /* info */ typingsJapgolly.rcMenu.AnonKey) => onTitleMouseEnter(t0).runNow()))
    if (onTitleMouseLeave != null) __obj.updateDynamic("onTitleMouseLeave")(js.Any.fromFunction1((t0: /* info */ typingsJapgolly.rcMenu.AnonKey) => onTitleMouseLeave(t0).runNow()))
    if (openKeys != null) __obj.updateDynamic("openKeys")(openKeys.asInstanceOf[js.Any])
    if (parentMenu != null) __obj.updateDynamic("parentMenu")(parentMenu.asInstanceOf[js.Any])
    if (popupClassName != null) __obj.updateDynamic("popupClassName")(popupClassName.asInstanceOf[js.Any])
    if (popupOffset != null) __obj.updateDynamic("popupOffset")(popupOffset.asInstanceOf[js.Any])
    if (rootPrefixCls != null) __obj.updateDynamic("rootPrefixCls")(rootPrefixCls.asInstanceOf[js.Any])
    if (selectedKeys != null) __obj.updateDynamic("selectedKeys")(selectedKeys.asInstanceOf[js.Any])
    if (store != null) __obj.updateDynamic("store")(store.asInstanceOf[js.Any])
    if (subMenuCloseDelay != null) __obj.updateDynamic("subMenuCloseDelay")(subMenuCloseDelay.asInstanceOf[js.Any])
    if (subMenuOpenDelay != null) __obj.updateDynamic("subMenuOpenDelay")(subMenuOpenDelay.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.rawNode.asInstanceOf[js.Any])
    if (triggerSubMenuAction != null) __obj.updateDynamic("triggerSubMenuAction")(triggerSubMenuAction.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.rcMenu.subMenuMod.SubMenuProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.rcMenu.subMenuMod.SubMenu](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.rcMenu.subMenuMod.SubMenuProps])(children: _*)
  }
  @JSImport("rc-menu/lib/SubMenu", "SubMenu")
  @js.native
  object componentImport extends js.Object
  
}

