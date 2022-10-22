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

object componentsMenuMenuItemMod {
  
  @JSImport("react-toolbox/components/menu/MenuItem", JSImport.Default)
  @js.native
  open class default protected () extends MenuItem {
    def this(props: MenuItemProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: MenuItemProps, context: Any) = this()
  }
  
  @JSImport("react-toolbox/components/menu/MenuItem", "MenuItem")
  @js.native
  open class MenuItem protected ()
    extends Component[MenuItemProps, js.Object, Any] {
    def this(props: MenuItemProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: MenuItemProps, context: Any) = this()
  }
  
  trait MenuItemProps
    extends StObject
       with Props {
    
    /**
      * The text to include in the menu item. Required.
      */
    var caption: String
    
    /**
      * Children to pass through the component.
      */
    var children: js.UndefOr[Node] = js.undefined
    
    /**
      * If true, the item will be displayed as disabled and is not selectable.
      * @default false
      */
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Icon font key string or Element to display in the right side of the option.
      */
    var icon: js.UndefOr[Node] = js.undefined
    
    /**
      * Transferred from the Menu component for selectable menus. Indicates if it's the current active option.
      * @default false
      */
    var selected: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Displays shortcut text on the right side of the caption attribute.
      */
    var shortcut: js.UndefOr[String] = js.undefined
    
    /**
      * Classnames object defining the component style.
      */
    var theme: js.UndefOr[MenuItemTheme] = js.undefined
    
    /**
      * Passed down to the root element
      */
    var value: js.UndefOr[Any] = js.undefined
  }
  object MenuItemProps {
    
    inline def apply(caption: String): MenuItemProps = {
      val __obj = js.Dynamic.literal(caption = caption.asInstanceOf[js.Any])
      __obj.asInstanceOf[MenuItemProps]
    }
    
    extension [Self <: MenuItemProps](x: Self) {
      
      inline def setCaption(value: String): Self = StObject.set(x, "caption", value.asInstanceOf[js.Any])
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setIcon(value: VdomNode): Self = StObject.set(x, "icon", value.rawNode.asInstanceOf[js.Any])
      
      inline def setIconNull: Self = StObject.set(x, "icon", null)
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setIconVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "icon", js.Array(value*))
      
      inline def setIconVdomElement(value: VdomElement): Self = StObject.set(x, "icon", value.rawElement.asInstanceOf[js.Any])
      
      inline def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      inline def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
      
      inline def setShortcut(value: String): Self = StObject.set(x, "shortcut", value.asInstanceOf[js.Any])
      
      inline def setShortcutUndefined: Self = StObject.set(x, "shortcut", js.undefined)
      
      inline def setTheme(value: MenuItemTheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait MenuItemTheme extends StObject {
    
    /**
      * Used for the caption inside the item.
      */
    var caption: js.UndefOr[String] = js.undefined
    
    /**
      * Added to the root element if it's disabled.
      */
    var disabled: js.UndefOr[String] = js.undefined
    
    /**
      * Used for the icon element if exists.
      */
    var icon: js.UndefOr[String] = js.undefined
    
    /**
      * Used as the root class for the component.
      */
    var menuItem: js.UndefOr[String] = js.undefined
    
    /**
      * Added to the root element in case it's selected.
      */
    var selected: js.UndefOr[String] = js.undefined
    
    /**
      * Used for the shortcut element if exists.
      */
    var shortcut: js.UndefOr[String] = js.undefined
  }
  object MenuItemTheme {
    
    inline def apply(): MenuItemTheme = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MenuItemTheme]
    }
    
    extension [Self <: MenuItemTheme](x: Self) {
      
      inline def setCaption(value: String): Self = StObject.set(x, "caption", value.asInstanceOf[js.Any])
      
      inline def setCaptionUndefined: Self = StObject.set(x, "caption", js.undefined)
      
      inline def setDisabled(value: String): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setMenuItem(value: String): Self = StObject.set(x, "menuItem", value.asInstanceOf[js.Any])
      
      inline def setMenuItemUndefined: Self = StObject.set(x, "menuItem", js.undefined)
      
      inline def setSelected(value: String): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      inline def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
      
      inline def setShortcut(value: String): Self = StObject.set(x, "shortcut", value.asInstanceOf[js.Any])
      
      inline def setShortcutUndefined: Self = StObject.set(x, "shortcut", js.undefined)
    }
  }
}
