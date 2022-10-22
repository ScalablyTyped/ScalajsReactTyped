package typingsJapgolly.wixStyleReact.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.wixStyleReact.distTypesStepperMod.StepperFit
import typingsJapgolly.wixStyleReact.distTypesStepperMod.StepperProps
import typingsJapgolly.wixStyleReact.distTypesStepperMod.StepperStep
import typingsJapgolly.wixStyleReact.distTypesStepperMod.StepperType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Stepper {
  
  inline def apply(activeStep: Double, steps: js.Array[StepperStep]): Builder = {
    val __props = js.Dynamic.literal(activeStep = activeStep.asInstanceOf[js.Any], steps = steps.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[StepperProps]))
  }
  
  @JSImport("wix-style-react", "Stepper")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.wixStyleReact.mod.Stepper] {
    
    inline def dataHook(value: String): this.type = set("dataHook", value.asInstanceOf[js.Any])
    
    inline def fit(value: StepperFit): this.type = set("fit", value.asInstanceOf[js.Any])
    
    inline def onClick(value: /* index */ Double => Callback): this.type = set("onClick", js.Any.fromFunction1((t0: /* index */ Double) => value(t0).runNow()))
    
    inline def `type`(value: StepperType): this.type = set("type", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: StepperProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
