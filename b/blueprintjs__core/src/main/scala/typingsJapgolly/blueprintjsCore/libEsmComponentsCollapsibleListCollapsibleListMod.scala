package typingsJapgolly.blueprintjsCore

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.blueprintjsCore.anon.PartialCollapsibleListPro
import typingsJapgolly.blueprintjsCore.libEsmCommonBoundaryMod.Boundary
import typingsJapgolly.blueprintjsCore.libEsmCommonPropsMod.IProps
import typingsJapgolly.blueprintjsCore.libEsmComponentsMenuMenuItemMod.MenuItemProps
import typingsJapgolly.blueprintjsCore.libEsmComponentsPopoverPopoverMod.IPopoverProps
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEsmComponentsCollapsibleListCollapsibleListMod {
  
  @JSImport("@blueprintjs/core/lib/esm/components/collapsible-list/collapsibleList", "CollapsibleList")
  @js.native
  open class CollapsibleList protected ()
    extends Component[CollapsibleListProps, js.Object, Any] {
    def this(props: CollapsibleListProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: CollapsibleListProps, context: Any) = this()
    
    /* private */ var partitionChildren: Any = js.native
  }
  /* static members */
  object CollapsibleList {
    
    @JSImport("@blueprintjs/core/lib/esm/components/collapsible-list/collapsibleList", "CollapsibleList")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/components/collapsible-list/collapsibleList", "CollapsibleList.defaultProps")
    @js.native
    def defaultProps: PartialCollapsibleListPro = js.native
    inline def defaultProps_=(x: PartialCollapsibleListPro): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/core/lib/esm/components/collapsible-list/collapsibleList", "CollapsibleList.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  type CollapsibleListProps = ICollapsibleListProps
  
  trait ICollapsibleListProps
    extends StObject
       with IProps {
    
    /** Contents to collapse. */
    var children: js.UndefOr[Node] = js.undefined
    
    /**
      * Which direction the items should collapse from: start or end of the children.
      *
      * @default Boundary.START
      */
    var collapseFrom: js.UndefOr[Boundary] = js.undefined
    
    /**
      * Props to pass to the dropdown.
      */
    var dropdownProps: js.UndefOr[IPopoverProps] = js.undefined
    
    /**
      * Element to render as dropdown target with `CLICK` interaction to show collapsed menu.
      */
    var dropdownTarget: Element
    
    /**
      * CSS class names to add to `<li>` tags containing each visible item and the dropdown.
      */
    var visibleItemClassName: js.UndefOr[String] = js.undefined
    
    /**
      * Exact number of visible items.
      *
      * @default 3
      */
    var visibleItemCount: js.UndefOr[Double] = js.undefined
    
    /**
      * Callback invoked to render each visible item. The item will be wrapped in an `li` with
      * the optional `visibleItemClassName` prop.
      */
    def visibleItemRenderer(props: MenuItemProps, index: Double): Element
  }
  object ICollapsibleListProps {
    
    inline def apply(dropdownTarget: VdomElement, visibleItemRenderer: (MenuItemProps, Double) => Element): ICollapsibleListProps = {
      val __obj = js.Dynamic.literal(dropdownTarget = dropdownTarget.rawElement.asInstanceOf[js.Any], visibleItemRenderer = js.Any.fromFunction2(visibleItemRenderer))
      __obj.asInstanceOf[ICollapsibleListProps]
    }
    
    extension [Self <: ICollapsibleListProps](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setCollapseFrom(value: Boundary): Self = StObject.set(x, "collapseFrom", value.asInstanceOf[js.Any])
      
      inline def setCollapseFromUndefined: Self = StObject.set(x, "collapseFrom", js.undefined)
      
      inline def setDropdownProps(value: IPopoverProps): Self = StObject.set(x, "dropdownProps", value.asInstanceOf[js.Any])
      
      inline def setDropdownPropsUndefined: Self = StObject.set(x, "dropdownProps", js.undefined)
      
      inline def setDropdownTarget(value: VdomElement): Self = StObject.set(x, "dropdownTarget", value.rawElement.asInstanceOf[js.Any])
      
      inline def setVisibleItemClassName(value: String): Self = StObject.set(x, "visibleItemClassName", value.asInstanceOf[js.Any])
      
      inline def setVisibleItemClassNameUndefined: Self = StObject.set(x, "visibleItemClassName", js.undefined)
      
      inline def setVisibleItemCount(value: Double): Self = StObject.set(x, "visibleItemCount", value.asInstanceOf[js.Any])
      
      inline def setVisibleItemCountUndefined: Self = StObject.set(x, "visibleItemCount", js.undefined)
      
      inline def setVisibleItemRenderer(value: (MenuItemProps, Double) => Element): Self = StObject.set(x, "visibleItemRenderer", js.Any.fromFunction2(value))
    }
  }
}
