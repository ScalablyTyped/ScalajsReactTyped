package typingsJapgolly.breeze.breeze

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValidationOptions extends StObject {
  
  def setAsDefault(): ValidationOptions
  
  def `using`(config: ValidationOptionsConfiguration): ValidationOptions
  
  var validateOnAttach: Boolean
  
  var validateOnPropertyChange: Boolean
  
  var validateOnQuery: Boolean
  
  var validateOnSave: Boolean
}
object ValidationOptions {
  
  inline def apply(
    setAsDefault: CallbackTo[ValidationOptions],
    `using`: ValidationOptionsConfiguration => ValidationOptions,
    validateOnAttach: Boolean,
    validateOnPropertyChange: Boolean,
    validateOnQuery: Boolean,
    validateOnSave: Boolean
  ): ValidationOptions = {
    val __obj = js.Dynamic.literal(setAsDefault = setAsDefault.toJsFn, validateOnAttach = validateOnAttach.asInstanceOf[js.Any], validateOnPropertyChange = validateOnPropertyChange.asInstanceOf[js.Any], validateOnQuery = validateOnQuery.asInstanceOf[js.Any], validateOnSave = validateOnSave.asInstanceOf[js.Any])
    __obj.updateDynamic("using")(js.Any.fromFunction1(`using`))
    __obj.asInstanceOf[ValidationOptions]
  }
  
  extension [Self <: ValidationOptions](x: Self) {
    
    inline def setSetAsDefault(value: CallbackTo[ValidationOptions]): Self = StObject.set(x, "setAsDefault", value.toJsFn)
    
    inline def setUsing(value: ValidationOptionsConfiguration => ValidationOptions): Self = StObject.set(x, "using", js.Any.fromFunction1(value))
    
    inline def setValidateOnAttach(value: Boolean): Self = StObject.set(x, "validateOnAttach", value.asInstanceOf[js.Any])
    
    inline def setValidateOnPropertyChange(value: Boolean): Self = StObject.set(x, "validateOnPropertyChange", value.asInstanceOf[js.Any])
    
    inline def setValidateOnQuery(value: Boolean): Self = StObject.set(x, "validateOnQuery", value.asInstanceOf[js.Any])
    
    inline def setValidateOnSave(value: Boolean): Self = StObject.set(x, "validateOnSave", value.asInstanceOf[js.Any])
  }
}
