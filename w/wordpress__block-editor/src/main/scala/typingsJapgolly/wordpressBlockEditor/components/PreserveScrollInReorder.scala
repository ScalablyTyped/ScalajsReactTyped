package typingsJapgolly.wordpressBlockEditor.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.wordpressBlockEditor.componentsPreserveScrollInReorderMod.PreserveScrollInReorder.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PreserveScrollInReorder {
  
  @JSImport("@wordpress/block-editor", "PreserveScrollInReorder")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: PreserveScrollInReorder.type): Default[js.Object] = new Default[js.Object](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: Props): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
