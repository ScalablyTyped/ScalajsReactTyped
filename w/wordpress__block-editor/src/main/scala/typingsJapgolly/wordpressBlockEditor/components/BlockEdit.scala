package typingsJapgolly.wordpressBlockEditor.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.wordpressBlockEditor.componentsBlockEditMod.BlockEdit.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Could't extract props from typingsJapgolly.wordpressBlockEditor.componentsBlockEditMod.BlockEdit.Props because couldn't resolve ClassTree. */
object BlockEdit {
  
  def apply(p: Props): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @JSImport("@wordpress/block-editor", "BlockEdit")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: BlockEdit.type): Default[js.Object] = new Default[js.Object](js.Array(this.component, js.Dictionary.empty))()
}
