package typingsJapgolly.reactTabsRedux

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

object tabsMod {
  
  @JSImport("react-tabs-redux/Tabs", "Tabs")
  @js.native
  open class Tabs protected ()
    extends Component[TabsProps, js.Object, Any] {
    def this(props: TabsProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: TabsProps, context: Any) = this()
  }
  
  trait TabsProps extends StObject {
    
    var activeLinkStyle: js.UndefOr[js.Object] = js.undefined
    
    var children: js.UndefOr[Node] = js.undefined
    
    var disableInlineStyles: js.UndefOr[Boolean] = js.undefined
    
    var handleSelect: js.UndefOr[js.Function2[/* tab */ String, /* name */ String, Unit]] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var onChange: js.UndefOr[js.Function2[/* selectedTab */ String, /* name */ String, Unit]] = js.undefined
    
    var renderActiveTabContentOnly: js.UndefOr[Boolean] = js.undefined
    
    var selectedTab: js.UndefOr[String] = js.undefined
    
    var visibleTabStyle: js.UndefOr[js.Object] = js.undefined
  }
  object TabsProps {
    
    inline def apply(): TabsProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TabsProps]
    }
    
    extension [Self <: TabsProps](x: Self) {
      
      inline def setActiveLinkStyle(value: js.Object): Self = StObject.set(x, "activeLinkStyle", value.asInstanceOf[js.Any])
      
      inline def setActiveLinkStyleUndefined: Self = StObject.set(x, "activeLinkStyle", js.undefined)
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setDisableInlineStyles(value: Boolean): Self = StObject.set(x, "disableInlineStyles", value.asInstanceOf[js.Any])
      
      inline def setDisableInlineStylesUndefined: Self = StObject.set(x, "disableInlineStyles", js.undefined)
      
      inline def setHandleSelect(value: (/* tab */ String, /* name */ String) => Callback): Self = StObject.set(x, "handleSelect", js.Any.fromFunction2((t0: /* tab */ String, t1: /* name */ String) => (value(t0, t1)).runNow()))
      
      inline def setHandleSelectUndefined: Self = StObject.set(x, "handleSelect", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setOnChange(value: (/* selectedTab */ String, /* name */ String) => Callback): Self = StObject.set(x, "onChange", js.Any.fromFunction2((t0: /* selectedTab */ String, t1: /* name */ String) => (value(t0, t1)).runNow()))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setRenderActiveTabContentOnly(value: Boolean): Self = StObject.set(x, "renderActiveTabContentOnly", value.asInstanceOf[js.Any])
      
      inline def setRenderActiveTabContentOnlyUndefined: Self = StObject.set(x, "renderActiveTabContentOnly", js.undefined)
      
      inline def setSelectedTab(value: String): Self = StObject.set(x, "selectedTab", value.asInstanceOf[js.Any])
      
      inline def setSelectedTabUndefined: Self = StObject.set(x, "selectedTab", js.undefined)
      
      inline def setVisibleTabStyle(value: js.Object): Self = StObject.set(x, "visibleTabStyle", value.asInstanceOf[js.Any])
      
      inline def setVisibleTabStyleUndefined: Self = StObject.set(x, "visibleTabStyle", js.undefined)
    }
  }
}
