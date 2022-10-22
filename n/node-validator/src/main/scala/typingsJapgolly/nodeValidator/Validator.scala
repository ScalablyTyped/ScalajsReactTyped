package typingsJapgolly.nodeValidator

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Validator {
  
  trait IsObjectValidator
    extends StObject
       with Validatable {
    
    def withCustom(customValidator: ValidateFn): IsObjectValidator
    
    def withOptional(name: String, validator: Validatable): IsObjectValidator
    
    def withRequired(name: String, validator: Validatable): IsObjectValidator
  }
  object IsObjectValidator {
    
    inline def apply(
      validate: (/* value */ Any, /* onError */ js.Function3[/* message */ String, /* childName */ String, /* childValie */ Any, Unit]) => Callback,
      withCustom: ValidateFn => IsObjectValidator,
      withOptional: (String, Validatable) => IsObjectValidator,
      withRequired: (String, Validatable) => IsObjectValidator
    ): IsObjectValidator = {
      val __obj = js.Dynamic.literal(validate = js.Any.fromFunction2((t0: /* value */ Any, t1: /* onError */ js.Function3[/* message */ String, /* childName */ String, /* childValie */ Any, Unit]) => (validate(t0, t1)).runNow()), withCustom = js.Any.fromFunction1(withCustom), withOptional = js.Any.fromFunction2(withOptional), withRequired = js.Any.fromFunction2(withRequired))
      __obj.asInstanceOf[IsObjectValidator]
    }
    
    extension [Self <: IsObjectValidator](x: Self) {
      
      inline def setWithCustom(value: ValidateFn => IsObjectValidator): Self = StObject.set(x, "withCustom", js.Any.fromFunction1(value))
      
      inline def setWithOptional(value: (String, Validatable) => IsObjectValidator): Self = StObject.set(x, "withOptional", js.Any.fromFunction2(value))
      
      inline def setWithRequired(value: (String, Validatable) => IsObjectValidator): Self = StObject.set(x, "withRequired", js.Any.fromFunction2(value))
    }
  }
  
  trait Validatable extends StObject {
    
    def validate(
      value: Any,
      onError: js.Function3[/* message */ String, /* childName */ String, /* childValie */ Any, Unit]
    ): Unit
    @JSName("validate")
    var validate_Original: ValidateFn
  }
  object Validatable {
    
    inline def apply(
      validate: (/* value */ Any, /* onError */ js.Function3[/* message */ String, /* childName */ String, /* childValie */ Any, Unit]) => Callback
    ): Validatable = {
      val __obj = js.Dynamic.literal(validate = js.Any.fromFunction2((t0: /* value */ Any, t1: /* onError */ js.Function3[/* message */ String, /* childName */ String, /* childValie */ Any, Unit]) => (validate(t0, t1)).runNow()))
      __obj.asInstanceOf[Validatable]
    }
    
    extension [Self <: Validatable](x: Self) {
      
      inline def setValidate(
        value: (/* value */ Any, /* onError */ js.Function3[/* message */ String, /* childName */ String, /* childValie */ Any, Unit]) => Callback
      ): Self = StObject.set(x, "validate", js.Any.fromFunction2((t0: /* value */ Any, t1: /* onError */ js.Function3[/* message */ String, /* childName */ String, /* childValie */ Any, Unit]) => (value(t0, t1)).runNow()))
    }
  }
  
  type ValidateFn = js.Function2[
    /* value */ Any, 
    /* onError */ js.Function3[/* message */ String, /* childName */ String, /* childValie */ Any, Unit], 
    Unit
  ]
}
