package typingsJapgolly.wordpressBlockEditor

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.wordpressBlockEditor.componentsBlockInspectorMod.BlockInspector.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsBlockInspectorMod {
  
  object default extends Shortcut {
    
    @JSImport("@wordpress/block-editor/components/block-inspector", JSImport.Default)
    @js.native
    val ^ : ComponentType[Props] = js.native
    
    type _To = ComponentType[Props]
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: ComponentType[Props] = ^
  }
  
  object BlockInspector {
    
    trait Props extends StObject {
      
      var children: js.UndefOr[scala.Nothing] = js.undefined
      
      var showNoBlockSelectedMessage: js.UndefOr[Boolean] = js.undefined
    }
    object Props {
      
      inline def apply(): Props = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Props]
      }
      
      extension [Self <: Props](x: Self) {
        
        inline def setShowNoBlockSelectedMessage(value: Boolean): Self = StObject.set(x, "showNoBlockSelectedMessage", value.asInstanceOf[js.Any])
        
        inline def setShowNoBlockSelectedMessageUndefined: Self = StObject.set(x, "showNoBlockSelectedMessage", js.undefined)
      }
    }
  }
}
