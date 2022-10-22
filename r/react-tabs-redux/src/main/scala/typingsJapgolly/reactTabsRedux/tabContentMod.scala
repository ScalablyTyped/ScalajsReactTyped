package typingsJapgolly.reactTabsRedux

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

object tabContentMod {
  
  @JSImport("react-tabs-redux/TabContent", "TabContent")
  @js.native
  open class TabContent protected ()
    extends Component[TabContentProps, js.Object, Any] {
    def this(props: TabContentProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: TabContentProps, context: Any) = this()
  }
  
  trait TabContentProps extends StObject {
    
    var children: js.UndefOr[Node] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var disableInlineStyles: js.UndefOr[Boolean] = js.undefined
    
    var `for`: String | Double
    
    var isVisible: js.UndefOr[Boolean] = js.undefined
    
    var renderActiveTabContentOnly: js.UndefOr[Boolean] = js.undefined
    
    var style: js.UndefOr[js.Object] = js.undefined
    
    var visibleClassName: js.UndefOr[String] = js.undefined
    
    var visibleStyle: js.UndefOr[js.Object] = js.undefined
  }
  object TabContentProps {
    
    inline def apply(`for`: String | Double): TabContentProps = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("for")(`for`.asInstanceOf[js.Any])
      __obj.asInstanceOf[TabContentProps]
    }
    
    extension [Self <: TabContentProps](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDisableInlineStyles(value: Boolean): Self = StObject.set(x, "disableInlineStyles", value.asInstanceOf[js.Any])
      
      inline def setDisableInlineStylesUndefined: Self = StObject.set(x, "disableInlineStyles", js.undefined)
      
      inline def setFor(value: String | Double): Self = StObject.set(x, "for", value.asInstanceOf[js.Any])
      
      inline def setIsVisible(value: Boolean): Self = StObject.set(x, "isVisible", value.asInstanceOf[js.Any])
      
      inline def setIsVisibleUndefined: Self = StObject.set(x, "isVisible", js.undefined)
      
      inline def setRenderActiveTabContentOnly(value: Boolean): Self = StObject.set(x, "renderActiveTabContentOnly", value.asInstanceOf[js.Any])
      
      inline def setRenderActiveTabContentOnlyUndefined: Self = StObject.set(x, "renderActiveTabContentOnly", js.undefined)
      
      inline def setStyle(value: js.Object): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setVisibleClassName(value: String): Self = StObject.set(x, "visibleClassName", value.asInstanceOf[js.Any])
      
      inline def setVisibleClassNameUndefined: Self = StObject.set(x, "visibleClassName", js.undefined)
      
      inline def setVisibleStyle(value: js.Object): Self = StObject.set(x, "visibleStyle", value.asInstanceOf[js.Any])
      
      inline def setVisibleStyleUndefined: Self = StObject.set(x, "visibleStyle", js.undefined)
    }
  }
}
