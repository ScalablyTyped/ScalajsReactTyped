package typingsJapgolly.wordpressComponents.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.wordpressComponents.visuallyHiddenMod.VisuallyHidden.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object VisuallyHidden {
  
  @JSImport("@wordpress/components", "VisuallyHidden")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: VisuallyHidden.type): Default[js.Object] = new Default[js.Object](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: Props): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
