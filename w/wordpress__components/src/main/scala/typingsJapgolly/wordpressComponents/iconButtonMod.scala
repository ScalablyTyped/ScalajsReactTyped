package typingsJapgolly.wordpressComponents

import japgolly.scalajs.react.vdom.VdomElement
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.wordpressComponents.buttonMod.Button.ButtonProps
import typingsJapgolly.wordpressComponents.dashiconMod.Dashicon.Icon
import typingsJapgolly.wordpressComponents.iconButtonMod.IconButton.Props
import typingsJapgolly.wordpressComponents.popoverMod.Popover.Position
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object iconButtonMod {
  
  object default extends Shortcut {
    
    @JSImport("@wordpress/components/icon-button", JSImport.Default)
    @js.native
    val ^ : ComponentType[Props] = js.native
    
    type _To = ComponentType[Props]
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: ComponentType[Props] = ^
  }
  
  object IconButton {
    
    trait Props
      extends StObject
         with ButtonProps {
      
      /**
        * Icon to use. Either a Dashicon slug or a custom component.
        */
      @JSName("icon")
      var icon_Props: Icon | Element
      
      /**
        * Position for the label.
        * @defaultValue "top"
        */
      var labelPosition: js.UndefOr[Position] = js.undefined
      
      /**
        * Tooltip text to display.
        * @defaultValue Props.label
        */
      var tooltip: js.UndefOr[String] = js.undefined
    }
    object Props {
      
      inline def apply(icon: Icon | Element): Props = {
        val __obj = js.Dynamic.literal(icon = icon.asInstanceOf[js.Any])
        __obj.asInstanceOf[Props]
      }
      
      extension [Self <: Props](x: Self) {
        
        inline def setIcon(value: Icon | Element): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
        
        inline def setIconVdomElement(value: VdomElement): Self = StObject.set(x, "icon", value.rawElement.asInstanceOf[js.Any])
        
        inline def setLabelPosition(value: Position): Self = StObject.set(x, "labelPosition", value.asInstanceOf[js.Any])
        
        inline def setLabelPositionUndefined: Self = StObject.set(x, "labelPosition", js.undefined)
        
        inline def setTooltip(value: String): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
        
        inline def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
      }
    }
  }
}
