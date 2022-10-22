package typingsJapgolly.businessRulesEngine.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IValidationResult extends StObject {
  
  def Add(validationResult: IValidationResult): Unit
  
  var Children: js.Array[IValidationResult]
  
  var ErrorCount: Double
  
  var ErrorMessage: String
  
  var HasErrors: Boolean
  
  var HasErrorsDirty: Boolean
  
  var Name: String
  
  var Optional: js.UndefOr[IOptional] = js.undefined
  
  def Remove(index: Double): Unit
  
  var TranslateArgs: js.UndefOr[js.Array[IErrorTranslateArgs]] = js.undefined
}
object IValidationResult {
  
  inline def apply(
    Add: IValidationResult => Callback,
    Children: js.Array[IValidationResult],
    ErrorCount: Double,
    ErrorMessage: String,
    HasErrors: Boolean,
    HasErrorsDirty: Boolean,
    Name: String,
    Remove: Double => Callback
  ): IValidationResult = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction1((t0: IValidationResult) => Add(t0).runNow()), Children = Children.asInstanceOf[js.Any], ErrorCount = ErrorCount.asInstanceOf[js.Any], ErrorMessage = ErrorMessage.asInstanceOf[js.Any], HasErrors = HasErrors.asInstanceOf[js.Any], HasErrorsDirty = HasErrorsDirty.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Remove = js.Any.fromFunction1((t0: Double) => Remove(t0).runNow()))
    __obj.asInstanceOf[IValidationResult]
  }
  
  extension [Self <: IValidationResult](x: Self) {
    
    inline def setAdd(value: IValidationResult => Callback): Self = StObject.set(x, "Add", js.Any.fromFunction1((t0: IValidationResult) => value(t0).runNow()))
    
    inline def setChildren(value: js.Array[IValidationResult]): Self = StObject.set(x, "Children", value.asInstanceOf[js.Any])
    
    inline def setChildrenVarargs(value: IValidationResult*): Self = StObject.set(x, "Children", js.Array(value*))
    
    inline def setErrorCount(value: Double): Self = StObject.set(x, "ErrorCount", value.asInstanceOf[js.Any])
    
    inline def setErrorMessage(value: String): Self = StObject.set(x, "ErrorMessage", value.asInstanceOf[js.Any])
    
    inline def setHasErrors(value: Boolean): Self = StObject.set(x, "HasErrors", value.asInstanceOf[js.Any])
    
    inline def setHasErrorsDirty(value: Boolean): Self = StObject.set(x, "HasErrorsDirty", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setOptional(value: CallbackTo[Boolean]): Self = StObject.set(x, "Optional", value.toJsFn)
    
    inline def setOptionalUndefined: Self = StObject.set(x, "Optional", js.undefined)
    
    inline def setRemove(value: Double => Callback): Self = StObject.set(x, "Remove", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setTranslateArgs(value: js.Array[IErrorTranslateArgs]): Self = StObject.set(x, "TranslateArgs", value.asInstanceOf[js.Any])
    
    inline def setTranslateArgsUndefined: Self = StObject.set(x, "TranslateArgs", js.undefined)
    
    inline def setTranslateArgsVarargs(value: IErrorTranslateArgs*): Self = StObject.set(x, "TranslateArgs", js.Array(value*))
  }
}
