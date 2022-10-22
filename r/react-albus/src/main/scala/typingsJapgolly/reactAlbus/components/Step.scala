package typingsJapgolly.reactAlbus.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.reactAlbus.mod.StepProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Support for combinations of intersection and union types not implemented */
object Step {
  
  def apply(p: StepProps): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @JSImport("react-albus", "Step")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: Step.type): Default[js.Object] = new Default[js.Object](js.Array(this.component, js.Dictionary.empty))()
}
