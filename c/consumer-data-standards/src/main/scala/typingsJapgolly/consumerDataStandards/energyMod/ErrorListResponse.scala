package typingsJapgolly.consumerDataStandards.energyMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.consumerDataStandards.anon.Detail
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ErrorListResponse
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  var errors: js.Array[Detail]
}
object ErrorListResponse {
  
  inline def apply(errors: js.Array[Detail]): ErrorListResponse = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorListResponse]
  }
  
  extension [Self <: ErrorListResponse](x: Self) {
    
    inline def setErrors(value: js.Array[Detail]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsVarargs(value: Detail*): Self = StObject.set(x, "errors", js.Array(value*))
  }
}
