package typingsJapgolly.knockoutValidation

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KnockoutValidationGroup extends StObject {
  
  var errors: js.UndefOr[KnockoutValidationErrors] = js.undefined
  
  var isAnyMessageShown: js.UndefOr[js.Function0[Boolean]] = js.undefined
  
  var isValid: js.UndefOr[js.Function0[Boolean]] = js.undefined
}
object KnockoutValidationGroup {
  
  inline def apply(): KnockoutValidationGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KnockoutValidationGroup]
  }
  
  extension [Self <: KnockoutValidationGroup](x: Self) {
    
    inline def setErrors(value: KnockoutValidationErrors): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
    
    inline def setIsAnyMessageShown(value: CallbackTo[Boolean]): Self = StObject.set(x, "isAnyMessageShown", value.toJsFn)
    
    inline def setIsAnyMessageShownUndefined: Self = StObject.set(x, "isAnyMessageShown", js.undefined)
    
    inline def setIsValid(value: CallbackTo[Boolean]): Self = StObject.set(x, "isValid", value.toJsFn)
    
    inline def setIsValidUndefined: Self = StObject.set(x, "isValid", js.undefined)
  }
}
