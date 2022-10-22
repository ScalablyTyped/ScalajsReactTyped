package typingsJapgolly.wordpressBlockEditor.components

import typingsJapgolly.wordpressBlockEditor.componentsProviderMod.BlockEditorProvider.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Provider {
  
  @JSImport("@wordpress/block-editor/components/provider", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: Provider.type): SharedBuilder_Props_2027316162 = new SharedBuilder_Props_2027316162(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: Props): SharedBuilder_Props_2027316162 = new SharedBuilder_Props_2027316162(js.Array(this.component, p.asInstanceOf[js.Any]))
}
