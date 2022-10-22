package typingsJapgolly.wixUiCore.distEsSrcMod

import japgolly.scalajs.react.facade.React.ComponentClassP
import typingsJapgolly.wixUiCore.distEsSrcComponentsNavStepperNavStepMod.ExternalNavStepProps
import typingsJapgolly.wixUiCore.distEsSrcComponentsNavStepperNavStepperMod.NavStepperProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wix-ui-core/dist/es/src", "NavStepper")
@js.native
open class NavStepper protected ()
  extends typingsJapgolly.wixUiCore.distEsSrcComponentsNavStepperMod.NavStepper {
  def this(props: NavStepperProps) = this()
  /**
    * @deprecated
    * @see https://reactjs.org/docs/legacy-context.html
    */
  def this(props: NavStepperProps, context: Any) = this()
}
/* static members */
object NavStepper {
  
  @JSImport("wix-ui-core/dist/es/src", "NavStepper")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("wix-ui-core/dist/es/src", "NavStepper.Step")
  @js.native
  def Step: ComponentClassP[ExternalNavStepProps & js.Object] = js.native
  inline def Step_=(x: ComponentClassP[ExternalNavStepProps & js.Object]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Step")(x.asInstanceOf[js.Any])
}
