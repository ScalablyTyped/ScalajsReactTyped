package typingsJapgolly.wordpressComponents

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.wordpressComponents.popoverMod.Popover.Position
import typingsJapgolly.wordpressComponents.shortcutMod.Shortcut.ShortcutType
import typingsJapgolly.wordpressComponents.tooltipMod.Tooltip.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tooltipMod {
  
  object default extends Shortcut {
    
    @JSImport("@wordpress/components/tooltip", JSImport.Default)
    @js.native
    val ^ : ComponentType[Props] = js.native
    
    type _To = ComponentType[Props]
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: ComponentType[Props] = ^
  }
  
  object Tooltip {
    
    trait Props extends StObject {
      
      var children: Element
      
      /**
        * The direction in which the tooltip should open relative to its
        * parent node.
        */
      var position: js.UndefOr[Position] = js.undefined
      
      var shortcut: js.UndefOr[ShortcutType] = js.undefined
      
      /**
        * The tooltip content to show on focus or hover.
        */
      var text: js.UndefOr[Node] = js.undefined
    }
    object Props {
      
      inline def apply(children: VdomElement): Props = {
        val __obj = js.Dynamic.literal(children = children.rawElement.asInstanceOf[js.Any])
        __obj.asInstanceOf[Props]
      }
      
      extension [Self <: Props](x: Self) {
        
        inline def setChildren(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
        
        inline def setPosition(value: Position): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
        
        inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
        
        inline def setShortcut(value: ShortcutType): Self = StObject.set(x, "shortcut", value.asInstanceOf[js.Any])
        
        inline def setShortcutUndefined: Self = StObject.set(x, "shortcut", js.undefined)
        
        inline def setText(value: VdomNode): Self = StObject.set(x, "text", value.rawNode.asInstanceOf[js.Any])
        
        inline def setTextNull: Self = StObject.set(x, "text", null)
        
        inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
        
        inline def setTextVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "text", js.Array(value*))
        
        inline def setTextVdomElement(value: VdomElement): Self = StObject.set(x, "text", value.rawElement.asInstanceOf[js.Any])
      }
    }
  }
}
