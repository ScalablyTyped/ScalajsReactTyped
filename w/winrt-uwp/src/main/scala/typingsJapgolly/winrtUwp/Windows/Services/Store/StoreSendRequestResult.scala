package typingsJapgolly.winrtUwp.Windows.Services.Store

import typingsJapgolly.winrtUwp.Windows.Web.Http.HttpStatusCode
import typingsJapgolly.winrtUwp.Windows.WinRTError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides response data for a request that is sent to the Windows Store. */
trait StoreSendRequestResult extends StObject {
  
  /** Gets the error code for the request, if the operation encountered an error. */
  var extendedError: WinRTError
  
  /** Gets the HTTP status code for the request. */
  var httpStatusCode: HttpStatusCode
  
  /** Gets the response data for the request. */
  var response: String
}
object StoreSendRequestResult {
  
  inline def apply(extendedError: WinRTError, httpStatusCode: HttpStatusCode, response: String): StoreSendRequestResult = {
    val __obj = js.Dynamic.literal(extendedError = extendedError.asInstanceOf[js.Any], httpStatusCode = httpStatusCode.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[StoreSendRequestResult]
  }
  
  extension [Self <: StoreSendRequestResult](x: Self) {
    
    inline def setExtendedError(value: WinRTError): Self = StObject.set(x, "extendedError", value.asInstanceOf[js.Any])
    
    inline def setHttpStatusCode(value: HttpStatusCode): Self = StObject.set(x, "httpStatusCode", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: String): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
