package typingsJapgolly.rmcDrawer

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.rmcDrawer.rmcDrawerStrings.bottom
import typingsJapgolly.rmcDrawer.rmcDrawerStrings.left
import typingsJapgolly.rmcDrawer.rmcDrawerStrings.right
import typingsJapgolly.rmcDrawer.rmcDrawerStrings.top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait OverlayClicked extends StObject {
    
    var overlayClicked: Boolean
  }
  object OverlayClicked {
    
    inline def apply(overlayClicked: Boolean): OverlayClicked = {
      val __obj = js.Dynamic.literal(overlayClicked = overlayClicked.asInstanceOf[js.Any])
      __obj.asInstanceOf[OverlayClicked]
    }
    
    extension [Self <: OverlayClicked](x: Self) {
      
      inline def setOverlayClicked(value: Boolean): Self = StObject.set(x, "overlayClicked", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<rmc-drawer.rmc-drawer.DrawerProps> */
  trait PartialDrawerProps extends StObject {
    
    var children: js.UndefOr[Node | js.Array[Node]] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var contentStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var docked: js.UndefOr[Boolean] = js.undefined
    
    var dragHandleStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var dragToggleDistance: js.UndefOr[Double] = js.undefined
    
    var enableDragHandle: js.UndefOr[Boolean] = js.undefined
    
    var onOpenChange: js.UndefOr[js.Function2[/* open */ Boolean, /* overlay */ js.UndefOr[OverlayClicked], Unit]] = js.undefined
    
    var open: js.UndefOr[Boolean] = js.undefined
    
    var overlayStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var position: js.UndefOr[left | right | top | bottom] = js.undefined
    
    var prefixCls: js.UndefOr[String] = js.undefined
    
    var sidebar: js.UndefOr[Node] = js.undefined
    
    var sidebarStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var touch: js.UndefOr[Boolean] = js.undefined
    
    var transitions: js.UndefOr[Boolean] = js.undefined
  }
  object PartialDrawerProps {
    
    inline def apply(): PartialDrawerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialDrawerProps]
    }
    
    extension [Self <: PartialDrawerProps](x: Self) {
      
      inline def setChildren(value: Node | js.Array[Node]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Element | Empty | JsNumber | Node | String)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setContentStyle(value: CSSProperties): Self = StObject.set(x, "contentStyle", value.asInstanceOf[js.Any])
      
      inline def setContentStyleUndefined: Self = StObject.set(x, "contentStyle", js.undefined)
      
      inline def setDocked(value: Boolean): Self = StObject.set(x, "docked", value.asInstanceOf[js.Any])
      
      inline def setDockedUndefined: Self = StObject.set(x, "docked", js.undefined)
      
      inline def setDragHandleStyle(value: CSSProperties): Self = StObject.set(x, "dragHandleStyle", value.asInstanceOf[js.Any])
      
      inline def setDragHandleStyleUndefined: Self = StObject.set(x, "dragHandleStyle", js.undefined)
      
      inline def setDragToggleDistance(value: Double): Self = StObject.set(x, "dragToggleDistance", value.asInstanceOf[js.Any])
      
      inline def setDragToggleDistanceUndefined: Self = StObject.set(x, "dragToggleDistance", js.undefined)
      
      inline def setEnableDragHandle(value: Boolean): Self = StObject.set(x, "enableDragHandle", value.asInstanceOf[js.Any])
      
      inline def setEnableDragHandleUndefined: Self = StObject.set(x, "enableDragHandle", js.undefined)
      
      inline def setOnOpenChange(value: (/* open */ Boolean, /* overlay */ js.UndefOr[OverlayClicked]) => Callback): Self = StObject.set(x, "onOpenChange", js.Any.fromFunction2((t0: /* open */ Boolean, t1: /* overlay */ js.UndefOr[OverlayClicked]) => (value(t0, t1)).runNow()))
      
      inline def setOnOpenChangeUndefined: Self = StObject.set(x, "onOpenChange", js.undefined)
      
      inline def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      inline def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
      
      inline def setOverlayStyle(value: CSSProperties): Self = StObject.set(x, "overlayStyle", value.asInstanceOf[js.Any])
      
      inline def setOverlayStyleUndefined: Self = StObject.set(x, "overlayStyle", js.undefined)
      
      inline def setPosition(value: left | right | top | bottom): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      inline def setSidebar(value: VdomNode): Self = StObject.set(x, "sidebar", value.rawNode.asInstanceOf[js.Any])
      
      inline def setSidebarNull: Self = StObject.set(x, "sidebar", null)
      
      inline def setSidebarStyle(value: CSSProperties): Self = StObject.set(x, "sidebarStyle", value.asInstanceOf[js.Any])
      
      inline def setSidebarStyleUndefined: Self = StObject.set(x, "sidebarStyle", js.undefined)
      
      inline def setSidebarUndefined: Self = StObject.set(x, "sidebar", js.undefined)
      
      inline def setSidebarVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "sidebar", js.Array(value*))
      
      inline def setSidebarVdomElement(value: VdomElement): Self = StObject.set(x, "sidebar", value.rawElement.asInstanceOf[js.Any])
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTouch(value: Boolean): Self = StObject.set(x, "touch", value.asInstanceOf[js.Any])
      
      inline def setTouchUndefined: Self = StObject.set(x, "touch", js.undefined)
      
      inline def setTransitions(value: Boolean): Self = StObject.set(x, "transitions", value.asInstanceOf[js.Any])
      
      inline def setTransitionsUndefined: Self = StObject.set(x, "transitions", js.undefined)
    }
  }
}
