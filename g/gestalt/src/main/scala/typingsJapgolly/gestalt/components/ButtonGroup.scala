package typingsJapgolly.gestalt.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.gestalt.mod.ButtonGroupProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ButtonGroup {
  
  @JSImport("gestalt", "ButtonGroup")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: ButtonGroup.type): Default[js.Object] = new Default[js.Object](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ButtonGroupProps): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
