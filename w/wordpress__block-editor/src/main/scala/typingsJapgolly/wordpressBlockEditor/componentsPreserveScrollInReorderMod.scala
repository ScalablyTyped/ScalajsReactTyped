package typingsJapgolly.wordpressBlockEditor

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.wordpressBlockEditor.componentsPreserveScrollInReorderMod.PreserveScrollInReorder.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsPreserveScrollInReorderMod {
  
  object default extends Shortcut {
    
    @JSImport("@wordpress/block-editor/components/preserve-scroll-in-reorder", JSImport.Default)
    @js.native
    val ^ : ComponentType[Props] = js.native
    
    type _To = ComponentType[Props]
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: ComponentType[Props] = ^
  }
  
  object PreserveScrollInReorder {
    
    trait Props extends StObject {
      
      var children: js.UndefOr[scala.Nothing] = js.undefined
    }
  }
}
