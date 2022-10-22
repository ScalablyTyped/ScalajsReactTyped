package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.Callback
import typingsJapgolly.react.mod.PureComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesStepperMod {
  
  @JSImport("wix-style-react/dist/types/Stepper", JSImport.Default)
  @js.native
  open class default ()
    extends PureComponent[StepperProps, js.Object, Any]
  
  type Stepper = PureComponent[StepperProps, js.Object, Any]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.compact
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.stretched
  */
  trait StepperFit extends StObject
  object StepperFit {
    
    inline def compact: typingsJapgolly.wixStyleReact.wixStyleReactStrings.compact = "compact".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.compact]
    
    inline def stretched: typingsJapgolly.wixStyleReact.wixStyleReactStrings.stretched = "stretched".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.stretched]
  }
  
  trait StepperProps extends StObject {
    
    var activeStep: Double
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var fit: js.UndefOr[StepperFit] = js.undefined
    
    var onClick: js.UndefOr[js.Function1[/* index */ Double, Unit]] = js.undefined
    
    var steps: js.Array[StepperStep]
    
    var `type`: js.UndefOr[StepperType] = js.undefined
  }
  object StepperProps {
    
    inline def apply(activeStep: Double, steps: js.Array[StepperStep]): StepperProps = {
      val __obj = js.Dynamic.literal(activeStep = activeStep.asInstanceOf[js.Any], steps = steps.asInstanceOf[js.Any])
      __obj.asInstanceOf[StepperProps]
    }
    
    extension [Self <: StepperProps](x: Self) {
      
      inline def setActiveStep(value: Double): Self = StObject.set(x, "activeStep", value.asInstanceOf[js.Any])
      
      inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      inline def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      inline def setFit(value: StepperFit): Self = StObject.set(x, "fit", value.asInstanceOf[js.Any])
      
      inline def setFitUndefined: Self = StObject.set(x, "fit", js.undefined)
      
      inline def setOnClick(value: /* index */ Double => Callback): Self = StObject.set(x, "onClick", js.Any.fromFunction1((t0: /* index */ Double) => value(t0).runNow()))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setSteps(value: js.Array[StepperStep]): Self = StObject.set(x, "steps", value.asInstanceOf[js.Any])
      
      inline def setStepsVarargs(value: StepperStep*): Self = StObject.set(x, "steps", js.Array(value*))
      
      inline def setType(value: StepperType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait StepperStep extends StObject {
    
    var text: String
    
    var `type`: js.UndefOr[StepperStepType] = js.undefined
  }
  object StepperStep {
    
    inline def apply(text: String): StepperStep = {
      val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[StepperStep]
    }
    
    extension [Self <: StepperStep](x: Self) {
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setType(value: StepperStepType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.completed
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.disabled
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.error
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.normal
  */
  trait StepperStepType extends StObject
  object StepperStepType {
    
    inline def completed: typingsJapgolly.wixStyleReact.wixStyleReactStrings.completed = "completed".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.completed]
    
    inline def disabled: typingsJapgolly.wixStyleReact.wixStyleReactStrings.disabled = "disabled".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.disabled]
    
    inline def error: typingsJapgolly.wixStyleReact.wixStyleReactStrings.error = "error".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.error]
    
    inline def normal: typingsJapgolly.wixStyleReact.wixStyleReactStrings.normal = "normal".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.normal]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.circle
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.text
  */
  trait StepperType extends StObject
  object StepperType {
    
    inline def circle: typingsJapgolly.wixStyleReact.wixStyleReactStrings.circle = "circle".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.circle]
    
    inline def text: typingsJapgolly.wixStyleReact.wixStyleReactStrings.text = "text".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.text]
  }
}
