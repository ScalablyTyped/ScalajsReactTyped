package typingsJapgolly.wixUiCore.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.wixUiCore.distEsSrcComponentsStepperStepperMod.ChildrenArgs
import typingsJapgolly.wixUiCore.distEsSrcComponentsStepperStepperMod.StepperProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Stepper {
  
  inline def apply(activeStep: Double): Builder = {
    val __props = js.Dynamic.literal(activeStep = activeStep.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[StepperProps]))
  }
  
  @JSImport("wix-ui-core/dist/es/src", "Stepper")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.wixUiCore.distEsSrcMod.Stepper] {
    
    inline def children(value: /* args */ ChildrenArgs => Element): this.type = set("children", js.Any.fromFunction1(value))
  }
  
  def withProps(p: StepperProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
