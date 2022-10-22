package typingsJapgolly.reactToolbox

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.ReactChild
import typingsJapgolly.reactToolbox.componentsListListItemActionsMod.ListItemActionsTheme
import typingsJapgolly.reactToolbox.componentsListListItemContentMod.ListItemContentTheme
import typingsJapgolly.reactToolbox.mod.ReactToolbox.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsListListItemLayoutMod {
  
  @JSImport("react-toolbox/components/list/ListItemLayout", "ListItemLayout")
  @js.native
  open class ListItemLayout protected ()
    extends Component[ListItemLayoutProps, js.Object, Any] {
    def this(props: ListItemLayoutProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ListItemLayoutProps, context: Any) = this()
  }
  
  trait ListItemLayoutProps
    extends StObject
       with Props {
    
    /**
      * A string URL to specify an avatar in the left side of the item.
      */
    var avatar: js.UndefOr[String | Element] = js.undefined
    
    /**
      * Main text of the item.
      */
    var caption: js.UndefOr[String] = js.undefined
    
    /**
      * Children to pass through the component.
      */
    var children: js.UndefOr[Node] = js.undefined
    
    /**
      * If true, the item is displayed as disabled and it's not clickable.
      * @default false
      */
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Layout content.
      */
    var itemContent: js.UndefOr[ReactChild] = js.undefined
    
    /**
      * A list of elements that are placed on the left side of the item and after the avatar attribute.
      */
    var leftActions: js.UndefOr[js.Array[Node]] = js.undefined
    
    /**
      * A string key of a font icon or element to display an icon in the left side of the item.
      */
    var leftIcon: js.UndefOr[String | Element] = js.undefined
    
    /**
      * Secondary text to display under the caption.
      */
    var legend: js.UndefOr[String] = js.undefined
    
    /**
      * A list of elements that are placed on the right side of the item and after the rightIcon attribute.
      */
    var rightActions: js.UndefOr[js.Array[Node]] = js.undefined
    
    /**
      * The same as the leftIcon but in this case the icon is displayed in the right side.
      */
    var rightIcon: js.UndefOr[String | Element] = js.undefined
    
    /**
      * If true, the elements in the list will display a hover effect and a pointer cursor. Inherited from the parent.
      * @default false
      */
    var selectable: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Object defining the component class name mappings.
      */
    var theme: js.UndefOr[ListItemLayoutTheme & ListItemContentTheme & ListItemActionsTheme] = js.undefined
    
    /**
      * In case you want to provide the item as a link, you can pass this property to specify the href.
      */
    var to: js.UndefOr[String] = js.undefined
  }
  object ListItemLayoutProps {
    
    inline def apply(): ListItemLayoutProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListItemLayoutProps]
    }
    
    extension [Self <: ListItemLayoutProps](x: Self) {
      
      inline def setAvatar(value: String | Element): Self = StObject.set(x, "avatar", value.asInstanceOf[js.Any])
      
      inline def setAvatarUndefined: Self = StObject.set(x, "avatar", js.undefined)
      
      inline def setAvatarVdomElement(value: VdomElement): Self = StObject.set(x, "avatar", value.rawElement.asInstanceOf[js.Any])
      
      inline def setCaption(value: String): Self = StObject.set(x, "caption", value.asInstanceOf[js.Any])
      
      inline def setCaptionUndefined: Self = StObject.set(x, "caption", js.undefined)
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setItemContent(value: ReactChild): Self = StObject.set(x, "itemContent", value.asInstanceOf[js.Any])
      
      inline def setItemContentUndefined: Self = StObject.set(x, "itemContent", js.undefined)
      
      inline def setItemContentVdomElement(value: VdomElement): Self = StObject.set(x, "itemContent", value.rawElement.asInstanceOf[js.Any])
      
      inline def setLeftActions(value: js.Array[Node]): Self = StObject.set(x, "leftActions", value.asInstanceOf[js.Any])
      
      inline def setLeftActionsUndefined: Self = StObject.set(x, "leftActions", js.undefined)
      
      inline def setLeftActionsVarargs(value: Node*): Self = StObject.set(x, "leftActions", js.Array(value*))
      
      inline def setLeftIcon(value: String | Element): Self = StObject.set(x, "leftIcon", value.asInstanceOf[js.Any])
      
      inline def setLeftIconUndefined: Self = StObject.set(x, "leftIcon", js.undefined)
      
      inline def setLeftIconVdomElement(value: VdomElement): Self = StObject.set(x, "leftIcon", value.rawElement.asInstanceOf[js.Any])
      
      inline def setLegend(value: String): Self = StObject.set(x, "legend", value.asInstanceOf[js.Any])
      
      inline def setLegendUndefined: Self = StObject.set(x, "legend", js.undefined)
      
      inline def setRightActions(value: js.Array[Node]): Self = StObject.set(x, "rightActions", value.asInstanceOf[js.Any])
      
      inline def setRightActionsUndefined: Self = StObject.set(x, "rightActions", js.undefined)
      
      inline def setRightActionsVarargs(value: Node*): Self = StObject.set(x, "rightActions", js.Array(value*))
      
      inline def setRightIcon(value: String | Element): Self = StObject.set(x, "rightIcon", value.asInstanceOf[js.Any])
      
      inline def setRightIconUndefined: Self = StObject.set(x, "rightIcon", js.undefined)
      
      inline def setRightIconVdomElement(value: VdomElement): Self = StObject.set(x, "rightIcon", value.rawElement.asInstanceOf[js.Any])
      
      inline def setSelectable(value: Boolean): Self = StObject.set(x, "selectable", value.asInstanceOf[js.Any])
      
      inline def setSelectableUndefined: Self = StObject.set(x, "selectable", js.undefined)
      
      inline def setTheme(value: ListItemLayoutTheme & ListItemContentTheme & ListItemActionsTheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      inline def setTo(value: String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      inline def setToUndefined: Self = StObject.set(x, "to", js.undefined)
    }
  }
  
  trait ListItemLayoutTheme extends StObject {
    
    /**
      * Added to the inner content if its a disabled item.
      */
    var disabled: js.UndefOr[String] = js.undefined
    
    /**
      * Used for the inner content of a list item.
      */
    var item: js.UndefOr[String] = js.undefined
    
    /**
      * Added when layout is selectable.
      */
    var selectable: js.UndefOr[String] = js.undefined
  }
  object ListItemLayoutTheme {
    
    inline def apply(): ListItemLayoutTheme = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListItemLayoutTheme]
    }
    
    extension [Self <: ListItemLayoutTheme](x: Self) {
      
      inline def setDisabled(value: String): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setItem(value: String): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
      
      inline def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
      
      inline def setSelectable(value: String): Self = StObject.set(x, "selectable", value.asInstanceOf[js.Any])
      
      inline def setSelectableUndefined: Self = StObject.set(x, "selectable", js.undefined)
    }
  }
}
