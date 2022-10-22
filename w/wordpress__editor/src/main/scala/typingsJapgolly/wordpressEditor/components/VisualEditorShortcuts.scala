package typingsJapgolly.wordpressEditor.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.wordpressEditor.componentsGlobalKeyboardShortcutsVisualEditorShortcutsMod.VisualEditorGlobalKeyboardShortcuts.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object VisualEditorShortcuts {
  
  @JSImport("@wordpress/editor/components/global-keyboard-shortcuts/visual-editor-shortcuts", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: VisualEditorShortcuts.type): Default[js.Object] = new Default[js.Object](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: Props): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
