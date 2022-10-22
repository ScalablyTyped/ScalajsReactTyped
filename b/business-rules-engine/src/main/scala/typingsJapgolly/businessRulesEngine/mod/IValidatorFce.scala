package typingsJapgolly.businessRulesEngine.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.q.mod.Promise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IValidatorFce extends StObject {
  
  var AsyncValidationFce: js.UndefOr[IAsyncValidate] = js.undefined
  
  var Name: String
  
  var ValidationFce: js.UndefOr[IValidate] = js.undefined
}
object IValidatorFce {
  
  inline def apply(Name: String): IValidatorFce = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IValidatorFce]
  }
  
  extension [Self <: IValidatorFce](x: Self) {
    
    inline def setAsyncValidationFce(value: /* args */ IError => Promise[Any]): Self = StObject.set(x, "AsyncValidationFce", js.Any.fromFunction1(value))
    
    inline def setAsyncValidationFceUndefined: Self = StObject.set(x, "AsyncValidationFce", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setValidationFce(value: /* args */ IError => Callback): Self = StObject.set(x, "ValidationFce", js.Any.fromFunction1((t0: /* args */ IError) => value(t0).runNow()))
    
    inline def setValidationFceUndefined: Self = StObject.set(x, "ValidationFce", js.undefined)
  }
}
