package typingsJapgolly.blueprintjsCore.anon

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.blueprintjsCore.libEsmCommonBoundaryMod.Boundary
import typingsJapgolly.blueprintjsCore.libEsmComponentsMenuMenuItemMod.MenuItemProps
import typingsJapgolly.blueprintjsCore.libEsmComponentsPopoverPopoverMod.IPopoverProps
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@blueprintjs/core.@blueprintjs/core/lib/esm/components/collapsible-list/collapsibleList.CollapsibleListProps> */
trait PartialCollapsibleListPro extends StObject {
  
  var children: js.UndefOr[Node] = js.undefined
  
  var className: js.UndefOr[String] = js.undefined
  
  var collapseFrom: js.UndefOr[Boundary] = js.undefined
  
  var dropdownProps: js.UndefOr[IPopoverProps] = js.undefined
  
  var dropdownTarget: js.UndefOr[Element] = js.undefined
  
  var visibleItemClassName: js.UndefOr[String] = js.undefined
  
  var visibleItemCount: js.UndefOr[Double] = js.undefined
  
  var visibleItemRenderer: js.UndefOr[js.Function2[/* props */ MenuItemProps, /* index */ Double, Element]] = js.undefined
}
object PartialCollapsibleListPro {
  
  inline def apply(): PartialCollapsibleListPro = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialCollapsibleListPro]
  }
  
  extension [Self <: PartialCollapsibleListPro](x: Self) {
    
    inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
    
    inline def setChildrenNull: Self = StObject.set(x, "children", null)
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setChildrenVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setCollapseFrom(value: Boundary): Self = StObject.set(x, "collapseFrom", value.asInstanceOf[js.Any])
    
    inline def setCollapseFromUndefined: Self = StObject.set(x, "collapseFrom", js.undefined)
    
    inline def setDropdownProps(value: IPopoverProps): Self = StObject.set(x, "dropdownProps", value.asInstanceOf[js.Any])
    
    inline def setDropdownPropsUndefined: Self = StObject.set(x, "dropdownProps", js.undefined)
    
    inline def setDropdownTarget(value: VdomElement): Self = StObject.set(x, "dropdownTarget", value.rawElement.asInstanceOf[js.Any])
    
    inline def setDropdownTargetUndefined: Self = StObject.set(x, "dropdownTarget", js.undefined)
    
    inline def setVisibleItemClassName(value: String): Self = StObject.set(x, "visibleItemClassName", value.asInstanceOf[js.Any])
    
    inline def setVisibleItemClassNameUndefined: Self = StObject.set(x, "visibleItemClassName", js.undefined)
    
    inline def setVisibleItemCount(value: Double): Self = StObject.set(x, "visibleItemCount", value.asInstanceOf[js.Any])
    
    inline def setVisibleItemCountUndefined: Self = StObject.set(x, "visibleItemCount", js.undefined)
    
    inline def setVisibleItemRenderer(value: (/* props */ MenuItemProps, /* index */ Double) => Element): Self = StObject.set(x, "visibleItemRenderer", js.Any.fromFunction2(value))
    
    inline def setVisibleItemRendererUndefined: Self = StObject.set(x, "visibleItemRenderer", js.undefined)
  }
}
