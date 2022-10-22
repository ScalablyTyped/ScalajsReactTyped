package typingsJapgolly.reactToolbox

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.react.mod.Component
import typingsJapgolly.reactToolbox.mod.ReactToolbox.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsLinkLinkMod {
  
  @JSImport("react-toolbox/components/link/Link", JSImport.Default)
  @js.native
  open class default protected () extends Link {
    def this(props: LinkProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: LinkProps, context: Any) = this()
  }
  
  @JSImport("react-toolbox/components/link/Link", "Link")
  @js.native
  open class Link protected ()
    extends Component[LinkProps, js.Object, Any] {
    def this(props: LinkProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: LinkProps, context: Any) = this()
  }
  
  trait LinkProps
    extends StObject
       with Props
       with /**
    * Additional properties passed to inner input element.
    */
  /* key */ StringDictionary[Any] {
    
    /**
      * If true, adds active style to link.
      * @default false
      */
    var active: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Children to pass through the component.
      */
    var children: js.UndefOr[Node] = js.undefined
    
    /**
      * Sets a count number.
      */
    var count: js.UndefOr[Double] = js.undefined
    
    /**
      * Sets the anchor link.
      */
    var href: js.UndefOr[String] = js.undefined
    
    /**
      * An icon key string to include a FontIcon component in front of the text.
      */
    var icon: js.UndefOr[Node] = js.undefined
    
    /**
      * The text string used for the text content of the link.
      */
    var label: js.UndefOr[String] = js.undefined
    
    /**
      * Classnames object defining the component style.
      */
    var theme: js.UndefOr[LinkTheme] = js.undefined
  }
  object LinkProps {
    
    inline def apply(): LinkProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LinkProps]
    }
    
    extension [Self <: LinkProps](x: Self) {
      
      inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
      
      inline def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
      
      inline def setHrefUndefined: Self = StObject.set(x, "href", js.undefined)
      
      inline def setIcon(value: VdomNode): Self = StObject.set(x, "icon", value.rawNode.asInstanceOf[js.Any])
      
      inline def setIconNull: Self = StObject.set(x, "icon", null)
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setIconVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "icon", js.Array(value*))
      
      inline def setIconVdomElement(value: VdomElement): Self = StObject.set(x, "icon", value.rawElement.asInstanceOf[js.Any])
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setTheme(value: LinkTheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
  
  trait LinkTheme extends StObject {
    
    /**
      * Added to the root element if the Link is active.
      */
    var active: js.UndefOr[String] = js.undefined
    
    /**
      * Used for the icon element if it's present.
      */
    var icon: js.UndefOr[String] = js.undefined
    
    /**
      * Used for the root element.
      */
    var link: js.UndefOr[String] = js.undefined
  }
  object LinkTheme {
    
    inline def apply(): LinkTheme = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LinkTheme]
    }
    
    extension [Self <: LinkTheme](x: Self) {
      
      inline def setActive(value: String): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setLink(value: String): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
      
      inline def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
    }
  }
}
