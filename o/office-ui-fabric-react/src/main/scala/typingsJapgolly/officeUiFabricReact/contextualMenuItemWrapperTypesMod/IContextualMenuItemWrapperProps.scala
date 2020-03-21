package typingsJapgolly.officeUiFabricReact.contextualMenuItemWrapperTypesMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.ReactKeyboardEventFrom
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.ReactTouchEventFrom
import japgolly.scalajs.react.raw.React.ComponentClassP
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.PointerEvent
import typingsJapgolly.officeUiFabricReact.contextualMenuClassNamesMod.IMenuItemClassNames
import typingsJapgolly.officeUiFabricReact.contextualMenuItemTypesMod.IContextualMenuItemProps
import typingsJapgolly.officeUiFabricReact.contextualMenuItemWrapperContextualMenuItemWrapperMod.ContextualMenuItemWrapper
import typingsJapgolly.officeUiFabricReact.contextualMenuTypesMod.IContextualMenuItem
import typingsJapgolly.react.mod.ClassAttributes
import typingsJapgolly.react.mod.FunctionComponent
import typingsJapgolly.react.mod.Key
import typingsJapgolly.react.mod.LegacyRef
import typingsJapgolly.uifabricUtilities.createRefMod.IRefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IContextualMenuItemWrapperProps extends ClassAttributes[IContextualMenuItem] {
  /**
    * CSS class to apply to the context menu.
    */
  var classNames: IMenuItemClassNames
  /**
    * Optional callback to access the ContextualMenuSplitButton interface. Use this instead of ref for accessing
    * the public methods and properties of the component.
    */
  var componentRef: js.UndefOr[IRefObject[ContextualMenuItemWrapper]] = js.undefined
  /**
    * Method to override the render of the individual menu items.
    * @defaultvalue ContextualMenuItem
    */
  var contextualMenuItemAs: js.UndefOr[
    (ComponentClassP[IContextualMenuItemProps with js.Object]) | FunctionComponent[IContextualMenuItemProps]
  ] = js.undefined
  /**
    * This prop will get set by ContextualMenu and can be called to close the menu this item belongs to.
    * If dismissAll is true, all menus will be closed.
    */
  var dismissMenu: js.UndefOr[
    js.Function2[/* ev */ js.UndefOr[js.Any], /* dismissAll */ js.UndefOr[Boolean], Unit]
  ] = js.undefined
  /**
    * This prop will get set by ContextualMenu and can be called to close this item's subMenu, if present.
    */
  var dismissSubMenu: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * Callback for when the click event on the primary button.
    */
  var executeItemClick: js.UndefOr[
    js.Function2[
      /* item */ IContextualMenuItem, 
      /* ev */ ReactMouseEventFrom[HTMLElement] | ReactKeyboardEventFrom[HTMLElement], 
      Unit
    ]
  ] = js.undefined
  /**
    * Key of the currently expanded subMenu.
    */
  var expandedMenuItemKey: js.UndefOr[String] = js.undefined
  /**
    * The index number of the wrapper among all items in the contextual menu excluding dividers and headers.
    */
  var focusableElementIndex: Double
  /**
    * Callback to get the subMenu ID for an IContextualMenuItem.
    */
  var getSubMenuId: js.UndefOr[js.Function1[/* item */ IContextualMenuItem, js.UndefOr[String]]] = js.undefined
  /**
    * Whether or not if the item for the wrapper uses checkmarks.
    */
  var hasCheckmarks: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether or not the item for the wrapper uses icons.
    */
  var hasIcons: js.UndefOr[Boolean] = js.undefined
  /**
    * The index number of the wrapper among all items in the contextual menu including things like dividers and headers.
    */
  var index: Double
  /**
    * The IContextualMenuItem that is used to render the item in the menu.
    */
  var item: IContextualMenuItem
  /**
    * Callback for when the click event on the icon button from the wrapper.
    */
  var onItemClick: js.UndefOr[
    js.Function2[
      /* item */ IContextualMenuItem, 
      /* ev */ ReactMouseEventFrom[HTMLElement] | ReactKeyboardEventFrom[HTMLElement], 
      Unit
    ]
  ] = js.undefined
  /**
    * Callback for when the click event on the icon button which also takes in a specific HTMLElement that will be focused.
    */
  var onItemClickBase: js.UndefOr[
    js.Function3[
      /* item */ IContextualMenuItem, 
      /* ev */ ReactMouseEventFrom[HTMLElement] | ReactKeyboardEventFrom[HTMLElement], 
      /* target */ HTMLElement, 
      Unit
    ]
  ] = js.undefined
  /**
    * Callback for keyboard events on the wrapper.
    */
  var onItemKeyDown: js.UndefOr[
    js.Function2[/* item */ IContextualMenuItem, /* ev */ ReactKeyboardEventFrom[HTMLElement], Unit]
  ] = js.undefined
  /**
    * Callback for the mousedown event on the icon button in the wrapper.
    */
  var onItemMouseDown: js.UndefOr[
    js.Function2[/* item */ IContextualMenuItem, /* ev */ ReactMouseEventFrom[HTMLElement], Unit]
  ] = js.undefined
  /**
    * Callback for when the user's mouse enters the wrapper.
    */
  var onItemMouseEnter: js.UndefOr[
    js.Function3[
      /* item */ IContextualMenuItem, 
      /* ev */ ReactMouseEventFrom[HTMLElement], 
      /* target */ HTMLElement, 
      Boolean | Unit
    ]
  ] = js.undefined
  /**
    * Callback for when the user's mouse leaves the wrapper.
    */
  var onItemMouseLeave: js.UndefOr[
    js.Function2[/* item */ IContextualMenuItem, /* ev */ ReactMouseEventFrom[HTMLElement], Unit]
  ] = js.undefined
  /**
    * Callback for when the user's mouse moves in the wrapper.
    */
  var onItemMouseMove: js.UndefOr[
    js.Function3[
      /* item */ IContextualMenuItem, 
      /* ev */ ReactMouseEventFrom[HTMLElement], 
      /* target */ HTMLElement, 
      Unit
    ]
  ] = js.undefined
  /**
    * Callback for touch/pointer events on the split button.
    */
  var onTap: js.UndefOr[js.Function1[/* ev */ ReactTouchEventFrom[HTMLElement] | PointerEvent, Unit]] = js.undefined
  /**
    * This prop will get set by ContextualMenu and can be called to open this item's subMenu, if present.
    */
  var openSubMenu: js.UndefOr[js.Function2[/* item */ js.Any, /* target */ HTMLElement, Unit]] = js.undefined
  /**
    * The total number of items in the contextual menu.
    */
  var totalItemCount: Double
}

object IContextualMenuItemWrapperProps {
  @scala.inline
  def apply(
    classNames: IMenuItemClassNames,
    focusableElementIndex: Double,
    index: Double,
    item: IContextualMenuItem,
    totalItemCount: Double,
    componentRef: IRefObject[ContextualMenuItemWrapper] = null,
    contextualMenuItemAs: (ComponentClassP[IContextualMenuItemProps with js.Object]) | FunctionComponent[IContextualMenuItemProps] = null,
    dismissMenu: (/* ev */ js.UndefOr[js.Any], /* dismissAll */ js.UndefOr[Boolean]) => Callback = null,
    dismissSubMenu: js.UndefOr[Callback] = js.undefined,
    executeItemClick: (/* item */ IContextualMenuItem, /* ev */ ReactMouseEventFrom[HTMLElement] | ReactKeyboardEventFrom[HTMLElement]) => Callback = null,
    expandedMenuItemKey: String = null,
    getSubMenuId: /* item */ IContextualMenuItem => CallbackTo[js.UndefOr[String]] = null,
    hasCheckmarks: js.UndefOr[Boolean] = js.undefined,
    hasIcons: js.UndefOr[Boolean] = js.undefined,
    key: Key = null,
    onItemClick: (/* item */ IContextualMenuItem, /* ev */ ReactMouseEventFrom[HTMLElement] | ReactKeyboardEventFrom[HTMLElement]) => Callback = null,
    onItemClickBase: (/* item */ IContextualMenuItem, /* ev */ ReactMouseEventFrom[HTMLElement] | ReactKeyboardEventFrom[HTMLElement], /* target */ HTMLElement) => Callback = null,
    onItemKeyDown: (/* item */ IContextualMenuItem, /* ev */ ReactKeyboardEventFrom[HTMLElement]) => Callback = null,
    onItemMouseDown: (/* item */ IContextualMenuItem, /* ev */ ReactMouseEventFrom[HTMLElement]) => Callback = null,
    onItemMouseEnter: (/* item */ IContextualMenuItem, /* ev */ ReactMouseEventFrom[HTMLElement], /* target */ HTMLElement) => CallbackTo[Boolean | Unit] = null,
    onItemMouseLeave: (/* item */ IContextualMenuItem, /* ev */ ReactMouseEventFrom[HTMLElement]) => Callback = null,
    onItemMouseMove: (/* item */ IContextualMenuItem, /* ev */ ReactMouseEventFrom[HTMLElement], /* target */ HTMLElement) => Callback = null,
    onTap: /* ev */ ReactTouchEventFrom[HTMLElement] | PointerEvent => Callback = null,
    openSubMenu: (/* item */ js.Any, /* target */ HTMLElement) => Callback = null,
    ref: LegacyRef[IContextualMenuItem] = null
  ): IContextualMenuItemWrapperProps = {
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
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (onItemClick != null) __obj.updateDynamic("onItemClick")(js.Any.fromFunction2((t0: /* item */ typingsJapgolly.officeUiFabricReact.contextualMenuTypesMod.IContextualMenuItem, t1: /* ev */ japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLElement] | japgolly.scalajs.react.ReactKeyboardEventFrom[org.scalajs.dom.raw.HTMLElement]) => onItemClick(t0, t1).runNow()))
    if (onItemClickBase != null) __obj.updateDynamic("onItemClickBase")(js.Any.fromFunction3((t0: /* item */ typingsJapgolly.officeUiFabricReact.contextualMenuTypesMod.IContextualMenuItem, t1: /* ev */ japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLElement] | japgolly.scalajs.react.ReactKeyboardEventFrom[org.scalajs.dom.raw.HTMLElement], t2: /* target */ org.scalajs.dom.raw.HTMLElement) => onItemClickBase(t0, t1, t2).runNow()))
    if (onItemKeyDown != null) __obj.updateDynamic("onItemKeyDown")(js.Any.fromFunction2((t0: /* item */ typingsJapgolly.officeUiFabricReact.contextualMenuTypesMod.IContextualMenuItem, t1: /* ev */ japgolly.scalajs.react.ReactKeyboardEventFrom[org.scalajs.dom.raw.HTMLElement]) => onItemKeyDown(t0, t1).runNow()))
    if (onItemMouseDown != null) __obj.updateDynamic("onItemMouseDown")(js.Any.fromFunction2((t0: /* item */ typingsJapgolly.officeUiFabricReact.contextualMenuTypesMod.IContextualMenuItem, t1: /* ev */ japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLElement]) => onItemMouseDown(t0, t1).runNow()))
    if (onItemMouseEnter != null) __obj.updateDynamic("onItemMouseEnter")(js.Any.fromFunction3((t0: /* item */ typingsJapgolly.officeUiFabricReact.contextualMenuTypesMod.IContextualMenuItem, t1: /* ev */ japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLElement], t2: /* target */ org.scalajs.dom.raw.HTMLElement) => onItemMouseEnter(t0, t1, t2).runNow()))
    if (onItemMouseLeave != null) __obj.updateDynamic("onItemMouseLeave")(js.Any.fromFunction2((t0: /* item */ typingsJapgolly.officeUiFabricReact.contextualMenuTypesMod.IContextualMenuItem, t1: /* ev */ japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLElement]) => onItemMouseLeave(t0, t1).runNow()))
    if (onItemMouseMove != null) __obj.updateDynamic("onItemMouseMove")(js.Any.fromFunction3((t0: /* item */ typingsJapgolly.officeUiFabricReact.contextualMenuTypesMod.IContextualMenuItem, t1: /* ev */ japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLElement], t2: /* target */ org.scalajs.dom.raw.HTMLElement) => onItemMouseMove(t0, t1, t2).runNow()))
    if (onTap != null) __obj.updateDynamic("onTap")(js.Any.fromFunction1((t0: /* ev */ japgolly.scalajs.react.ReactTouchEventFrom[org.scalajs.dom.raw.HTMLElement] | org.scalajs.dom.raw.PointerEvent) => onTap(t0).runNow()))
    if (openSubMenu != null) __obj.updateDynamic("openSubMenu")(js.Any.fromFunction2((t0: /* item */ js.Any, t1: /* target */ org.scalajs.dom.raw.HTMLElement) => openSubMenu(t0, t1).runNow()))
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[IContextualMenuItemWrapperProps]
  }
}

