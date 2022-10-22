package typingsJapgolly.wixUiCore

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.ComponentClassP
import typingsJapgolly.react.mod.PureComponent
import typingsJapgolly.wixUiCore.distEsSrcComponentsNavStepperNavStepMod.ExternalNavStepProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsSrcComponentsNavStepperNavStepperMod {
  
  @JSImport("wix-ui-core/dist/es/src/components/nav-stepper/NavStepper", "NavStepper")
  @js.native
  open class NavStepper protected ()
    extends PureComponent[NavStepperProps, js.Object, Any] {
    def this(props: NavStepperProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: NavStepperProps, context: Any) = this()
  }
  /* static members */
  object NavStepper {
    
    @JSImport("wix-ui-core/dist/es/src/components/nav-stepper/NavStepper", "NavStepper")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("wix-ui-core/dist/es/src/components/nav-stepper/NavStepper", "NavStepper.Step")
    @js.native
    def Step: ComponentClassP[ExternalNavStepProps & js.Object] = js.native
    inline def Step_=(x: ComponentClassP[ExternalNavStepProps & js.Object]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Step")(x.asInstanceOf[js.Any])
  }
  
  trait NavStepperProps extends StObject {
    
    var activeStep: Double
    
    var className: js.UndefOr[String] = js.undefined
    
    /** hook for testing purposes */
    var `data-hook`: js.UndefOr[String] = js.undefined
    
    var onStepClick: js.UndefOr[js.Function2[/* stepIndex */ Double, /* e */ Any, Unit]] = js.undefined
  }
  object NavStepperProps {
    
    inline def apply(activeStep: Double): NavStepperProps = {
      val __obj = js.Dynamic.literal(activeStep = activeStep.asInstanceOf[js.Any])
      __obj.asInstanceOf[NavStepperProps]
    }
    
    extension [Self <: NavStepperProps](x: Self) {
      
      inline def setActiveStep(value: Double): Self = StObject.set(x, "activeStep", value.asInstanceOf[js.Any])
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def `setData-hook`(value: String): Self = StObject.set(x, "data-hook", value.asInstanceOf[js.Any])
      
      inline def `setData-hookUndefined`: Self = StObject.set(x, "data-hook", js.undefined)
      
      inline def setOnStepClick(value: (/* stepIndex */ Double, /* e */ Any) => Callback): Self = StObject.set(x, "onStepClick", js.Any.fromFunction2((t0: /* stepIndex */ Double, t1: /* e */ Any) => (value(t0, t1)).runNow()))
      
      inline def setOnStepClickUndefined: Self = StObject.set(x, "onStepClick", js.undefined)
    }
  }
}
