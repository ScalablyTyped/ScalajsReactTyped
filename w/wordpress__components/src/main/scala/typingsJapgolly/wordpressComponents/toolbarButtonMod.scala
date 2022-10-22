package typingsJapgolly.wordpressComponents

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.wordpressComponents.anon.PartialPropsAccept
import typingsJapgolly.wordpressComponents.dashiconMod.Dashicon.Icon
import typingsJapgolly.wordpressComponents.shortcutMod.Shortcut.ShortcutType
import typingsJapgolly.wordpressComponents.toolbarButtonMod.ToolbarButton.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toolbarButtonMod {
  
  object default extends Shortcut {
    
    @JSImport("@wordpress/components/toolbar-button", JSImport.Default)
    @js.native
    val ^ : ComponentType[Props | typingsJapgolly.wordpressComponents.buttonMod.Button.Props] = js.native
    
    type _To = ComponentType[Props | typingsJapgolly.wordpressComponents.buttonMod.Button.Props]
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: ComponentType[Props | typingsJapgolly.wordpressComponents.buttonMod.Button.Props] = ^
  }
  
  object ToolbarButton {
    
    /* Inlined parent @wordpress/components.@wordpress/components/dropdown-menu.default.Control */
    /* Inlined parent std.Pick<@wordpress/components.@wordpress/components/icon-button.default.Props, 'shortcut'> */
    trait Props extends StObject {
      
      /**
        * Anything to add into the containing element after the button.
        */
      var children: js.UndefOr[Node] = js.undefined
      
      /**
        * `className` for the button element.
        */
      var className: js.UndefOr[String] = js.undefined
      
      /**
        * `className` for the container.
        */
      var containerClassName: js.UndefOr[String] = js.undefined
      
      /**
        * Any additional props to pass down to `IconButton`.
        */
      var extraProps: js.UndefOr[PartialPropsAccept] = js.undefined
      
      /**
        * Dashicon icon slug.
        */
      var icon: Icon | Element
      
      /**
        * Describes whether or not the button is active.
        */
      var isActive: js.UndefOr[Boolean] = js.undefined
      
      /**
        * Describes whether or not the control is disabled.
        */
      var isDisabled: js.UndefOr[Boolean] = js.undefined
      
      /**
        * Function to invoke when the option is selected.
        */
      var onClick: js.UndefOr[js.Function0[Unit]] = js.undefined
      
      var shortcut: js.UndefOr[ShortcutType] = js.undefined
      
      /**
        * Subscript text to add to the button.
        */
      var subscript: js.UndefOr[String] = js.undefined
      
      /**
        * Human-readable title for the control.
        */
      var title: String
    }
    object Props {
      
      inline def apply(icon: Icon | Element, title: String): Props = {
        val __obj = js.Dynamic.literal(icon = icon.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
        __obj.asInstanceOf[Props]
      }
      
      extension [Self <: Props](x: Self) {
        
        inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
        
        inline def setChildrenNull: Self = StObject.set(x, "children", null)
        
        inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
        
        inline def setChildrenVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "children", js.Array(value*))
        
        inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
        
        inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
        
        inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
        
        inline def setContainerClassName(value: String): Self = StObject.set(x, "containerClassName", value.asInstanceOf[js.Any])
        
        inline def setContainerClassNameUndefined: Self = StObject.set(x, "containerClassName", js.undefined)
        
        inline def setExtraProps(value: PartialPropsAccept): Self = StObject.set(x, "extraProps", value.asInstanceOf[js.Any])
        
        inline def setExtraPropsUndefined: Self = StObject.set(x, "extraProps", js.undefined)
        
        inline def setIcon(value: Icon | Element): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
        
        inline def setIconVdomElement(value: VdomElement): Self = StObject.set(x, "icon", value.rawElement.asInstanceOf[js.Any])
        
        inline def setIsActive(value: Boolean): Self = StObject.set(x, "isActive", value.asInstanceOf[js.Any])
        
        inline def setIsActiveUndefined: Self = StObject.set(x, "isActive", js.undefined)
        
        inline def setIsDisabled(value: Boolean): Self = StObject.set(x, "isDisabled", value.asInstanceOf[js.Any])
        
        inline def setIsDisabledUndefined: Self = StObject.set(x, "isDisabled", js.undefined)
        
        inline def setOnClick(value: Callback): Self = StObject.set(x, "onClick", value.toJsFn)
        
        inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
        
        inline def setShortcut(value: ShortcutType): Self = StObject.set(x, "shortcut", value.asInstanceOf[js.Any])
        
        inline def setShortcutUndefined: Self = StObject.set(x, "shortcut", js.undefined)
        
        inline def setSubscript(value: String): Self = StObject.set(x, "subscript", value.asInstanceOf[js.Any])
        
        inline def setSubscriptUndefined: Self = StObject.set(x, "subscript", js.undefined)
        
        inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      }
    }
  }
}
