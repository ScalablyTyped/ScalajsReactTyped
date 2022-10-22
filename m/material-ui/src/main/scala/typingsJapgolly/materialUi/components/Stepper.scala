package typingsJapgolly.materialUi.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.materialUi.MaterialUI.Stepper.StepperProps
import typingsJapgolly.materialUi.materialUiStrings.horizontal
import typingsJapgolly.materialUi.materialUiStrings.vertical
import typingsJapgolly.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Stepper {
  
  @JSImport("material-ui", "Stepper")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.materialUi.mod.Stepper] {
    
    inline def activeStep(value: Double): this.type = set("activeStep", value.asInstanceOf[js.Any])
    
    inline def linear(value: Boolean): this.type = set("linear", value.asInstanceOf[js.Any])
    
    inline def orientation(value: horizontal | vertical): this.type = set("orientation", value.asInstanceOf[js.Any])
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Stepper.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: StepperProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
