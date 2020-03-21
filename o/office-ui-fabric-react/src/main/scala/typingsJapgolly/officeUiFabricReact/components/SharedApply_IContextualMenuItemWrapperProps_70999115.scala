package typingsJapgolly.officeUiFabricReact.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.ReactKeyboardEventFrom
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.ReactTouchEventFrom
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.ComponentClassP
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.PointerEvent
import typingsJapgolly.officeUiFabricReact.contextualMenuClassNamesMod.IMenuItemClassNames
import typingsJapgolly.officeUiFabricReact.contextualMenuItemTypesMod.IContextualMenuItemProps
import typingsJapgolly.officeUiFabricReact.contextualMenuItemWrapperTypesMod.IContextualMenuItemWrapperProps
import typingsJapgolly.officeUiFabricReact.contextualMenuTypesMod.IContextualMenuItem
import typingsJapgolly.react.mod.FunctionComponent
import typingsJapgolly.uifabricUtilities.createRefMod.IRefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

abstract class SharedApply_IContextualMenuItemWrapperProps_70999115[ComponentRef] () {
  val componentImport: js.Any
  def apply(
    classNames: IMenuItemClassNames,
    focusableElementIndex: Double,
    index: Double,
    item: IContextualMenuItem,
    totalItemCount: Double,
    componentRef: IRefObject[
      typingsJapgolly.officeUiFabricReact.contextualMenuItemWrapperContextualMenuItemWrapperMod.ContextualMenuItemWrapper
    ] = null,
    contextualMenuItemAs: (ComponentClassP[IContextualMenuItemProps with js.Object]) | FunctionComponent[IContextualMenuItemProps] = null,
    dismissMenu: (/* ev */ js.UndefOr[js.Any], /* dismissAll */ js.UndefOr[Boolean]) => Callback = null,
    dismissSubMenu: js.UndefOr[Callback] = js.undefined,
    executeItemClick: (/* item */ IContextualMenuItem, /* ev */ ReactMouseEventFrom[HTMLElement] | ReactKeyboardEventFrom[HTMLElement]) => Callback = null,
    expandedMenuItemKey: String = null,
    getSubMenuId: /* item */ IContextualMenuItem => CallbackTo[js.UndefOr[String]] = null,
    hasCheckmarks: js.UndefOr[Boolean] = js.undefined,
    hasIcons: js.UndefOr[Boolean] = js.undefined,
    onItemClick: (/* item */ IContextualMenuItem, /* ev */ ReactMouseEventFrom[HTMLElement] | ReactKeyboardEventFrom[HTMLElement]) => Callback = null,
    onItemClickBase: (/* item */ IContextualMenuItem, /* ev */ ReactMouseEventFrom[HTMLElement] | ReactKeyboardEventFrom[HTMLElement], /* target */ HTMLElement) => Callback = null,
    onItemKeyDown: (/* item */ IContextualMenuItem, /* ev */ ReactKeyboardEventFrom[HTMLElement]) => Callback = null,
    onItemMouseDown: (/* item */ IContextualMenuItem, /* ev */ ReactMouseEventFrom[HTMLElement]) => Callback = null,
    onItemMouseEnter: (/* item */ IContextualMenuItem, /* ev */ ReactMouseEventFrom[HTMLElement], /* target */ HTMLElement) => CallbackTo[Boolean | Unit] = null,
    onItemMouseLeave: (/* item */ IContextualMenuItem, /* ev */ ReactMouseEventFrom[HTMLElement]) => Callback = null,
    onItemMouseMove: (/* item */ IContextualMenuItem, /* ev */ ReactMouseEventFrom[HTMLElement], /* target */ HTMLElement) => Callback = null,
    onTap: /* ev */ ReactTouchEventFrom[HTMLElement] | PointerEvent => Callback = null,
    openSubMenu: (/* item */ js.Any, /* target */ HTMLElement) => Callback = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[IContextualMenuItemWrapperProps, ComponentRef, Unit, IContextualMenuItemWrapperProps] = {
    val __obj = js.Dynamic.literal(classNames = classNames.asInstanceOf[js.Any], focusableElementIndex = focusableElementIndex.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], totalItemCount = totalItemCount.asInstanceOf[js.Any])
  
      if (componentRef != null) __obj.updateDynamic("componentRef")(componentRef.asInstanceOf[js.Any])
    if (contextualMenuItemAs != null) __obj.updateDynamic("contextualMenuItemAs")(contextualMenuItemAs.asInstanceOf[js.Any])
    if (dismissMenu != null) __obj.updateDynamic("dismissMenu")(js.Any.fromFunction2((t0: /* ev */ js.UndefOr[js.Any], t1: /* dismissAll */ js.UndefOr[scala.Boolean]) => dismissMenu(t0, t1).runNow()))
    dismissSubMenu.foreach(p => __obj.updateDynamic("dismissSubMenu")(p.toJsFn))
    if (executeItemClick != null) __obj.updateDynamic("executeItemClick")(js.Any.fromFunction2((t0: /* item */ typingsJapgolly.officeUiFabricReact.contextualMenuTypesMod.IContextualMenuItem, t1: /* ev */ japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLElement] | japgolly.scalajs.react.ReactKeyboardEventFrom[org.scalajs.dom.raw.HTMLElement]) => executeItemClick(t0, t1).runNow()))
    if (expandedMenuItemKey != null) __obj.updateDynamic("expandedMenuItemKey")(expandedMenuItemKey.asInstanceOf[js.Any])
    if (getSubMenuId != null) __obj.updateDynamic("getSubMenuId")(js.Any.fromFunction1((t0: /* item */ typingsJapgolly.officeUiFabricReact.contextualMenuTypesMod.IContextualMenuItem) => getSubMenuId(t0).runNow()))
    if (!js.isUndefined(hasCheckmarks)) __obj.updateDynamic("hasCheckmarks")(hasCheckmarks.asInstanceOf[js.Any])
    if (!js.isUndefined(hasIcons)) __obj.updateDynamic("hasIcons")(hasIcons.asInstanceOf[js.Any])
    if (onItemClick != null) __obj.updateDynamic("onItemClick")(js.Any.fromFunction2((t0: /* item */ typingsJapgolly.officeUiFabricReact.contextualMenuTypesMod.IContextualMenuItem, t1: /* ev */ japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLElement] | japgolly.scalajs.react.ReactKeyboardEventFrom[org.scalajs.dom.raw.HTMLElement]) => onItemClick(t0, t1).runNow()))
    if (onItemClickBase != null) __obj.updateDynamic("onItemClickBase")(js.Any.fromFunction3((t0: /* item */ typingsJapgolly.officeUiFabricReact.contextualMenuTypesMod.IContextualMenuItem, t1: /* ev */ japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLElement] | japgolly.scalajs.react.ReactKeyboardEventFrom[org.scalajs.dom.raw.HTMLElement], t2: /* target */ org.scalajs.dom.raw.HTMLElement) => onItemClickBase(t0, t1, t2).runNow()))
    if (onItemKeyDown != null) __obj.updateDynamic("onItemKeyDown")(js.Any.fromFunction2((t0: /* item */ typingsJapgolly.officeUiFabricReact.contextualMenuTypesMod.IContextualMenuItem, t1: /* ev */ japgolly.scalajs.react.ReactKeyboardEventFrom[org.scalajs.dom.raw.HTMLElement]) => onItemKeyDown(t0, t1).runNow()))
    if (onItemMouseDown != null) __obj.updateDynamic("onItemMouseDown")(js.Any.fromFunction2((t0: /* item */ typingsJapgolly.officeUiFabricReact.contextualMenuTypesMod.IContextualMenuItem, t1: /* ev */ japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLElement]) => onItemMouseDown(t0, t1).runNow()))
    if (onItemMouseEnter != null) __obj.updateDynamic("onItemMouseEnter")(js.Any.fromFunction3((t0: /* item */ typingsJapgolly.officeUiFabricReact.contextualMenuTypesMod.IContextualMenuItem, t1: /* ev */ japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLElement], t2: /* target */ org.scalajs.dom.raw.HTMLElement) => onItemMouseEnter(t0, t1, t2).runNow()))
    if (onItemMouseLeave != null) __obj.updateDynamic("onItemMouseLeave")(js.Any.fromFunction2((t0: /* item */ typingsJapgolly.officeUiFabricReact.contextualMenuTypesMod.IContextualMenuItem, t1: /* ev */ japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLElement]) => onItemMouseLeave(t0, t1).runNow()))
    if (onItemMouseMove != null) __obj.updateDynamic("onItemMouseMove")(js.Any.fromFunction3((t0: /* item */ typingsJapgolly.officeUiFabricReact.contextualMenuTypesMod.IContextualMenuItem, t1: /* ev */ japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLElement], t2: /* target */ org.scalajs.dom.raw.HTMLElement) => onItemMouseMove(t0, t1, t2).runNow()))
    if (onTap != null) __obj.updateDynamic("onTap")(js.Any.fromFunction1((t0: /* ev */ japgolly.scalajs.react.ReactTouchEventFrom[org.scalajs.dom.raw.HTMLElement] | org.scalajs.dom.raw.PointerEvent) => onTap(t0).runNow()))
    if (openSubMenu != null) __obj.updateDynamic("openSubMenu")(js.Any.fromFunction2((t0: /* item */ js.Any, t1: /* target */ org.scalajs.dom.raw.HTMLElement) => openSubMenu(t0, t1).runNow()))
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.officeUiFabricReact.contextualMenuItemWrapperTypesMod.IContextualMenuItemWrapperProps, 
  japgolly.scalajs.react.Children.Varargs, 
  ComponentRef](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.officeUiFabricReact.contextualMenuItemWrapperTypesMod.IContextualMenuItemWrapperProps])(children: _*)
  }
}

