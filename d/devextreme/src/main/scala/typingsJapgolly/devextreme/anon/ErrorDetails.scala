package typingsJapgolly.devextreme.anon

import typingsJapgolly.devextreme.mod.DevExpress.data.ODataContext.ODataRequestOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ErrorDetails extends StObject {
  
  var errorDetails: Any
  
  var httpStatus: Double
  
  var requestOptions: ODataRequestOptions
}
object ErrorDetails {
  
  inline def apply(errorDetails: Any, httpStatus: Double, requestOptions: ODataRequestOptions): ErrorDetails = {
    val __obj = js.Dynamic.literal(errorDetails = errorDetails.asInstanceOf[js.Any], httpStatus = httpStatus.asInstanceOf[js.Any], requestOptions = requestOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorDetails]
  }
  
  extension [Self <: ErrorDetails](x: Self) {
    
    inline def setErrorDetails(value: Any): Self = StObject.set(x, "errorDetails", value.asInstanceOf[js.Any])
    
    inline def setHttpStatus(value: Double): Self = StObject.set(x, "httpStatus", value.asInstanceOf[js.Any])
    
    inline def setRequestOptions(value: ODataRequestOptions): Self = StObject.set(x, "requestOptions", value.asInstanceOf[js.Any])
  }
}
