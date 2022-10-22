package typingsJapgolly.reactToolbox

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.react.mod.Component
import typingsJapgolly.reactToolbox.componentsListListItemActionsMod.ListItemActionsTheme
import typingsJapgolly.reactToolbox.componentsListListItemContentMod.ListItemContentTheme
import typingsJapgolly.reactToolbox.componentsListListItemLayoutMod.ListItemLayoutProps
import typingsJapgolly.reactToolbox.componentsListListItemLayoutMod.ListItemLayoutTheme
import typingsJapgolly.reactToolbox.componentsListListItemTextMod.ListItemTextTheme
import typingsJapgolly.reactToolbox.mod.ReactToolbox.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsListListItemMod {
  
  @JSImport("react-toolbox/components/list/ListItem", "ListItem")
  @js.native
  open class ListItem protected ()
    extends Component[ListItemProps & ListItemLayoutProps, js.Object, Any] {
    def this(props: ListItemProps & ListItemLayoutProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ListItemProps & ListItemLayoutProps, context: Any) = this()
  }
  
  trait ListItemProps
    extends StObject
       with Props {
    
    /**
      * Children to pass through the component.
      */
    var children: js.UndefOr[Node] = js.undefined
    
    /**
      * If true, the item is displayed as disabled and is not clickable.
      * @default false
      */
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If true, the item displays a ripple effect on click. By default it's inherited from the parent element.
      */
    var ripple: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Classnames object defining the component style.
      * @default false
      */
    var theme: js.UndefOr[
        ListItemTheme & ListItemActionsTheme & ListItemContentTheme & ListItemLayoutTheme & ListItemTextTheme
      ] = js.undefined
    
    /**
      * In case you want to provide the item as a link, you can pass this property to specify the href.
      */
    var to: js.UndefOr[String] = js.undefined
  }
  object ListItemProps {
    
    inline def apply(): ListItemProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListItemProps]
    }
    
    extension [Self <: ListItemProps](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setRipple(value: Boolean): Self = StObject.set(x, "ripple", value.asInstanceOf[js.Any])
      
      inline def setRippleUndefined: Self = StObject.set(x, "ripple", js.undefined)
      
      inline def setTheme(
        value: ListItemTheme & ListItemActionsTheme & ListItemContentTheme & ListItemLayoutTheme & ListItemTextTheme
      ): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      inline def setTo(value: String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      inline def setToUndefined: Self = StObject.set(x, "to", js.undefined)
    }
  }
  
  trait ListItemTheme extends StObject {
    
    /**
      * Used for the root element of the list.
      */
    var listItem: js.UndefOr[String] = js.undefined
  }
  object ListItemTheme {
    
    inline def apply(): ListItemTheme = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListItemTheme]
    }
    
    extension [Self <: ListItemTheme](x: Self) {
      
      inline def setListItem(value: String): Self = StObject.set(x, "listItem", value.asInstanceOf[js.Any])
      
      inline def setListItemUndefined: Self = StObject.set(x, "listItem", js.undefined)
    }
  }
}
