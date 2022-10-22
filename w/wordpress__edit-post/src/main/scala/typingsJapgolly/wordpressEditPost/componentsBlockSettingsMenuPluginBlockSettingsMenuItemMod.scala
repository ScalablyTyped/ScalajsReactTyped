package typingsJapgolly.wordpressEditPost

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.vdom.VdomElement
import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.HTMLButtonElement
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.react.mod.MouseEventHandler
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.wordpressComponents.dashiconMod.Dashicon.Icon
import typingsJapgolly.wordpressEditPost.componentsBlockSettingsMenuPluginBlockSettingsMenuItemMod.PluginBlockSettingsMenuItem.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsBlockSettingsMenuPluginBlockSettingsMenuItemMod {
  
  object default extends Shortcut {
    
    @JSImport("@wordpress/edit-post/components/block-settings-menu/plugin-block-settings-menu-item", JSImport.Default)
    @js.native
    val ^ : ComponentType[Props] = js.native
    
    type _To = ComponentType[Props]
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: ComponentType[Props] = ^
  }
  
  object PluginBlockSettingsMenuItem {
    
    trait Props extends StObject {
      
      /**
        * An array containing a list of block names for which the item should be shown. If not present,
        * it'll be rendered for any block. If multiple blocks are selected, it'll be shown if and only if
        * all of them are in the whitelist.
        */
      var allowedBlocks: js.UndefOr[js.Array[String]] = js.undefined
      
      /**
        * A dashicon slug, or a custom JSX element.
        * @defaultValue `"admin-plugins"`
        */
      var icon: js.UndefOr[Element | Icon] = js.undefined
      
      /**
        * The menu item text.
        */
      var label: String
      
      /**
        * Callback function to be executed when the user click the menu item.
        */
      var onClick: MouseEventHandler[HTMLButtonElement]
      
      /**
        * If it should be rendered smaller. (This is undocumented).
        */
      var small: js.UndefOr[Boolean] = js.undefined
    }
    object Props {
      
      inline def apply(
        label: String,
        onClick: ReactMouseEventFrom[HTMLButtonElement & org.scalajs.dom.Element] => Callback
      ): Props = {
        val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], onClick = js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLButtonElement & org.scalajs.dom.Element]) => onClick(t0).runNow()))
        __obj.asInstanceOf[Props]
      }
      
      extension [Self <: Props](x: Self) {
        
        inline def setAllowedBlocks(value: js.Array[String]): Self = StObject.set(x, "allowedBlocks", value.asInstanceOf[js.Any])
        
        inline def setAllowedBlocksUndefined: Self = StObject.set(x, "allowedBlocks", js.undefined)
        
        inline def setAllowedBlocksVarargs(value: String*): Self = StObject.set(x, "allowedBlocks", js.Array(value*))
        
        inline def setIcon(value: Element | Icon): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
        
        inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
        
        inline def setIconVdomElement(value: VdomElement): Self = StObject.set(x, "icon", value.rawElement.asInstanceOf[js.Any])
        
        inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
        
        inline def setOnClick(value: ReactMouseEventFrom[HTMLButtonElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onClick", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLButtonElement & org.scalajs.dom.Element]) => value(t0).runNow()))
        
        inline def setSmall(value: Boolean): Self = StObject.set(x, "small", value.asInstanceOf[js.Any])
        
        inline def setSmallUndefined: Self = StObject.set(x, "small", js.undefined)
      }
    }
  }
}
