package typingsJapgolly.wordpressBlockEditor

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.wordpressBlockEditor.componentsUrlPopoverMod.URLPopover.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsUrlPopoverMod {
  
  object default extends Shortcut {
    
    @JSImport("@wordpress/block-editor/components/url-popover", JSImport.Default)
    @js.native
    val ^ : ComponentType[Props] = js.native
    
    type _To = ComponentType[Props]
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: ComponentType[Props] = ^
  }
  
  object URLPopover {
    
    trait Props
      extends StObject
         with typingsJapgolly.wordpressComponents.popoverMod.Popover.Props {
      
      var additionalControls: js.UndefOr[Node] = js.undefined
      
      /**
        * Callback used to return the React Elements that will be rendered inside the settings
        * drawer. When this function is provided, a toggle button will be rendered in the popover
        * that allows the user to open and close the settings drawer.
        */
      var renderSettings: js.UndefOr[js.Function0[Element]] = js.undefined
    }
    object Props {
      
      inline def apply(Props: typingsJapgolly.wordpressComponents.popoverMod.Popover.Props): Props = {
        val __obj = js.Dynamic.literal()
        js.Dynamic.global.Object.assign(__obj, Props)
        __obj.asInstanceOf[Props]
      }
      
      extension [Self <: Props](x: Self) {
        
        inline def setAdditionalControls(value: VdomNode): Self = StObject.set(x, "additionalControls", value.rawNode.asInstanceOf[js.Any])
        
        inline def setAdditionalControlsNull: Self = StObject.set(x, "additionalControls", null)
        
        inline def setAdditionalControlsUndefined: Self = StObject.set(x, "additionalControls", js.undefined)
        
        inline def setAdditionalControlsVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "additionalControls", js.Array(value*))
        
        inline def setAdditionalControlsVdomElement(value: VdomElement): Self = StObject.set(x, "additionalControls", value.rawElement.asInstanceOf[js.Any])
        
        inline def setRenderSettings(value: CallbackTo[Element]): Self = StObject.set(x, "renderSettings", value.toJsFn)
        
        inline def setRenderSettingsUndefined: Self = StObject.set(x, "renderSettings", js.undefined)
      }
    }
  }
}
