package typingsJapgolly.wordpressBlockEditor

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.wordpressBlockEditor.componentsBlockVerticalAlignmentToolbarMod.BlockVerticalAlignmentToolbar.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsBlockVerticalAlignmentToolbarMod {
  
  object default extends Shortcut {
    
    @JSImport("@wordpress/block-editor/components/block-vertical-alignment-toolbar", JSImport.Default)
    @js.native
    val ^ : ComponentType[Props] = js.native
    
    type _To = ComponentType[Props]
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: ComponentType[Props] = ^
  }
  
  object BlockVerticalAlignmentToolbar {
    
    trait Props extends StObject {
      
      var children: js.UndefOr[scala.Nothing] = js.undefined
      
      def onChange(newValue: Value): Unit
      
      var value: Value
    }
    object Props {
      
      inline def apply(onChange: Value => Callback): Props = {
        val __obj = js.Dynamic.literal(onChange = js.Any.fromFunction1((t0: Value) => onChange(t0).runNow()))
        __obj.asInstanceOf[Props]
      }
      
      extension [Self <: Props](x: Self) {
        
        inline def setOnChange(value: Value => Callback): Self = StObject.set(x, "onChange", js.Any.fromFunction1((t0: Value) => value(t0).runNow()))
        
        inline def setValue(value: Value): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
        
        inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      }
    }
    
    /* Rewritten from type alias, can be one of: 
      - typingsJapgolly.wordpressBlockEditor.wordpressBlockEditorStrings.bottom
      - typingsJapgolly.wordpressBlockEditor.wordpressBlockEditorStrings.center
      - typingsJapgolly.wordpressBlockEditor.wordpressBlockEditorStrings.top
      - scala.Unit
    */
    type Value = js.UndefOr[_Value]
    
    trait _Value extends StObject
  }
}
