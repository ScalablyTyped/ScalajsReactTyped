package typingsJapgolly.wordpressEditor

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.wordpressEditor.componentsGlobalKeyboardShortcutsVisualEditorShortcutsMod.VisualEditorGlobalKeyboardShortcuts.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsGlobalKeyboardShortcutsVisualEditorShortcutsMod {
  
  object default extends Shortcut {
    
    @JSImport("@wordpress/editor/components/global-keyboard-shortcuts/visual-editor-shortcuts", JSImport.Default)
    @js.native
    val ^ : ComponentType[Props] = js.native
    
    type _To = ComponentType[Props]
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: ComponentType[Props] = ^
  }
  
  @JSImport("@wordpress/editor/components/global-keyboard-shortcuts/visual-editor-shortcuts", "EditorGlobalKeyboardShortcuts")
  @js.native
  val EditorGlobalKeyboardShortcuts: ComponentType[Props] = js.native
  
  object VisualEditorGlobalKeyboardShortcuts {
    
    trait Props extends StObject {
      
      var children: js.UndefOr[scala.Nothing] = js.undefined
    }
  }
}
