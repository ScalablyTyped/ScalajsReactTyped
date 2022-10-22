package typingsJapgolly.gestalt.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.gestalt.mod.ContainerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Container {
  
  @JSImport("gestalt", "Container")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: Container.type): Default[js.Object] = new Default[js.Object](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ContainerProps): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
