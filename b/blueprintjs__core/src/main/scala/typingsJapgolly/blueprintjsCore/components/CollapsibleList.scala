package typingsJapgolly.blueprintjsCore.components

import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.blueprintjsCore.libEsmCommonBoundaryMod.Boundary
import typingsJapgolly.blueprintjsCore.libEsmComponentsCollapsibleListCollapsibleListMod.ICollapsibleListProps
import typingsJapgolly.blueprintjsCore.libEsmComponentsMenuMenuItemMod.MenuItemProps
import typingsJapgolly.blueprintjsCore.libEsmComponentsPopoverPopoverMod.IPopoverProps
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CollapsibleList {
  
  inline def apply(dropdownTarget: VdomElement, visibleItemRenderer: (MenuItemProps, Double) => Element): Builder = {
    val __props = js.Dynamic.literal(dropdownTarget = dropdownTarget.rawElement.asInstanceOf[js.Any], visibleItemRenderer = js.Any.fromFunction2(visibleItemRenderer))
    new Builder(js.Array(this.component, __props.asInstanceOf[ICollapsibleListProps]))
  }
  
  @JSImport("@blueprintjs/core", "CollapsibleList")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.blueprintjsCore.mod.CollapsibleList] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def collapseFrom(value: Boundary): this.type = set("collapseFrom", value.asInstanceOf[js.Any])
    
    inline def dropdownProps(value: IPopoverProps): this.type = set("dropdownProps", value.asInstanceOf[js.Any])
    
    inline def visibleItemClassName(value: String): this.type = set("visibleItemClassName", value.asInstanceOf[js.Any])
    
    inline def visibleItemCount(value: Double): this.type = set("visibleItemCount", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ICollapsibleListProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
