package typingsJapgolly.sharepoint

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SPClientForms {
  
  @js.native
  sealed trait FormManagerEvents extends StObject
  @JSGlobal("SPClientForms.FormManagerEvents")
  @js.native
  object FormManagerEvents extends StObject {
    
    // : 3,
    @js.native
    sealed trait Event_GetControlValueCallback
      extends StObject
         with FormManagerEvents
    
    // : 6,
    @js.native
    sealed trait Event_GetHasValueChangedCallback
      extends StObject
         with FormManagerEvents
    
    // : 2,
    @js.native
    sealed trait Event_OnControlFocusSetCallback
      extends StObject
         with FormManagerEvents
    
    // : 1,
    @js.native
    sealed trait Event_OnControlInitializedCallback
      extends StObject
         with FormManagerEvents
    
    // : 4,
    @js.native
    sealed trait Event_OnControlValidationError
      extends StObject
         with FormManagerEvents
    
    @js.native
    sealed trait Event_OnControlValueChanged
      extends StObject
         with FormManagerEvents
    
    // : 5,
    @js.native
    sealed trait Event_RegisterControlValidator
      extends StObject
         with FormManagerEvents
  }
  
  trait ClientForm extends StObject {
    
    def NotifyControlEvent(eventName: FormManagerEvents, fldName: String, eventArg: Any): Unit
    
    def RenderClientForm(): Unit
    
    def SubmitClientForm(): Boolean
  }
  object ClientForm {
    
    inline def apply(
      NotifyControlEvent: (FormManagerEvents, String, Any) => Callback,
      RenderClientForm: Callback,
      SubmitClientForm: CallbackTo[Boolean]
    ): ClientForm = {
      val __obj = js.Dynamic.literal(NotifyControlEvent = js.Any.fromFunction3((t0: FormManagerEvents, t1: String, t2: Any) => (NotifyControlEvent(t0, t1, t2)).runNow()), RenderClientForm = RenderClientForm.toJsFn, SubmitClientForm = SubmitClientForm.toJsFn)
      __obj.asInstanceOf[ClientForm]
    }
    
    extension [Self <: ClientForm](x: Self) {
      
      inline def setNotifyControlEvent(value: (FormManagerEvents, String, Any) => Callback): Self = StObject.set(x, "NotifyControlEvent", js.Any.fromFunction3((t0: FormManagerEvents, t1: String, t2: Any) => (value(t0, t1, t2)).runNow()))
      
      inline def setRenderClientForm(value: Callback): Self = StObject.set(x, "RenderClientForm", value.toJsFn)
      
      inline def setSubmitClientForm(value: CallbackTo[Boolean]): Self = StObject.set(x, "SubmitClientForm", value.toJsFn)
    }
  }
  
  trait ClientFormManager extends StObject
  
  object ClientValidation {
    
    trait IValidator extends StObject {
      
      def Validate(value: Any): ValidationResult
    }
    object IValidator {
      
      inline def apply(Validate: Any => ValidationResult): IValidator = {
        val __obj = js.Dynamic.literal(Validate = js.Any.fromFunction1(Validate))
        __obj.asInstanceOf[IValidator]
      }
      
      extension [Self <: IValidator](x: Self) {
        
        inline def setValidate(value: Any => ValidationResult): Self = StObject.set(x, "Validate", js.Any.fromFunction1(value))
      }
    }
    
    trait MaxLengthUrlValidator
      extends StObject
         with IValidator
    object MaxLengthUrlValidator {
      
      inline def apply(Validate: Any => ValidationResult): MaxLengthUrlValidator = {
        val __obj = js.Dynamic.literal(Validate = js.Any.fromFunction1(Validate))
        __obj.asInstanceOf[MaxLengthUrlValidator]
      }
    }
    
    trait RequiredFileValidator
      extends StObject
         with IValidator
    object RequiredFileValidator {
      
      inline def apply(Validate: Any => ValidationResult): RequiredFileValidator = {
        val __obj = js.Dynamic.literal(Validate = js.Any.fromFunction1(Validate))
        __obj.asInstanceOf[RequiredFileValidator]
      }
    }
    
    trait RequiredRichTextValidator
      extends StObject
         with IValidator
    object RequiredRichTextValidator {
      
      inline def apply(Validate: Any => ValidationResult): RequiredRichTextValidator = {
        val __obj = js.Dynamic.literal(Validate = js.Any.fromFunction1(Validate))
        __obj.asInstanceOf[RequiredRichTextValidator]
      }
    }
    
    trait RequiredValidator
      extends StObject
         with IValidator
    object RequiredValidator {
      
      inline def apply(Validate: Any => ValidationResult): RequiredValidator = {
        val __obj = js.Dynamic.literal(Validate = js.Any.fromFunction1(Validate))
        __obj.asInstanceOf[RequiredValidator]
      }
    }
    
    trait ValidationResult extends StObject
    
    trait ValidatorSet extends StObject {
      
      def RegisterValidator(validator: IValidator): Unit
    }
    object ValidatorSet {
      
      inline def apply(RegisterValidator: IValidator => Callback): ValidatorSet = {
        val __obj = js.Dynamic.literal(RegisterValidator = js.Any.fromFunction1((t0: IValidator) => RegisterValidator(t0).runNow()))
        __obj.asInstanceOf[ValidatorSet]
      }
      
      extension [Self <: ValidatorSet](x: Self) {
        
        inline def setRegisterValidator(value: IValidator => Callback): Self = StObject.set(x, "RegisterValidator", js.Any.fromFunction1((t0: IValidator) => value(t0).runNow()))
      }
    }
  }
}
