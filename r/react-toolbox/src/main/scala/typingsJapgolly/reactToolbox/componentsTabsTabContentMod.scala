package typingsJapgolly.reactToolbox

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.react.mod.Component
import typingsJapgolly.reactToolbox.mod.ReactToolbox.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsTabsTabContentMod {
  
  @JSImport("react-toolbox/components/tabs/TabContent", JSImport.Default)
  @js.native
  open class default protected () extends TabContent {
    def this(props: TabContentProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: TabContentProps, context: Any) = this()
  }
  
  @JSImport("react-toolbox/components/tabs/TabContent", "TabContent")
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
  
  trait TabContentProps
    extends StObject
       with Props {
    
    /**
      * Whether tab is active.
      */
    var active: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Tab content.
      */
    var children: js.UndefOr[Node] = js.undefined
    
    /**
      * Current tab index.
      */
    var tabIndex: js.UndefOr[Double] = js.undefined
    
    /**
      * Classnames object defining the component style.
      */
    var theme: js.UndefOr[TabContentTheme] = js.undefined
  }
  object TabContentProps {
    
    inline def apply(): TabContentProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TabContentProps]
    }
    
    extension [Self <: TabContentProps](x: Self) {
      
      inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
      
      inline def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
      
      inline def setTheme(value: TabContentTheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
  
  trait TabContentTheme extends StObject {
    
    /**
      * Added when tab is active.
      */
    var active: js.UndefOr[String] = js.undefined
    
    /**
      * Used for the tab content element.
      */
    var tab: js.UndefOr[String] = js.undefined
  }
  object TabContentTheme {
    
    inline def apply(): TabContentTheme = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TabContentTheme]
    }
    
    extension [Self <: TabContentTheme](x: Self) {
      
      inline def setActive(value: String): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      inline def setTab(value: String): Self = StObject.set(x, "tab", value.asInstanceOf[js.Any])
      
      inline def setTabUndefined: Self = StObject.set(x, "tab", js.undefined)
    }
  }
}
