package typingsJapgolly.ssUtils.ssutils

import japgolly.scalajs.react.Callback
import org.scalajs.dom.HTMLFormElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BindFormOptions extends StObject {
  
  var complete: js.UndefOr[js.Function1[/* repeated */ Any, Unit]] = js.undefined
  
  var error: js.UndefOr[js.Function1[/* repeated */ Any, Unit]] = js.undefined
  
  var onSubmitDisable: js.UndefOr[String] = js.undefined
  
  var validate: js.UndefOr[js.Function1[/* form */ HTMLFormElement, Boolean]] = js.undefined
  
  var validation: js.UndefOr[ValidationOptional] = js.undefined
}
object BindFormOptions {
  
  inline def apply(): BindFormOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BindFormOptions]
  }
  
  extension [Self <: BindFormOptions](x: Self) {
    
    inline def setComplete(value: /* repeated */ Any => Callback): Self = StObject.set(x, "complete", js.Any.fromFunction1((t0: /* repeated */ Any) => value(t0).runNow()))
    
    inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    inline def setError(value: /* repeated */ Any => Callback): Self = StObject.set(x, "error", js.Any.fromFunction1((t0: /* repeated */ Any) => value(t0).runNow()))
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setOnSubmitDisable(value: String): Self = StObject.set(x, "onSubmitDisable", value.asInstanceOf[js.Any])
    
    inline def setOnSubmitDisableUndefined: Self = StObject.set(x, "onSubmitDisable", js.undefined)
    
    inline def setValidate(value: /* form */ HTMLFormElement => Boolean): Self = StObject.set(x, "validate", js.Any.fromFunction1(value))
    
    inline def setValidateUndefined: Self = StObject.set(x, "validate", js.undefined)
    
    inline def setValidation(value: ValidationOptional): Self = StObject.set(x, "validation", value.asInstanceOf[js.Any])
    
    inline def setValidationUndefined: Self = StObject.set(x, "validation", js.undefined)
  }
}
