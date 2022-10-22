package typingsJapgolly.reactLeafletSidebarv2

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-leaflet-sidebarv2", "Sidebar")
  @js.native
  open class Sidebar protected () extends Component[SidebarProps, Any, Any] {
    def this(props: SidebarProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: SidebarProps, context: Any) = this()
  }
  
  @JSImport("react-leaflet-sidebarv2", "Tab")
  @js.native
  open class Tab protected () extends Component[TabProps, Any, Any] {
    def this(props: TabProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: TabProps, context: Any) = this()
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.reactLeafletSidebarv2.reactLeafletSidebarv2Strings.top
    - typingsJapgolly.reactLeafletSidebarv2.reactLeafletSidebarv2Strings.bottom
  */
  trait Anchor extends StObject
  object Anchor {
    
    inline def bottom: typingsJapgolly.reactLeafletSidebarv2.reactLeafletSidebarv2Strings.bottom = "bottom".asInstanceOf[typingsJapgolly.reactLeafletSidebarv2.reactLeafletSidebarv2Strings.bottom]
    
    inline def top: typingsJapgolly.reactLeafletSidebarv2.reactLeafletSidebarv2Strings.top = "top".asInstanceOf[typingsJapgolly.reactLeafletSidebarv2.reactLeafletSidebarv2Strings.top]
  }
  
  type Icon = String | Element
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.reactLeafletSidebarv2.reactLeafletSidebarv2Strings.left
    - typingsJapgolly.reactLeafletSidebarv2.reactLeafletSidebarv2Strings.right
  */
  trait Position extends StObject
  object Position {
    
    inline def left: typingsJapgolly.reactLeafletSidebarv2.reactLeafletSidebarv2Strings.left = "left".asInstanceOf[typingsJapgolly.reactLeafletSidebarv2.reactLeafletSidebarv2Strings.left]
    
    inline def right: typingsJapgolly.reactLeafletSidebarv2.reactLeafletSidebarv2Strings.right = "right".asInstanceOf[typingsJapgolly.reactLeafletSidebarv2.reactLeafletSidebarv2Strings.right]
  }
  
  trait SidebarProps extends StObject {
    
    var children: TabType
    
    var closeIcon: js.UndefOr[Icon] = js.undefined
    
    var collapsed: Boolean
    
    var id: String
    
    var onClose: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onOpen: js.UndefOr[js.Function1[/* id */ String, Unit]] = js.undefined
    
    var position: Position
    
    var selected: String
  }
  object SidebarProps {
    
    inline def apply(children: TabType, collapsed: Boolean, id: String, position: Position, selected: String): SidebarProps = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], collapsed = collapsed.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any])
      __obj.asInstanceOf[SidebarProps]
    }
    
    extension [Self <: SidebarProps](x: Self) {
      
      inline def setChildren(value: TabType): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenVarargs(value: Element*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setCloseIcon(value: Icon): Self = StObject.set(x, "closeIcon", value.asInstanceOf[js.Any])
      
      inline def setCloseIconUndefined: Self = StObject.set(x, "closeIcon", js.undefined)
      
      inline def setCloseIconVdomElement(value: VdomElement): Self = StObject.set(x, "closeIcon", value.rawElement.asInstanceOf[js.Any])
      
      inline def setCollapsed(value: Boolean): Self = StObject.set(x, "collapsed", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setOnClose(value: Callback): Self = StObject.set(x, "onClose", value.toJsFn)
      
      inline def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
      
      inline def setOnOpen(value: /* id */ String => Callback): Self = StObject.set(x, "onOpen", js.Any.fromFunction1((t0: /* id */ String) => value(t0).runNow()))
      
      inline def setOnOpenUndefined: Self = StObject.set(x, "onOpen", js.undefined)
      
      inline def setPosition(value: Position): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setSelected(value: String): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    }
  }
  
  trait TabProps extends StObject {
    
    var active: js.UndefOr[Boolean] = js.undefined
    
    var anchor: js.UndefOr[Anchor] = js.undefined
    
    var children: js.UndefOr[Node] = js.undefined
    
    var closeIcon: js.UndefOr[Icon] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var header: String
    
    var icon: Icon
    
    var id: String
    
    var onClose: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var position: js.UndefOr[Position] = js.undefined
  }
  object TabProps {
    
    inline def apply(header: String, icon: Icon, id: String): TabProps = {
      val __obj = js.Dynamic.literal(header = header.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[TabProps]
    }
    
    extension [Self <: TabProps](x: Self) {
      
      inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      inline def setAnchor(value: Anchor): Self = StObject.set(x, "anchor", value.asInstanceOf[js.Any])
      
      inline def setAnchorUndefined: Self = StObject.set(x, "anchor", js.undefined)
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setCloseIcon(value: Icon): Self = StObject.set(x, "closeIcon", value.asInstanceOf[js.Any])
      
      inline def setCloseIconUndefined: Self = StObject.set(x, "closeIcon", js.undefined)
      
      inline def setCloseIconVdomElement(value: VdomElement): Self = StObject.set(x, "closeIcon", value.rawElement.asInstanceOf[js.Any])
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setHeader(value: String): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      inline def setIcon(value: Icon): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconVdomElement(value: VdomElement): Self = StObject.set(x, "icon", value.rawElement.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setOnClose(value: Callback): Self = StObject.set(x, "onClose", value.toJsFn)
      
      inline def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
      
      inline def setPosition(value: Position): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    }
  }
  
  type TabType = Element | js.Array[Element]
}
