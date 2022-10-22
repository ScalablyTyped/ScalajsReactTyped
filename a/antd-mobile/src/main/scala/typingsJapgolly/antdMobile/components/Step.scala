package typingsJapgolly.antdMobile.components

import typingsJapgolly.antdMobile.esComponentsStepsStepMod.StepProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Step {
  
  @JSImport("antd-mobile/es/components/steps/step", "Step")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: Step.type): SharedBuilder_StepProps_1214491172 = new SharedBuilder_StepProps_1214491172(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: StepProps): SharedBuilder_StepProps_1214491172 = new SharedBuilder_StepProps_1214491172(js.Array(this.component, p.asInstanceOf[js.Any]))
}
