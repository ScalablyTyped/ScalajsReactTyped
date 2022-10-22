package typingsJapgolly.sharepoint.global

import typingsJapgolly.sharepoint.SPClientForms.ClientValidation.IValidator
import typingsJapgolly.sharepoint.SPClientForms.FormManagerEvents
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SPClientForms {
  
  @JSGlobal("SPClientForms.ClientForm")
  @js.native
  open class ClientForm protected ()
    extends StObject
       with typingsJapgolly.sharepoint.SPClientForms.ClientForm {
    def this(qualifier: String) = this()
    
    /* CompleteClass */
    override def NotifyControlEvent(eventName: FormManagerEvents, fldName: String, eventArg: Any): Unit = js.native
    
    /* CompleteClass */
    override def RenderClientForm(): Unit = js.native
    
    /* CompleteClass */
    override def SubmitClientForm(): Boolean = js.native
  }
  
  @JSGlobal("SPClientForms.ClientFormManager")
  @js.native
  open class ClientFormManager ()
    extends StObject
       with typingsJapgolly.sharepoint.SPClientForms.ClientFormManager
  object ClientFormManager {
    
    @JSGlobal("SPClientForms.ClientFormManager")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def GetClientForm(qualifier: String): typingsJapgolly.sharepoint.SPClientForms.ClientForm = ^.asInstanceOf[js.Dynamic].applyDynamic("GetClientForm")(qualifier.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.sharepoint.SPClientForms.ClientForm]
    
    /* static member */
    inline def RegisterClientForm(qualifier: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("RegisterClientForm")(qualifier.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /* static member */
    inline def SubmitClientForm(qualifier: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("SubmitClientForm")(qualifier.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
  
  object ClientValidation {
    
    @JSGlobal("SPClientForms.ClientValidation.MaxLengthUrlValidator")
    @js.native
    open class MaxLengthUrlValidator ()
      extends StObject
         with typingsJapgolly.sharepoint.SPClientForms.ClientValidation.MaxLengthUrlValidator {
      
      /* CompleteClass */
      override def Validate(value: Any): typingsJapgolly.sharepoint.SPClientForms.ClientValidation.ValidationResult = js.native
    }
    
    @JSGlobal("SPClientForms.ClientValidation.RequiredFileValidator")
    @js.native
    open class RequiredFileValidator ()
      extends StObject
         with typingsJapgolly.sharepoint.SPClientForms.ClientValidation.RequiredFileValidator {
      
      /* CompleteClass */
      override def Validate(value: Any): typingsJapgolly.sharepoint.SPClientForms.ClientValidation.ValidationResult = js.native
    }
    
    @JSGlobal("SPClientForms.ClientValidation.RequiredRichTextValidator")
    @js.native
    open class RequiredRichTextValidator ()
      extends StObject
         with typingsJapgolly.sharepoint.SPClientForms.ClientValidation.RequiredRichTextValidator {
      
      /* CompleteClass */
      override def Validate(value: Any): typingsJapgolly.sharepoint.SPClientForms.ClientValidation.ValidationResult = js.native
    }
    
    @JSGlobal("SPClientForms.ClientValidation.RequiredValidator")
    @js.native
    open class RequiredValidator ()
      extends StObject
         with typingsJapgolly.sharepoint.SPClientForms.ClientValidation.RequiredValidator {
      
      /* CompleteClass */
      override def Validate(value: Any): typingsJapgolly.sharepoint.SPClientForms.ClientValidation.ValidationResult = js.native
    }
    
    @JSGlobal("SPClientForms.ClientValidation.ValidationResult")
    @js.native
    open class ValidationResult protected ()
      extends StObject
         with typingsJapgolly.sharepoint.SPClientForms.ClientValidation.ValidationResult {
      def this(hasErrors: Boolean, errorMsg: String) = this()
    }
    
    @JSGlobal("SPClientForms.ClientValidation.ValidatorSet")
    @js.native
    open class ValidatorSet ()
      extends StObject
         with typingsJapgolly.sharepoint.SPClientForms.ClientValidation.ValidatorSet {
      
      /* CompleteClass */
      override def RegisterValidator(validator: IValidator): Unit = js.native
    }
  }
  
  @JSGlobal("SPClientForms.FormManagerEvents")
  @js.native
  object FormManagerEvents extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.sharepoint.SPClientForms.FormManagerEvents & Double] = js.native
    
    /* 3 */ val Event_GetControlValueCallback: typingsJapgolly.sharepoint.SPClientForms.FormManagerEvents.Event_GetControlValueCallback & Double = js.native
    
    /* 6 */ val Event_GetHasValueChangedCallback: typingsJapgolly.sharepoint.SPClientForms.FormManagerEvents.Event_GetHasValueChangedCallback & Double = js.native
    
    /* 2 */ val Event_OnControlFocusSetCallback: typingsJapgolly.sharepoint.SPClientForms.FormManagerEvents.Event_OnControlFocusSetCallback & Double = js.native
    
    /* 1 */ val Event_OnControlInitializedCallback: typingsJapgolly.sharepoint.SPClientForms.FormManagerEvents.Event_OnControlInitializedCallback & Double = js.native
    
    /* 4 */ val Event_OnControlValidationError: typingsJapgolly.sharepoint.SPClientForms.FormManagerEvents.Event_OnControlValidationError & Double = js.native
    
    /* 0 */ val Event_OnControlValueChanged: typingsJapgolly.sharepoint.SPClientForms.FormManagerEvents.Event_OnControlValueChanged & Double = js.native
    
    /* 5 */ val Event_RegisterControlValidator: typingsJapgolly.sharepoint.SPClientForms.FormManagerEvents.Event_RegisterControlValidator & Double = js.native
  }
}
