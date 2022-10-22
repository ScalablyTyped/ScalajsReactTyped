package typingsJapgolly.wordpressBlockEditor.components

import typingsJapgolly.wordpressBlockEditor.componentsProviderMod.BlockEditorProvider.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object BlockEditorProvider {
  
  @JSImport("@wordpress/block-editor", "BlockEditorProvider")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: BlockEditorProvider.type): SharedBuilder_Props_2027316162 = new SharedBuilder_Props_2027316162(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: Props): SharedBuilder_Props_2027316162 = new SharedBuilder_Props_2027316162(js.Array(this.component, p.asInstanceOf[js.Any]))
}
