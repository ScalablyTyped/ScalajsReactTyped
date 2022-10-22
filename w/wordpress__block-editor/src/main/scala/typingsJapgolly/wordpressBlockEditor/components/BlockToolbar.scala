package typingsJapgolly.wordpressBlockEditor.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.wordpressBlockEditor.componentsBlockToolbarMod.BlockToolbar.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object BlockToolbar {
  
  @JSImport("@wordpress/block-editor", "BlockToolbar")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: BlockToolbar.type): Default[js.Object] = new Default[js.Object](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: Props): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
