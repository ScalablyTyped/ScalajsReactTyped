package typingsJapgolly.formstate

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.formstate.anon.HasError
import typingsJapgolly.formstate.anon.HasErrorValue
import typingsJapgolly.formstate.anon.OnReinit
import typingsJapgolly.formstate.anon.Value
import typingsJapgolly.formstate.formstateStrings.`object`
import typingsJapgolly.formstate.formstateStrings.array
import typingsJapgolly.formstate.formstateStrings.map
import typingsJapgolly.formstate.libCoreTypesMod.ComposibleValidatable
import typingsJapgolly.formstate.libCoreTypesMod.Validator
import typingsJapgolly.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCoreFormStateMod {
  
  @JSImport("formstate/lib/core/formState", "FormState")
  @js.native
  open class FormState[TValue /* <: ValidatableMapOrArray */] protected ()
    extends StObject
       with ComposibleValidatable[TValue] {
    def this(/**
      * SubItems can be any Validatable
      */
    $: TValue) = this()
    
    /* CompleteClass */
    @JSName("$")
    var $: TValue = js.native
    
    /* protected */ var _error: js.UndefOr[String | Null] = js.native
    
    /* CompleteClass */
    @JSName("_on$Reinit")
    override def _on$Reinit(): Unit = js.native
    
    /** Used to tell the parent about validation */
    /* CompleteClass */
    @JSName("_on$ValidationPass")
    override def _on$ValidationPass(): Unit = js.native
    
    /** Used by the parent to register listeners */
    /* CompleteClass */
    override def _setCompositionParent(config: OnReinit): Unit = js.native
    
    /* protected */ var _validators: js.Array[Validator[TValue]] = js.native
    
    /**
      * Auto validation
      */
    /* protected */ var autoValidationEnabled: Boolean = js.native
    
    /**
      * Call it when you are `reinit`ing child fields
      */
    def clearFormError(): Unit = js.native
    
    /**
      * Composible fields (fields that work in conjuction with FormState)
      */
    def compose(): this.type = js.native
    
    /* CompleteClass */
    override def disableAutoValidation(): Unit = js.native
    
    /* CompleteClass */
    override def enableAutoValidation(): Unit = js.native
    
    def enableAutoValidationAndValidate(): js.Promise[HasError | HasErrorValue[TValue]] = js.native
    
    /**
      * The first error from any sub (if any) or form error
      */
    @JSName("error")
    def error_MFormState: js.UndefOr[String | Null] = js.native
    
    /**
      * Error from some sub field if any
      */
    def fieldError: js.UndefOr[String | Null] = js.native
    
    /**
      * Error from form if any
      */
    def formError: js.UndefOr[String | Null] = js.native
    
    /** Get validatable objects from $ */
    /* protected */ def getValues(): js.Array[ComposibleValidatable[Any]] = js.native
    
    /* CompleteClass */
    var hasError: Boolean = js.native
    /**
      * Does any field or form have an error
      */
    @JSName("hasError")
    def hasError_MFormState: Boolean = js.native
    
    /**
      * Does any field have an error
      */
    def hasFieldError: Boolean = js.native
    
    /**
      * Does form level validation have an error
      */
    def hasFormError: Boolean = js.native
    
    /* protected */ var mode: `object` | array | map = js.native
    
    /** Allows a convinient reset for all fields */
    /* CompleteClass */
    override def reset(): Unit = js.native
    
    /**
      * You should only show the form error if there are no field errors
      */
    def showFormError: Boolean = js.native
    
    /* CompleteClass */
    override def validate(): js.Promise[HasError | Value[TValue]] = js.native
    
    /**
      * Composible field validation tracking
      */
    var validatedSubFields: js.Array[ComposibleValidatable[Any]] = js.native
    
    /* CompleteClass */
    var validating: Boolean = js.native
    
    def validators(validators: Validator[TValue]*): this.type = js.native
  }
  
  type ValidatableMapOrArray = StringDictionary[ComposibleValidatable[Any]] | js.Array[ComposibleValidatable[Any]] | (Map[Any, ComposibleValidatable[Any]])
}
