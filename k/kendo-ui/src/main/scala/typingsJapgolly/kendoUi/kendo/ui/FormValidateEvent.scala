package typingsJapgolly.kendoUi.kendo.ui

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.kendoUi.kendo.data.Model
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FormValidateEvent
  extends StObject
     with FormEvent {
  
  var errors: js.UndefOr[js.Array[Any]] = js.undefined
  
  var model: js.UndefOr[Model] = js.undefined
  
  var valid: js.UndefOr[Boolean] = js.undefined
}
object FormValidateEvent {
  
  inline def apply(isDefaultPrevented: CallbackTo[Boolean], preventDefault: js.Function, sender: Form): FormValidateEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = isDefaultPrevented.toJsFn, preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormValidateEvent]
  }
  
  extension [Self <: FormValidateEvent](x: Self) {
    
    inline def setErrors(value: js.Array[Any]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
    
    inline def setErrorsVarargs(value: Any*): Self = StObject.set(x, "errors", js.Array(value*))
    
    inline def setModel(value: Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
    
    inline def setValid(value: Boolean): Self = StObject.set(x, "valid", value.asInstanceOf[js.Any])
    
    inline def setValidUndefined: Self = StObject.set(x, "valid", js.undefined)
  }
}
