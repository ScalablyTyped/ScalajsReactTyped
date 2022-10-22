package typingsJapgolly.remixRunRouter.distUtilsMod

import org.scalajs.dom.Headers
import typingsJapgolly.remixRunRouter.distUtilsMod.ResultType.error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ErrorResult
  extends StObject
     with DataResult {
  
  var error: Any
  
  var headers: js.UndefOr[Headers] = js.undefined
  
  var `type`: error
}
object ErrorResult {
  
  inline def apply(error: Any, `type`: error): ErrorResult = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorResult]
  }
  
  extension [Self <: ErrorResult](x: Self) {
    
    inline def setError(value: Any): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Headers): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setType(value: error): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
