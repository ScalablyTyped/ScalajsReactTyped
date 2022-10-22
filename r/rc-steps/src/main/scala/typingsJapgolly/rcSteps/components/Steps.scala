package typingsJapgolly.rcSteps.components

import typingsJapgolly.rcSteps.libStepsMod.StepsProps
import typingsJapgolly.rcSteps.libStepsMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Steps {
  
  @JSImport("rc-steps/lib/Steps", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: Steps.type): SharedBuilder_StepsProps1971936139[default] = new SharedBuilder_StepsProps1971936139[default](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: StepsProps): SharedBuilder_StepsProps1971936139[default] = new SharedBuilder_StepsProps1971936139[default](js.Array(this.component, p.asInstanceOf[js.Any]))
}
