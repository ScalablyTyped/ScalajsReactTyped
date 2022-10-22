package typingsJapgolly.officeUiFabricReact.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactKeyboardEventFrom
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.ReactTouchEventFrom
import japgolly.scalajs.react.facade.React.ComponentClassP
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.PointerEvent
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.officeUiFabricReact.libComponentsContextualMenuContextualMenuDottypesMod.IContextualMenuItem
import typingsJapgolly.officeUiFabricReact.libComponentsContextualMenuContextualMenuItemDottypesMod.IContextualMenuItemProps
import typingsJapgolly.react.mod.FunctionComponent
import typingsJapgolly.uifabricUtilities.libCreateRefMod.IRefObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
open class SharedBuilder_IContextualMenuItemWrapperProps_1138345542[R <: js.Object] (val args: js.Array[Any])
  extends AnyVal
     with StBuildingComponent[R] {
  
  inline def componentRef(
    value: IRefObject[
      typingsJapgolly.officeUiFabricReact.libComponentsContextualMenuContextualMenuItemWrapperContextualMenuItemWrapperMod.ContextualMenuItemWrapper
    ]
  ): this.type = set("componentRef", value.asInstanceOf[js.Any])
  
  inline def componentRefFunction1(
    value: /* ref */ typingsJapgolly.officeUiFabricReact.libComponentsContextualMenuContextualMenuItemWrapperContextualMenuItemWrapperMod.ContextualMenuItemWrapper | Null => Callback
  ): this.type = set("componentRef", js.Any.fromFunction1((t0: /* ref */ typingsJapgolly.officeUiFabricReact.libComponentsContextualMenuContextualMenuItemWrapperContextualMenuItemWrapperMod.ContextualMenuItemWrapper | Null) => value(t0).runNow()))
  
  inline def contextualMenuItemAs(
    value: (ComponentClassP[IContextualMenuItemProps & js.Object]) | FunctionComponent[IContextualMenuItemProps]
  ): this.type = set("contextualMenuItemAs", value.asInstanceOf[js.Any])
  
  inline def dismissMenu(value: (/* ev */ js.UndefOr[Any], /* dismissAll */ js.UndefOr[Boolean]) => Callback): this.type = set("dismissMenu", js.Any.fromFunction2((t0: /* ev */ js.UndefOr[Any], t1: /* dismissAll */ js.UndefOr[Boolean]) => (value(t0, t1)).runNow()))
  
  inline def dismissSubMenu(value: Callback): this.type = set("dismissSubMenu", value.toJsFn)
  
  inline def executeItemClick(
    value: (/* item */ IContextualMenuItem, /* ev */ ReactMouseEventFrom[HTMLElement] | ReactKeyboardEventFrom[HTMLElement]) => Callback
  ): this.type = set("executeItemClick", js.Any.fromFunction2((t0: /* item */ IContextualMenuItem, t1: /* ev */ ReactMouseEventFrom[HTMLElement] | ReactKeyboardEventFrom[HTMLElement]) => (value(t0, t1)).runNow()))
  
  inline def expandedMenuItemKey(value: String): this.type = set("expandedMenuItemKey", value.asInstanceOf[js.Any])
  
  inline def getSubMenuId(value: /* item */ IContextualMenuItem => js.UndefOr[String]): this.type = set("getSubMenuId", js.Any.fromFunction1(value))
  
  inline def hasCheckmarks(value: Boolean): this.type = set("hasCheckmarks", value.asInstanceOf[js.Any])
  
  inline def hasIcons(value: Boolean): this.type = set("hasIcons", value.asInstanceOf[js.Any])
  
  inline def onItemClick(
    value: (/* item */ IContextualMenuItem, /* ev */ ReactMouseEventFrom[HTMLElement] | ReactKeyboardEventFrom[HTMLElement]) => Callback
  ): this.type = set("onItemClick", js.Any.fromFunction2((t0: /* item */ IContextualMenuItem, t1: /* ev */ ReactMouseEventFrom[HTMLElement] | ReactKeyboardEventFrom[HTMLElement]) => (value(t0, t1)).runNow()))
  
  inline def onItemClickBase(
    value: (/* item */ IContextualMenuItem, /* ev */ ReactMouseEventFrom[HTMLElement] | ReactKeyboardEventFrom[HTMLElement], /* target */ HTMLElement) => Callback
  ): this.type = set("onItemClickBase", js.Any.fromFunction3((t0: /* item */ IContextualMenuItem, t1: /* ev */ ReactMouseEventFrom[HTMLElement] | ReactKeyboardEventFrom[HTMLElement], t2: /* target */ HTMLElement) => (value(t0, t1, t2)).runNow()))
  
  inline def onItemKeyDown(value: (/* item */ IContextualMenuItem, /* ev */ ReactKeyboardEventFrom[HTMLElement]) => Callback): this.type = set("onItemKeyDown", js.Any.fromFunction2((t0: /* item */ IContextualMenuItem, t1: /* ev */ ReactKeyboardEventFrom[HTMLElement]) => (value(t0, t1)).runNow()))
  
  inline def onItemMouseDown(value: (/* item */ IContextualMenuItem, /* ev */ ReactMouseEventFrom[HTMLElement]) => Callback): this.type = set("onItemMouseDown", js.Any.fromFunction2((t0: /* item */ IContextualMenuItem, t1: /* ev */ ReactMouseEventFrom[HTMLElement]) => (value(t0, t1)).runNow()))
  
  inline def onItemMouseEnter(
    value: (/* item */ IContextualMenuItem, /* ev */ ReactMouseEventFrom[HTMLElement], /* target */ HTMLElement) => Boolean | Unit
  ): this.type = set("onItemMouseEnter", js.Any.fromFunction3(value))
  
  inline def onItemMouseLeave(value: (/* item */ IContextualMenuItem, /* ev */ ReactMouseEventFrom[HTMLElement]) => Callback): this.type = set("onItemMouseLeave", js.Any.fromFunction2((t0: /* item */ IContextualMenuItem, t1: /* ev */ ReactMouseEventFrom[HTMLElement]) => (value(t0, t1)).runNow()))
  
  inline def onItemMouseMove(
    value: (/* item */ IContextualMenuItem, /* ev */ ReactMouseEventFrom[HTMLElement], /* target */ HTMLElement) => Callback
  ): this.type = set("onItemMouseMove", js.Any.fromFunction3((t0: /* item */ IContextualMenuItem, t1: /* ev */ ReactMouseEventFrom[HTMLElement], t2: /* target */ HTMLElement) => (value(t0, t1, t2)).runNow()))
  
  inline def onTap(value: /* ev */ ReactTouchEventFrom[HTMLElement] | PointerEvent => Callback): this.type = set("onTap", js.Any.fromFunction1((t0: /* ev */ ReactTouchEventFrom[HTMLElement] | PointerEvent) => value(t0).runNow()))
  
  inline def openSubMenu(value: (/* item */ Any, /* target */ HTMLElement) => Callback): this.type = set("openSubMenu", js.Any.fromFunction2((t0: /* item */ Any, t1: /* target */ HTMLElement) => (value(t0, t1)).runNow()))
}
