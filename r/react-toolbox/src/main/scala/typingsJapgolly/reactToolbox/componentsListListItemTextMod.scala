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

object componentsListListItemTextMod {
  
  @JSImport("react-toolbox/components/list/ListItemText", "ListItemText")
  @js.native
  open class ListItemText protected ()
    extends Component[ListItemTextProps, js.Object, Any] {
    def this(props: ListItemTextProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ListItemTextProps, context: Any) = this()
  }
  
  trait ListItemTextProps
    extends StObject
       with Props
       with /**
    * Additional properties passed to inner input element.
    */
  /* key */ StringDictionary[Any] {
    
    /**
      * Children to pass through the component.
      */
    var children: js.UndefOr[Node] = js.undefined
    
    /**
      * Whether list item text should have 'primary' look.
      * @default
      */
    var primary: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Object defining the component class name mappings.
      */
    var theme: js.UndefOr[ListItemTextTheme] = js.undefined
  }
  object ListItemTextProps {
    
    inline def apply(): ListItemTextProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListItemTextProps]
    }
    
    extension [Self <: ListItemTextProps](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setPrimary(value: Boolean): Self = StObject.set(x, "primary", value.asInstanceOf[js.Any])
      
      inline def setPrimaryUndefined: Self = StObject.set(x, "primary", js.undefined)
      
      inline def setTheme(value: ListItemTextTheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
  
  trait ListItemTextTheme extends StObject {
    
    /**
      * Added to the text inside of the list item.
      */
    var itemText: js.UndefOr[String] = js.undefined
    
    /**
      * Added to the text inside of the list item if its primary.
      */
    var primary: js.UndefOr[String] = js.undefined
  }
  object ListItemTextTheme {
    
    inline def apply(): ListItemTextTheme = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListItemTextTheme]
    }
    
    extension [Self <: ListItemTextTheme](x: Self) {
      
      inline def setItemText(value: String): Self = StObject.set(x, "itemText", value.asInstanceOf[js.Any])
      
      inline def setItemTextUndefined: Self = StObject.set(x, "itemText", js.undefined)
      
      inline def setPrimary(value: String): Self = StObject.set(x, "primary", value.asInstanceOf[js.Any])
      
      inline def setPrimaryUndefined: Self = StObject.set(x, "primary", js.undefined)
    }
  }
}
