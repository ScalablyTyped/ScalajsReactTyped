package typingsJapgolly.finalFormFocus

import japgolly.scalajs.react.Callback
import typingsJapgolly.finalForm.mod.Decorator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("final-form-focus", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[FormValues, InitialFormValues](): Decorator[FormValues, InitialFormValues] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[Decorator[FormValues, InitialFormValues]]
  inline def default[FormValues, InitialFormValues](getInputs: Unit, findInput: FindInput): Decorator[FormValues, InitialFormValues] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(getInputs.asInstanceOf[js.Any], findInput.asInstanceOf[js.Any])).asInstanceOf[Decorator[FormValues, InitialFormValues]]
  inline def default[FormValues, InitialFormValues](getInputs: GetInputs): Decorator[FormValues, InitialFormValues] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(getInputs.asInstanceOf[js.Any]).asInstanceOf[Decorator[FormValues, InitialFormValues]]
  inline def default[FormValues, InitialFormValues](getInputs: GetInputs, findInput: FindInput): Decorator[FormValues, InitialFormValues] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(getInputs.asInstanceOf[js.Any], findInput.asInstanceOf[js.Any])).asInstanceOf[Decorator[FormValues, InitialFormValues]]
  
  inline def getFormInputs(formName: String): GetInputs = ^.asInstanceOf[js.Dynamic].applyDynamic("getFormInputs")(formName.asInstanceOf[js.Any]).asInstanceOf[GetInputs]
  
  type FindInput = js.Function2[
    /* inputs */ js.Array[FocusableInput], 
    /* errors */ js.Object, 
    js.UndefOr[FocusableInput]
  ]
  
  trait FocusableInput extends StObject {
    
    def focus(): Unit
    
    var name: String
  }
  object FocusableInput {
    
    inline def apply(focus: Callback, name: String): FocusableInput = {
      val __obj = js.Dynamic.literal(focus = focus.toJsFn, name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[FocusableInput]
    }
    
    extension [Self <: FocusableInput](x: Self) {
      
      inline def setFocus(value: Callback): Self = StObject.set(x, "focus", value.toJsFn)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  type GetInputs = js.Function0[js.Array[FocusableInput]]
}
