package typingsJapgolly.reactToolbox

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.react.mod.Component
import typingsJapgolly.reactToolbox.mod.ReactToolbox.Props
import typingsJapgolly.reactToolbox.reactToolboxStrings.auto
import typingsJapgolly.reactToolbox.reactToolboxStrings.bottomLeft
import typingsJapgolly.reactToolbox.reactToolboxStrings.bottomRight
import typingsJapgolly.reactToolbox.reactToolboxStrings.static
import typingsJapgolly.reactToolbox.reactToolboxStrings.topLeft
import typingsJapgolly.reactToolbox.reactToolboxStrings.topRight
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsMenuIconMenuMod {
  
  @JSImport("react-toolbox/components/menu/IconMenu", JSImport.Default)
  @js.native
  open class default protected () extends IconMenu {
    def this(props: IconMenuProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: IconMenuProps, context: Any) = this()
  }
  
  @JSImport("react-toolbox/components/menu/IconMenu", "IconMenu")
  @js.native
  open class IconMenu protected ()
    extends Component[IconMenuProps, js.Object, Any] {
    def this(props: IconMenuProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: IconMenuProps, context: Any) = this()
  }
  
  trait IconMenuProps
    extends StObject
       with Props {
    
    /**
      * If true, the inner Menu component will be active.
      * @default false
      */
    var active: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Children to pass through the component.
      */
    var children: js.UndefOr[Node] = js.undefined
    
    /**
      * Icon font key string or Element to display the opener icon.
      * @default more_vert
      */
    var icon: js.UndefOr[Node] = js.undefined
    
    /**
      * If true, the icon will show a ripple when is clicked.
      * @default true
      */
    var iconRipple: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If true, the neutral colors are inverted. Useful if the icon is over a dark background.
      * @default false
      */
    var inverse: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Transferred to the Menu component.
      * @default true
      */
    var menuRipple: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Callback that will be called when the menu is being hidden.
      */
    var onHide: js.UndefOr[js.Function] = js.undefined
    
    /**
      * Callback that will be invoked when a menu item is selected.
      */
    var onSelect: js.UndefOr[js.Function] = js.undefined
    
    /**
      * Callback that will be invoked when the menu is being shown.
      */
    var onShow: js.UndefOr[js.Function] = js.undefined
    
    /**
      * Determines the position of the menu. This property is transferred to the inner Menu component.
      * @default auto
      */
    var position: js.UndefOr[auto | static | topLeft | topRight | bottomLeft | bottomRight] = js.undefined
    
    /**
      * If true, the menu will keep a value to highlight the active child item.
      * @default false
      */
    var selectable: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Used for selectable menus. Indicates the current selected value so the child item with this value can be highlighted.
      */
    var selected: js.UndefOr[Any] = js.undefined
    
    /**
      * Classnames object defining the component style.
      */
    var theme: js.UndefOr[IconMenuTheme] = js.undefined
  }
  object IconMenuProps {
    
    inline def apply(): IconMenuProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IconMenuProps]
    }
    
    extension [Self <: IconMenuProps](x: Self) {
      
      inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setIcon(value: VdomNode): Self = StObject.set(x, "icon", value.rawNode.asInstanceOf[js.Any])
      
      inline def setIconNull: Self = StObject.set(x, "icon", null)
      
      inline def setIconRipple(value: Boolean): Self = StObject.set(x, "iconRipple", value.asInstanceOf[js.Any])
      
      inline def setIconRippleUndefined: Self = StObject.set(x, "iconRipple", js.undefined)
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setIconVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "icon", js.Array(value*))
      
      inline def setIconVdomElement(value: VdomElement): Self = StObject.set(x, "icon", value.rawElement.asInstanceOf[js.Any])
      
      inline def setInverse(value: Boolean): Self = StObject.set(x, "inverse", value.asInstanceOf[js.Any])
      
      inline def setInverseUndefined: Self = StObject.set(x, "inverse", js.undefined)
      
      inline def setMenuRipple(value: Boolean): Self = StObject.set(x, "menuRipple", value.asInstanceOf[js.Any])
      
      inline def setMenuRippleUndefined: Self = StObject.set(x, "menuRipple", js.undefined)
      
      inline def setOnHide(value: js.Function): Self = StObject.set(x, "onHide", value.asInstanceOf[js.Any])
      
      inline def setOnHideUndefined: Self = StObject.set(x, "onHide", js.undefined)
      
      inline def setOnSelect(value: js.Function): Self = StObject.set(x, "onSelect", value.asInstanceOf[js.Any])
      
      inline def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
      
      inline def setOnShow(value: js.Function): Self = StObject.set(x, "onShow", value.asInstanceOf[js.Any])
      
      inline def setOnShowUndefined: Self = StObject.set(x, "onShow", js.undefined)
      
      inline def setPosition(value: auto | static | topLeft | topRight | bottomLeft | bottomRight): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setSelectable(value: Boolean): Self = StObject.set(x, "selectable", value.asInstanceOf[js.Any])
      
      inline def setSelectableUndefined: Self = StObject.set(x, "selectable", js.undefined)
      
      inline def setSelected(value: Any): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      inline def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
      
      inline def setTheme(value: IconMenuTheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
  
  trait IconMenuTheme extends StObject {
    
    /**
      * Used for the icon element.
      */
    var icon: js.UndefOr[String] = js.undefined
    
    /**
      * Used for the root element of the icon menu.
      */
    var iconMenu: js.UndefOr[String] = js.undefined
  }
  object IconMenuTheme {
    
    inline def apply(): IconMenuTheme = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IconMenuTheme]
    }
    
    extension [Self <: IconMenuTheme](x: Self) {
      
      inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconMenu(value: String): Self = StObject.set(x, "iconMenu", value.asInstanceOf[js.Any])
      
      inline def setIconMenuUndefined: Self = StObject.set(x, "iconMenu", js.undefined)
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    }
  }
}
