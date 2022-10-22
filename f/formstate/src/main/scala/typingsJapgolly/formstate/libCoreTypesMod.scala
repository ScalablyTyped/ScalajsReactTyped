package typingsJapgolly.formstate

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.formstate.anon.HasError
import typingsJapgolly.formstate.anon.OnReinit
import typingsJapgolly.formstate.anon.Value
import typingsJapgolly.formstate.formstateBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCoreTypesMod {
  
  @JSImport("formstate/lib/core/types", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def applyValidators[TValue](value: TValue, validators: js.Array[Validator[TValue]]): js.Promise[js.UndefOr[String | Null]] = (^.asInstanceOf[js.Dynamic].applyDynamic("applyValidators")(value.asInstanceOf[js.Any], validators.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.UndefOr[String | Null]]]
  
  trait ComposibleValidatable[TValue]
    extends StObject
       with Validatable[TValue] {
    
    @JSName("_on$Reinit")
    def _on$Reinit(): Unit
    
    /** Used to tell the parent about validation */
    @JSName("_on$ValidationPass")
    def _on$ValidationPass(): Unit
    
    /** Used by the parent to register listeners */
    def _setCompositionParent(config: OnReinit): Unit
    
    /** Allows a convinient reset for all fields */
    def reset(): Unit
  }
  object ComposibleValidatable {
    
    inline def apply[TValue](
      $: TValue,
      _on$Reinit: Callback,
      _on$ValidationPass: Callback,
      _setCompositionParent: OnReinit => Callback,
      disableAutoValidation: Callback,
      enableAutoValidation: Callback,
      hasError: Boolean,
      reset: Callback,
      validate: CallbackTo[js.Promise[HasError | Value[TValue]]],
      validating: Boolean
    ): ComposibleValidatable[TValue] = {
      val __obj = js.Dynamic.literal($ = $.asInstanceOf[js.Any], _on$Reinit = _on$Reinit.toJsFn, _on$ValidationPass = _on$ValidationPass.toJsFn, _setCompositionParent = js.Any.fromFunction1((t0: OnReinit) => _setCompositionParent(t0).runNow()), disableAutoValidation = disableAutoValidation.toJsFn, enableAutoValidation = enableAutoValidation.toJsFn, hasError = hasError.asInstanceOf[js.Any], reset = reset.toJsFn, validate = validate.toJsFn, validating = validating.asInstanceOf[js.Any])
      __obj.asInstanceOf[ComposibleValidatable[TValue]]
    }
    
    extension [Self <: ComposibleValidatable[?], TValue](x: Self & ComposibleValidatable[TValue]) {
      
      inline def setReset(value: Callback): Self = StObject.set(x, "reset", value.toJsFn)
      
      inline def set_on$Reinit(value: Callback): Self = StObject.set(x, "_on$Reinit", value.toJsFn)
      
      inline def set_on$ValidationPass(value: Callback): Self = StObject.set(x, "_on$ValidationPass", value.toJsFn)
      
      inline def set_setCompositionParent(value: OnReinit => Callback): Self = StObject.set(x, "_setCompositionParent", js.Any.fromFunction1((t0: OnReinit) => value(t0).runNow()))
    }
  }
  
  trait Validatable[TValue] extends StObject {
    
    @JSName("$")
    var $: TValue
    
    def disableAutoValidation(): Unit
    
    def enableAutoValidation(): Unit
    
    var error: js.UndefOr[String | Null] = js.undefined
    
    var hasError: Boolean
    
    def validate(): js.Promise[HasError | Value[TValue]]
    
    var validating: Boolean
  }
  object Validatable {
    
    inline def apply[TValue](
      $: TValue,
      disableAutoValidation: Callback,
      enableAutoValidation: Callback,
      hasError: Boolean,
      validate: CallbackTo[js.Promise[HasError | Value[TValue]]],
      validating: Boolean
    ): Validatable[TValue] = {
      val __obj = js.Dynamic.literal($ = $.asInstanceOf[js.Any], disableAutoValidation = disableAutoValidation.toJsFn, enableAutoValidation = enableAutoValidation.toJsFn, hasError = hasError.asInstanceOf[js.Any], validate = validate.toJsFn, validating = validating.asInstanceOf[js.Any])
      __obj.asInstanceOf[Validatable[TValue]]
    }
    
    extension [Self <: Validatable[?], TValue](x: Self & Validatable[TValue]) {
      
      inline def set$(value: TValue): Self = StObject.set(x, "$", value.asInstanceOf[js.Any])
      
      inline def setDisableAutoValidation(value: Callback): Self = StObject.set(x, "disableAutoValidation", value.toJsFn)
      
      inline def setEnableAutoValidation(value: Callback): Self = StObject.set(x, "enableAutoValidation", value.toJsFn)
      
      inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorNull: Self = StObject.set(x, "error", null)
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setHasError(value: Boolean): Self = StObject.set(x, "hasError", value.asInstanceOf[js.Any])
      
      inline def setValidate(value: CallbackTo[js.Promise[HasError | Value[TValue]]]): Self = StObject.set(x, "validate", value.toJsFn)
      
      inline def setValidating(value: Boolean): Self = StObject.set(x, "validating", value.asInstanceOf[js.Any])
    }
  }
  
  type ValidationResponse = js.UndefOr[String | Null | `false`]
  
  type Validator[TValue] = js.Function1[/* value */ TValue, ValidatorResponse]
  
  type ValidatorResponse = ValidationResponse | js.Promise[ValidationResponse]
}
